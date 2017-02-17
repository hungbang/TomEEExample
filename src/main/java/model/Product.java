package model;

import javax.persistence.*;

/**
 * Created by HungBang on 2/17/2017.
 */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product", catalog = "sakila")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    public Product(){}
    @Id
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "TYPE", nullable = false)
    private String type;

    public Product(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String description) {
        this.type = description;
    }

}