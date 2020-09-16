package app;
import model.CPF;

public class Aplicacao{
    public static void main(String [] args){
        
       CPF cpf=new CPF();

       String test1="68741539001";
    
       System.out.println("TESTE 01 - CPF:"+test1+"\n======================================");

        //TESTE 01
        if(cpf.VerificaCPF(test1)){

            System.out.println("CPF valido\n--------------------------------------");

        }else{
            System.out.println("CPF invalido\n--------------------------------------");
        }
        


        String test2="47488652886";
    
        System.out.println("TESTE 02 - CPF:"+test2+"\n======================================");
 
         //TESTE 02
         if(cpf.VerificaCPF(test2)){
 
             System.out.println("CPF valido\n--------------------------------------");
 
         }else{
             System.out.println("CPF invalido\n--------------------------------------");
         }
    }
}