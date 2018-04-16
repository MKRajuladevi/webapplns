package in.gov.cgg.base.masters.mvc.util;

import org.json.JSONArray;

/*import in.gov.cgg.base.masters.model.dao.LoginUser;
import in.gov.cgg.base.masters.model.dao.Role;
import in.gov.cgg.base.masters.model.dao.Services;
import in.gov.cgg.base.masters.model.dao.UserRole;
import in.gov.cgg.base.masters.mvc.command.MenuCommand;*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceToMenuMapper {

    /*public static JSONArray createJsonServiceMenu(LoginUser currentUser) {
        List<MenuCommand> menuCommandList = mapServicesToMenu(currentUser);
        return new JSONArray(menuCommandList);
    }*/

    /*public static List<MenuCommand> mapServicesToMenu(LoginUser LoginUser){
        List<Services> servicesToBeMapped = retrieveServices(LoginUser);
        if(Objects.nonNull(servicesToBeMapped) && !servicesToBeMapped.isEmpty()) {
            return mapServicesToMenu(servicesToBeMapped);
        }
        return null;
    }*/


    /*private static List<Services> retrieveServices(LoginUser LoginUser) {
        List<UserRole> userRolesList = LoginUser.getUserRoleCode();
        List<Services> servicesList = new ArrayList<>();
        if(Objects.nonNull(userRolesList) && !userRolesList.isEmpty()) {
            userRolesList.forEach(userRole -> {
                Role role = userRole.getRole();
                role.getRoleServicesList().forEach(roleServices -> {
                    Services services = roleServices.getServices();
                    servicesList.add(services);
                });
            });
        }
        return servicesList;
    }*/

    /*private static List<MenuCommand> mapServicesToMenu(List<Services> servicesToBeMapped) {
        List<MenuCommand> menuCommandList = new ArrayList<>();
        servicesToBeMapped.forEach(services -> {
            MenuCommand menuCommand = new MenuCommand();
            menuCommand.setServiceId(services.getId());
            menuCommand.setServiceName(services.getServiceName());
            menuCommand.setTargetUrl(services.getServiceUrl());
            menuCommand.setParentId(services.getServices().getId());
            menuCommand.setDisplayId((services.getDisplayId()));
            menuCommandList.add(menuCommand);

        });
        return menuCommandList;
    }*/


}
