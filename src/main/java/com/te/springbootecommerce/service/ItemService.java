package com.te.springbootecommerce.service;

import java.util.List;

import com.te.springbootecommerce.dto.ItemBean;

public interface ItemService {
	

	
	public ItemBean getEmpData(Integer aid);

	public boolean addItem(ItemBean Bean);
	
	public boolean updateItem(ItemBean infoBean);
	
	public boolean deleteItem(Integer id);
	
	public List<ItemBean> getAllEmployeeDetails();

}
