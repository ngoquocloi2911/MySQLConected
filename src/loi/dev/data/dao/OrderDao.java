package loi.dev.data.dao;

import java.util.List;

import loi.dev.data.model.Gallery;
import loi.dev.data.model.Order;

public interface OrderDao {
	public boolean insert(Order order);
	public boolean update(Order order);
	public boolean delete(int id);
	public Order find(int id);
	public List<Order> findAll();
	public List<Order> findByOder(int id);
}
