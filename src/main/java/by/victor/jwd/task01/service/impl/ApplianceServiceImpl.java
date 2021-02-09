package by.victor.jwd.task01.service.impl;

import by.victor.jwd.task01.dao.ApplianceDAO;
import by.victor.jwd.task01.dao.DAOFactory;
import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.criteria.Criteria;
import by.victor.jwd.task01.service.ApplianceService;
import by.victor.jwd.task01.service.validation.Validator;

import java.util.ArrayList;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Appliance> find(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            return new ArrayList<>();
        }
        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        return applianceDAO.find(criteria);
    }

}

