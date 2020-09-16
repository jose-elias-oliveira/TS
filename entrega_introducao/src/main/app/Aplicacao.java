package app;
import model.CPF;

public class Aplicacao{
    public static void main(String [] args){     
      
  
        
       //TESTE 01
       //CPF Válido com pontuação
       String test1="687.415.390-01";  
       System.out.println("TESTE 01\n======================================");
       verificador(test1);  
        


        //TESTE 02
        //CPF Válido sem pontuação
        String test2="47488652886";
        System.out.println("TESTE 02\n======================================");
        verificador(test2);


        //TESTE 03
        //CPF inválido
        String test3="12547886674";
        System.out.println("TESTE 03\n======================================");
        verificador(test3);
    
 
     
    }

    public static void verificador(String test){
        CPF cpf=new CPF();
        if(cpf.VerificaCPF(test)){
 
            System.out.println("------------- CPF valido ------------- \n--------------------------------------");
            System.out.println("CPF SEM FORMATACAO:"+cpf.RemoveCharCPF(test)+"\n--------------------------------------");
            System.out.println("CPF FORMATADO:"+cpf.FormataCPF(cpf.RemoveCharCPF(test))+"\n--------------------------------------");

        }else{
            System.out.println("CPF invalido\n--------------------------------------");
        }
        System.out.println("                                                ");
    }



}