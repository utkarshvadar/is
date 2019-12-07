import java.io.*;
import java.math.BigInteger;
import java.net.*;

class Server{
    public static void main(String[] args) throws Exception{
        int port = 8888;
        BigInteger b = BigInteger.valueOf(3);
        ServerSocket serverSocket = new ServerSocket(port);
        Socket server = serverSocket.accept();

        ObjectOutputStream out = new ObjectOutputStream(server.getOutputStream());
        ObjectInputStream is = new ObjectInputStream(server.getInputStream());

        BigInteger p = (BigInteger)is.readObject();
        BigInteger g = (BigInteger)is.readObject();
        BigInteger x = (BigInteger)is.readObject();

        System.out.println(p+" "+g+" "+x);
        BigInteger y = g.modPow(b,p);
        out.writeObject(y);
        System.out.println(y);
        BigInteger kb = x.modPow(b,p);

        System.out.println(kb);
        serverSocket.close();

    }
}