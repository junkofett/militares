/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package militarescompare;

/**
 *
 * @author Lucky
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class Cuartel
{
    private Militar[] tropa;

    /**
     * Constructor de objetos del Cuartel
     * 
     * @param       numero de militares que formara la tropa
     */
    public Cuartel(int numTropas)
    {
        tropa = new Militar[numTropas];
        inicializarTropa();
    }

    /**
     * Inicializa la tropa de militares
     * 
     */
    private void inicializarTropa()
    {        
        for (int i = 0; i < tropa.length; i++)
        {
            tropa[i] = new Militar();
        }
    }

    public void ordenarSort()
    {
       Arrays.sort(tropa);
    }
    /**
     * Metodo para ordenar el array de militares de manera descendente
     * usando insercion directa
     */
    public void ordenarTropaInsercionDirecta()
    {
        Militar aux = tropa[0];
        int  j = 0;

        for  (int i = 1; i < tropa.length; i++)
        {
            aux = tropa[i];
            j = i-1;
            while (j >= 0 && tropa[j].compareTo(aux) < 0)
            {
                tropa[j + 1] = tropa[j];
                j--;
            }
           
            tropa[j + 1] = aux; 
        }
    }

    /**
     * Metodo para ordenar el array de militares de manera descendente
     * usando seleccion directa
     */
    public void ordenarTropaSeleccionDirecta()
    {
        int posmax;

        for  (int i = 0; i < tropa.length-1; i++)
        {
            posmax = i;

            for (int j=i+1; j < tropa.length; j++)
            {
                if (tropa[j].compareTo(tropa[posmax]) > 0)
                    posmax = j;
            }

            intercambiar(i, posmax);
        }

    }

    /**
     * Metodo para ordenar el array de militares de manera descendente
     * usando el metodo de la burbuja
     */
    public void ordenarTropaBurbuja()
    {
        boolean cambio;

        do{
            cambio = false;

            for (int i = 0; i < tropa.length -1; i++){
                if (tropa[i].compareTo(tropa[i+1]) < 0){
                    intercambiar(i, i+1);                    
                    cambio=true;
                }
            }
        }while(cambio);

    }

    /**
     * Metodo para hacer un intercambio de valores,
     * usado por los metodos de ordenacion
     */
    private void intercambiar(int i, int j)
    {
        Militar aux = tropa[i];
        tropa[i] = tropa[j];
        tropa[j] = aux;
    }

    /**
     * Metodo para mostrar una cadena que represente a la tropa. 
     * 
     * @return     tropa
     */
    @Override
    public String toString()
    {
        String s = "";

        for (int i = 0; i < tropa.length; i++)
            s += tropa[i].toString() + "\n";

        return s;
    }

    /**
     * Metodo para mostrar por pantalla la tropa. 
     * 
     */
    public void mostrarTropa()
    {
        System.out.println(toString());
    }
}
