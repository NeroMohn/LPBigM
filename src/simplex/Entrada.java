/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplex;
import java.util.*;
/**
 *
 * @author David e Victor
 */
public class Entrada {
    private Scanner in = new Scanner(System.in);
    private String holder;
    private int numeroDeVariaveis;

   
    

    public double[][] MontarRestricoes(int reatricoes){
        double[][] restricoes = mew
        
        return restriceos;
    }
    
    public double[] MontarFuncaoObjetiva(int var, int necessidade){
        setNumeroDeVariaveis(var);   
        double funcaoObjetiva[] = new double[var+1];
        
        System.out.println("Informe os coeficientes das seguintes variaveis para gerar a funcao objetiva:");
        for(int i = 0; i< numeroDeVariaveis; i++){
            System.out.println("Informe o coeficiente de X"+(i+1));
            holder = in.nextLine();      
            funcaoObjetiva[i]=Double.parseDouble(holder);  
        }
        System.out.println("Sua função objetiva e: \n");
            for(int i = 0; i< numeroDeVariaveis; i++){
                if(funcaoObjetiva[i]<0){
                System.out.println("-"+funcaoObjetiva[i]+"X"+(i+1));
            }else{
                    System.out.println("+"+funcaoObjetiva[i]+"X"+(i+1));
                }
        }
            return funcaoObjetiva;
    }

    public int getNumeroDeVariaveis() {
        return numeroDeVariaveis;
    }

    public void setNumeroDeVariaveis(int numeroDeVariaveis) {
        this.numeroDeVariaveis = numeroDeVariaveis;
    }
    
    

    
}
