package com.services;

import java.util.List;

import com.model.Client;

public interface ClientServices  {
public 	void add(Client e);
	
	public Client edite(Client e);
	
	public void delete(Long id);
	
	public List<Client> findAll();
	
	public Client findById(Long id);
	public Client findByUsername(String username);


}
