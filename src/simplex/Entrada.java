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
    private int numeroDeCariaveis;
    public double restricoes[][];

   
    

    public void MontarSimplex(int reatricoes){
        
    }
    
    public void MontarFuncaoObjetiva(int var, int necessidade){
        setNumeroDeCariaveis(var);
        System.out.println("Informe os coeficientes das seguintes variaveis para gerar a funcao objetiva:");
        for(int i = 0; i<= numeroDeCariaveis; i++){
            System.out.println("Informe o coeficiente de X"+(i+1));
            holder = in.nextLine();
            double oi = Double.parseDouble(holder);      
            restricoes[0][i]=oi;  
        }
        System.out.println("Sua função objetiva e: \n");
            for(int i = 0; i<= numeroDeCariaveis; i++){
                if(restricoes[0][i]<0){
                System.out.println("-"+restricoes[0][i]+"X"+(i+1));
            }else{
                    System.out.println("+"+restricoes[0][i]+"X"+(i+1));
                }
        }
    }
    
    
    public int getNumeroDeCariaveis() {
        return numeroDeCariaveis;
    }
    public void setNumeroDeCariaveis(int numeroDeCariaveis) {
        this.numeroDeCariaveis = numeroDeCariaveis;
    }
    
}
