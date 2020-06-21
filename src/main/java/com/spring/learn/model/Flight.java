package com.spring.learn.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author
 *
 */
@Table(name="flight")
public class Flight implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @NotEmpty
    private String flightno;

    @NotEmpty
    private Integer departurecity;

    @NotEmpty
    private Date departuretime;

    @NotEmpty
    private Integer arrivalcity;

    @NotEmpty
    private Date arrivalitime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno;
    }

    public Integer getDeparturecity() {
        return departurecity;
    }

    public void setDeparturecity(Integer departurecity) {
        this.departurecity = departurecity;
    }

    public Date getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    public Integer getArrivalcity() {
        return arrivalcity;
    }

    public void setArrivalcity(Integer arrivalcity) {
        this.arrivalcity = arrivalcity;
    }

    public Date getArrivalitime() {
        return arrivalitime;
    }

    public void setArrivalitime(Date arrivalitime) {
        this.arrivalitime = arrivalitime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Flight other = (Flight) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFlightno() == null ? other.getFlightno() == null : this.getFlightno().equals(other.getFlightno()))
            && (this.getDeparturecity() == null ? other.getDeparturecity() == null : this.getDeparturecity().equals(other.getDeparturecity()))
            && (this.getDeparturetime() == null ? other.getDeparturetime() == null : this.getDeparturetime().equals(other.getDeparturetime()))
            && (this.getArrivalcity() == null ? other.getArrivalcity() == null : this.getArrivalcity().equals(other.getArrivalcity()))
            && (this.getArrivalitime() == null ? other.getArrivalitime() == null : this.getArrivalitime().equals(other.getArrivalitime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFlightno() == null) ? 0 : getFlightno().hashCode());
        result = prime * result + ((getDeparturecity() == null) ? 0 : getDeparturecity().hashCode());
        result = prime * result + ((getDeparturetime() == null) ? 0 : getDeparturetime().hashCode());
        result = prime * result + ((getArrivalcity() == null) ? 0 : getArrivalcity().hashCode());
        result = prime * result + ((getArrivalitime() == null) ? 0 : getArrivalitime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", flightno=").append(flightno);
        sb.append(", departurecity=").append(departurecity);
        sb.append(", departuretime=").append(departuretime);
        sb.append(", arrivalcity=").append(arrivalcity);
        sb.append(", arrivalitime=").append(arrivalitime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}