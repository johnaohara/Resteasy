package org.jboss.resteasy.test.cdi.validation.resource;

import javax.validation.constraints.Size;

public class EjbParam
{
   @Size(min = 2, max = 25)
   private String param;

   public EjbParam() {
      param = "";
   }

   public EjbParam(String param) {
      this.param = param;
   }

   public void setParam(String param) {
      this.param = param;
   }

   public String getParam()
   {
      return param;
   }

}
