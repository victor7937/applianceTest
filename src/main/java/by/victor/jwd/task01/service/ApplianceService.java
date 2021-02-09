package by.victor.jwd.task01.service;

import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {
    List<Appliance> find(Criteria criteria);
}
