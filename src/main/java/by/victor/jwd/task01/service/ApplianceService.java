package by.victor.jwd.task01.service;


import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.criteria.Criteria;

public interface ApplianceService {

    Appliance find(Criteria criteria);

}
