import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Set;



public class Exercise2 {

    public static void main(String[] args) {
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();
        //write your answer here
    
       //highestPopulatedCitiesInContinen List<City> cities = worldDao.findAllCities();
        List<Country> countries = worldDao.findAllCountries();
        Set<String> continents = worldDao.getContinents();
		List<City> cities = worldDao.findAllCities();
		
		List<City> highestPopulatedCitiesInContinent = continents.stream()
               .map(continent -> countries.stream()
                        .filter(country -> country.getContinent().equals(continent))
                        .map(country -> country.getCities().stream()
                                 .max(Comparator.comparing(City::getPopulation))
                                 .orElse(new City(cities.size() + 2, "testCity", "TEST", 0)))
                        .max(Comparator.comparing(City::getPopulation))
                        .orElse(null))
               .collect(Collectors.toList());
                    
                    
        System.out.println("--------------");
        highestPopulatedCitiesInContinent.stream()
              .forEach(city1 -> {
                  if (city1 != null && city1.getPopulation()!= 0)
                    System.out.println(city1.getName());
                  });
				
        

    }

}