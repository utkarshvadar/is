import java.security.*;
import javax.crypto.*;

import java.util.*;

class dec{
    public static void main(String[] args) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
            SecretKey secretKey = keyGenerator.generateKey();

            Cipher encCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            encCipher.init(Cipher.ENCRYPT_MODE, secretKey);

            String message = "this is meassage";

            byte[] encMessage = encCipher.doFinal(message.getBytes());

            System.out.println(Base64.getEncoder().encodeToString(encMessage));

            Cipher decCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            decCipher.init(Cipher.DECRYPT_MODE, secretKey);

            String decMessage = new String(decCipher.doFinal(encMessage));
            System.out.println(decMessage);

        } catch (Exception e) {
            //TODO: handle exception
        }


    }
}