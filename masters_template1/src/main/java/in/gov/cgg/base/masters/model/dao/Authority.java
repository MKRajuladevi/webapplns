package in.gov.cgg.base.masters.model.dao;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by manojpotla on 3/8/2017.
 */
public class Authority implements GrantedAuthority {

    private String authority;

    public Authority(String authority){
        this.authority = authority;
    }
    @Override
    public String getAuthority() {
        return authority;
    }
}
