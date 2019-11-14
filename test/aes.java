import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

import java.util.*;

class aes{
    public static void main(String[] args) {
        try {
            String key = "UTKARSH";
            String message = "this is message ";
            MessageDigest sha;
            byte[] keyByte = key.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");

            keyByte = sha.digest(keyByte);
            keyByte = Arrays.copyOf(keyByte, 16);
            SecretKeySpec secreatkey = new SecretKeySpec(keyByte,"AES");

            Cipher encCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            encCipher.init(Cipher.ENCRYPT_MODE , secreatkey);

            String encMessage = Base64.getEncoder().encodeToString(encCipher.doFinal(message.getBytes("UTF-8")));

            System.out.println(encMessage);

            Cipher decCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            decCipher.init(Cipher.DECRYPT_MODE , secreatkey);

            String decMessage = new String(decCipher.doFinal(Base64.getDecoder().decode((encMessage))));
            System.out.println(decMessage);


        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}