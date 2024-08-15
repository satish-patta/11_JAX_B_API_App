package in.satish;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class MarshalDemo {
   public static void main(String... args) throws JAXBException {
	   Customer c = new Customer();
	   c.setCusEmail("satishpatta690@gmail.com");
	   c.setCusName("satish");
	   c.setCusId(101);
	   c.setCusPhn((long)12344553);
	   
	     JAXBContext context = JAXBContext.newInstance(Customer.class);
	     
	     Marshaller marshaller = context.createMarshaller();
	     
	     marshaller.marshal(c, new File("customer.xml"));
	     
	     System.out.println("XML created...");
	   
   }
}
