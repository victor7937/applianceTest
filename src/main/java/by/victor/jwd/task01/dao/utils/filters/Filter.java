package by.victor.jwd.task01.dao.utils.filters;

import by.victor.jwd.task01.entity.criteria.Criteria;

public interface Filter {
    boolean filterExpression(String expression);
    void setCriteria(Criteria criteria);

}
