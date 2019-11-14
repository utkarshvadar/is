import java.util.Random;
import java.util.Scanner;

class OTP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter Text : ");
        String text = sc.next().toUpperCase();
        String out = "";
        int i;
        String randKey = "";
        char key ;
        for(i=0;i<text.length();i++){
            key = (char)('A'+random.nextInt(26));
            randKey+=key;
            out+= (char)((text.charAt(i)+key)%26+'A');
        }
        String dec ="";
        System.out.println("Ciphertext Text : "+ out);
        for(i=0;i<out.length();i++){
            dec+= (char)((out.charAt(i)-randKey.charAt(i)+26)%26+'A');
        }
        System.out.println("Decrypted text : "+dec);
        System.out.println(randKey);
        sc.close();
    }
}