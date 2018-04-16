package in.gov.cgg.base.masters.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.gov.cgg.base.masters.model.dao.LoginUser;


@Repository
public interface LoginUserRepository extends CrudRepository<LoginUser, Long>{

	//findByXXXXIgnoreCase (XXXX is the actual property name in LoginUser class)
    public LoginUser findByUserIDIgnoreCase(String userID);

    //deleteByXXXX (XXXX is the actual property name in LoginUser class)
    public void deleteByUserID(String userID);

}
