package Cheisda_SonicMongoDB;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import org.bson.types.ObjectId;

/**
 * Created by Cheisda on 23/04/2016.
 */
@Embedded
public class Address {

  private String street;
  private String city;
  private String postCode;
  private String country;

  //Constructeur vide
  public Address(){

  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

 public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
  public String toString(){
    return ("Rue : " + this.street +", Ville : "+ this.city+", Code postal : "+ this.postCode +", pays : "+this.country);
  }
}
