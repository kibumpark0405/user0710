package user.domain;

import user.UserApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="User_table")
@Data

public class User  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private String userId;
    
    
    
    
    
    private String age;
    
    
    
    
    
    private Country ;


    public static UserRepository repository(){
        UserRepository userRepository = UserApplication.applicationContext.getBean(UserRepository.class);
        return userRepository;
    }






}
