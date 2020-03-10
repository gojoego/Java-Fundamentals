package mysql.chatapp;

/*
 how to query all Users from the DB,
  and then map the ResultSet to an ArrayList of User objects
 */

//POJO


public class Users {

    int id;
    String f_name;
    String l_name;
    String email;
    String username;
    int profile_pic_id;
    int status;

    public Users(int id, String f_name, String l_name, String email, String username, int profile_pic_id, int status) {
        this.id = id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.username = username;
        this.profile_pic_id = profile_pic_id;
        this.status = status;
    }

    public Users(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getProfile_pic_id() {
        return profile_pic_id;
    }

    public void setProfile_pic_id(int profile_pic_id) {
        this.profile_pic_id = profile_pic_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", profile_pic_id=" + profile_pic_id +
                ", status=" + status +
                '}';
    }


}
