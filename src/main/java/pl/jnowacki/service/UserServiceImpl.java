package pl.jnowacki.service;

import pl.jnowacki.dao.UserDao;
import pl.jnowacki.dao.UserDaoImpl;
import pl.jnowacki.model.User;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public boolean isUserValid(String login, String password) {
        User user = userDao.getUser(login);

        return user != null &&
               login.equals(user.getUsername()) &&
               password.equals(user.getPassword());
    }
}
