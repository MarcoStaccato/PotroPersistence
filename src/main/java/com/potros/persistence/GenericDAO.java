package com.potros.persistence;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public abstract class GenericDAO<T> {
	protected final Class<?> clazz = this.getClazz();

	public abstract Class<?> getClazz();

	private Session session = HibernateUtil.getSessionFactory().openSession();

	public boolean persist(T entity) {
		try {
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean merge(T entity) {
		if (entity == null) {
			return false;
		}
		try {
			session.beginTransaction();
			session.merge(entity);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public T findById(int id) {
		try {
			return (T) session.get(getClazz(), id);
		} catch (Exception e) {
			return null;
		}
	}

	public boolean remove(T entity) {
		if (entity == null) {
			return false;
		}
		try {
			session.beginTransaction();
			session.delete(entity);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean removeById(int id) {
		boolean isSuccess = false;
		try {
			T entity = (T) session.get(getClazz(), id);
			session.beginTransaction();
			isSuccess = remove(entity);
			session.getTransaction().commit();
			return isSuccess;
		} catch (Exception e) {
			return false;
		}
	}

	public List<T> findAll() {
		Query q = session.createQuery("From USUARIO");
		List<T> resultList = (List<T>) q.list();
		return resultList;
	}
}
