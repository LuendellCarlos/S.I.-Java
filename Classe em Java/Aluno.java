
package Classes;


public class Aluno {
    
// Atributos da classe
    
    private int     matricula;
    private String  nome;
    private int     qtdNotas; //opcional
    private float[] notas;
    
    // Metodo construtor
    
    public Aluno( int matricula, String nome, int qtdNotas, float[] notas){
        
        this.matricula      = matricula;
        this.nome           = nome;
        this.qtdNotas       = qtdNotas;
        this.notas          = notas;
    }
    
    // Gets
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getQtdNotas(){
        return this.qtdNotas;
    }
    
    public float[] getNotas(){
        return this.notas;
    }
    
    // Sets
    
    public void setMatricula( int m){
        this.matricula = m;
    }
    
    public void setNome( String n){
        this.nome = n;
    }
    
    public void setQtdNotas( int qtd){
        this.qtdNotas = qtd;
    }
    
    public void setNotas( float[] n ){
        this.notas = n;
    }
    
    public void exibirDados(){
        
       System.out.println("\n------------------------------------");
       System.out.println("Matricula            : " + this.matricula );
       System.out.println("Nome                 : " + this.nome );
       System.out.println("Quantidade de notas  : " + this.qtdNotas );
       System.out.print("Notas                  : ");
       
       for( float n : notas ){
           System.out.print( n + " ");
           
       }
       System.out.println("\n------------------------------------");
       
    
        
    }
    
}
