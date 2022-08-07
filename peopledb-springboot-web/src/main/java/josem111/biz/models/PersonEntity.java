package josem111.biz.models;

import josem111.helpers.IHelpers;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private BigDecimal salary;
    
    // private constructor with a
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PersonEntity person = (PersonEntity) o;
        return id != null && Objects.equals(id, person.id);
    }
    
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
    
    @Override
    public String toString() {
        return IHelpers.toStrFormatter(
            id,
            firstName,
            lastName,
            dob,
            salary
        );
    }
    
    //    public String formattedDOB() {
    //        return DateTimeFormatter
    //            .ofPattern("MMMM dd, yyyy")
    //            .format(dob);
    //    }
}



