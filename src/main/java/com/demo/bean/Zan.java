package com.demo.bean;

import java.io.Serializable;

public class Zan implements Serializable {
    private Integer id;
    private String name;
    private String title;
    private Integer zan;

    public Zan(Integer id, String name, String title, Integer zan) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.zan = zan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getZan() {
        return zan;
    }

    public void setZan(Integer zan) {
        this.zan = zan;
    }

    @Override
    public String toString() {
        return "Zan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", zan=" + zan +
                '}';
    }
}
