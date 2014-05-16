/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package militarescompare;

/**
 *
 * @author Lucky
 */
public class Militar implements Comparable<Militar>
{
    private Rango rango;

    /**
     * Constructor de objetos de la clase Militar
     */
    public Militar()
    { 
        rango = ListaRangos.rangos[(int)(Math.random() *21)];
    }
    
    /**
     * Metodo que compara si un militar es mayor, menor o igual que otro
     * 
     * @param       militar con el que se va a hacer la comparacion
     */
    @Override
    public int compareTo(Militar m1){
        /*if (this.rango == m1.rango)
            return 0;
        
        if (this.rango.getNivel() < m1.rango.getNivel())
            return -1;
        //else
        return 1;*/
        
        return (int)((this.rango.getNivel()- m1.rango.getNivel())*2);
    }
    
    /**
     * Metodo para mostrar una cadena que represente al militar. 
     * 
     * @return     militar
     */
    @Override
    public String toString(){
        return "Militar de "+ rango;
    }

  
}
