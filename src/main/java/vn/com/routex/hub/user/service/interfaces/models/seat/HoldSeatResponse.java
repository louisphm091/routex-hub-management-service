package vn.com.routex.hub.user.service.interfaces.models.seat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import vn.com.routex.hub.user.service.interfaces.models.base.BaseResponse;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class HoldSeatResponse extends BaseResponse {
    private List<HoldSeatResponseData> data;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @SuperBuilder
    public static class HoldSeatResponseData {
        private String routeId;
        private String seatNo;
        private String status;
        private OffsetDateTime holdUntil;
        private String holdBy;
    }
}
