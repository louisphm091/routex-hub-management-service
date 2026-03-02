package vn.com.routex.hub.user.service.interfaces.models.route;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import vn.com.routex.hub.user.service.interfaces.models.base.BaseRequest;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CreateRouteRequest extends BaseRequest {
    private CreateRouteRequestData data;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @SuperBuilder
    public static class CreateRouteRequestData {

        @NotBlank
        @NotNull
        private String origin;

        @NotBlank
        @NotNull
        private String destination;

        @NotBlank
        @NotNull
        private String plannedStartTime;

        @NotBlank
        @NotNull
        private String plannedEndTime;
        private List<RouteStopPoints> stopPoints;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @SuperBuilder
    public static class RouteStopPoints {
        private String stopOrder;
        private String plannedArrivalTime;
        private String plannedDepartureTime;
        private String note;
    }
}
