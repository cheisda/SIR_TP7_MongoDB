package Cheisda_SonicMongoDB;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * Created by Cheisda on 23/04/2016.
 */
@Entity("personne")
public class Person {

  private String name;
  @Id
  private ObjectId idPerson;
  public String surname;
  @Embedded
  private List<Address> lstAdress;
  public Address address;

  public ObjectId getIdPerson() {
    return idPerson;
  }

  public void setIdPerson(ObjectId idPerson) {
    this.idPerson = idPerson;
  }

  public Address getAdress() {
    return address;
  }

  public void setAddress(Address adress) {
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String toString(){
    return ("prénom : " + this.name +", nom : "+ this.surname+", id : "+ this.idPerson +", adresse : "+this.lstAdress);
  }
}

