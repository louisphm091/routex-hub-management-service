package vn.com.routex.hub.user.service.application.services;

import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatRequest;
import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatResponse;
import vn.com.routex.hub.user.service.interfaces.models.seat.HoldSeatRequest;
import vn.com.routex.hub.user.service.interfaces.models.seat.HoldSeatResponse;

public interface RouteSeatManagementService {
    GetAllSeatResponse getAllSeat(GetAllSeatRequest request);

    HoldSeatResponse holdSeat(HoldSeatRequest request);
}
