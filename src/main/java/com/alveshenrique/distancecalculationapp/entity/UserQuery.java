package com.alveshenrique.distancecalculationapp.entity;

import javax.persistence.*;

@Entity
@Table(name = "QUERIES")
public class UserQuery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "lat1")
    private float lat1;

    @Column(name = "lng1")
    private float lng1;

    @Column(name = "lat2")
    private float lat2;

    @Column(name = "lng2")
    private float lng2;

    @Column(name = "distance")
    private  float distance;

    public UserQuery() {

    }

    public UserQuery(float lat1, float lng1, float lat2, float lng2, float distance) {
        this.lat1 = lat1;
        this.lng1 = lng1;
        this.lat2 = lat2;
        this.lng2 = lng2;
        this.distance = distance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getLat1() {
        return lat1;
    }

    public void setLat1(float lat1) {
        this.lat1 = lat1;
    }

    public float getLng1() {
        return lng1;
    }

    public void setLng1(float lng1) {
        this.lng1 = lng1;
    }

    public float getLat2() {
        return lat2;
    }

    public void setLat2(float lat2) {
        this.lat2 = lat2;
    }

    public float getLng2() {
        return lng2;
    }

    public void setLng2(float lng2) {
        this.lng2 = lng2;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }
}
