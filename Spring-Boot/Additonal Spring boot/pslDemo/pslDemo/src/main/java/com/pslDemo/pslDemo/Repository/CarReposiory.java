package com.pslDemo.pslDemo.Repository;

public class CarReposiory implements CarRepositoryImpl{
    private long Id;
    String name;
    int rollno;

    
    @Override
    public String toString() {
        return "CarReposiory [Id=" + Id + ", name=" + name + ", rollno=" + rollno + "]";
    }
    public CarReposiory(long id, String name, int rollno) {
        Id = id;
        this.name = name;
        this.rollno = rollno;
    }
    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    


}
