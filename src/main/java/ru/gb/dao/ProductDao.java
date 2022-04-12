package ru.gb.dao;

import ru.gb.entity.Manufacturer;
import ru.gb.entity.Product;

public interface ProductDao {
    Iterable<Product> findAll();
    public String findNameById(Long id);
    Manufacturer findById(Long id);
    void insert(Product product);
    void update(Product product);
    void deleteById(Long id);
}
