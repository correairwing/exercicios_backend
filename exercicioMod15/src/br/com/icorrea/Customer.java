package br.com.icorrea;

public class Customer {
    private String gradeRequest;
    private boolean isAutomatic;

    public Customer (String gradeRequest, boolean isAutomatic) {
        this.gradeRequest = gradeRequest;
        this.isAutomatic = isAutomatic;
    }
    public boolean isAutomatic() {
        return isAutomatic;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }
}
