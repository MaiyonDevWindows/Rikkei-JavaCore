package Session2.Lesson6.Backend.Business;

import java.util.List;

// Design Pattern.
public interface IBusiness <T, K> {
    List<T> getAll();
    boolean create(T t);
    boolean update(T t);
    boolean delete(K k);
    T findById(K k);
}
