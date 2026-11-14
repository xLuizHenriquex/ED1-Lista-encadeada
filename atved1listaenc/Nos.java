/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.luiz.atved1listaenc;

/**
 *@param 
 * @author lazar
 */
public class Nos<T> {
    private T elemento;
    private Nos<T>proximo;

    public Nos(T elemento){
        this.elemento = elemento;
        this.proximo = null;
    }
    public Nos(T elemento, Nos<T> proximo){
        this.elemento = elemento;
        this.proximo = proximo;

    }
    public T getElemento(){
        return elemento;
    }    
    public void setElemento(T elemento){
        this.elemento = elemento;
    }
    public Nos<T> getProximo(){
        return proximo;
    }
    public void setProximo(Nos<T> proximo){
        this.proximo = proximo;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Nos [elemento=").append(elemento).append(", proximo=").append(proximo).append("]");
        return builder.toString();
    }
}   
