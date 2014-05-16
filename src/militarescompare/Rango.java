/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package militarescompare;

/**
 *
 * @author Lucky
 */
public class Rango
{
    private double nivel;
    private String codigo;
    private String nombre;
    private String descripcion;
    private String grupo;

    /**
     * Constructor de objetos de la clase Rango
     * 
     * @param       en nivel expresado en double del rango
     * @param       array con los valores del rango dados por la clase ListaRangos
     */
    public Rango(double nivel, String[] array)
    {
        this.nivel = nivel;
        codigo = array[0];
        nombre = array[1];
        descripcion = array[2];
        grupo = array[3];
    }
    
    /**
     * Accesor del atributo nivel
     * 
     * @return       el valor de nivel
     */
    public double getNivel(){
        return nivel;
    }
    
    /**
     * Metodo para mostrar una cadena que represente al Rango. 
     * 
     * @return     el nombre del rango
     */
    @Override
    public String toString(){
        return "rango "+nombre;
    }
}

