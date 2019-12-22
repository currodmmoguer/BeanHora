/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanhora;

import java.awt.Color;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author curro
 */
@RunWith(Parameterized.class)
public class BeanHoraTestParametrizado2 {
    private Color c;
    
    public BeanHoraTestParametrizado2(Color c) {
        this.c = c;
    }
    
    
    @Parameters     
    public static ArrayList<Color> colores(){
        ArrayList<Color> colores = new ArrayList<>();
        colores.add(Color.BLACK);
        colores.add(Color.BLUE);
        colores.add(Color.GREEN);
        colores.add(Color.MAGENTA);
        return colores;
    }
    
    
    @Test
    public void test(){
        System.out.println("Test color fecha");
        BeanHora instance = new BeanHora();
        instance.setColorText(c);
        Color result = instance.getColorText();
        assertEquals(c, result);
    }


}
