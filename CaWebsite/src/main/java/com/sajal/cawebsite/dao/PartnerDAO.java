package com.sajal.cawebsite.dao;

import java.util.List;

import com.sajal.cawebsite.model.Partner;

public interface PartnerDAO {

	public List<Partner> partner();

	public boolean save(Partner partner);

	public boolean update(Partner partner);

	public boolean delete(int id);

	public boolean delete(Partner partner);

	public Partner getPartnerByID(int id);

	public Partner getPartnerByName(String name);

}
