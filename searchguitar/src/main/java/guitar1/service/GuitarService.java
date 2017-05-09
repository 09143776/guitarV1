package guitar1.service;

import java.util.List;

import guitar1.dao.GuitarDaoImpl;
import guitar1.entity.Guitar;



public class GuitarService {

	private static GuitarDaoImpl guitarDao=new GuitarDaoImpl();
	public boolean add(Guitar guitar){
	    return	guitarDao.add(guitar);		
	}
	
	public static GuitarDaoImpl getGuitarDao() {
		return guitarDao;
	}

	public static void setGuitarDao(GuitarDaoImpl guitarDao) {
		GuitarService.guitarDao = guitarDao;
	}

	public List<Guitar> getAll(double price, String serialNumber, String builder, String model, String type,
			String backWood, String topWood) {
		// TODO Auto-generated method stub
		return guitarDao.getAll(price,serialNumber, builder, model, type, backWood, topWood);
	}	

}