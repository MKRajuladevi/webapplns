package in.gov.cgg.base.masters.model.dao;

import lombok.*;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@lombok.RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "login_roles_services", uniqueConstraints = @UniqueConstraint(columnNames = {"roleid", "service_id"}))
public class UserRole {

    private static final long serialVersionUID = 1L;

    @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="roleid")
    @NonNull
    @NotNull
    @Valid
    private UserRole role;

}
