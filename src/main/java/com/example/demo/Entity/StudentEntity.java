import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValve;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
public class student {
    private integer id;
    private String name;
    private String email;
    private LocalDate dob;
    private float cgpa;


public integer getId() {
    return id;
}

public void setId(integer id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}


public student(){

}

public student(integer id, String name, String email, LocalDate dob, float cgpa) {
    this.id = id;
    this.name = name;
    this.email = email;
   
}

}