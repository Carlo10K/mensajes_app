import java.util.Scanner;

public class MensajesService{

    public static void postMessage(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu mensaje");
        String message = sc.nextLine();

        System.out.println("Escribe el nombre del autor");
        String author = sc.nextLine();

        Mensajes reg= new Mensajes(message,author);

        MensajesDAO.postMessageDB(reg);
    }

    public static void getMessage(){
        MensajesDAO.getMessageDB();
    }

    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el id del mensaje a borrar");
        getMessage();
        int idMensaje = sc.nextInt();

        if(MensajesDAO.deleteMessageDB(idMensaje)){
            System.out.println("El mensaje ha sido borrado");
        }else{
            System.out.println("Selecciona un Id valido");
            deleteMessage();
        }
    }

    public static void patchMessage(){

    }

}
