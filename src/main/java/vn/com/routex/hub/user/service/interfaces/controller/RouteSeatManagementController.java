package vn.com.routex.hub.user.service.interfaces.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.routex.hub.user.service.application.facade.RouteSeatManagementFacade;
import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatRequest;
import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatResponse;

import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ApiConstant.API_PATH;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ApiConstant.API_VERSION;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ApiConstant.MANAGEMENT_PATH;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ApiConstant.ROUTE_SERVICE;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ApiConstant.SEAT_PATH;

@RestController
@RequestMapping(API_PATH + API_VERSION + MANAGEMENT_PATH)
@RequiredArgsConstructor
public class RouteSeatManagementController {

    private final RouteSeatManagementFacade routeSeatManagementFacade;

    @PostMapping(ROUTE_SERVICE + SEAT_PATH)
    public ResponseEntity<GetAllSeatResponse> getAvailableSeat(@Valid @RequestBody GetAllSeatRequest request) {
        return routeSeatManagementFacade.getAllSeat(request);
    }
}
