package ru.samyual.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Resource;
import org.springframework.beans.factory.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ProductService implements DisposableBean {

    @Autowired
    private PromotionsService promotionsService;

    @Resource(name = "product")
    private Product product;

    public PromotionsService getPromotionsService() {
        return promotionsService;
    }

    public void setPromotionsService(PromotionsService promotionsService) {
        this.promotionsService = promotionsService;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Вызван метод postConstruct объекта " + this);
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Выполняется метод preDestroy бина " + this);
    }

    @Override
    public void destroy() {
        System.out.println("Выполняется метод destroy бина " + this);
    }
}
