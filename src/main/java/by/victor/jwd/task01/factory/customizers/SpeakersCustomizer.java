package by.victor.jwd.task01.factory.customizers;



import by.victor.jwd.task01.entity.Appliance;
import by.victor.jwd.task01.entity.Speakers;
import by.victor.jwd.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public final class SpeakersCustomizer extends Customizer {

    private Speakers speakers;

    @Override
    public void setAppliance(Appliance Appliance) {
        this.speakers = (Speakers) Appliance;
    }

    @Override
    public Appliance getAppliance(){
        return speakers;
    }

    @Override
    public void customizeAppliance(Map<Enum<?>,Object> param) {
        speakers.setPowerConsumption((Integer) param.get(SearchCriteria.Speakers.POWER_CONSUMPTION));
        speakers.setNumberOfSpeakers((Integer) param.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS));
        speakers.setFrequencyRange((String) param.get(SearchCriteria.Speakers.FREQUENCY_RANGE));
        speakers.setCordLength((Integer) param.get(SearchCriteria.Speakers.CORD_LENGTH));
    }
}
