package by.victor.jwd.task01.filter;
import by.victor.jwd.task01.filter.impl.ApplianceFilterImpl;
import by.victor.jwd.task01.entity.criteria.Criteria;

public final class FilterFactory {
    private static final FilterFactory instance = new FilterFactory();

    private FilterFactory() {}

    public ApplianceFilter getApplianceFilter(Criteria criteria) {
        return new ApplianceFilterImpl(criteria);
    }

    public static FilterFactory getInstance() {
        return instance;
    }
}
