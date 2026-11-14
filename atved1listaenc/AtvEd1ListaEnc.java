/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.luiz.atved1listaenc;

/**
 *
 * @author lazar
 */
public class AtvEd1ListaEnc<T> {

    private Nos<T> inicio;
    private int tamanho = 0;

    public void adiciona(T elemento) {
        Nos<T> celula = new Nos<>(elemento);
        if (this.inicio == null) {
            this.inicio = celula;
        } else {
            Nos<T> atual = this.inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(celula);
        }
        this.tamanho++;
    }
    public void adicionaNoInicio(T elemento) {
            Nos<T> celula = new Nos<>(elemento);
            celula.setProximo(this.inicio);
            this.inicio = celula;   
            this.tamanho++;
    }
    public int getTamanho() {
        return this.tamanho;
    }
    public void AdicionaNoMeio(T elemento){
        Nos<T> celula = new Nos<>(elemento);
        int meio = this.tamanho / 2;
        Nos<T> atual = this.inicio;
        for (int i = 0; i < meio; i++) {
            atual = atual.getProximo();
        }
        celula.setProximo(atual.getProximo());
        atual.setProximo(celula);
        this.tamanho++;
        
    }
    public void removeDoInicio() {
        if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            return;
        }
        this.inicio = this.inicio.getProximo();
        this.tamanho--;
    }

    public void removeDoFim() {
        if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            return;
        }
        if (this.tamanho == 1) {
            this.removeDoInicio();
            return;
        }
        Nos<T> atual = this.inicio;
        while (atual.getProximo().getProximo() != null) {
            atual = atual.getProximo();
        }
        atual.setProximo(null);
        this.tamanho--;
    }
    @Override
public String toString() {
    if (this.inicio == null) {
        return "[]";
    }

    StringBuilder builder = new StringBuilder("[");
    Nos<T> atual = this.inicio;
    builder.append(atual.getElemento());
    
    while (atual.getProximo() != null) {
        builder.append(", ");
        atual = atual.getProximo();
        builder.append(atual.getElemento());
    }
    
    
    builder.append("]");
    return builder.toString();
}
    public void imprimirEmLinhas() {
    Nos<T> atual = this.inicio;
    while (atual != null) {
        System.out.println(atual.getElemento());
        atual = atual.getProximo();
    }
}
    }

    

    
    

    
        
    



          
    
