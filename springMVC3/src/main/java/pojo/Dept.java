package pojo;

import javax.validation.constraints.Max;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author LHQ
 * @description :
 */

@XmlRootElement(name = "dept")
public class Dept {
    @Max(value = 1000, message = "部门编号最大为1000")
    private int deptNo;
    private String deptName;
    private List<Employee> empList;

    public Dept() {
    }

    public Dept(int deptNo, String deptName, List<Employee> empList) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.empList = empList;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
