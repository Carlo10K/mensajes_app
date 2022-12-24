import java.sql.Connection;
import java.util.Scanner;

public class Init {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        Scanner sc = new Scanner(System.in);

        int option=0;

        do{
            System.out.println("-----------------------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. Crear Mensaje");
            System.out.println("2. Listar Mensajes");
            System.out.println("3. Eliminar Mensaje");
            System.out.println("4. Editar Mensaje");
            System.out.println("5. Salir");

            option=sc.nextInt();

            switch (option){
                case 1:
                    MensajesService.postMessage();
                    break;
                case 2:
                    MensajesService.getMessage();
                    break;
                case 3:
                    MensajesService.deleteMessage();
                    break;
                case 4:
                    MensajesService.patchMessage();
                    break;
                default:
                    break;

            }
        }while (option != 5);


    }
}
