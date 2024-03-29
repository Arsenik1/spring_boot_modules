package yte.intern.springsecurity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

@Entity
@Data // @Data annotation is a shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor annotations.
@RequiredArgsConstructor
public class Authorities implements GrantedAuthority{
    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany(mappedBy = "authorities")
    private Set<Users> userEntities;

    private String authority;
}
