/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.util.ArrayList;
import Rental.Rent;
/**
 *
 * @author 91730
 */
public class Customer {
    String customerId;
    String customerName;
    int customerAge;
    ArrayList<Rent> rentlist;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Customer() {
        this.rentlist = new ArrayList<Rent>();
    }

    public ArrayList<Rent> getRentlist() {
        return rentlist;
    }

    public void setRentlist(ArrayList<Rent> rentlist) {
        this.rentlist = rentlist;
    }
    
    
    
    

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

}
