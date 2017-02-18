package Home_Work8;

import java.util.Optional;

public class UserDAO extends AbstractDAOImpl<User>{
    public void deleteById(long id){
        for (User u: list){
            if (u.getId() == id){
                list.remove(u);
                return;
            }
        }
    }

    public User get(long id){
        return list.stream().filter(user -> user.getId() == id).findFirst().get();
    }
}
