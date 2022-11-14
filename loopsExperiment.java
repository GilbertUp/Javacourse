public class Loops{

public static void main(String[] args){
    
   for(int i=1; i<=20; i++){
        
        if(i==5){
            continue;
        }
        else if(i==19){
            break;
        }

        while(i%2!=0){
            System.out.println(i);
            break;   
        }
   
    }


 }
}
        
    
    
    


