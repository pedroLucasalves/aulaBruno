package interfaces;

import java.util.List;

public interface GenericOperations<E> {
	
	public E create(E entity);
	
	public void update(E entity);
	
	public E read(E entity);
	
	public void delete(Integer id);
	
	public List<E> create(List<E> entity);
	
	public void update(List<E> entity);
	
	public List<E> read(List<E> entity);
	
	public void delete(List<Integer> ids);
}
