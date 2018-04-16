package in.gov.cgg.base.masters.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.gov.cgg.base.masters.model.dao.LoginUser;
import in.gov.cgg.base.masters.repository.LoginUserRepository;


@Service
public class UserSecurityService implements UserDetailsService{

    private static final Logger LOG = LoggerFactory.getLogger(UserSecurityService.class);
    @Autowired
    LoginUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userID) throws UsernameNotFoundException {
        LoginUser user = userRepository.findByUserIDIgnoreCase(userID);
        if(user == null){
            LOG.warn("Username " + userID + " not found");
            throw new UsernameNotFoundException(userID);
        }

        return user;
    }
}
