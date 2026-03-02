package vn.com.routex.hub.user.service.application.services;

import vn.com.routex.hub.user.service.interfaces.models.assignment.AssignRouteRequest;
import vn.com.routex.hub.user.service.interfaces.models.assignment.AssignRouteResponse;
import vn.com.routex.hub.user.service.interfaces.models.route.CreateRouteRequest;
import vn.com.routex.hub.user.service.interfaces.models.route.CreateRouteResponse;

public interface RouteManagementService {

    CreateRouteResponse createRoute(CreateRouteRequest request);

    AssignRouteResponse assignRoute(AssignRouteRequest request);
}
