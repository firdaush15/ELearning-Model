package com.elearning.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course implements Serializable {

    @Id
    @Column(name = "COURSE_CODE")
    private String courseCode;

    @Column(name = "COURSE_NAME")
    private String courseName;

    @Column(name = "CREDITS")
    private int credits;
    
    @Column(name = "INSTRUCTOR_ID")
    private String instructorId;
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "CONTENT_URL")
    private String contentUrl;

    // --- NEW FIELD: STATUS ---
    @Column(name = "STATUS")
    private String status; // Values: "PENDING", "APPROVED"

    public Course() {
    }

    // Constructor used by UpdateCourseServlet (preserves legacy calls)
    public Course(String courseCode, String courseName, int credits, String instructorId, String description, String contentUrl) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.instructorId = instructorId;
        this.description = description;
        this.contentUrl = contentUrl;
        this.status = "PENDING"; // Default
    }

    // Full Constructor
    public Course(String courseCode, String courseName, int credits, String instructorId, String description, String contentUrl, String status) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.instructorId = instructorId;
        this.description = description;
        this.contentUrl = contentUrl;
        this.status = status;
    }

    // Getters and Setters
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }
    
    public String getInstructorId() { return instructorId; }
    public void setInstructorId(String instructorId) { this.instructorId = instructorId; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getContentUrl() { return contentUrl; }
    public void setContentUrl(String contentUrl) { this.contentUrl = contentUrl; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}