package vn.com.routex.hub.user.service.application.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import vn.com.routex.hub.user.service.application.services.RouteSeatManagementService;
import vn.com.routex.hub.user.service.infrastructure.persistence.exception.BusinessException;
import vn.com.routex.hub.user.service.infrastructure.persistence.utils.ExceptionUtils;
import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatRequest;
import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatResponse;

import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ErrorConstant.TIMEOUT_ERROR;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ErrorConstant.TIMEOUT_ERROR_MESSAGE;

@Component
@RequiredArgsConstructor
public class RouteSeatManagementFacadeImpl implements RouteSeatManagementFacade{

    private final RouteSeatManagementService routeSeatManagementService;

    @Override
    public ResponseEntity<GetAllSeatResponse> getAllSeat(GetAllSeatRequest request) {
        GetAllSeatResponse response = routeSeatManagementService.getAllSeat(request);
        if(response == null) {
            throw new BusinessException(request.getRequestId(), request.getRequestDateTime(), request.getChannel(),
                    ExceptionUtils.buildResultResponse(TIMEOUT_ERROR, TIMEOUT_ERROR_MESSAGE));
        }
        response.setRequestId(request.getRequestId());
        response.setRequestDateTime(request.getRequestDateTime());
        response.setChannel(request.getChannel());
        if(response.getData() == null) {
            return new ResponseEntity<>(response , HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(response ,HttpStatus.OK);
    }
}
