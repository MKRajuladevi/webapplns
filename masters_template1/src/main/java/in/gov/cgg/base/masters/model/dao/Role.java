package in.gov.cgg.base.masters.model.dao;

import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@NoArgsConstructor
@lombok.RequiredArgsConstructor
@EqualsAndHashCode(exclude = "id")
@Getter
@Setter
@Entity
@Table(name = "login_user_roles_mst")
public class Role implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_role_code")
    private long userRoleCode;

    @NotBlank
    //@Size(min=4, max = 100)
    @NonNull
    @Column(name = "user_role_name")
    private String roleName;

    @Column(name = "description")
    private boolean description;
    
    @Column(name = "hierarchy_lvl_code")
    private int hierarchyLvlCode;
    
    @Column(name = "active_status")
    private String activeStatus;	
    
    @Column(name = "delete_flag")
    private boolean deleteFlag;
    
    @Column(name = "updated_by")
    private String updatedBy;	

    @Column(name = "updated_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_timestamp;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_role_code")
    private List<RoleServices> roleServicesList;

}
