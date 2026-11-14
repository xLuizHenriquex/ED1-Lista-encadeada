/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.luiz.atved1listaenc;

/**
 *
 * @author lazar
 */
public class Testes {
    public static void main(String[] args) {
        AtvEd1ListaEnc<Pedido>  lanchonete = new AtvEd1ListaEnc<>();
        Pedido p1 = new Pedido(1, "Carlos", "xburgue",2, 25, "normal");
        Pedido p2 = new Pedido(2, "Maria", "Cheese burguer", 1, 20, "prioridade");
        Pedido p3 = new Pedido(3, "João", "duplo cheddar", 3, 30, "urgente");
        Pedido p4 = new Pedido(4, "Ana", "hambuerguer", 2, 25, "normal");
        Pedido p5 = new Pedido(5, "Pedro", "x-salada", 1, 20, "prioridade");
        Pedido p6 = new Pedido(6, "Lucas", "xbacon", 3, 30, "normal");
        Pedido p7 = new Pedido(7, "Julia", "x-tudo", 2, 25, "normal");
        Pedido p8 = new Pedido(8, "Rafael", "xovo", 1, 20, "prioridade");
        Pedido p9 = new Pedido(9, "Fernanda", "x-tudo", 3, 30, "urgente");
        Pedido p10 = new Pedido(10, "Gabriel", "x-nada", 2, 25, "normal");
        Pedido p11 = new Pedido(11, "Larissa", "xxxxtudo", 1, 20, "prioridade");
        Pedido p12 = new Pedido(12, "Bruno", "dupro xedar", 3, 30, "normal");
        Pedido p13 = new Pedido(13, "Camila", "xbacan", 2, 25, "normal");
        Pedido p14 = new Pedido(14, "Felipe", "x-tudo", 1, 20, "normal");
        Pedido p15 = new Pedido(15, "Isabela", "x nada", 3, 30, "urgente");


        lanchonete.adiciona(p1);
        lanchonete.AdicionaNoMeio(p2);
        lanchonete.adicionaNoInicio(p3);
        lanchonete.adiciona(p4);
        lanchonete.AdicionaNoMeio(p5);
        lanchonete.adiciona(p6);
        lanchonete.adiciona(p7);
        lanchonete.AdicionaNoMeio(p8);
        lanchonete.adicionaNoInicio(p9);
        lanchonete.adiciona(p10);
        lanchonete.AdicionaNoMeio(p11);
        lanchonete.adiciona(p12);
        lanchonete.adiciona(p13);
        lanchonete.adiciona(p14);
        lanchonete.adicionaNoInicio(p15);

        System.out.println("Filla para pedidos");
        lanchonete.imprimirEmLinhas();
        System.out.println("Tamanho da lista: " + lanchonete.getTamanho());
    
    
    System.out.println("Fila para pedidos");
        lanchonete.imprimirEmLinhas();
        System.out.println("Tamanho da lista: " + lanchonete.getTamanho());

        System.out.println("Removendo do inicio");
        lanchonete.removeDoInicio();
        lanchonete.imprimirEmLinhas();
        System.out.println("total de pedidos: " + lanchonete.getTamanho());

        System.out.println("Removendo do fim");
        lanchonete.removeDoFim();
        lanchonete.imprimirEmLinhas();
        System.out.println("total de pedidos: " + lanchonete.getTamanho());
    }
      
    @Override
    public String toString() {
        return "Testes []";
    }
    
}
