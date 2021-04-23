package kz.iitu.lms.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;


@Data
@NoArgsConstructor
public class UserRole implements GrantedAuthority {

    private Long id;

    private String role;

    public UserRole(Long id, String role) {
        this.id = id;
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
