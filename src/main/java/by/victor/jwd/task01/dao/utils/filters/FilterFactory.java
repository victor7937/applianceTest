package by.victor.jwd.task01.dao.utils.filters;
import by.victor.jwd.task01.dao.utils.filters.impl.ApplianceFilter;
import by.victor.jwd.task01.entity.criteria.Criteria;

public final class FilterFactory {
    private static final FilterFactory instance = new FilterFactory();

    private FilterFactory() {
    }

    public Filter getApplianceFilter(Criteria criteria) {
        return new ApplianceFilter(criteria);
    }

    public static FilterFactory getInstance() {
        return instance;
    }
}
