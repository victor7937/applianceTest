package by.victor.jwd.task01.main;


import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.ApplianceType;
import by.victor.jwd.task01.entity.criteria.Criteria;
import by.victor.jwd.task01.entity.criteria.SearchCriteria.*;
import by.victor.jwd.task01.service.ApplianceService;
import by.victor.jwd.task01.service.ServiceFactory;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Appliance appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(ApplianceType.Oven);//"Oven"
        criteriaOven.add(Oven.CAPACITY, 33);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(ApplianceType.Oven);
        criteriaOven.add(Oven.HEIGHT, 43.1);
        criteriaOven.add(Oven.DEPTH, 70);

        appliance = service.find(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

       /* Criteria criteriaTabletPC = new Criteria(ApplianceType.TabletPC);
        criteriaTabletPC.add(TabletPC.COLOR, "red");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 15);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);

        appliance = service.find(criteriaTabletPC);// find(Object...obj)*/

        PrintApplianceInfo.print(appliance);


    }

}
