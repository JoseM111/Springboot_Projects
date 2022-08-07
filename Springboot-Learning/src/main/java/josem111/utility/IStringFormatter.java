package josem111.utility;

public class IStringFormatter {
    public static String deptEntityToStr(Object... args) {
        return (
            """
            =========================================================
            DepartmentEntity: {
              Department ID: %d
              Department Name: %s
              Department Address: %s
              Department Code: %s
            }
            =========================================================
            """
        ).formatted(args);
    }
}
