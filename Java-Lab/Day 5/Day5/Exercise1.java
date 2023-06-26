import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.Map;
import java.util.*;


public class Exercise1 
{
	public static void main(String[] args) 
	{
        	CountryDao countryDao= InMemoryWorldDao.getInstance(); 
      		List<City> hightestPopulated=countryDao.findAllCountries()
	  	.stream()
      		.map( country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
      		.filter(Optional::isPresent)
      		.map(Optional::get)
      		.collect(Collectors.toList());
	 	for(City c: hightestPopulated)
		System.out.println(c);
   }
}