package vn.com.routex.hub.user.service.application.services;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import vn.com.routex.hub.user.service.domain.roles.Authorities;
import vn.com.routex.hub.user.service.interfaces.models.authorities.AddPermissionRequest;
import vn.com.routex.hub.user.service.interfaces.models.authorities.AddPermissionResponse;
import vn.com.routex.hub.user.service.interfaces.models.authorities.AddRoleRequest;
import vn.com.routex.hub.user.service.interfaces.models.authorities.AddRoleResponse;
import vn.com.routex.hub.user.service.interfaces.models.authorities.SetPermissionRequest;
import vn.com.routex.hub.user.service.interfaces.models.authorities.SetPermissionResponse;
import vn.com.routex.hub.user.service.interfaces.models.authorities.SetRoleRequest;
import vn.com.routex.hub.user.service.interfaces.models.authorities.SetRoleResponse;

import java.util.List;
import java.util.Set;

public interface AuthoritiesManagementService {
    AddRoleResponse addRole(AddRoleRequest request);
    AddPermissionResponse addPermission(AddPermissionRequest request);
    SetPermissionResponse setPermission(SetPermissionRequest request);
    SetRoleResponse setRole(SetRoleRequest request);
}
