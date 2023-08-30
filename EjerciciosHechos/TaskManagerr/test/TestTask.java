/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidad.TaskManager;
import Servicio.ServicioTask;
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
public class TestTask {
    
    public TestTask() {
    }
    ServicioTask ser;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ser = new ServicioTask();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void agregar(){
        TaskManager a = new TaskManager();
            assertTrue(ser.agregarTarea(a));
    }
    @Test
    public void eliminar(){
        TaskManager a = new TaskManager();
        ser.agregarTarea(a);
        ser.agregarTarea(a);
        assertTrue(ser.eliminarTarea(a));
    }
}
