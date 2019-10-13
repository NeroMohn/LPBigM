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
    double restricoes[][];

   
    

    public void MontarSimplex(int reatricoes){
        
    }
    
    public void MontarFuncaoObjetiva(int var, int necessidade){
        setNumeroDeCariaveis(var);
        System.out.println("Informe os coeficientes das seguintes variaveis para gerar a funcao objetiva:");
        for(int i = 0; i<= numeroDeCariaveis; i++){
            System.out.println("Informe o coeficiente de X"+i);
            holder = in.nextLine();
            restricoes[0][i] = Integer.parseInt(holder);         
        }
        System.out.println("");
    }
        
    
    
    public int getNumeroDeCariaveis() {
        return numeroDeCariaveis;
    }
    public void setNumeroDeCariaveis(int numeroDeCariaveis) {
        this.numeroDeCariaveis = numeroDeCariaveis;
    }
    
}
