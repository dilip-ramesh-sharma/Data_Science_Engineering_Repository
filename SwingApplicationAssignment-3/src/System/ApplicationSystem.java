/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import Customer.CustomerDirectory;
import Employee.Employee;
import Employee.EmployeeDirectory;
import Library.Library;
import Material.Book;
import Material.BookDirectory;
import Material.Magazine;
import Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class ApplicationSystem {
    ArrayList<Branch> branches;
    ArrayList <String> branchName;
    UserAccountDirectory topLevelUserAccountDirectory;
    CustomerDirectory customerList;

    public CustomerDirectory getCustomerList() {
        System.out.println("Inside customer list");
        return customerList;
    }

    public void setCustomerList(CustomerDirectory customerList) {
        this.customerList = customerList;
    }
    
    public ArrayList<String> getBranchName() {
        return branchName;
    }

    public void setBranchName(ArrayList<String> branchName) {
        this.branchName = branchName;
    }
    
    ApplicationSystem() {
        this.branches = new ArrayList<Branch>();
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        this.branchName = new ArrayList <String>();
        this.customerList = new CustomerDirectory();

        this.topLevelUserAccountDirectory.createUserAccount("admin", "admin", new SystemAdminRole(),"ALL");
    }
     public static ApplicationSystem getInstance() {
        return new ApplicationSystem();
    }
      public void storeBranchName(String name) {
        this.branchName.add(name);
        
    }
          public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }
    
      public Branch AddEmpToBranch(String name, Library lib) {  

        Branch branch = new Branch();
        branch.setName(name);
        branch.setLib(lib);
        this.branches.add(branch);
        return branch;
    }
      
       public void removeBranch(String name) {  
          //Creating new branch
          this.branchName.remove(name);
     for(Branch branch: this.branches){
         if(branch.getName().equals(name))
         {
             this.branches.remove(branch); 
         }
         
     }

    }
 
         
         
      
        public void AddBookToBranch(String BranchName, Library lib) {  
        
        for(Branch branch: this.branches)
        {
            if(BranchName.equals(branch.getName()))
            {
                branch.setLib(lib);
                System.out.println("Appending data in only branch: "+BranchName);
                break;
            }     
        }
        
        }
        
        public void AddMagazineToBranch(String BranchName, Library lib) {  
        
        for(Branch branch: this.branches)
        {
            if(BranchName.equals(branch.getName()))
            {
                branch.setLib(lib);
                break;
            }     
        }
        
        }
        
        public void UpdateBookToBranch(String BranchName, Book bk) {  
        
        for(Branch branch: this.branches)
        {
            if(BranchName.equals(branch.getName()))
            {
                Library lib = branch.getLib();
                ArrayList<Book> bc = lib.getBooklist().getBooklistCollection();
                for(int i =0 ; i< bc.size();i++){
                    if(bc.get(i).getRt().getRentId() == bk.getRt().getRentId()){
                        System.out.println("Updated rent for rent-id" + bc.get(i).getRt().getRentId());
                        bc.set(i, bk);
                         break;
                        
                    }
                }
                
                

               
            }     
        }
        
        }
        
        
         public void UpdateMagazineToBranch(String BranchName, Magazine bk) {  
        
        for(Branch branch: this.branches)
        {
            if(BranchName.equals(branch.getName()))
            {
                Library lib = branch.getLib();
                ArrayList<Magazine> bc = lib.getGeneralList().getMagazineCollection();
                for(int i =0 ; i< bc.size();i++){
                    if(bc.get(i).getRt().getRentId() == bk.getRt().getRentId()){
                        System.out.println("Updated rent for rent-id" + bc.get(i).getRt().getRentId());
                        bc.set(i, bk);
                         break;
                        
                    }
                }
                

            }     
        }
        
        }
        
     
      public Boolean branchAlreadyUsed (String branchName){
          for (String u : this.branchName) {
             if(u.equals(branchName)){
                return true;
            }
         }
        return false;
      }
      
     public Boolean branchAlreadyAssigned (String branchName, String designation){
          for (Branch u : this.branches) {
              ArrayList<Employee> emp = u.getLib().getEmployeelist().getEmployeelist();
              String getDesignationValue = "";
              for(int i=0;i < emp.size();i++) {
                  getDesignationValue = emp.get(i).getDesignation();
                  System.out.println("DesignationValue " +getDesignationValue);
                  if(u.getName().equals(branchName) && getDesignationValue.equals(designation) ){    
                return true;
            }
                  else {
                      return false; 
                  }
                 
              
                 
              }
              
            
         }
        return false;
        
      }

       
      
}