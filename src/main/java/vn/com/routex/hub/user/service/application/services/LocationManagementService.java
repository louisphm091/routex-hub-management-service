package vn.com.routex.hub.user.service.application.services;

import org.springframework.data.domain.Page;
import vn.com.routex.hub.user.service.interfaces.models.location.SearchLocationResponse;

public interface LocationManagementService {
    SearchLocationResponse searchLocation(String keyword, int page, int size);
}
