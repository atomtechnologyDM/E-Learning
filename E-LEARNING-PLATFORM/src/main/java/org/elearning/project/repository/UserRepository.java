package org.elearning.project.repository;

import org.elearning.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByEmail(String email);
    public User findByEmailAndPassword(String email,String password);
}
