package in.gov.cgg.base.masters.mvc.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MenuCommand {

   private int serviceId;
   private String targetUrl;
   private String serviceName;
   private int displayId;
   private int parentId;
}
