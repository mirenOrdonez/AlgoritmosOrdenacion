
package algoritmosordenacion;

import java.util.Arrays;

/**
 *
 * @author mirenordonezdearce
 */
public class AlgoritmosOrdenacion {

    //El método recibe un array de números y lo ordenará mediante el algoritmo
    //de la burbuja. 
    public void ordenacionBurbuja (int [] numeros) {
        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    //Si se cumple, intercambio los valores de i e i+1
                    int aux = numeros[i + 1]; //creo un auxiliar para guardar el número de i+1
                    numeros[i + 1] = numeros[i]; //guardo el número de i en i+1
                    numeros[i] = aux; //guardo i en el auxiliar
                }
            }
        }
    }
    
    //Creamos una lista de números aleatorios para que haga la ordenación. 
    int [] lista1 = {13, 27, 455, 621, 23, 1, 15};
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos ordenacion, para llamar a cada uno de los métodos. 
        AlgoritmosOrdenacion ordenacion = new AlgoritmosOrdenacion();
        System.out.println("Lista sin ordenar: " + Arrays.toString(ordenacion.lista1));
        
        //Llamamos a ordenacionBurbuja, junto con la lista1
        ordenacion.ordenacionBurbuja(ordenacion.lista1);
        System.out.println("Lista ordenación burbuja: " + Arrays.toString(ordenacion.lista1));
    }
    
}
