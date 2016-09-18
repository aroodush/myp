/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lahiru
 */
@Entity
@Table(name = "customermaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customermaster.findAll", query = "SELECT c FROM Customermaster c"),
    @NamedQuery(name = "Customermaster.findByCusid", query = "SELECT c FROM Customermaster c WHERE c.cusid = :cusid"),
    @NamedQuery(name = "Customermaster.findByFname", query = "SELECT c FROM Customermaster c WHERE c.fname = :fname"),
    @NamedQuery(name = "Customermaster.findByMname", query = "SELECT c FROM Customermaster c WHERE c.mname = :mname"),
    @NamedQuery(name = "Customermaster.findByLname", query = "SELECT c FROM Customermaster c WHERE c.lname = :lname"),
    @NamedQuery(name = "Customermaster.findByAddreslane1", query = "SELECT c FROM Customermaster c WHERE c.addreslane1 = :addreslane1"),
    @NamedQuery(name = "Customermaster.findByAddresslane2", query = "SELECT c FROM Customermaster c WHERE c.addresslane2 = :addresslane2"),
    @NamedQuery(name = "Customermaster.findByAddresslane3", query = "SELECT c FROM Customermaster c WHERE c.addresslane3 = :addresslane3"),
    @NamedQuery(name = "Customermaster.findByNic", query = "SELECT c FROM Customermaster c WHERE c.nic = :nic"),
    @NamedQuery(name = "Customermaster.findByCusMobile", query = "SELECT c FROM Customermaster c WHERE c.cusMobile = :cusMobile"),
    @NamedQuery(name = "Customermaster.findByCusfax", query = "SELECT c FROM Customermaster c WHERE c.cusfax = :cusfax"),
    @NamedQuery(name = "Customermaster.findByTitle", query = "SELECT c FROM Customermaster c WHERE c.title = :title")})
public class Customermaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cusid")
    private Integer cusid;
    @Basic(optional = false)
    @Column(name = "fname")
    private String fname;
    @Basic(optional = false)
    @Column(name = "mname")
    private String mname;
    @Basic(optional = false)
    @Column(name = "lname")
    private String lname;
    @Basic(optional = false)
    @Column(name = "addreslane1")
    private String addreslane1;
    @Basic(optional = false)
    @Column(name = "addresslane2")
    private String addresslane2;
    @Basic(optional = false)
    @Column(name = "addresslane3")
    private String addresslane3;
    @Basic(optional = false)
    @Column(name = "nic")
    private String nic;
    @Basic(optional = false)
    @Column(name = "cus_mobile")
    private int cusMobile;
    @Basic(optional = false)
    @Column(name = "cusfax")
    private int cusfax;
    @Basic(optional = false)
    @Column(name = "Title")
    private String title;

    public Customermaster() {
    }

    public Customermaster(Integer cusid) {
        this.cusid = cusid;
    }

    public Customermaster(Integer cusid, String fname, String mname, String lname, String addreslane1, String addresslane2, String addresslane3, String nic, int cusMobile, int cusfax, String title) {
        this.cusid = cusid;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.addreslane1 = addreslane1;
        this.addresslane2 = addresslane2;
        this.addresslane3 = addresslane3;
        this.nic = nic;
        this.cusMobile = cusMobile;
        this.cusfax = cusfax;
        this.title = title;
    }

    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddreslane1() {
        return addreslane1;
    }

    public void setAddreslane1(String addreslane1) {
        this.addreslane1 = addreslane1;
    }

    public String getAddresslane2() {
        return addresslane2;
    }

    public void setAddresslane2(String addresslane2) {
        this.addresslane2 = addresslane2;
    }

    public String getAddresslane3() {
        return addresslane3;
    }

    public void setAddresslane3(String addresslane3) {
        this.addresslane3 = addresslane3;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getCusMobile() {
        return cusMobile;
    }

    public void setCusMobile(int cusMobile) {
        this.cusMobile = cusMobile;
    }

    public int getCusfax() {
        return cusfax;
    }

    public void setCusfax(int cusfax) {
        this.cusfax = cusfax;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cusid != null ? cusid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customermaster)) {
            return false;
        }
        Customermaster other = (Customermaster) object;
        if ((this.cusid == null && other.cusid != null) || (this.cusid != null && !this.cusid.equals(other.cusid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Entity.Customermaster[ cusid=" + cusid + " ]";
    }
    
}
