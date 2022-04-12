package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gb.config.HibernateConfig;
import ru.gb.dao.ManufacturerDao;
import ru.gb.dao.OldJdbcProductDao;
import ru.gb.dao.ProductDao;
import ru.gb.entity.Product;

public class ShopApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        ProductDao productDao = new OldJdbcProductDao();
//        ProductDao productDao = context.getBean(ProductDao.class);
        System.out.println(productDao.findNameById(3L));
        for (Product product : productDao.findAll()) {
            System.out.println(product);
        }
//        System.out.println(productDao.findNameById(3L));
    }
}
