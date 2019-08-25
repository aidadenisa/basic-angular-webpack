package ilab.repository;

import ilab.model.UserAccount;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserAccount,Long> {
    UserAccount findByEmail(String email);
}
