class Nodo {
    int valor;
    Nodo izquierda, derecha;

    public Nodo(int valor) {
        this.valor = valor;
        izquierda = derecha = null;
    }
}

public class ArbolPrint {
    
    static void imprimirArbol(Nodo nodo, int espacio, int separacion) {
        if (nodo == null) {
            return;
        }

        
        espacio += separacion;

        
        imprimirArbol(nodo.derecha, espacio, separacion);

        
        System.out.println();
        for (int i = separacion; i < espacio; i++) {
            System.out.print(" ");
        }
        System.out.println(nodo.valor);

        
        imprimirArbol(nodo.izquierda, espacio, separacion);
    }

    public static void main(String[] args) {
        // Crear el árbol basado 
        Nodo raiz = new Nodo(60);
        raiz.izquierda = new Nodo(41);
        raiz.derecha = new Nodo(74);

        raiz.izquierda.izquierda = new Nodo(16);
        raiz.izquierda.derecha = new Nodo(53);
        raiz.izquierda.izquierda.izquierda = new Nodo(25);

        raiz.izquierda.derecha.izquierda = new Nodo(46);
        raiz.izquierda.derecha.derecha = new Nodo(55);
        raiz.izquierda.derecha.izquierda.izquierda = new Nodo(42);

        raiz.derecha.izquierda = new Nodo(65);
        raiz.derecha.derecha = new Nodo(70);
        raiz.derecha.izquierda.izquierda = new Nodo(63);
        raiz.derecha.izquierda.derecha = new Nodo(62);
        raiz.derecha.izquierda.izquierda.derecha = new Nodo(64);

    
        imprimirArbol(raiz, 0, 8);
    }
}

