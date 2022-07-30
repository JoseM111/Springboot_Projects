package josem111.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <everything it uses>
 @Target(value=TYPE)
 @Retention(value=RUNTIME)
 @Documented
 @Controller
 @ResponseBody
 <public @interface RestController>
 A convenience annotation that is itself annotated with @Controller and @ResponseBody.
 Types that carry this annotation are treated as controllers where @RequestMapping
 methods assume @ResponseBody semantics by default.
 NOTE: @RestController is processed if an appropriate HandlerMapping-HandlerAdapter
 pair is configured such as the RequestMappingHandlerMapping-RequestMappingHandlerAdapter
 pair which are the default in the MVC Java config and the MVC namespace.
 */
@RestController
public class HelloController {
    /**
     * @RequestMapping
     * Annotation for mapping web requests onto methods in
     * request-handling classes with flexible method signatures.
     * ••••••••••••••••••••••••••••••••••••
     * <mapping a get request>
     * @RequestMapping(value = "/", method = RequestMethod.GET)
     * ----------------------------------------------------------
     * @Target(value=METHOD)
     * @Retention(value=RUNTIME)
     * @Documented
     * @RequestMapping(method=GET)
     * <public @interface GetMapping>
     * Annotation for mapping HTTP GET requests onto specific handler
     * methods. Specifically, @GetMapping is a composed annotation
     * that acts as a shortcut for @RequestMapping(method = RequestMethod.GET).
     */
    @GetMapping(value = "/")
    public String helloMundo() {
        final String customStyles = """
                                    font-family: iceLand;
                                    font-size: 4.5rem;\040
                                    margin-top: 15rem;
                                    margin-left: 4rem;
                                    color: #778FFB;
                                    text-shadow: 2px 2px 4px #000000;
                                    """;
        return """
               <div style='%s'>
                   <strong>
                       *. WELCOME TO THE TERROR DOME!!!
                   </strong>
               </div>
               """.formatted(customStyles);
    }
}






























