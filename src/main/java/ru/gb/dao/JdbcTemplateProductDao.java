package ru.gb.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.gb.entity.Manufacturer;
import ru.gb.entity.Product;

//@Component
@RequiredArgsConstructor
public class JdbcTemplateProductDao implements ProductDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public String findNameById(Long id) {
        return jdbcTemplate.queryForObject("SELECT name FROM Product where id = ?", String.class, id);
    }

    @Override
    public Iterable<Product> findAll() {
        return null;
    }

    @Override
    public Manufacturer findById(Long id) {
        return null;
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
