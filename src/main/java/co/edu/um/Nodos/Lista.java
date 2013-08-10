package co.edu.um.Nodos;

/**
 * Created with IntelliJ IDEA.
 * User: Alejandro
 * Date: 9/08/13
 * Time: 08:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Lista<E> {
    protected Nodo<E> primero; protected int tamaño;

    public Lista(){
        primero=null;
        tamaño=0;
    }

    public void insertarNodo(E dato){
        primero=new Nodo<E>(dato,primero);this.tamaño++;
    }

    public void insertarNodoalfinal(E dato){
        Nodo<E> Nf=new Nodo<E>(dato);this.tamaño++;
        Nodo<E> aux=primero;
        if(aux.sgt != null) aux = aux.sgt;
        aux.sgt=Nf;
    }

    public String toString(){
        String res="";
        for(Nodo<E> aux=primero; aux != null; aux=aux.sgt)
            res += aux.dato.toString()+"/n";
        return res;
    }

    public boolean Eliminar(E dato){
        Nodo<E> aux= primero, ant=null; boolean res=false;
        while (aux != null && !aux.dato.equals(dato)){
            ant=aux; aux=aux.sgt;
        }
        if (aux != null){
            res=true; this.tamaño--;
            if (ant ==null) primero=aux.sgt;
            else ant.sgt=aux.sgt;
        }
        return res;
    }
}

