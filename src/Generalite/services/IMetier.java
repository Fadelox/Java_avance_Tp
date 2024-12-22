package Generalite.services;

import java.util.List;

public interface IMetier <T>{
     void add(T o);
     List<T> getAll();
     T findById(Long id);
     void remove(Long id);
}
