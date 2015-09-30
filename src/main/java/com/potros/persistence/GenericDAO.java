package com.potros.persistence;

import java.util.ArrayList;
import java.util.List;

import com.potros.exception.ElementNotFoundException;
import com.potros.exception.InvalidDataException;
import com.potros.exception.UserNotFoundException;

public class GenericDAO<T> {
	
	private List<T> listEntities = new ArrayList<T>();

	public boolean persist(T entity) {
		if(entity == null){
			throw new UserNotFoundException();
		}
		try {
			System.out.println("Guardando objeto" + entity.toString());
			listEntities.add(entity);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean merge(T entity) {
		if (entity == null) {
			throw new UserNotFoundException();
		}
		try {
			System.out.println("Actualizando objeto" + entity.toString());
			if (listEntities.contains(entity)) {
				int index = listEntities.indexOf(entity);
				listEntities.remove(index);
				listEntities.add(index, entity);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public T findById(int id) {
		try {
			if (listEntities.get(id) != null) {
				return listEntities.get(id);
			}else{
				throw new ElementNotFoundException();
			}
		} catch (Exception e) {
			return null;
		}
	}

	public boolean remove(T entity) {
		if (entity == null) {
			throw new InvalidDataException();
		}
		try {
			return listEntities.remove(entity);
		} catch (Exception e) {
			return false;
		}
	}

	public boolean removeById(int id) {
		if (id<0) {
			throw new ElementNotFoundException();
		}
		try {
			return listEntities.remove(listEntities.get(id));
		} catch (Exception e) {
			return false;
		}
	}

	public List<T> findAll() {
		return listEntities;
	}
}
