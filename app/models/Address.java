package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Address extends Model {
    @Id
    private Long id;

    @Constraints.Required
    private String address;

    public Address() {
    }

    public Address(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getAddress(){
        return this.address;
    
}
    public void setAddress(String address){
        this.address=address;
    }
}