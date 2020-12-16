package by.victor.jwd.task01.dao.utils.filters.impl;

import by.victor.jwd.task01.dao.utils.filters.Filter;
import by.victor.jwd.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ApplianceFilter implements Filter {

    private Criteria criteria;
    private String groupSearchName;
    public ApplianceFilter (Criteria criteria) {
        this.criteria = criteria;
        groupSearchName = criteria.getStringGroupSearchName();
    }
    @Override
    public boolean filterExpression(String expression) {
        if (!expression.contains(groupSearchName)){
            return false;
        }
        List<String> searchKeys = getSearchKeys();
        int equalsCounter = 0;
        for (String searchKey : searchKeys){
            if (expression.contains(searchKey + ",") || expression.contains(searchKey + ";")){
                equalsCounter++;
            }
        }
        return equalsCounter == searchKeys.size();
    }

    private List<String> getSearchKeys () {
        Map<Enum<?>,Object> criteriaMap = criteria.getMapOfCriteria();
        List<String> searchKeys = new ArrayList<>();
        criteriaMap.forEach((key, value) -> searchKeys.add(new StringBuilder().append(key).
                append("=").append(value).toString()));
        return searchKeys;
    }

    @Override
    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }
}
