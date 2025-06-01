package main;

import filas.filaInt;

public class Main {
    public static void main(String[] args) {
        filaInt fila = new filaInt();
        fila.enqueue(5);
        fila.enqueue(3);
        fila.enqueue(8);
        fila.enqueue(3);
        fila.enqueue(4);
        System.out.println(fila.menor());
    }
}
