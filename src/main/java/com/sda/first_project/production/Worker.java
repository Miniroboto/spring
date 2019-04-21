package com.sda.first_project.production;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Worker {
    private static final Log LOGGER = LogFactory.getLog(Worker.class);

    private int age;
    private String profession;
    @Autowired
    private WorkerMotto workerMotto;

    private List<Tool> tools;

        public Worker(int age, String profession, WorkerMotto workerMotto){
        this.age=age;
        this.profession=profession;
        this.workerMotto=workerMotto;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public WorkerMotto getWorkerMotto() {
        return workerMotto;
    }

    public void setWorkerMotto(WorkerMotto workerMotto) {
        this.workerMotto = workerMotto;
    }
    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    public void initialize() throws Exception{
        LOGGER.info("Worker initialized");
        LOGGER.isTraceEnabled();

    }

    public void destroy() throws Exception{
        LOGGER.info("Worker destroyed");
    }


    @Override
    public String toString() {
        return "Worker{" +
                "age=" + age +
                ", profession='" + profession + '\'' +
                ", workerMotto=" + workerMotto +
                ", tools=" + tools +
                '}';
    }




}
