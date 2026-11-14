package br.luiz.atved1listaenc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lazar
 */
public class Pedido {
    int Id_pedido;
    String Nomecliente;
    String item;
    int quantidade;
    double valor;
    String Tipo;
    public Pedido(int id_pedido, String nomeCliente, String item, int quantidade, double valor, String tipo) {
        this.Id_pedido = id_pedido;
        this.Nomecliente = nomeCliente;
        this.item = item;
        this.quantidade = quantidade;
        this.valor = valor;
        this.Tipo = tipo;
        if (this.Tipo.equalsIgnoreCase("Urgente")) {
            this.valor = valor * 1.2;
        }
        else if (this.Tipo.equalsIgnoreCase("Prioridade")) {
            this.valor = valor * 1.1;
        }
        else if (this.Tipo.equalsIgnoreCase("Normal")) {
            this.valor = valor;
        }
        
    }
    @Override
    public String toString() {
        return "Pedido [Id_pedido=" + Id_pedido + ", Nomecliente=" + Nomecliente + ", item=" + item + ", quantidade="
                + quantidade + ", valor=" + valor + ", Tipo=" + Tipo + "]";
    }



    
}
