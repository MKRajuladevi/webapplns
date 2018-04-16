package in.gov.cgg.base.masters.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import in.gov.cgg.base.masters.mvc.GlobalConstants;
/*import in.gov.cgg.base.masters.model.dao.LoginUser;
import in.gov.cgg.base.masters.mvc.GlobalConstants;
import in.gov.cgg.base.masters.mvc.command.MenuCommand;*/
import in.gov.cgg.base.masters.mvc.util.ServiceToMenuMapper;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@ControllerAdvice
public class GlobalDefaultExceptionController{

    private static final Logger LOG = LoggerFactory.getLogger(GlobalDefaultExceptionController.class);

    @ExceptionHandler(value = Exception.class)
    public String defaultHandlerException(HttpServletRequest request, Exception exception, Authentication authentication, Model model){

        LOG.error("Request {} raised Exception {} ", request.getRequestURL(), exception.getMessage());
        /*LoginUser currentUser = (LoginUser)authentication.getPrincipal();
        List<MenuCommand> serviceMenu= ServiceToMenuMapper.mapServicesToMenu(currentUser);
        model.addAttribute("serviceMenu", serviceMenu);
        model.addAttribute("userName",  currentUser.getUsername());
        model.addAttribute("serviceException", GlobalConstants.ERROR_MESSAGE);*/
        return GlobalConstants.GENERIC_ERROR_VIEW_NAME;


    }
}
