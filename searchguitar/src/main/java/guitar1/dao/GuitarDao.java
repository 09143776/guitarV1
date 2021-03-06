package guitar1.dao;

import java.util.List;
import guitar1.entity.Guitar;

public interface GuitarDao {

	public boolean add(Guitar guitar);
	public List<Guitar> getAll(double price, String serialNumber, String builder, String model, String type,
			String backWood, String topWood);
}