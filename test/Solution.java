class RailFence
{
    int depth;
    String[] depthArr=null;
    public RailFence(int depth)
    {
        this.depth=depth;
        depthArr=new String[depth];
        for(int i=0;i<depth;i++)
            depthArr[i]="";
    }
    public String encrypt(String input)
    {
        input=input.replaceAll(" ","");
        
        int counter=0;
        int depthCounter=0;
        int size=input.length();
        while(counter<size)
        {
            
                
                depthArr[depthCounter]=depthArr[depthCounter]+input.charAt(counter++);
                depthCounter++;
                if(depthCounter==depth)
                    depthCounter=0;
           
        }
        String encrMsg="";
        
        for(int i=0;i<depth;i++)
        {
             System.out.println("Depth "+i+" "+depthArr[i]);
             encrMsg+=depthArr[i];
        }
           
        
        return encrMsg;
    }
    
    public String decrypt(String encrMsg)
    {
        int depthCounter=0;
        int i=0;
        String decrMsg="";
        int counter=0;
        int size=encrMsg.length();
        while(counter<size)
        {
            decrMsg=decrMsg+depthArr[depthCounter].charAt(i);
            depthCounter++;
            if(depthCounter==depth)
            {
                depthCounter=0;
                i++;
            }
            counter++;
        }
        
        return decrMsg;
    }
}

public class Solution {

    
    public static void main(String[] args){
        int depth =Integer.parseInt(args[1]);
        String input= args[0];
      
        RailFence railFence=new RailFence(depth);
        String encrMsg=railFence.encrypt(input);
        System.out.println("Encrypted message is:"+encrMsg);
        String decrMsg=railFence.decrypt(encrMsg);
        System.out.println("Decrypted message is:"+decrMsg);
    }
}


