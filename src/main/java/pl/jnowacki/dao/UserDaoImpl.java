package pl.jnowacki.dao;

import pl.jnowacki.model.User;

public class UserDaoImpl implements UserDao {

    @Override
    public User getUser(String userLogin) {
        return new User(1L, userLogin, "asd");
    }
}
