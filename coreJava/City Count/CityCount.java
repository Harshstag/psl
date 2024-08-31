import com.sun.nio.sctp.SendFailedNotification;
import java.text.SimpleDateFormat;
import java.util.*;

public class CityCount extends Thread {
    private String city;
    private int count;
    private List<User> userList = new ArrayList<User>();

    CityCount() {

    }

    public CityCount(String city, List<User> userList) {
        this.city = city;
        this.userList = userList;
        this.count = 0;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public void run() {
        countCity();
    }

    private void countCity() {
        for (User user : userList) {
            if (user.getCity().equalsIgnoreCase(city)) {
                count++;
            }
        }

    }

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String date = "22-12-1999";
    sdf.parse(date)


}
