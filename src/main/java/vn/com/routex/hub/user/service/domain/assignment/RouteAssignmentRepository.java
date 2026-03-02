package vn.com.routex.hub.user.service.domain.assignment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteAssignmentRepository extends JpaRepository<RouteAssignment, String> {
    boolean existsByRouteId(String routeId);
}
