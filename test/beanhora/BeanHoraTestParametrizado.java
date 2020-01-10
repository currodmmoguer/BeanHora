/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanhora;

import java.time.format.DateTimeFormatter;
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
public class BeanHoraTestParametrizado {
    private String formato;
    
    public BeanHoraTestParametrizado(String formato) {
        this.formato = formato;
    }
    
    @Parameters
    public static ArrayList<String> formatos()  {
        ArrayList<String> parametrosFormato = new ArrayList<>();
        
        parametrosFormato.add("dd/MM/yyyy");
        parametrosFormato.add("yyyy");
        parametrosFormato.add("dd/MM/yy");
        parametrosFormato.add("dd/MM/yyyy - HH:mm:ss");
        parametrosFormato.add("HH:mm - dd/MM/yyyy");
        parametrosFormato.add("HH:mm:ss");
        parametrosFormato.add("HH:mm:ss:SS");
        parametrosFormato.add("HH:mm");
        
        return parametrosFormato;
    }
    
    @Test
    public void test(){
        System.out.println("Test formato fecha");
        BeanHora instance = new BeanHora();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formato);
        instance.setFormato(formato);
        assertEquals(DateTimeFormatter.ofPattern(formato).toString(), instance.getFormato().toString());
        
        
    }
    
        

}
