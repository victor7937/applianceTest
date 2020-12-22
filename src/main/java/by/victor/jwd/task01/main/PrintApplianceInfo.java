package by.victor.jwd.task01.main;


import by.victor.jwd.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> applianceList) {
        if (applianceList == null) {
            System.out.println("Can't find appliances with such criteria!\n");
        }
        else{
            applianceList.forEach(System.out::println);
            System.out.println("\n");
        }
    }
}
