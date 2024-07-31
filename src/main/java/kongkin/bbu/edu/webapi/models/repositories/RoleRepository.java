package kongkin.bbu.edu.webapi.models.repositories;


import kongkin.bbu.edu.webapi.models.ERole;
import kongkin.bbu.edu.webapi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
