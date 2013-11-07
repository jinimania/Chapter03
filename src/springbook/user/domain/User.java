package springbook.user.domain;

/**
 * Created with IntelliJ IDEA.
 * User: 2SsooN
 * Date: 2013. 11. 7.
 * Time: PM 11:53
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private String id;
    private String name;
    private String password;

    public User() {
    }

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
