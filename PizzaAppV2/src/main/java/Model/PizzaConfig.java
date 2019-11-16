/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Ntwali
 */
@Entity
public class PizzaConfig implements Serializable{

        @Id
    private Long id;
        
    private double baseprice;   
    private String size;
    
    private double delivery;
    private String name;
    
   @OneToMany(fetch = FetchType.LAZY, mappedBy = "pizzaConfig")
    private Set<OptionSet> optionSets = new HashSet<>();

    public PizzaConfig(Long id, double baseprice, String size, double delivery, String name) {
        this.id = id;
        this.baseprice = baseprice;
        this.size = size;
        this.delivery = delivery;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<OptionSet> getOptionSets() {
        return optionSets;
    }

    public void setOptionSets(Set<OptionSet> optionSets) {
        this.optionSets = optionSets;
    }
    
    
    public PizzaConfig(){
        
    }

 

    public double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(double baseprice) {
        this.baseprice = baseprice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getDelivery() {
        return delivery;
    }

    public void setDelivery(double delivery) {
        this.delivery = delivery;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
//    public void find(String name ){
//        
//    }
//    
//    public void delete(){
//        
//    }
//    
//    public void update(){
//        
//    }

    @Override
    public String toString() {
        return super.toString();
    }
 
}
