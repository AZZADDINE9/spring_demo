package country.service;

import country.model.Country;

public interface IServiceWorker {
	void dealWithCountryByCode(String language);

	void ajouterCountry(Country _country, String _nameContinent);
}
