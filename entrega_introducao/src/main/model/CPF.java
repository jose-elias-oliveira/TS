package model;
import java.util.InputMismatchException;

public class CPF{

public boolean  VerificaCPF(String cpf){
    
    //Remove os resultados que são claramente falsos antes de fazer o calculo para poupar tempo
    if (cpf.equals("00000000000") ||
        cpf.equals("11111111111") ||  
        cpf.equals("22222222222") || 
        cpf.equals("33333333333") || 
        cpf.equals("44444444444") || 
        cpf.equals("55555555555") ||
        cpf.equals("66666666666") || 
        cpf.equals("77777777777") || 
        cpf.equals("88888888888") || 
        cpf.equals("99999999999") || 
        (cpf.length() != 11))
        {
            return(false);
        }
  
        
        int peso, soma, i, r, n;


        char d10, d11;
        try {
            //Primeiro digito de verificação
            peso = 10;
            soma = 0;
            
            for (i=0; i<9; i++) {

            n = (int)(cpf.charAt(i) - 48);

            soma = soma + (n * peso);
            peso = peso - 1;
            }

            r = 11 - (soma % 11);
            if ((r == 10) || (r == 11))
            d10 = '0';
            else d10 = (char)(r + 48);

            //segundo digito de verificação
            peso = 11;
            soma = 0;            
            

            for(i=0; i<10; i++) {

            n = (int)(cpf.charAt(i) - 48);

            soma = soma + (n * peso);

            peso = peso - 1;


            }

            r = 11 - (soma % 11);
            if ((r == 10) || (r == 11))
            d11 = '0';
            else d11 = (char)(r + 48);

            if ((d10 == cpf.charAt(9)) && (d11 == cpf.charAt(10)))
                 return(true);
                 else return(false);
        } 
        catch (InputMismatchException erro) {
            return(false);
        }


}

}