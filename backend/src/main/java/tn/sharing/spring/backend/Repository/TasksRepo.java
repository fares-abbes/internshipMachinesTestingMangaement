package tn.sharing.spring.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.sharing.spring.backend.Entity.Tasks;

import java.util.List;

@Repository
public interface TasksRepo extends JpaRepository<Tasks, Integer> {
    List<Tasks> findByUsers_Id(int userId);

    List<Tasks> findByProject_ProjectId(int projectId);
}
