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
    public List<Appliance> find(Criteria criteria) {
        List<String> linesByCriteria;
        FilterFactory filterFactory = FilterFactory.getInstance();
        Filter applianceFilter = filterFactory.getApplianceFilter(criteria);

        try {
            linesByCriteria = FileReader.getStringsByFilter(applianceFilter, FILENAME);
        } catch (IOException | URISyntaxException e) {
            return null;
        }
        if (linesByCriteria.isEmpty()) {
            return null;
        }

        ParserFactory parserFactory = ParserFactory.getInstance();
        ApplianceParser applianceParser = parserFactory.getParser(criteria.getGroupSearchName());
        ApplianceFactory applianceFactory = ApplianceFactory.getInstance();

        List<Appliance> applianceList = new ArrayList<>();

        for (String line : linesByCriteria){
            Appliance appliance = applianceFactory.produce(criteria.
                    getGroupSearchName(), applianceParser.parse(line));
            applianceList.add(appliance);
        }
        return applianceList;
    }

}
