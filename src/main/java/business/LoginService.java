package business;

import data.User;
import data.UserRepository;

/**
 * Business Layer: Authenticates users by checking plain passwords.
 */
public class LoginService {
    private UserRepository repo;

    public LoginService(UserRepository repo) {
        this.repo = repo;
    }

    public User authenticate(String email, String password) {
        User user = repo.getUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
