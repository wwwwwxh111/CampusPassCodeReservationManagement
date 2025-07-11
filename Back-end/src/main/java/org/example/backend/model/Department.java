package org.example.backend.model;

public class Department {
    private int id;
    private Integer departmentType; // 改为 Integer，允许 null
    private String departmentName;

    // 无参构造函数
    public Department() {}

    // 有参构造函数
    public Department(int id, Integer departmentType, String departmentName) {
        this.id = id;
        this.departmentType = departmentType;
        this.departmentName = departmentName;
    }

    // Getter 和 Setter 方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getDepartmentType() { // 改为返回 Integer
        return departmentType;
    }

    public void setDepartmentType(Integer departmentType) { // 改为接受 Integer
        this.departmentType = departmentType;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentType=" + departmentType + // 移除单引号，因为是整数
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}