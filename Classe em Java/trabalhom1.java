package com.mycompany.trabalhom1obj;

import Classes.*;
import java.util.Scanner;

public class Trabalhom1obj {

    public static void calculaMedia( Aluno [] vetAlunos, float [] pesos){
        
        for ( Aluno a : vetAlunos){
            float [] notas;
            notas = a.getNotas();
            float media;
            
            if ( a.getQtdNotas() == 2){
                media = (notas[0] + notas[1] ) / 2;
                
            }else{
                media = ( notas[0]*pesos[0] + notas[1]*pesos[1] + notas[2]*pesos[2]) /10;
                
            }
            
            System.out.println("Aluno " + a.getNome() + " Media " + media);
        }
    }
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // O ideial é fazer a leitura do teclado
        
        float [] pesos = { 3.0f , 3.0f, 4,0f };
        
        System.out.println("Quantidade de alunos  : ");
        int qtdAlunos = entrada.nextInt();
        
        Aluno[] vetAlunos = new Aluno [ qtdAlunos ];
        
        for ( int i = 0 ; i < qtdAlunos; i++ ){
            System.out.print("Digite a matricula : ");
            int tempMatricula = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer do teclado.
            
            System.out.print("Digite o nome : ");
            String tempNome = entrada.nextLine();
            
            System.out.print("Quantidade de notas : ");
            int tempQtdNotas = entrada.nextInt();
            
            float[] tempNotas = new float [ tempQtdNotas ];
            for (int j = 0 ; j < tempQtdNotas ; j++){
                System.out.print("Digite a nota : ");
                tempNotas [ j ] = entrada.nextFloat();
            }
            
            vetAlunos [ i ] = new Aluno (tempMatricula, tempNome, tempQtdNotas, tempNotas);
            
            System.out.println("\n *** Inclusao efetuada ");
        
        }
        
        for( Aluno a : vetAlunos ){
            a.exibirDados();
        }
        
        calculaMedia ( vetAlunos , pesos);
     } 
            
     
}
