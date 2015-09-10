package person.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by gbeuhler on 9/9/15.
 */
@Entity
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private List<Person> members;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public List<Person> getMembers() {
        return members;
    }


}
