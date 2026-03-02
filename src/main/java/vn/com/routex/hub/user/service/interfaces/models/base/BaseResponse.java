package vn.com.routex.hub.user.service.interfaces.models.base;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import vn.com.routex.hub.user.service.interfaces.models.result.ApiResult;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseResponse {
    private String requestId;
    private String requestDateTime;
    private String channel;
    private ApiResult result;
}
