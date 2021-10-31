package mate.academy.service.impl;

import java.util.Optional;
import mate.academy.dao.UserDao;
import mate.academy.exception.AuthenticationException;
import mate.academy.lib.Inject;
import mate.academy.model.User;
import mate.academy.service.UserService;

public class UserServiceImpl implements UserService {
    @Inject
    UserDao userDao;

    @Override
    public User add(User user) {
        return userDao.add(user);
    }

    @Override
    public Optional<User> findByEmail(String email) {
       return userDao.findByEmail(email);
    }
}
