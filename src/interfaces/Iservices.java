package interfaces;

import java.util.List;

public interface Iservices<T> {

    boolean save(T data);
    List<T> show();
    T getByString(String chaine);
}