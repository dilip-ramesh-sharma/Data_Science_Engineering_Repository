/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Material;

import Rental.Rent;
import java.util.Date;

/**
 *
 * @author 91730
 */
public class Book extends Material {
    
    String typeOfBinding;
    int noOfPages;
    String languages;
    String AuthorName;
    String genre;
    String location;
    Rent rt;

    public Book() {
         super();
         this.rt = new Rent();
    }

    public Book(String typeOfBinding, int noOfPages, String languages, String AuthorName, String genre,String location) {
        this.typeOfBinding = typeOfBinding;
        this.noOfPages = noOfPages;
        this.languages = languages;
        this.AuthorName = AuthorName;
        this.genre = genre;
        this.location = location;
    }

    public Rent getRt() {
        return rt;
    }

    public void setRt(Rent rt) {
        this.rt = rt;
    }


    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

   

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
     
    
    
}
