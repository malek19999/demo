
public class client{
    public static void main (){
        try{

              socket s =new socket("127.0.0.1",1234);
              system.out.println("envoi de "+ 8);
              outputstream os= s.getoutputstream();
              os.write(8);
              inputstream is =s.getinputstream();
              int resp= is.read();
              System.out.println("reponse du serveur:" +resp);
              s.close();



        }
    }
}