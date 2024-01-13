package com.example.assignment_blackcoffer.Model;

public class UserInfo {
    private String name, address, occupation, distance, work, social, other, description, invite;
    private int image;

    public UserInfo(String name, String address, String occupation, String distance, String work, String social, String other, String description, String invite, int image) {
        this.name = name;
        this.address = address;
        this.occupation = occupation;
        this.distance = distance;
        this.work = work;
        this.social = social;
        this.other = other;
        this.description = description;
        this.invite = invite;
        this.image = image;
    }

    public UserInfo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInvite() {
        return invite;
    }

    public void setInvite(String invite) {
        this.invite = invite;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
