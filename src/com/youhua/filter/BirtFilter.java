 /**
  *   * BirtFilter.java 2009-8-21
  * by shoru
  */
  package com.youhua.filter;
  
  import java.io.IOException;
  import java.util.HashMap;
  import java.util.Map;
  import java.util.Set;
  
  import javax.servlet.Filter;
  import javax.servlet.FilterChain;
  import javax.servlet.FilterConfig;
  import javax.servlet.RequestDispatcher;
  import javax.servlet.ServletContext;
  import javax.servlet.ServletException;
  import javax.servlet.ServletRequest;
  import javax.servlet.ServletResponse;
  import javax.servlet.http.HttpServletRequest;
  
  /**
   * BirtViewer和Struts2框架整合必须配置此拦截器。 如下配置web.xml，注意struts2的核心过滤器必须配置在BirtFilter之后。
   * <filter>
   *        <filter-name>BirtFilter</filter-name>
   *         <filter-class>com.linkage.system.filter.BirtFilter</filter-class>
   * </filter>
   * <filter-mapping>
   *        <filter-name>BirtFilter</filter-name>
   *         <url-pattern>/*</url-pattern>
   * </filter-mapping>
   * 
   * @description
   * @author Shoru
   * @date 2009-8-21
   * @version 1.0.0
   * @since 1.0
   */
  public class BirtFilter implements Filter {
      /**
       * 容器，封装birt相关功能的uri和所对应Servlet名的键值对
       */
      Map<String, String> map = new HashMap<String, String>();
  
      /**
       * Context.
       */
      ServletContext context;
  
      /**
       * debug开关
       */
      static boolean debug = false;
  
      /**
       * @description
       * @author Shoru
       * @date 2009-8-21
       * @version 1.0.0
       */
      public void destroy() {
          map = null;
      }
  
      /**
       * 过滤birt请求，转发到对应的servlet，以绕过其他过滤器，e.g. struts2
       * 
       * @description
       * @author Shoru
       * @date 2009-8-21
       * @version 1.0.0
       * @param request
       * @param response
       * @param fc
       * @throws IOException
       * @throws ServletException
       */
      public void doFilter(ServletRequest request, ServletResponse response,
                           FilterChain fc)
          throws IOException, ServletException {
  
          HttpServletRequest req = (HttpServletRequest)request;
          String uri = req.getRequestURI();
          if (debug) {
              System.out.println(">>>Requesting " + uri + "?"
                                 + req.getQueryString());
          }
          Set<String> keys = map.keySet();
  
          for (String key : keys) {
              /*
               * TODO:这里的判断只是简单地调用contains方法，这样就带来较多限制。
               * 比如工程子目录的命名、struts2命名空间等都受到birtViewer的约束。待改进。
               */
              if (uri.contains(key)) {
                  RequestDispatcher rd = this.context.getNamedDispatcher(map.get(key));
                  if (rd != null) {
                      if (debug) {
                          System.out.println(">>>Redirect successfully executed");
                     }
                     // 跳过其他过滤器，跳转到对应的servlet
                     rd.forward(request, response);
                 } else {
                     if (debug) {
                         System.out.println(">>>Redirect unsuccessfully executed");
                     }
                }
                 return;
            }
         }
 
         // 将请求交给下一个过滤器
         fc.doFilter(request, response);
     }
 
     /**
      * @description
      * @author Shoru
      * @date 2009-8-21
      * @version 1.0.0
      * @param fc
      * @throws ServletException
      */
     public void init(FilterConfig fc)
         throws ServletException {
 
         this.context = fc.getServletContext();
         /*
          * 这里注意，在项目目录的命名时，不要取和birt内置的一些servlet名重复。 请根据项目的web.xml自行配置。
          * （包括frameset、run、preview、download、parameter、document、output）
          */
         map.put("frameset", "ViewerServlet");
         map.put("preview", "EngineServlet");
     }
 }