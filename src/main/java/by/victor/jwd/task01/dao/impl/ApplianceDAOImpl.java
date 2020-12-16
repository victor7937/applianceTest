package by.victor.jwd.task01.dao.impl;


import by.victor.jwd.task01.dao.ApplianceDAO;
import by.victor.jwd.task01.dao.utils.FileReader;
import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.criteria.Criteria;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    @Override
    public Appliance find(Criteria criteria) {
        List<String> linesByGroupName = new ArrayList<>();
        try {
            linesByGroupName = FileReader.getStrings(criteria.getStringGroupSearchName(),
                    "appliances_db.txt");
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            System.out.println("Exp");
        }

        return null;
    }

    // you may add your own code here

}


//you may add your own new classes