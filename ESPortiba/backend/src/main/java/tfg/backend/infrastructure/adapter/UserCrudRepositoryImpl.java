package tfg.backend.infrastructure.adapter;

import tfg.backend.domain.model.User;
import tfg.backend.domain.port.IUserRepository;
import tfg.backend.infrastructure.mapper.UserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserCrudRepositoryImpl implements IUserRepository {
    private final IUserCrudRepository iUserCrudeRepository;
    private final UserMapper userMapper;

    public UserCrudRepositoryImpl(IUserCrudRepository iUserCrudeRepository, UserMapper userMapper) {
        this.iUserCrudeRepository = iUserCrudeRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User save(User user) {
       return userMapper.toUser(iUserCrudeRepository.save(userMapper.toUserEntity(user)));
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.toUser(iUserCrudeRepository.findById(id).get());
    }
}
