package cn.licoy.springcloud.microserviceprovideruser.repository;

import cn.licoy.springcloud.microserviceprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Licoy.cn
 * @version 1.0 /
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
