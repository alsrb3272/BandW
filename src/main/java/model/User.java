package model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String profile_img;

    private String gender;

    @Builder
    public User(Long id, String name, String email, String profile_img, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.profile_img = profile_img;
        this.gender = gender;
    }
}
