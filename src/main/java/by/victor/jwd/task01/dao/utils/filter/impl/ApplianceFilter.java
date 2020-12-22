package by.victor.jwd.task01.dao.utils.filter.impl;

import by.victor.jwd.task01.dao.utils.filter.Filter;
import by.victor.jwd.task01.dao.utils.parser.OneLineParser;
import by.victor.jwd.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class ApplianceFilter implements Filter {

    private Criteria criteria;
    private final String groupSearchName;

    public ApplianceFilter (Criteria criteria) {
        this.criteria = criteria;
        groupSearchName = criteria.getStringGroupSearchName();
    }

    @Override
    public boolean filterExpression(String expression) {
        if (!expression.contains(groupSearchName)){
            return false;
        }
        Map<String,String> allParamsMap = OneLineParser.parseLine(expression);
        Map<Enum<?>,Object> criteriaMap = criteria.getMapOfCriteria();
        List<Boolean> truthCheckingList = new ArrayList<>();

        criteriaMap.forEach((key, value) -> truthCheckingList.add(Objects.equals(
                allParamsMap.get(key.toString()), value.toString())));

        if (truthCheckingList.isEmpty()) {
            return false;
        }
        return !truthCheckingList.contains(false);
    }

    @Override
    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }
}
