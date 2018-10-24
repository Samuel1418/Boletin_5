/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author Samuel
 */
public class Conta {
    private String nomeCliente;
    private String numConta;
    private double saldo;
   
    public Conta(){};
    
    public Conta(String a,String b,double c){
   this.nomeCliente=a;
   this.numConta=b;
   this.saldo=c;
    }
    
    public void setDinero(double saldo){
      this.saldo=saldo;
    }
    
    public double getDinero(){
    return this.saldo;
    }
     public void setNome(String nome){
     this.nomeCliente=nome;
     }
     public String getNome(){
     return this.nomeCliente;
     }
     
   public void setNumConta(String numConta){
   this.numConta=numConta;
   }
   public String getNumConta(){
   return this.numConta;
   }
    
 public void ingSaldo(double a){
 this.saldo=this.saldo+a;
 }
 
 public void amosar(){
  System.out.println("Nome: "+this.nomeCliente+"\n Numero de conta: "+this.numConta+"\n Saldo no conta: "+this.saldo);
 }
    
    
    
}
