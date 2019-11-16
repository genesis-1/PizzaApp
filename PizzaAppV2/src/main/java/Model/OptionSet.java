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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author root
 */
@Entity
public class OptionSet implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     private String name;
     
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Option> options = new HashSet<>();
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }

    

//    protected class Option {
//
//        private String name;
//        private double price;
//
//        public Option() {
//        }
//
//        public Option(String name) {
//            this.name = name;
//        }
//
//        protected Option(String name, double price) {
//
//            this.name = name;
//            this.price = price;
//        }
//
//        protected String getName() {
//            return name;
//        }
//
//        protected void setName(String name) {
//            this.name = name;
//        }
//
//        protected double getPrice() {
//            return price;
//        }
//
//        protected void setPrice(double price) {
//            this.price = price;
//        }
//
//         public void findOPtion(String name){
//        
//    }
//    
//   // public void deleteOption(){
//        
//    }
    
//    public void updateOption(){
//        
//    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
