package com.zzq.pojo;

public class Curriculum {
    private Integer curriculumId;

    private String curriculumName;

    public Integer getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(Integer curriculumId) {
        this.curriculumId = curriculumId;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName == null ? null : curriculumName.trim();
    }
}