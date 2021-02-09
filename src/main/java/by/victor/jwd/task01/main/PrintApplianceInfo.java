package by.victor.jwd.task01.main;


import by.victor.jwd.task01.entity.Appliance;

import java.util.List;

public final class PrintApplianceInfo {

    public static void print(List<Appliance> applianceList) {
        if (applianceList.isEmpty()) {
            System.out.println("Can't find appliances with such criteria!\n");
        }
        else{
            applianceList.forEach(System.out::println);
            System.out.println("\n");
        }
    }
}
