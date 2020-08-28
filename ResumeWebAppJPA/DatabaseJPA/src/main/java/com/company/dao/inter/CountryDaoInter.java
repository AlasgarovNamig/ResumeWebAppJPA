/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.dao.inter;

import com.company.entity.Country;
import com.company.entity.Skills;
import java.util.List;

/**
 *
 * @author Hp
 */
public interface CountryDaoInter {

    public List<Country> getAllCountry();

    public Country getCountryById(int userId);

    public boolean updateCountry(Country u);

    public boolean addCountry(Country u);

    public boolean removeCountry(int id);
}
