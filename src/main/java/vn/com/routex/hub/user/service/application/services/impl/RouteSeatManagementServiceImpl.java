package vn.com.routex.hub.user.service.application.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.com.routex.hub.user.service.application.services.RouteSeatManagementService;
import vn.com.routex.hub.user.service.domain.seat.RouteSeat;
import vn.com.routex.hub.user.service.domain.seat.RouteSeatRepository;
import vn.com.routex.hub.user.service.infrastructure.persistence.exception.BusinessException;
import vn.com.routex.hub.user.service.infrastructure.persistence.utils.ExceptionUtils;
import vn.com.routex.hub.user.service.interfaces.models.result.ApiResult;
import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatRequest;
import vn.com.routex.hub.user.service.interfaces.models.seat.GetAllSeatResponse;

import java.util.List;
import java.util.stream.Collectors;

import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ErrorConstant.RECORD_NOT_FOUND;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ErrorConstant.ROUTE_SEAT_NOT_FOUND;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ErrorConstant.SUCCESS_CODE;
import static vn.com.routex.hub.user.service.infrastructure.persistence.constant.ErrorConstant.SUCCESS_MESSAGE;

@Service
@RequiredArgsConstructor
public class RouteSeatManagementServiceImpl implements RouteSeatManagementService {

    private final RouteSeatRepository routeSeatRepository;
    @Override
    public GetAllSeatResponse getAllSeat(GetAllSeatRequest request) {

        List<RouteSeat> routeSeatList = routeSeatRepository.findAllByRouteIdOrderBySeatNoAsc(request.getData().getRouteId());

        if(routeSeatList.isEmpty()) {
            throw new BusinessException(request.getRequestId(), request.getRequestDateTime(), request.getChannel(),
                    ExceptionUtils.buildResultResponse(RECORD_NOT_FOUND, String.format(ROUTE_SEAT_NOT_FOUND, request.getData().getRouteId())));
        }
        List<GetAllSeatResponse.GetAvailableSeatResponseData> responseDataList = routeSeatList
                .stream()
                .map(rs -> GetAllSeatResponse.GetAvailableSeatResponseData.builder()
                        .routeId(rs.getRouteId())
                        .seatNo(rs.getSeatNo())
                        .status(rs.getStatus().name())
                        .ticketId(rs.getTicketId())
                        .build())
                .collect(Collectors.toList());

        return GetAllSeatResponse.builder()
                .requestId(request.getRequestId())
                .requestDateTime(request.getRequestDateTime())
                .channel(request.getChannel())
                .result(ApiResult.builder()
                        .responseCode(SUCCESS_CODE)
                        .description(SUCCESS_MESSAGE)
                        .build())
                .data(responseDataList)
                .build();
    }
}
