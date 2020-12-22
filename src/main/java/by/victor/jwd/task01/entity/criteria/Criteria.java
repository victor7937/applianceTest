package by.victor.jwd.task01.entity.criteria;

import by.victor.jwd.task01.entity.ApplianceType;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Criteria {

    private final ApplianceType groupSearchName;
    private final Map<Enum<?>, Object> criteria = new HashMap<Enum<?>, Object>();

    public Criteria(ApplianceType groupSearchName) {
        this.groupSearchName = groupSearchName;
    }


    public ApplianceType getGroupSearchName() {
        return groupSearchName;
    }

    public String getStringGroupSearchName(){
        return groupSearchName.toString();
    }

    public Map<Enum<?>, Object> getMapOfCriteria() {
        return criteria;
    }

    public void add(Enum<?> searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    @Override
    public String toString() {
        return "Criteria{" +
                "groupSearchName=" + groupSearchName +
                ", criteria=" + criteria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Criteria criteria1 = (Criteria) o;
        return groupSearchName == criteria1.groupSearchName &&
                Objects.equals(criteria, criteria1.criteria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupSearchName, criteria);
    }


}
