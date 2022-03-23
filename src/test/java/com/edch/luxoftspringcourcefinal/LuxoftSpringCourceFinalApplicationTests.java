package com.edch.luxoftspringcourcefinal;

import com.edch.luxoftspringcourcefinal.model.Bank;
import com.edch.luxoftspringcourcefinal.model.Client;
import com.edch.luxoftspringcourcefinal.model.Country;
import com.edch.luxoftspringcourcefinal.service.BankService;
import com.edch.luxoftspringcourcefinal.service.ClientService;
import com.edch.luxoftspringcourcefinal.service.CountryService;
import com.edch.luxoftspringcourcefinal.specification.base.OrSpecification;
import com.edch.luxoftspringcourcefinal.specification.impl.CodeCountryIs;
import com.edch.luxoftspringcourcefinal.specification.impl.NameCountryIs;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class LuxoftSpringCourceFinalApplicationTests {

    @Autowired
    private CountryService countryService;

    @Autowired
    private BankService bankService;

    @Autowired
    private ClientService clientService;

    /*@Test
    public void test() {
        Country firstCountry = new Country();
        firstCountry.setName("First foundation");
        firstCountry.setCodeName("ff");
        countryService.save(firstCountry);

        Country secondCountry = new Country();
        secondCountry.setName("Second foundation");
        secondCountry.setCodeName("sf");
        countryService.save(secondCountry);

        List<Country> countries = countryService.findAll().stream()
                .filter(country ->
                        new OrSpecification<Country>(
                                new NameCountryIs("First foundation"),
                                new CodeCountryIs("sf")
                        ).test(country)
                )
                .collect(Collectors.toList());
        Assert.isTrue(countries.size() == 2);
    }*/

   /* @Test
    public void testEntities() {
        Country firstCountry = new Country();
        firstCountry.setName("First foundation");
        firstCountry.setCodeName("ff");
        countryService.save(firstCountry);

        Bank bank = new Bank();
        bank.setName("Abc bank group");
        bank.setCountry(firstCountry);
        bankService.save(bank);

        Client client = new Client();
        client.setName("Alex");
        client.setBank(bank);
        clientService.save(client);

        for (Client client1 : clientService.findAll()) {
            System.out.println(client1);
        }
    }*/
}
