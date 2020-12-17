package by.victor.jwd.task01.dao.impl;


import by.victor.jwd.task01.dao.ApplianceDAO;
import by.victor.jwd.task01.dao.utils.FileReader;
import by.victor.jwd.task01.dao.utils.filter.Filter;
import by.victor.jwd.task01.dao.utils.filter.FilterFactory;
import by.victor.jwd.task01.dao.utils.parser.ApplianceParser;
import by.victor.jwd.task01.dao.utils.parser.ParserFactory;
import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.criteria.Criteria;
import by.victor.jwd.task01.factory.ApplianceFactory;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    private final static String FILENAME = "appliances_db.txt";

    @Override
    public Appliance find(Criteria criteria) {
        List<String> linesByCriteria = new ArrayList<>();
        FilterFactory filterFactory = FilterFactory.getInstance();
        Filter applianceFilter = filterFactory.getApplianceFilter(criteria);
        try {
            linesByCriteria = FileReader.getStringsByFilter(applianceFilter, FILENAME);
        } catch (IOException | URISyntaxException e) {
            return null;
        }

        //linesByGroupName.forEach(System.out::println);
        //System.out.println("\n");

        ParserFactory parserFactory = ParserFactory.getInstance();
        ApplianceParser applianceParser = parserFactory.getParser(criteria.getGroupSearchName());
        ApplianceFactory applianceFactory = ApplianceFactory.getInstance();

        for (String line : linesByCriteria){
            Appliance appliance = applianceFactory.produce(criteria.
                    getGroupSearchName(), applianceParser.parse(line));
            System.out.println(appliance);
        }


        return null;
    }

    // you may add your own code here

}


//you may add your own new classes