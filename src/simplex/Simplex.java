/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplex;
import java.util.*;
import simplex.Entrada.*;
import simplex.Algoritmo;

/**
 *
 * @author David e Victor
 */
public class Simplex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe o número de variáveis");
        String holder = in.nextLine();
        int numeroDeVariaveis = Integer.parseInt(holder);
        System.out.println("Informe o número de restrições");
        holder = in.nextLine();
        int numeroDeRestricoes = Integer.parseInt(holder);
        System.out.println("Informe a necessidade \n 1 - MAX \n 2 - MIN");
        holder = in.nextLine();
        int necessidade = Integer.parseInt(holder);
        
        Entrada.MontarFuncaoObjetiva(numeroDeVariaveis, necessidade);
        
    }
    
}
