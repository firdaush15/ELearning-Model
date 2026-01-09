package com.elearning.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "MATERIAL")
public class Material implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MATERIAL_ID")
    private int materialId;

    @Column(name = "MATERIAL_NAME")
    private String materialName;

    @Column(name = "CONTENT_URL")
    private String contentUrl; // Stores Link (if any)
    
    @Column(name = "TOPIC_ID")
    private int topicId;
    
    // --- NEW FIELDS FOR FILE UPLOAD ---
    @Lob
    @Column(name = "FILE_DATA")
    private byte[] fileData;
    
    @Column(name = "FILE_NAME")
    private String fileName;
    
    @Column(name = "CONTENT_TYPE")
    private String contentType; // e.g. "application/pdf"

    public Material() {}

    // Constructor for Links
    public Material(String materialName, String contentUrl, int topicId) {
        this.materialName = materialName;
        this.contentUrl = contentUrl;
        this.topicId = topicId;
    }
    
    // Constructor for Files
    public Material(String materialName, int topicId, byte[] fileData, String fileName, String contentType) {
        this.materialName = materialName;
        this.topicId = topicId;
        this.fileData = fileData;
        this.fileName = fileName;
        this.contentType = contentType;
        this.contentUrl = ""; // Empty string for files
    }

    public int getMaterialId() { return materialId; }
    public void setMaterialId(int materialId) { this.materialId = materialId; }

    public String getMaterialName() { return materialName; }
    public void setMaterialName(String materialName) { this.materialName = materialName; }

    public String getContentUrl() { return contentUrl; }
    public void setContentUrl(String contentUrl) { this.contentUrl = contentUrl; }

    public int getTopicId() { return topicId; }
    public void setTopicId(int topicId) { this.topicId = topicId; }
    
    public byte[] getFileData() { return fileData; }
    public void setFileData(byte[] fileData) { this.fileData = fileData; }

    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    public String getContentType() { return contentType; }
    public void setContentType(String contentType) { this.contentType = contentType; }
}