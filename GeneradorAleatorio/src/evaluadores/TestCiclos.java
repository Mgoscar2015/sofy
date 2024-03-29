/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package evaluadores;

import java.util.Vector;

/**
 *
 * @author Carolina
 */
public class TestCiclos
{

    public TestCiclos()
    {
    }


    public int test(Vector v)
    {
        int cantidad = 0;
        int size = v.size();
        int i = 0;
        double min;
        double max;
        for(int j=1; j<size; j++)
        {
            min = Double.parseDouble(String.valueOf(v.elementAt(i)));
            max = Double.parseDouble(String.valueOf(v.elementAt(j)));
            if(min != max)
                cantidad++;
            else
            {
                if(this.buscarCoincidencia(v, i, j, size))
                    break;
                else
                    cantidad++;
            }

        }
        return cantidad;
    }


    private boolean buscarCoincidencia(Vector v, int i, int j, int size)
    {
        i++;
        j++;
        boolean coincidencia = true;
        for(;j<size;j++)
        {
            if(Double.parseDouble(String.valueOf(v.elementAt(i))) == Double.parseDouble(String.valueOf(v.elementAt(j))))
                i++;
            else
            {
                coincidencia = false;
                break;
            }
        }
        return coincidencia;
    }

}
