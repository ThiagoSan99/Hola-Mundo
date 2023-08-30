/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import EntidadDescuento.Descuentaso;
import ServicioDescuento.Servicio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hewlett Packard
 */
public class DescuentoTest {
    
    public DescuentoTest() {
    }
    Servicio s;
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        s = new Servicio();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void descuentoValido(){
        
        Descuentaso so = new Descuentaso("Leche", 2000,0);
        assertEquals(2000,s.calcularDescuento(so),0);
    }
}
