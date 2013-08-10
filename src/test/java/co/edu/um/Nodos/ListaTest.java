package co.edu.um.Nodos;

/**
 * Created with IntelliJ IDEA.
 * User: Alejandro
 * Date: 9/08/13
 * Time: 08:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListaTest {
    public static void main (){
        Lista<Integer> L= new Lista<Integer>();
        L.insertarNodo(new Integer(10));
        L.insertarNodo(new Integer(12));
        System.out.println("Lista de Nodos Actual:/n"+L.toString());
        System.out.println("Borrar de la lista el 10:");
        if (L.EliminarNodo(new Integer(10)))
            System.out.println("El nodo no existe");
    }
}
