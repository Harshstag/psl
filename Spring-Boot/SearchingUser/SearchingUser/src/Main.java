import com.spring.dao.OwnerDAO;
import com.spring.entity.Owner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger log = Logger.getLogger("org.hibernate");
        log.setLevel(Level.OFF);
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");

        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        OwnerDAO ownerDAO = (OwnerDAO) factory.getBean("ownerDAO");

        List<Owner> owners = ownerDAO.getAllOwners();
        for (Owner owner : owners) {
            System.out.println(owner.getName());
        }

        System.out.print("Enter the name of the person you want to search\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        String mobileNumber = ownerDAO.getOwnerNumberByName(name);
        if (mobileNumber != null) {
            System.out.println("You can contact " + name + " by " + mobileNumber);
        } else {
            System.out.println("No such owner!");
        }

        System.exit(0);
    }
}