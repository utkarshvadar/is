import java.io.*;
import java.math.BigInteger;
import java.net.*;

class client{
    public static void main(String[] args) throws Exception{
        int port = 8888;
        BigInteger p = BigInteger.valueOf(23);
        BigInteger g = BigInteger.valueOf(9);
        BigInteger a = BigInteger.valueOf(4);
        Socket client = new Socket("localhost",port);

        ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
        ObjectInputStream is = new ObjectInputStream(client.getInputStream());


        out.writeObject(p);
        out.writeObject(g);

        BigInteger x = g.modPow(a,p);
        out.writeObject(x);
        
        BigInteger y = (BigInteger) is.readObject();
        System.out.println(x+" "+y);


        BigInteger ka = y.modPow(a,p);
        System.out.println(ka);
        client.close();

    }
}