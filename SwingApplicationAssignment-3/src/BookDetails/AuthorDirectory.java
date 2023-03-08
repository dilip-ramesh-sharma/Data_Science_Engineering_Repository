/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookDetails;

import Material.Book;
import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class AuthorDirectory {
    private ArrayList<Author> authorlist;

    
    public AuthorDirectory(){
        this.authorlist = new ArrayList<Author>();
    }
    public ArrayList<Author> getAuthorlist() {
        return authorlist;
    }

    public void setAuthorlist(ArrayList<Author> authorlist) {
        this.authorlist = authorlist;
    }
    
    public Author addAuthor(String authorName){
        Author author = new Author();
        author.setAuthorName(authorName);
        this.authorlist.add(author);
        return author;
    }
    
    
}
