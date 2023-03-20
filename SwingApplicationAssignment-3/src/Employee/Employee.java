/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import Library.Library;
import Profile.Profile;

/**
 *
 * @author 91730
 */
public class Employee extends Profile {
    int EmployeeId;
    String designation;
    int experience;
    
    
    String libraryName;

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
    
    
    
    public Employee() {
        super();
    
    }

    public Employee(int EmployeeId, String designation, int experience, Library lib) {
        this.EmployeeId = EmployeeId;
        this.designation = designation;
        this.experience = experience;
    }
    

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

}