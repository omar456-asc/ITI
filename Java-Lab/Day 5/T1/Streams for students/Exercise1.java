import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Objects;


public class Exercise1 
{
	public static void main(String[] args) 
	{
      		CountryDao countryDao= InMemoryWorldDao.getInstance();
		List<City> highPopCities = countryDao.findAllCountries()
		.stream()
		.filter(Objects::nonNull)
		.map( country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
		.filter(Optional::isPresent)
		.map(Optional::get)
		.collect(Collectors.toList());
		highPopCities.forEach(System.out::println);  
   	}

}