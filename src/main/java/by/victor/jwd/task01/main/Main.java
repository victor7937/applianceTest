package by.victor.jwd.task01.main;


import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.ApplianceType;
import by.victor.jwd.task01.entity.criteria.Criteria;
import by.victor.jwd.task01.entity.criteria.SearchCriteria.*;
import by.victor.jwd.task01.service.ApplianceService;
import by.victor.jwd.task01.service.ServiceFactory;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Appliance appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(ApplianceType.Oven);//"Oven"
        criteriaOven.add(Oven.CAPACITY, 33);

        List<Appliance> appliances = service.find(criteriaOven);

        PrintApplianceInfo.print(appliances);

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(ApplianceType.Oven);
        criteriaOven.add(Oven.HEIGHT, 43.1);
        criteriaOven.add(Oven.DEPTH, 70);

        appliances = service.find(criteriaOven);

        PrintApplianceInfo.print(appliances);

        Criteria criteriaLaptop = new Criteria(ApplianceType.Laptop);//"Oven"
        criteriaLaptop.add(Laptop.CPU, 3.2);

        appliances = service.find(criteriaLaptop);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(ApplianceType.TabletPC);
        criteriaTabletPC.add(TabletPC.COLOR, "red");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 15);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);

        appliances = service.find(criteriaTabletPC);// find(Object...obj)*/

        PrintApplianceInfo.print(appliances);


    }

}
