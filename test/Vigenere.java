import java.util.Scanner;

class Vigenere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key : ");
        String key = sc.nextLine().toUpperCase();
        System.out.print("Enter Text : ");
        String text = sc.nextLine().replaceAll("\\s","").toUpperCase();
        String out = "";
        int i;
        int kl = key.length();
        for(i=0;i<text.length();i++){
            out+= (char)((text.charAt(i)+key.charAt(i%kl))%26+'A');
        }
        String dec ="";
        System.out.println("Ciphertext Text : "+ out);
        for(i=0;i<out.length();i++){
            dec+= (char)((out.charAt(i)-key.charAt(i%kl)+26)%26+'A');
        }
        System.out.println("Decrypted text : "+dec);
        sc.close();
    }
}