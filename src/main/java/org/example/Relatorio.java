package org.example;

import java.util.Iterator;

public class Relatorio {

    public static Integer contarClientesAtivosCarteira(Carteira carteira) {
        int quantidade = 0;
        for (Cliente cliente : carteira) {
            if (cliente.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalClientesCarteira(Carteira carteira) {
        int quantidade = 0;
        for (Iterator c = carteira.iterator(); c.hasNext(); ) {
            quantidade++;
            c.next();
        }
        return quantidade;
    }

}