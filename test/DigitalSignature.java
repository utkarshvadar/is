import java.security.*;
import java.util.*;

class DigitalSignature{
    public static void main(String[] args) throws Exception{

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(2048);
        KeyPair key = keyPairGenerator.generateKeyPair();
        PrivateKey privateKey = key.getPrivate();
        PublicKey publicKey = key.getPublic();

        Signature sign = Signature.getInstance("SHA256withDSA");
        sign.initSign(privateKey);

        String msg = "utkarsh";
        byte[] byteMsg = msg.getBytes();

        sign.update(byteMsg);

        byte[] sgn = sign.sign();

        System.out.println(sgn);

        sign.initVerify(publicKey);
        sign.update(byteMsg);
        System.out.println(sign.verify(sgn));

    }
}
