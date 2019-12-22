/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanhora;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author curro
 */
public class BeanHoraTest {
    
    static BeanHora instance;
    static String formato;
    public BeanHoraTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
         instance = new BeanHora();
         formato = "dd/MM/yyyy - HH:mm:ss";
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHora method, of class BeanHora.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        
        String expResult = LocalDateTime.now().format(DateTimeFormatter.ofPattern(formato));
        String result = instance.getHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setColotText method, of class BeanHora.
     */
    @Test
    public void testSetColotText() {
        System.out.println("setColotText");
        Color c = Color.DARK_GRAY;
        instance.setColorText(c);
        assertEquals(c, instance.getColorText());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of setFuente method, of class BeanHora.
     */
    @Test
    public void testSetFuente() {
        System.out.println("setFuente");
        Font f = new Font("ubuntu", Font.BOLD, 15);
        instance.setFuente(f);
        assertEquals(f, instance.getFuente());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of setFormato method, of class BeanHora.
     */
    @Test
    public void testSetFormato() {
        System.out.println("setFormato");
        instance.setFormato(formato);
        assertEquals(DateTimeFormatter.ofPattern(formato).toString(), instance.getFormato().toString());
    }
    

    
}
