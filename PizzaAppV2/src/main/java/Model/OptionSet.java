/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author root
 */
public class OptionSet {
     private String name;
     
    private Option[] choices;
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Option[] getChoices() {
        return choices;
    }

    public void setChoices(Option[] choices) {
        this.choices = choices;
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
