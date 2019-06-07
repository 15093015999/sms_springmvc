package com.kalearn.javaserver.bean.extend;

import com.kalearn.javaserver.bean.Course;
import com.kalearn.javaserver.bean.StudentCourse;
import com.kalearn.javaserver.bean.User;

/**
 * StudentCourseExtend
 */
public class StudentCourseExtend extends StudentCourse {

    private User student;
    private Course course;

    public User getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStudent(User student) {
        this.student = student;
    }

}