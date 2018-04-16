package in.gov.cgg.base.masters.model.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ba_departments_st_mst")
public class Department {

	@Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "dept_code")
    private int deptCode;

    @Column(name = "dept_name")
    private String deptName;

    @Column(name = "state_ut_code")
    private int stateUTCode;

    @Column(name = "status")
    private int status_code;

    @Column(name = "active")
    private boolean active_flag;

    @Column(name = "updated_by")
    private String updated_by;

    @Column(name = "updated_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    
}

