package com.mycompany.casopracticoiestrucutradedatos;

import java.util.ArrayList;
import java.util.Stack;

public class CasoPracticoIEstrucutraDeDatos {

    public static void main(String[] args) {

        ArrayList<Integer> tren = new ArrayList<>();
        tren.add(5);
        tren.add(1);
        tren.add(2);
        tren.add(4);
        tren.add(3);

        Stack<Integer> pila = new Stack();
        int num = 1;

        String resultado = ordenAscendente(tren, num, pila, 0);

        System.out.println(resultado);
    }

    public static String ordenAscendente(ArrayList<Integer> tren, int num, Stack<Integer> pila, int indice) {
        
        if (pila.size() == 0 && indice == tren.size()) {
            return "Si";
        }
        
        if (indice == tren.size() && pila.size() != 0) {
            return "No";
        }
        
        pila.push(tren.get(indice));
        
        while (!pila.isEmpty() && pila.peek() == num) {
            pila.pop();
            num++; 
        }
        
        return ordenAscendente(tren, num, pila, indice + 1);
    }
}
