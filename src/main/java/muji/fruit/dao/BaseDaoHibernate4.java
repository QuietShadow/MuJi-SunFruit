package muji.fruit.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
/**
 * DAO基类，提供基本CRUD操作
 * 不使用HibernateSupport或者HibernateTemplate，避免代码耦合以后升级版本代价太高
 * 为了让getCurrentSession()获得的session自动关闭，连查询方法都需加上事务管理
 * 在事务关闭后，session自动关闭
 * @author CHW
 *
 */
@Repository
@Transactional
public class BaseDaoHibernate4<T> {

	@Resource
	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public T get(Class<T> entityClazz, Serializable id) {
		return (T) getSessionFactory().getCurrentSession().get(entityClazz, id);
	}

	public Serializable save(T entity) {
		return getSessionFactory().getCurrentSession().save(entity);
	}

	public void update(T entity) {
		getSessionFactory().getCurrentSession().saveOrUpdate(entity);
	}

	public void delete(T entity) {
		getSessionFactory().getCurrentSession().delete(entity);
	}

	
	public void delete(Class<T> entityClazz, Serializable id) {
		getSessionFactory().getCurrentSession()
				.createQuery("delete " + entityClazz.getSimpleName() + " en where en.id = ?0").setParameter("0", id)
				.executeUpdate();
	}

	/**
	 * 加载所有的实体
	 * 
	 * @param 实体
	 * @return
	 */
	public List<T> findAll(Class<T> entityClazz) {
		return find("select en from " + entityClazz.getSimpleName() + " en");
	}
	
	/**
	 * 统计实体数量
	 * @param entityClazz
	 * @return
	 */

	public long findCount(Class<T> entityClazz) {
		List<?> l = find("select count(*) from " + entityClazz.getSimpleName());
		if (l != null && l.size() == 1) {
			return (Long) l.get(0);
		}
		return 0;
	}

	/**
	 * 执行hql语句
	 * 
	 * @param hql
	 * @return
	 */

	@SuppressWarnings("unchecked")
	protected List<T> find(String hql) {
		return (List<T>) getSessionFactory().getCurrentSession().createQuery(hql).list();
	}

	/**
	 * 执行带参hql
	 * @param hql
	 * @param params
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected List<T> find(String hql, Object... params) {

		Query query = getSessionFactory().getCurrentSession().createQuery(hql);

		for (int i = 0, len = params.length; i < len; i++) {
			query.setParameter(i + "", params[i]);
		}
		return (List<T>) query.list();
	}

	/**
	 * 执行获得唯一结果的带参HQL
	 * @param hql
	 * @param params
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected T uniqueResult(String hql, Object... params) {
		Query query = getSessionFactory().getCurrentSession().createQuery(hql);

		for (int i = 0, len = params.length; i < len; i++) {
			query.setParameter(i + "", params[i]);
		}
		return (T) query.uniqueResult();
	}

	/**
	 * 分页查询
	 * @param hql
	 * @param pageNo 页数
	 * @param pageSize 每页显示大小
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected List<T> findByPage(String hql, int pageNo, int pageSize) {
		return getSessionFactory().getCurrentSession().createQuery(hql).setFirstResult((pageNo - 1) * pageSize)
				.setMaxResults(pageSize).list();
	}

	/**
	 * 带参分页查询
	 * @param hql
	 * @param pageNo 页数
	 * @param pageSize 每页显示大小
	 * @param params 参数
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected List<T> findByPage(String hql, int pageNo, int pageSize, Object... params) {
		Query query = getSessionFactory().getCurrentSession().createQuery(hql);
		for (int i = 0, len = params.length; i < len; i++) {
			query.setParameter(i + "", params[i]);
		}
		return query.setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize).list();
	}

}
