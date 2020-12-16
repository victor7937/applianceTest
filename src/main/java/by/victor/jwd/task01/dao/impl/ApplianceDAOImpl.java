package by.victor.jwd.task01.dao.impl;


import by.victor.jwd.task01.dao.ApplianceDAO;
import by.victor.jwd.task01.dao.utils.FileReader;
import by.victor.jwd.task01.dao.utils.filters.Filter;
import by.victor.jwd.task01.dao.utils.filters.FilterFactory;
import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.criteria.Criteria;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    private final static String FILENAME = "appliances_db.txt";

    @Override
    public Appliance find(Criteria criteria) {
        List<String> linesByGroupName = new ArrayList<>();
        FilterFactory filterFactory = FilterFactory.getInstance();
        Filter applianceFilter = filterFactory.getApplianceFilter(criteria);
        try {
            linesByGroupName = FileReader.getStringsByFilter(applianceFilter, FILENAME);
        } catch (IOException | URISyntaxException e) {
            return null;
        }

       // linesByGroupName.forEach(System.out::println);
        //System.out.println("\n");


        return null;
    }

    // you may add your own code here

}


//you may add your own new classes