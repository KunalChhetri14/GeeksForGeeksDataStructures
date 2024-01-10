package Java8.StreamsAPI;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class UserDTO {


    int id;
    String username;

    String email;

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDTO(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }


}
class User {

    int id;
    String username;

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String password;
    String email;
}
public class MapStreams {

    public static void main(String args[]) {

        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "kunal", "kunal123", "kunalchhetri14@gmail.com"));
        userList.add(new User(2, "kunal2", "kunal1234", "kunalchhetri15@gmail.com"));
        userList.add(new User(1, "kunal3", "kunal1235", "kunalchhetri164@gmail.com"));

        //tradionally
//        List<UserDTO> userDTOList = new ArrayList<>();
//        for(User user: userList) {
//            userDTOList.add(new UserDTO(user.getId(), user.getUsername(), user.getEmail()));
//        }
//        System.out.println(userDTOList);

        //using streams
        List<UserDTO> userDTOList = userList.stream().map(i -> new UserDTO(i.getId(), i.getUsername(), i.getEmail())).collect(Collectors.toList());
    }

}
