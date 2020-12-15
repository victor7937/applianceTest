package by.victor.jwd.task01.dao;

import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
    Appliance find(Criteria criteria);
}
