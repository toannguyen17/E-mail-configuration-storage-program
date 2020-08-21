package emailprogram.service;

import java.util.List;

public interface Service<E> {
    void insert(E element);
    void update(E element);
}
