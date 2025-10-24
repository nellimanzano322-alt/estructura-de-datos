package Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Jerarquia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una operación:");
        String cadena = sc.nextLine();

        if (estaCorrecta(cadena)) {
            System.out.println("La operación está correcta");
        } else {
            System.out.println("La operación no está correcta");
        }
    }

    public static boolean estaCorrecta(String cadena) {
        Stack<Character> pila = new Stack<>();
cd "C:\Users\Nelli\Documents\NelliFes\Estructuradedatos"
javac Pilas\Jerarquia.java
java Pilas.Jerarquia
        for (char c : cadena.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) {
                    return false;
                }
                char ultimo = pila.pop();
                if ((c == ')' && ultimo != '(') ||
                    (c == '}' && ultimo != '{') ||
                    (c == ']' && ultimo != '[')) {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
}