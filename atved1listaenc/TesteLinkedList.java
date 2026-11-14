package br.luiz.atved1listaenc;

import java.util.LinkedList;

/**
 * @author lazar
 */
public class TesteLinkedList {
    public static void main(String[] args) {
        
        LinkedList<Pedido> lanchoneteNativa = new LinkedList<>();

        Pedido p1 = new Pedido(1, "Carlos", "xburgue", 2, 25, "normal");
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
        Pedido p15 = new Pedido(15, "Isabela", "x nada",    3, 30, "urgente");  


        lanchoneteNativa.add(p1);
        lanchoneteNativa.addFirst(p3);
        lanchoneteNativa.add(1, p2);
        lanchoneteNativa.addLast(p4);
        lanchoneteNativa.add(3, p5);
        lanchoneteNativa.add(p6);
        lanchoneteNativa.add(p7);
        lanchoneteNativa.add(5, p8);
        lanchoneteNativa.addFirst(p9);
        lanchoneteNativa.add(p10);
        lanchoneteNativa.add(7, p11);
        lanchoneteNativa.add(p12);
        lanchoneteNativa.add(p13);
        lanchoneteNativa.add(p14);
        lanchoneteNativa.addFirst(p15);
        System.out.println("--- Fila nativa para pedidos ---");
        for (Pedido p : lanchoneteNativa) {
            System.out.println(p);
        }
        System.out.println("Tamanho: " + lanchoneteNativa.size());

        lanchoneteNativa.removeFirst();
        lanchoneteNativa.removeLast();

        System.out.println("\n--- Apos remover ---");
        for (Pedido p : lanchoneteNativa) {
            System.out.println(p);
        }
    }
}



