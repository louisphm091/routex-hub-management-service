package vn.com.routex.hub.user.service.interfaces.controller;


import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.routex.hub.user.service.application.facade.RouteManagementFacade;
import vn.com.routex.hub.user.service.interfaces.models.assignment.AssignRouteRequest;
import vn.com.routex.hub.user.service.interfaces.models.assignment.AssignRouteResponse;
import vn.com.routex.hub.user.service.interfaces.models.route.CreateRouteRequest;
import vn.com.routex.hub.user.service.interfaces.models.route.CreateRouteResponse;

import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ApiConstant.API_PATH;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ApiConstant.API_VERSION;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ApiConstant.ASSIGNMENT;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ApiConstant.CREATE;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ApiConstant.MANAGEMENT_PATH;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ApiConstant.ROUTE_SERVICE;

@RestController
@RequestMapping(API_PATH + API_VERSION + MANAGEMENT_PATH + ROUTE_SERVICE)
@RequiredArgsConstructor
public class RouteManagementController {

    private final RouteManagementFacade routeManagementFacade;

    @PostMapping(CREATE)
    public ResponseEntity<CreateRouteResponse> createRoute(@Valid @RequestBody CreateRouteRequest request) {
        return routeManagementFacade.createRoute(request);
    }

    @PostMapping(ASSIGNMENT)
    public ResponseEntity<AssignRouteResponse> assignRoute(@Valid @RequestBody AssignRouteRequest request) {
        return routeManagementFacade.assignRoute(request);
    }

}
