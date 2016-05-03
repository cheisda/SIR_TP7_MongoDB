package Cheisda_SonicMongoDB;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

import java.net.UnknownHostException;

/**
 * Hello world!
 *
 */
public class App
{
   /* public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }*/
   public static void main( String[] args ) throws UnknownHostException
   {
     Morphia morphia = new Morphia(

     );
     Mongo mongo = new Mongo();
     morphia.map(Person.class).map(Address.class);
     Datastore ds = morphia.createDatastore(mongo, "test");

     //Creation des personnes
     Person p = new Person();
     p.setName("Tintin");
     p.setSurname("Dubois");
     Person p2 = new Person();
     p2.setName("Ji Young");
     p2.setSurname("Park");
     Person p3 = new Person();
     p3.setName("Jackson");
     p3.setSurname("Wang");

     //Creation des adresses
     Address address = new Address();
     address.setStreet("123 Some street");
     address.setCity("Some city");
     address.setPostCode("123 456");
     address.setCountry("Some country");
     Address address1 = new Address();
     address1.setStreet("1 allée des Joncquilles");
     address1.setCity("Bain de Bretagne");
     address1.setPostCode("35569");
     address1.setCountry("FRANCE");
     Address address2 = new Address();
     address2.setStreet("1 Namsam Tower street");
     address2.setCity("Seoul");
     address2.setPostCode("36988");
     address2.setCountry("South Korea");

         //set address
     p.setAddress(address);
     p2.setAddress(address1);
     p3.setAddress(address2);
     // Save the POJO
     ds.save(p);
     ds.save(p2);
     ds.save(p3);

     //Affichage des personnes enregistrées en base
     System.err.println("---------PEOPLE----------");
     for (Person e : ds.find(Person.class)){
       System.err.println(e.toString());
     }

     System.err.println("----------------------");
     //Creation des articles
     Article art1 = new Article();
     art1.setName("Instax FujiFilm ");
     art1.setStars(5);
     art1.setBuyer(p3);
     Article art2 = new Article();
     art2.setName("Watch Totoro ");
     art2.setStars(4);
     art2.setBuyer(p2);
     Article art3 = new Article();
     art3.setName("Eastpak");
     art3.setStars(4);
     art3.setBuyer(p);
     art3.setBuyer(p3);
     // Sauvegarde des articles en base
     ds.save(art1);
     ds.save(art2);
     ds.save(art3);
     //Affichage des articles enregistrés en base
     System.err.println("---------ARTICLES----------");
     for (Article art : ds.find(Article.class)){
       System.err.println(art.toString());
     }
     System.err.println("----------------------");
   }
}
