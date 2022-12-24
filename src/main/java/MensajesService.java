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

    }

    public static void patchMessage(){

    }

}
