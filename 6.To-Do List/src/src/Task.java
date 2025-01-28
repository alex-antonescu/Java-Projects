import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Task {
    private String nume;
    private LocalDateTime date;
    private String status;

    public Task(){}

    public Task(String nume){
        this.nume = nume;
        this.date = LocalDateTime.now();
        this.status = "uncompleted";
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
