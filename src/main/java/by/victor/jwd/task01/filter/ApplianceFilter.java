package by.victor.jwd.task01.filter;

import by.victor.jwd.task01.entity.criteria.Criteria;

public interface ApplianceFilter {
    boolean filterExpression(String expression);
    void setCriteria(Criteria criteria);

}
