package cn.edu.scau.dao;

import java.util.List;

import cn.edu.scau.entity.Client;


public interface ClientDao {
	public Client getClientById(int id);
	public List<Client> getAllClient();
	public List getClientByMobileNumber();
}
