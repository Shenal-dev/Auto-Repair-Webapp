package AutoReparShop.webapp.models; // Adjust to your actual package

import java.io.Serializable;
import java.util.Objects;

public class JobPartId implements Serializable {

    private int job;      // Matches the name of the Job property in JobPart
    private int sparePart;   // Matches the name of the partId property in JobPart

    public JobPartId() {}

    public JobPartId(int job, int sparePart) {
        this.job = job;
        this.sparePart = sparePart;
    }

    // JPA requires equals() and hashCode() for composite keys
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPartId that = (JobPartId) o;
        return Objects.equals(job, that.job) && Objects.equals(sparePart, that.sparePart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(job, sparePart);
    }

    // Getters and Setters
    public int getJob() { return job; }
    public void setJob(int job) { this.job = job; }
    public int getsparePart() { return sparePart; }
    public void setPartId(int sparePart) { this.sparePart = sparePart; }
}