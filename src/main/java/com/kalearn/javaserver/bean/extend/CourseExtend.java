package com.kalearn.javaserver.bean.extend;

import com.kalearn.javaserver.bean.Course;
import com.kalearn.javaserver.bean.User;

/**
 * CourseExtend
 */
public class CourseExtend extends Course {
    private User teacher;

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }
}
