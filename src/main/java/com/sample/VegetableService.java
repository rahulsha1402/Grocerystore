package com.sample;

import com.sample.model.VegetableType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VegetableService {

    public List getAvailableQuantity(VegetableType type){

        List quantity = new ArrayList();

        if(type.equals(VegetableType.Potato)){
            quantity.add("500Gms");
            quantity.add("1KG");
            quantity.add(("2KG"));

        }else if(type.equals(VegetableType.Onion)){
            quantity.add("500Gms");
            quantity.add("1KG");
            quantity.add(("2KG"));

        }else if(type.equals(VegetableType.Tomato)){
            quantity.add("500Gms");
            quantity.add("1KG");
            quantity.add(("2KG"));

        }else if(type.equals(VegetableType.Radish)){
            quantity.add("500Gms");
            quantity.add("1KG");
            quantity.add(("2KG"));

        }else if(type.equals(VegetableType.Carrot)){
            quantity.add("500Gms");
            quantity.add("1KG");
            quantity.add(("2KG"));

        }else if(type.equals(VegetableType.Cabbage)){
            quantity.add("500Gms");
            quantity.add("1KG");

        }else if(type.equals(VegetableType.Beans)){
            quantity.add("500Gms");
            quantity.add("1KG");
            quantity.add(("2KG"));

        }else {
            quantity.add("No Quantity Available");
        }
        return quantity;
    }


    public Map<String, List<String>> getAvailableQuantities(){

        Map<String, List<String>> availableQuantities = new HashMap<>();

        List potato = new ArrayList();
        potato.add("500Gms");
        potato.add("1KG");
        potato.add(("2KG"));
        potato.add("Unit_Price 05");
        availableQuantities.put("Potato", potato);

        List onion = new ArrayList();
        onion.add("500Gms");
        onion.add("1KG");
        onion.add(("2KG"));
        onion.add("Unit_Price 07");
        availableQuantities.put("Onion", onion);

        List tomato = new ArrayList();
        tomato.add("500Gms");
        tomato.add("1KG");
        tomato.add(("2KG"));
        tomato.add("Unit_Price 10");
        availableQuantities.put("Tomato", tomato);


        List radish = new ArrayList();
        radish.add("500Gms");
        radish.add("1KG");
        radish.add(("2KG"));
        radish.add("Unit_Price 8");
        availableQuantities.put("Radish", radish);

        List carrot = new ArrayList();
        carrot.add("500Gms");
        carrot.add("1KG");
        carrot.add("2KG");
        carrot.add("Unit_Price 8");
        availableQuantities.put("Carrot", carrot);

        List beans = new ArrayList();
        beans.add("500Gms");
        beans.add("1KG");
        beans.add("Unit_Price 15");
        availableQuantities.put("Beans", beans);

        List cabbage = new ArrayList();
        cabbage.add("500Gms");
        cabbage.add("1KG");
        cabbage.add("Unit_Price 10");
        availableQuantities.put("Cabbage", cabbage);

        return availableQuantities;
    }


}

