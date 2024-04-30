package org.example;

public class Main {

    public static void main(String[] args) {


        CustomStack myStack = new CustomStack();

        // Uso del método push para agregar elementos a la pila
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        // Uso del método printStack para imprimir la pila
        System.out.println("La pila contiene: ");
        myStack.printStack();  // Debería imprimir: 10 20 30

        // Uso del método peek para observar el elemento superior de la pila
        System.out.println("\nEl elemento superior (peek): " + myStack.peek()); // Debería imprimir: 30

        // Uso del método isEmpty para verificar si la pila está vacía
        System.out.println("¿Está la pila vacía? " + myStack.isEmpty()); // Debería imprimir: false

        // Uso del método size para imprimir el tamaño de la pila
        System.out.println("Tamaño de la pila: " + myStack.size()); // Debería imprimir: 3

        // Uso del método insertElementAt para insertar un elemento en la pila en una posición específica
        myStack.insertElementAt(25, 1);  // Inserta 25 en la posición 1 (índices basados en 0)

        // Uso del método removeElementAt para eliminar un elemento en una posición específica
        myStack.removeElementAt(1);  // Elimina el elemento en la posición 1, que es 25

        // Uso del metodo updateElementAt para actualizar una elemento en una posición especifica
        myStack.updateElementAt(40, 2);

        // Imprime la pila después de insertar y eliminar
        System.out.println("Pila después de insertar y eliminar:");
        myStack.printStack();  // Debería imprimir: 10 20 40

    }
}