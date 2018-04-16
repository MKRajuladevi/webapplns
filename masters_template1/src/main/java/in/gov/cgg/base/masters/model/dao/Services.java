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
@Table(name = "login_services")
public class Services {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "service_id")
    private int serviceID;

    @Column(name = "service_name")
    private String serviceName;
    
    @Column(name = "parent_id")
    private int parentID;
    
    @Column(name = "priority")
    private String priority;

    @Column(name = "delete_flag")
    private boolean deleteFlag;

    /*@Column(name = "ipaddress")
    private String ipaddress;*/
    
    @Column(name = "target")
    private String target;
    
    @Column(name = "timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTimestamp;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "display")
    private boolean display;

    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "display_id")
    private int displayId;
    
    @Column(name = "path")
    private String path;
    
    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTimestamp;

}
