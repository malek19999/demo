import java.io.expception;
import java.io.inputstream ;
import java.net.serversocket;


public class main {
    public static void main(){
        try {
            system.out.println("lancemenet du serveur ...")

            serversocket ss= new serversocket(1234);
            system.out.println(" attente d une connexion");
            socket s= server.accept();
            system.out.println("connexion etablie ...")
            inputstream is =s.getinputstream();
            int num = is.read();
            system.out.println("lecture de :"+ num);
            outputstream os =s.getoutputstream();
            system.out.println("envoi de" + (num*10));
            os.write(num*10);
            s.close();

        
        }catch(IOException e){
              e.printstacktrace();  

        }

    }
}