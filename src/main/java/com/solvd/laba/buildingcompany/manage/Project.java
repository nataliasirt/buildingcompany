package com.solvd.laba.buildingcompany.manage;
import com.solvd.laba.buildingcompany.people.Engineer;
import com.solvd.laba.buildingcompany.people.Worker;
import java.util.List;

public class Project extends Building {
    private List<Engineer>engineers;
    private List<Worker> workers;

    public List<Engineer> getEngineers() {
        return engineers;
    }

    public void setEngineers(List<Engineer> engineers) {
        this.engineers = engineers;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}



