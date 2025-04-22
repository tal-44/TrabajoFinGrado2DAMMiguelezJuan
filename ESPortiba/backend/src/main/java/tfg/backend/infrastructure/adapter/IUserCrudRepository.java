package tfg.backend.infrastructure.adapter;

import tfg.backend.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserCrudRepository extends CrudRepository<UserEntity, Integer> {

}
