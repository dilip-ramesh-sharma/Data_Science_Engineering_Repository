/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;


import BookDetails.AuthorDirectory;
import BookDetails.GenreDirectory;
import Employee.EmployeeDirectory;
import Material.BookDirectory;
import Material.General;
import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class Library {
    String LibraryName;
    int buildingNo;
    EmployeeDirectory employeelist;
    BookDirectory booklist;
    AuthorDirectory authorCompleteList;
    GenreDirectory genreCompleteList;
    General generalList;

    public General getGeneralList() {
        return generalList;
    }

    public void setGeneralList(General generalList) {
        this.generalList = generalList;
    }
    


    public GenreDirectory getGenreCompleteList() {
        return genreCompleteList;
    }

    public void setGenreCompleteList(GenreDirectory genreCompleteList) {
        this.genreCompleteList = genreCompleteList;
    }

    public AuthorDirectory getAuthorCompleteList() {
        return authorCompleteList;
    }

    public void setAuthorCompleteList(AuthorDirectory authorCompleteList) {
        this.authorCompleteList = authorCompleteList;
    }
    

    public BookDirectory getBooklist() {
        return booklist;
    }
     
    public void setBooklist(BookDirectory booklist) {
        this.booklist = booklist;
    }

    public Library() {
        this.employeelist = new EmployeeDirectory();
        this.booklist = new BookDirectory();
        this.authorCompleteList = new AuthorDirectory();
        this.genreCompleteList = new GenreDirectory();
        this.generalList = new General();
    }

    public String getLibraryName() {
        return LibraryName;
    }

    public void setLibraryName(String LibraryName) {
        System.out.println("setLibraryName " +LibraryName);
        this.LibraryName = LibraryName;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public EmployeeDirectory getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(EmployeeDirectory employeelist) {
        this.employeelist = employeelist;
    }
    

}