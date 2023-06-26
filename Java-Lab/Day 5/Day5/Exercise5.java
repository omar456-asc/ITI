import java.util.Objects;
import java.util.Optional;
import java.util.Comparator;
import java.util.Map;
import static java.lang.System.out;
import  java.util.Comparator;

import static java.util.stream.Collectors.maxBy;


public class Exercise5 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
		
		Optional<City> city=countryDao.findAllCountries()
	    .stream()
		.map(Country::getCapital)
        .map(cityDao::findCityById)
        .filter(Objects::nonNull)
		.max(Comparator.comparing(City::getPopulation));
		
		if(city.isPresent())
			System.out.println(city.get());
    }
}