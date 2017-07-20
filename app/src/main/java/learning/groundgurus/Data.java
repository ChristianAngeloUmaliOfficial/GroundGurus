package learning.groundgurus;

/**
 * Created by Wanda on 7/20/2017.
 */

public class Data
{
    private String email;

    private String name;

    private String user_id;

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getUser_id ()
    {
        return user_id;
    }

    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [email = "+email+", name = "+name+", user_id = "+user_id+"]";
    }
}
