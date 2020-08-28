package com.run.pojo;

public class Manager {
    private Long mid;
    private String musername;
    private String password;


    public Manager(Long mid, String musername, String password) {
        this.mid = mid;
        this.musername = musername;
        this.password = password;
    }

    public Manager() {
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getMusername() {
        return musername;
    }

    public void setMusername(String musername) {
        this.musername = musername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mid=" + mid +
                ", musername='" + musername + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
