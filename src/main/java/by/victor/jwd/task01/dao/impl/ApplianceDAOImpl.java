package by.victor.jwd.task01.dao.impl;

import by.victor.jwd.task01.dao.ApplianceDAO;
import by.victor.jwd.task01.dao.utils.FileReader;
import by.victor.jwd.task01.filter.ApplianceFilter;
import by.victor.jwd.task01.filter.FilterFactory;
import by.victor.jwd.task01.parser.ApplianceParser;
import by.victor.jwd.task01.parser.ParserFactory;
import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.criteria.Criteria;
import by.victor.jwd.task01.factory.ApplianceFactory;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public final class ApplianceDAOImpl implements ApplianceDAO {

    private final static String FILENAME = "appliances_db.txt";
    private boolean fileErrorFlag;

    @Override
    public List<Appliance> find(Criteria criteria) {

        List<String> linesByCriteria = new ArrayList<>();
        FilterFactory filterFactory = FilterFactory.getInstance();
        ApplianceFilter applianceFilter = filterFactory.getApplianceFilter(criteria);

        try {
            linesByCriteria = FileReader.getStringsByFilter(applianceFilter, FILENAME);
        } catch (IOException | URISyntaxException e) {
            fileErrorFlag = true;
        }

        List<Appliance> applianceList = new ArrayList<>();
        ParserFactory parserFactory = ParserFactory.getInstance();
        ApplianceParser applianceParser = parserFactory.getParser(criteria.getGroupSearchName());

        if (!fileErrorFlag && !linesByCriteria.isEmpty() && applianceParser != null) {
            ApplianceFactory applianceFactory = ApplianceFactory.getInstance();
            for (String line : linesByCriteria){
                Appliance appliance = applianceFactory.produce(criteria.getGroupSearchName(), applianceParser.parse(line));
                applianceList.add(appliance);
            }
        }
        return applianceList;
    }

}
