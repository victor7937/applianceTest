package by.victor.jwd.task01.service.validation;


import by.victor.jwd.task01.entity.criteria.Criteria;
import java.util.Map;

public final class Validator {

    private static final int MINVALUE = 0;
    private static final int MAXVALUE = 10000;

    public static boolean criteriaValidator(Criteria criteria) {
        Map<Enum<?>,Object> criteriaMap = criteria.getMapOfCriteria();
        if (criteriaMap.isEmpty()) {
            return false;
        }
        for (Object value : criteriaMap.values()) {
            if (!correctValueChecker(value)) {
                return false;
            }
        }
        return true;
    }

    private static boolean correctValueChecker (Object value) {
        if (value instanceof Integer){
            int valueForCheck = (Integer) value;
            return !(valueForCheck < MINVALUE || valueForCheck > MAXVALUE);
        }
        if (value instanceof Double){
            double valueForCheck = (Double) value;
            return !(valueForCheck < MINVALUE || valueForCheck > MAXVALUE);
        }
        if (value instanceof String) {
        String valueForCheck = (String)value;
            return !valueForCheck.isEmpty();
        }
        else {
            return false;
        }
    }
}
