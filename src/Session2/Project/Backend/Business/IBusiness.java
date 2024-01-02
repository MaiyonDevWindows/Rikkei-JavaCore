package Session2.Project.Backend.Business;

import java.util.List;

public interface IBusiness<T, K, S, I> {
    List<T> getAll(I i);

    boolean create(T t);

    boolean update(T t);

    boolean delete(T t, K k);
    T findById(K k);

    T findByName(S s);
    List<T> search(S s, I i);
}