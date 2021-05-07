package Hometask6.DataMapper;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser() {
        userRepository.findUserById();
    }
}
