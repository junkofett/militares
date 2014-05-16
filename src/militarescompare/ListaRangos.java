/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package militarescompare;

/**
 *
 * @author Lucky
 */
public class ListaRangos
{
    public static Rango[] rangos;
    public static String[][] tabla = { {"CA-1", "INSUMISO",             "CADENA PERPETUA",      "CALABOZO"},
                                       {"CA-2", "SOLDADO CONDENADO",    "TRABAJOS FORZADOS",    "CALABOZO"},
                                       {"CA-3", "SOLDADO ARRESTADO",    "AISLAMIENTO TEMPORAL", "CALABOZO"},
                                       {"OR-1", "SOLDADO",               "",                    "TROPA"},
                                       {"OR-2", "SOLDADO DE PRIMERA",    "",                    "TROPA"},
                                       {"OR-3", "CABO",                  "",                    "TROPA"},
                                       {"OR-4", "CABO PRIMERO",          "",                    "TROPA"},
                                       {"OR-5", "SARGENTO",              "",                    "SUBOFICIALES"},
                                       {"OR-7", "SARGENTO PRIMERO",      "",                    "SUBOFICIALES"},
                                       {"OR-8", "BRIGADA",               "",                    "SUBOFICIALES"},
                                       {"OR-9", "SUBTENIENTE",           "",                    "SUBOFICIALES"},
                                       {"OF-1", "TENIENTE",              "",                    "OFICIALES SUBALTERNOS"},
                                       {"OF-2", "CAPITAN",               "",                    "OFICIALES SUBALTERNOS"},
                                       {"OF-3", "COMANDANTE",            "",                    "OFICIALES SUPERIORES"},
                                       {"OF-4", "TENIENTE CORONEL",      "",                    "OFICIALES SUPERIORES"},
                                       {"OF-5", "CORONEL",               "",                    "OFICIALES SUPERIORES"},
                                       {"OF-6", "GENERAL DE BRIGADA",    "",                    "GENERALES"},
                                       {"OF-7", "MAYOR GENERAL",         "",                    "GENERALES"},
                                       {"OF-8", "TENIENTE GENERAL",      "",                    "GENERALES"},
                                       {"OF-9", "GENERAL",               "",                    "GENERALES"},
                                       {"OF-10", "CAPITAN GENERAL",      "RANGO HONORIFICO",    "GENERALES"}
                                   } ; 
   
                                        
    
    static {
        rangos = new Rango[tabla.length];
        for ( int i = 0; i < tabla.length; i++)
        {
                rangos[i] = new Rango((double)i/2, tabla[i]);
        }
        
    }

    /**
     * Constructor de objetos de la clase ListaRangos
     */
    public ListaRangos()
    {
    }
}
