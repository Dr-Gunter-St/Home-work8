package Home_Work8;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T>{

    protected List<T> list = new ArrayList<T>();

    @Override
    public T save(T element) {
        list.add(element);
        return element;
    }

    @Override
    public void delete(T element) {
        list.remove(element);
    }

    @Override
    public void deleteAll(List<T> list) {
        this.list.removeAll(list);
    }

    @Override
    public void saveAll(List<T> list) {
        this.list.addAll(list);
    }

    @Override
    public List<T> getList() {
        return this.list;
    }

}
