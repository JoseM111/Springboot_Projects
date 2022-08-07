package josem111.entities;

import josem111.utility.IStringFormatter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deptId;
    private String deptName;
    private String deptAddress;
    private String deptCode;
    
    // constructor
    private DepartmentEntity(Long deptId, String deptName, String deptAddress, String deptCode) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptAddress = deptAddress;
        this.deptCode = deptCode;
    }
    
    // default constructor
    public DepartmentEntity() {}
    
    /**
     * Static builder method that creates a new
     * DepartmentEntity without using the deptId
     * @param deptName
     * @param deptAddress
     * @param deptCode
     * @return <DepartmentEntity>
     */
    public static DepartmentEntity of(String deptName, String deptAddress, String deptCode) {
        return new DepartmentEntity(null, deptName, deptAddress, deptCode);
    }
    
    public Long getDeptId() {
        return deptId;
    }
    
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
    
    public String getDeptName() {
        return deptName;
    }
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    public String getDeptAddress() {
        return deptAddress;
    }
    
    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress;
    }
    
    public String getDeptCode() {
        return deptCode;
    }
    
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }
    
    @Override
    public String toString() {
        return IStringFormatter.deptEntityToStr(
            deptId,
            deptName,
            deptAddress,
            deptCode
        );
    }
}
