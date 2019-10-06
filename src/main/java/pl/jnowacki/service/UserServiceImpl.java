package pl.jnowacki.service;

public class UserServiceImpl implements UserService {

    @Override
    public boolean isUserValid(String login, String password) {
        // wywolać getUser z DAO i porównać name i pwd
    }
}
