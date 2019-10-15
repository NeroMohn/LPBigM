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

   
    

    public double[][] MontarRestricoes(int NumRestricoes,int variaveis){
        double[][] restricoes = new double[NumRestricoes][variaveis+2]; 
        System.out.println("\n\n Agora vamos montar suas restrucoes");
        for(int i = 0; i< NumRestricoes; i++){
            for(int j = 0; j < variaveis; j++){
                System.out.println("\n Informe o coeficiente de X"+(j+1)+" da restricao "+(i+1));
                holder = in.nextLine();      
                restricoes[i][j]=Double.parseDouble(holder);  
            }
            System.out.println("\n Informe o valor de B");
            holder = in.nextLine();      
            restricoes[i][restricoes[0].length-2]=Double.parseDouble(holder);
            System.out.println("\n Informe o sinal [1: >= ][2: <= ][3: = ]");
            holder = in.nextLine();      
            restricoes[i][restricoes[0].length-1]=Double.parseDouble(holder);
        }
            
            System.out.println("\n Suas restricoes são: \n");
            for(int i = 0; i< NumRestricoes; i++){
                for(int j = 0; j < variaveis; j++){
                    System.out.print((restricoes[i][j]+" x "+j));
                }
                System.out.println("\n Seu valor de B e: "+restricoes[i][restricoes.length]);
                if(restricoes[i][restricoes.length-1] == 1){
                    System.out.print(" seu sinal e: >=");
                }else if(restricoes[i][restricoes.length-1] == 2){
                    System.out.print(" seu sinal e: <=");
                }else{
                    System.out.print(" seu sinal e: =");
                }
            }
        
        return restricoes;
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
        System.out.println("\n Sua função objetiva e: ");
            for(int i = 0; i< numeroDeVariaveis; i++){
                if(funcaoObjetiva[i]<0){
                System.out.print(" - "+funcaoObjetiva[i]+"X"+(i+1));
            }else{
                    System.out.print(" + "+funcaoObjetiva[i]+"X"+(i+1));
                    
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
