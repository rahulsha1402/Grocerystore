package com.sample.service;

import com.sample.VegetableService;
import com.sample.model.VegetableType;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VegetableServiceTest {

    VegetableService service = new VegetableService();
    List<String> list;

    @Test
    public void testGetAvailableQuantity_Potato(){
        list = service.getAvailableQuantity(VegetableType.Potato);
        assertTrue(list.contains("500Gms"));
        assertTrue(list.contains("1KG"));
        assertTrue(list.contains("2KG"));
    }

    @Test
    public void testGetAvailableQuantity_Negative_Potato(){
        list = service.getAvailableQuantity(VegetableType.Potato);
        assertFalse(list.contains("20Gms"));
    }

    @Test
    public void testGetAvailableQuantity_Onion(){
        list = service.getAvailableQuantity(VegetableType.Onion);
        assertTrue(list.contains("500Gms"));
        assertTrue(list.contains("1KG"));
        assertTrue(list.contains("2KG"));
    }

    @Test
    public void testGetAvailableQuantity_Negative_Onion(){
        list = service.getAvailableQuantity(VegetableType.Onion);
        assertFalse(list.contains("20Gms"));
    }

    @Test
    public void testGetAvailableQuantity_Tomato(){
        list = service.getAvailableQuantity(VegetableType.Tomato);
        assertTrue(list.contains("500Gms"));
        assertTrue(list.contains("1KG"));
        assertTrue(list.contains("2KG"));
    }

    @Test
    public void testGetAvailableQuantity_Negative_Tomato(){
        list = service.getAvailableQuantity(VegetableType.Tomato);
        assertFalse(list.contains("4KG"));
    }

    @Test
    public void testGetAvailableQuantity_Radish(){
        list = service.getAvailableQuantity(VegetableType.Radish);
        assertTrue(list.contains("500Gms"));
        assertTrue(list.contains("1KG"));
        assertTrue(list.contains("2KG"));
    }

    @Test
    public void testGetAvailableQuantity_Negative_Radish(){
        list = service.getAvailableQuantity(VegetableType.Radish);
        assertFalse(list.contains("50Gms"));
    }

    @Test
    public void testGetAvailableQuantity_Carrot(){
        list = service.getAvailableQuantity(VegetableType.Carrot);
        assertTrue(list.contains("500Gms"));
        assertTrue(list.contains("1KG"));
        assertTrue(list.contains("2KG"));
    }

    @Test
    public void testGetAvailableQuantity_Negative_Carrot(){
        list = service.getAvailableQuantity(VegetableType.Carrot);
        assertFalse(list.contains("200Gms"));
    }

    @Test
    public void testGetAvailableQuantity_Cabbage(){
        list = service.getAvailableQuantity(VegetableType.Cabbage);
        assertTrue(list.contains("500Gms"));
        assertTrue(list.contains("1KG"));
    }

    @Test
    public void testGetAvailableQuantity_Negative_Cabbage(){
        list = service.getAvailableQuantity(VegetableType.Cabbage);
        assertFalse(list.contains("2.5KG"));
    }

    @Test
    public void testGetAvailableQuantity_Beans(){
        list = service.getAvailableQuantity(VegetableType.Beans);
        assertTrue(list.contains("500Gms"));
        assertTrue(list.contains("1KG"));
    }

    @Test
    public void testGetAvailableQuantity_Negative_Beans(){
        list = service.getAvailableQuantity(VegetableType.Beans);
        assertFalse(list.contains("4KG"));
    }
}
