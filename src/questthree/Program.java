/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questthree;

import entidades.Pacientes;
import java.util.Locale;
import java.util.Scanner;
import entidades.Relatorio;
import java.util.Date;

/**
 *
 * @author Visitante
 */
public class Program {

  
    public static void main(String[] args) {
     Scanner read = new Scanner (System.in);
     Locale.setDefault(Locale.US);
     
     
     
       Relatorio relatorio = new Relatorio(new Date());
    int count=0;
     for (int i=1; i<=3; i++){
         System.out.println("Digite os dados do #"+i+"Paciente:");
         System.out.println("Digite nome do paciente");
         String nome = read.nextLine();
         System.out.println("Digite sexo(M ou F) do paciente");
         String sexo = read.nextLine();
         System.out.println("Digite peso do paciente");
         Integer peso = read.nextInt();
         System.out.println("Digite idade do paciente");
         Integer idade = read.nextInt();
         System.out.println("Digite Altura do paciente");
         Integer altura = read.nextInt();
        
         read.nextLine();
         
         Pacientes pac = new Pacientes(nome, sexo, peso, idade, altura);
       
         relatorio.addPaciente(pac);
        count++;
     }
        System.out.println("FIM DA LISTA");
                

    System.out.println(relatorio.ToString());
        System.out.println("quantidade de pacientes: "+count);
      /*  
        System.out.println(" a média de idade dos homens: "+relatorio.madiaHomem());
        
      System.out.println("a quantidade de mulheres com altura entre 1,60 e 1,70"
                + " e peso acima de 70kg: "+relatorio.qtidadeMler());
        
        System.out.println(" a quantidade de pessoas com idade entre 18 e 25 é:"+relatorio.qtdfaixa());
   */
        System.out.println(relatorio.faixaMaior());
        System.out.println(relatorio.mlrBaixa()
        );
    }
    
}
