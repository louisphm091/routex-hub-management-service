package vn.com.routex.hub.user.service.application.facade;

import org.springframework.http.ResponseEntity;
import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatRequest;
import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatResponse;

public interface RouteSeatManagementFacade {

    ResponseEntity<GetAllSeatResponse> getAllSeat(GetAllSeatRequest request);
}
