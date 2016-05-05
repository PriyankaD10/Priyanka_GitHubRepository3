package model;

import java.util.List;

public interface ProductDAOInterface {

	void insert();
	void update();
	List searchAll();
	void search();
	void delete();
}
