/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursach.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author olejaja
 */
public class Rate {
    private long id;
    private String name;
    private String login;
    private Double price;
    private Date time;
    private List<User> user;
    
     public Rate()
    {}

    public Rate(long id, String name, String login, Double price, Date time, List<User> user) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.price = price;
        this.time = time;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public Double getPrice() {
        return price;
    }

    public Date getTime() {
        return time;
    }

    public List<User> getUser() {
        return user;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.login);
        hash = 71 * hash + Objects.hashCode(this.price);
        hash = 71 * hash + Objects.hashCode(this.time);
        hash = 71 * hash + Objects.hashCode(this.user);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rate other = (Rate) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.time, other.time)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rate{" + "id=" + id + ", name=" + name + ", login=" + login + ", price=" + price + ", time=" + time + ", user=" + user + '}';
    }

  
     
}
