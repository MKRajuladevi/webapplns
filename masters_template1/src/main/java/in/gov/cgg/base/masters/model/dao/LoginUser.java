package in.gov.cgg.base.masters.model.dao;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "login_users_mst")
public class LoginUser implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="user_id")
    private String userID;

    @Column(name = "user_password")
    private String password;
    
    @Column(name = "user_password_old")
    private String passwordOld;

    @Column(name = "user_pre_pwd")
    private String prePassword;
    
    @Column(name = "user_pswd_expiry_dt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pswdExpiryDt;
    
    @Column(name = "conf_pswd_code")
    private String confPasswordCode;
    
    @Column(name = "user_role_code")
    private int userRoleCode;
    
    @Column(name = "dept_officer_code")
    private int deptOfficerCode;
    
    @Column(name = "status")
    private int statusCode;
    
    @Column(name = "user_display_name")
    private int userDisplayName;
    
    @Column(name = "enter_by")
    private String enterBy;
    
    @Column(name = "enter_dt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enterDt;

    @Column(name = "last_login")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;

    @Column(name="user_deleted_flag")
    private boolean userDeletedFlag;

    @Column(name="country_level_code")
    private int countryLevelCode;
    
    @Column(name="state_level_code")
    private int stateLevelCode;
    
    @Column(name="dist_level_code")
    private int distLevelCode;
    
    @Column(name="block_mandal_level_code")
    private int blockMandalLevelCode;
    
    @Column(name="college_others_level_code")
    private int collegeOthersLevelCode;
    
    @Column(name = "user_email_id")
    private String userEmailID;
    
    @Column(name = "user_contact_num1")
    private String userContactNum1	;
    
    @Column(name = "user_contact_num2")
    private String userContactNum2;
    
    @Column(name = "updated_by")
    private String updatedBy;
    

    /*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @Valid
    private List<UserRole> userRoles;*/

   /* @ManyToOne
    @JoinColumn(name="district_id", insertable=false, updatable=false, nullable = true)
    private District district;*/

   /* @OneToOne
    @JoinColumn(name = "department_id", insertable = false, updatable = false)
    private Department department;*/


    /*@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<>();
        userRoles.forEach(userRole -> authorities.add(new Authority(userRole.getRole().getRoleName())));
        return authorities;
    }*/

    @Override
    public String getPassword() {
        //return this.password;
    	//dummy123 => password
        return "$2a$12$OqlhUs1YTYgxO68cQMP1iO7vC6gDjBp231RIuIsfVfXRo6DETkb3C";
    }

    @Override
    public String getUsername() {
        return this.userID;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}*/
}
