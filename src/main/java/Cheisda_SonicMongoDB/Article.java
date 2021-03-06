package Cheisda_SonicMongoDB;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cheisda on 23/04/2016.
 */

@Entity
public class Article {
  @Id
  private ObjectId idArticle;
  private String name;
  private int stars;
  @Embedded
  private List<Person> buyers;

  public Article() {
    this.buyers=new ArrayList<Person>();
  }

  public ObjectId getId() {
    return idArticle;
  }

  public void setId(ObjectId id) {
    this.idArticle = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStars() {
    return stars;
  }

  public void setStars(int stars) {
    this.stars = stars;
  }

  public void setBuyer(Person person) {
    this.buyers.add(person);
  }

  public List<Person> getBuyers() {
    return buyers;
  }

  public String toString(){
    return "Name : "+this.name+"\nId : "+this.idArticle+"\nStars : "+this.stars+"\nBuyers : "+this.buyers;
  }
}
