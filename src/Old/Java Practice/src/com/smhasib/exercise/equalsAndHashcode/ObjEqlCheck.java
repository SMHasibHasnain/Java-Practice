package com.smhasib.exercise.equalsAndHashcode;

public class ObjEqlCheck {
    String name;
    String ID;
    String dept;
    
    public ObjEqlCheck(String name, String iD, String dept) {
        this.name = name;
        ID = iD;
        this.dept = dept;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ObjEqlCheck)) {
            return false;
        }
        ObjEqlCheck var1 = (ObjEqlCheck) obj;
        return var1.name.equals(name) && var1.ID.equals(ID) && var1.dept.equals(dept);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    
}
