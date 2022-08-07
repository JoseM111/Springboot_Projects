package josem111.helpers;

import josem111.biz.models.PersonEntity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface IHelpers {
    List<PersonEntity> people = List.of(
        new PersonEntity(
            10L, "Jake", "Ferris",
            LocalDate.of(1950, 1, 1),
            new BigDecimal("50000")
        )
        , new PersonEntity(
            20L, "Nasty-Nas", "Nasir",
            LocalDate.of(1992, 3, 10),
            new BigDecimal("120000")
        )
        , new PersonEntity(
            12L, "Ben", "Getting-It",
            LocalDate.of(1969, 2, 13),
            new BigDecimal("75000")
        )
        , new PersonEntity(
            15L, "Betty", "Gets",
            LocalDate.of(1987, 5, 4),
            new BigDecimal("45000")
        )
        , new PersonEntity(
            45L, "Last-One", "Son",
            LocalDate.of(1980, 3, 3),
            new BigDecimal("67000")
        )
        , new PersonEntity(
            17L, "JSin", "The-God",
            LocalDate.of(1984, 11, 1),
            new BigDecimal("234000")
        )
    );
    
    static String toStrFormatter(Object... args) {
        return (
            """
            =========================================================
            PersonEntity: {
              Person ID: %d
              First Name: %s
              Last Name: %s
              DOB: %s
              Salary: %s
            }
            =========================================================
            """
        ).formatted(args);
    }
}
