package vn.com.routex.hub.user.service.interfaces.models.seat;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import vn.com.routex.hub.user.service.interfaces.models.base.BaseResponse;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class GetAllSeatResponse extends BaseResponse {
    private List<GetAvailableSeatResponseData> data;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @SuperBuilder
    public static class GetAvailableSeatResponseData {
        private String routeId;
        private String seatNo;
        private String status;
        private String ticketId;
    }
}
