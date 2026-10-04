package AutoReparShop.webapp.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Job_Part")
@IdClass(JobPartId.class) // Links to the composite key class
public class JobPart {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jobID", referencedColumnName = "jobID")
    private Job job;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "partID", referencedColumnName = "partID")
    private SparePart sparePart; // Use a Long here assuming you don't have a Part entity class yet

    @Column(name = "quantityUsed")
    private Integer quantityUsed;

    // Getters and Setters
    public Job getJob() { return job; }
    public void setJob(Job job) { this.job = job; }

    public SparePart getSparePart() { return sparePart; }
    public void setSparePart(SparePart sparePart) { this.sparePart = sparePart; }

    public Integer getQuantityUsed() { return quantityUsed; }
    public void setQuantityUsed(Integer quantityUsed) { this.quantityUsed = quantityUsed; }
}