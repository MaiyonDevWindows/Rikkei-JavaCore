package Session2.Project.Backend.Business;

import java.util.List;

public interface IBusiness {
    public interface IBussiness<T, K> {
        List<T> getAll();

        boolean create(T t);

        boolean update(T t);

        boolean updateStatus(T t);
        boolean delete(T t, K k);

        List<T> findByName(K k);
    }
}
