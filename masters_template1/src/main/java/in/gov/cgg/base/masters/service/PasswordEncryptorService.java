package in.gov.cgg.base.masters.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import in.gov.cgg.base.masters.model.dao.LoginUser;


@Service
public class PasswordEncryptorService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    /*@Autowired
    private BCrypt bCrypt;*/

    public void encryptPassword(LoginUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
    }
    
   /* @SuppressWarnings("static-access")
	public boolean checkPassword(String passwordStr,LoginUser user){
        return bCrypt.checkpw(passwordStr, user.getPassword());
    }*/

}
