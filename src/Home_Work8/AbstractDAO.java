package Home_Work8;

import java.util.List;

public interface AbstractDAO <T>{
    public T save(T element);
    public void delete (T element);
    public void deleteAll(List<T> list);
    public void saveAll(List<T> list);
    public List<T> getList();
}
