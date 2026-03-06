package vn.com.routex.hub.user.service.application.services;

import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatRequest;
import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatResponse;

public interface RouteSeatManagementService {
    GetAllSeatResponse getAllSeat(GetAllSeatRequest request);
}
