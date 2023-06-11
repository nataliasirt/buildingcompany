package com.solvd.laba.buildingcompany.interfaces;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
    static List<String> materials = new ArrayList<>();
    public static List getMaterials(){
        materials.add("glass");
        materials.add("steel");
        materials.add("insulation");
        return materials;
    }
}
