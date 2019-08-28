package primer.object_t;

/**
 * @author 陈枫 on 2019-06-30.
 */
public class User {
    int id;
    String name;
    String pwd;

    public User(int id, String name, String pwd) {
        super();
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return false;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        User other = (User) obj;
        if (id != other.id) {
            return false;
        }
        return true;

    }




}
