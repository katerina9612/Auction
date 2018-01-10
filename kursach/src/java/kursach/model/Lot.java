/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursach.model;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author olejaja
 */
public class Lot {
     private long id;
    private String name;
    private String user_id;
    private String description;
    private double first_price;
    private double last_price;
    private Date first_time;
    private Date last_time;
    private byte[] image; 
    
     public Lot()
    {}

    public Lot(long id, String name, String user_id, String rate_id, String description, double first_price, double last_price, Date first_time, Date last_time, byte[] image) {
        this.id = id;
        this.name = name;
        this.user_id = user_id;
        this.description = description;
        this.first_price = first_price;
        this.last_price = last_price;
        this.first_time = first_time;
        this.last_time = last_time;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUser_id() {
        return user_id;
    }

   

    public String getDescription() {
        return description;
    }

    public double getFirst_price() {
        return first_price;
    }

    public double getLast_price() {
        return last_price;
    }

    public Date getFirst_time() {
        return first_time;
    }

    public Date getLast_time() {
        return last_time;
    }

    public byte[] getImage() {
        return image;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

  

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFirst_price(double first_price) {
        this.first_price = first_price;
    }

    public void setLast_price(double last_price) {
        this.last_price = last_price;
    }

    public void setFirst_time(Date first_time) {
        this.first_time = first_time;
    }

    public void setLast_time(Date last_time) {
        this.last_time = last_time;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.user_id);
      
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.first_price) ^ (Double.doubleToLongBits(this.first_price) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.last_price) ^ (Double.doubleToLongBits(this.last_price) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.first_time);
        hash = 71 * hash + Objects.hashCode(this.last_time);
        hash = 71 * hash + Arrays.hashCode(this.image);
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
        final Lot other = (Lot) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.first_price) != Double.doubleToLongBits(other.first_price)) {
            return false;
        }
        if (Double.doubleToLongBits(this.last_price) != Double.doubleToLongBits(other.last_price)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.user_id, other.user_id)) {
            return false;
       
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.first_time, other.first_time)) {
            return false;
        }
        if (!Objects.equals(this.last_time, other.last_time)) {
            return false;
        }
        if (!Arrays.equals(this.image, other.image)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lot{" + "id=" + id + ", name=" + name + ", user_id=" + user_id + ", description=" + description + ", first_price=" + first_price + ", last_price=" + last_price + ", first_time=" + first_time + ", last_time=" + last_time + ", image=" + image + '}';
    }
    
    
    
    
}
