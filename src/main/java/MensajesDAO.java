import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO{


    public static void postMessageDB(Mensajes message){
        try{
            Connection db =Conexion.getConnection();
            PreparedStatement ps = null;
            try{
                String query="INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";

                ps= db.prepareStatement(query);
                ps.setString(1,message.getMensaje());
                ps.setString(2,message.getAutorMensaje());
                ps.executeUpdate();

                System.out.println("El mensaje fue creado correctamente");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        Conexion.closeConnection(db);
        }catch (SQLException ex){
            System.out.println(ex);
        }
    }

    public static void getMessageDB(){
        try{
            Connection db =Conexion.getConnection();
            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                String query = "SELECT * FROM mensajes";

                ps = db.prepareStatement(query);
                rs=ps.executeQuery();

                while (rs.next()){
                    System.out.println("Id: "+rs.getInt("id_mensaje"));
                    System.out.println("Mensaje: "+rs.getString("mensaje"));
                    System.out.println("Autor: "+rs.getString("autor_mensaje"));
                    System.out.println("Fecha: "+rs.getString("fecha_mensaje"));
                    System.out.println();
                }

            } catch (SQLException e) {
                System.out.println("No se pudieron recuperar los mensajes");
                throw new RuntimeException(e);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteMessageDB(int idMessage){

    }

    public static void patchMessageDB(Mensajes message){

    }
}