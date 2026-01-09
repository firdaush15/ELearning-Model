package com.elearning.entities;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface ELearningFacadeRemote {
    // --- Course Management ---
    void addCourse(Course course) throws ELearningException;
    Course getCourse(String code) throws ELearningException;
    Course[] getAllCourses() throws ELearningException;
    void deleteCourse(String code) throws ELearningException;
    void updateCourse(Course course) throws ELearningException;
    Course[] getCoursesByInstructor(String username) throws ELearningException;
    
    // [NEW] Method to Approve Course
    void updateCourseStatus(String code, String status) throws ELearningException;

    // --- User Management ---
    void registerUser(User user) throws ELearningException;
    User validateUser(String username, String password) throws ELearningException;
    User[] getAllUsers() throws ELearningException;
    void deleteUser(String username) throws ELearningException;

    // --- Enrollment Management ---
    void enrollStudent(String username, String courseCode) throws ELearningException;
    Course[] getEnrolledCourses(String username) throws ELearningException;
    boolean isEnrolled(String username, String courseCode) throws ELearningException;
    void dropCourse(String username, String courseCode) throws ELearningException;

    // --- Topic Management ---
    void addTopic(Topic topic) throws ELearningException;
    List<Topic> getTopicsByCourse(String courseCode) throws ELearningException;
    Topic getTopic(int topicId) throws ELearningException;
    void deleteTopic(int topicId) throws ELearningException;

    // --- Material Management ---
    void addMaterial(Material material) throws ELearningException;
    List<Material> getMaterialsByTopic(int topicId) throws ELearningException;
    Material getMaterial(int materialId) throws ELearningException; 
    void deleteMaterial(int materialId) throws ELearningException;
}