/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TIMS.app.auth.dao;

import TIMS.app.core.dao.BaseDao;
import TIMS.app.lib.hbm.TimsUser;
import java.util.List;

/**
 *
 * @author Nuwan Chathuranga <icechathuranga@gmail.com>
 */
public class UserDao extends BaseDao{

    public List getAllUsers() {        
       String sql = "FROM  TimsUser";
       return this.executeQuery(sql, false);
       
    }

    public TimsUser getUserByUserId(Integer userId) {
        return (TimsUser) getEntityByPrimaryKey(TimsUser.class, userId);
    }
    
     public TimsUser saveUser(TimsUser timsUser){
         
        if(timsUser.getId()==null){
            timsUser = (TimsUser) this.saveEntity(timsUser);
        }else{
            this.updateEntity(timsUser);
            timsUser = this.getUserByUserId(timsUser.getId());
        }
        
        return timsUser;
    }

    public int deleteUserById(Integer userid) {        
        return this.deletEntityByPrimaryKey(TimsUser.class, userid);
    }
}
