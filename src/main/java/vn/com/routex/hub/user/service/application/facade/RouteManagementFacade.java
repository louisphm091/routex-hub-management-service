package vn.com.routex.hub.user.service.application.facade;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import vn.com.routex.hub.user.service.interfaces.models.assignment.AssignRouteRequest;
import vn.com.routex.hub.user.service.interfaces.models.assignment.AssignRouteResponse;
import vn.com.routex.hub.user.service.interfaces.models.route.CreateRouteRequest;
import vn.com.routex.hub.user.service.interfaces.models.route.CreateRouteResponse;

public interface RouteManagementFacade {

    ResponseEntity<CreateRouteResponse> createRoute(CreateRouteRequest request);

    ResponseEntity<AssignRouteResponse> assignRoute(AssignRouteRequest request);
}
