package josem111.web.formatters;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @Component:
 * Indicates that an annotated class is a "component". Such classes are
 * considered as candidates for auto-detection when using annotation-based
 * configuration and classpath scanning. Other class-level annotations may
 * be considered as identifying a component as well, typically a special
 * kind of component: e.g. the @Repository annotation or AspectJ's @Aspect annotation.
 */
@Component
public class LocalDateFormatter implements Formatter<LocalDate> {
    
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter
        .ofPattern("MMMM dd, yyyy");
    
    @Override
    public LocalDate parse(String text, Locale locale) throws ParseException {
        return LocalDate.parse(text, dateTimeFormatter);
    }
    
    @Override
    public String print(LocalDate object, Locale locale) {
        return dateTimeFormatter.format(object);
    }
}
