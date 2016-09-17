/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lahiru
 */
@Entity
@Table(name = "customer_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerMaster.findAll", query = "SELECT c FROM CustomerMaster c"),
    @NamedQuery(name = "CustomerMaster.findByCusId", query = "SELECT c FROM CustomerMaster c WHERE c.cusId = :cusId"),
    @NamedQuery(name = "CustomerMaster.findByFName", query = "SELECT c FROM CustomerMaster c WHERE c.fName = :fName"),
    @NamedQuery(name = "CustomerMaster.findByMName", query = "SELECT c FROM CustomerMaster c WHERE c.mName = :mName"),
    @NamedQuery(name = "CustomerMaster.findByLName", query = "SELECT c FROM CustomerMaster c WHERE c.lName = :lName"),
    @NamedQuery(name = "CustomerMaster.findByAddresLane1", query = "SELECT c FROM CustomerMaster c WHERE c.addresLane1 = :addresLane1"),
    @NamedQuery(name = "CustomerMaster.findByAddressLane2", query = "SELECT c FROM CustomerMaster c WHERE c.addressLane2 = :addressLane2"),
    @NamedQuery(name = "CustomerMaster.findByAddressLane3", query = "SELECT c FROM CustomerMaster c WHERE c.addressLane3 = :addressLane3"),
    @NamedQuery(name = "CustomerMaster.findByNic", query = "SELECT c FROM CustomerMaster c WHERE c.nic = :nic"),
    @NamedQuery(name = "CustomerMaster.findByCusMobile", query = "SELECT c FROM CustomerMaster c WHERE c.cusMobile = :cusMobile"),
    @NamedQuery(name = "CustomerMaster.findByCusFax", query = "SELECT c FROM CustomerMaster c WHERE c.cusFax = :cusFax"),
    @NamedQuery(name = "CustomerMaster.findByDate", query = "SELECT c FROM CustomerMaster c WHERE c.date = :date")})
public class CustomerMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cus_id")
    private Integer cusId;
    @Basic(optional = false)
    @Column(name = "f_name")
    private String fName;
    @Basic(optional = false)
    @Column(name = "m_name")
    private String mName;
    @Basic(optional = false)
    @Column(name = "l_name")
    private String lName;
    @Basic(optional = false)
    @Column(name = "addres_lane1")
    private String addresLane1;
    @Basic(optional = false)
    @Column(name = "address_lane2")
    private String addressLane2;
    @Basic(optional = false)
    @Column(name = "address_lane3")
    private String addressLane3;
    @Basic(optional = false)
    @Column(name = "nic")
    private String nic;
    @Basic(optional = false)
    @Column(name = "cus_mobile")
    private int cusMobile;
    @Basic(optional = false)
    @Column(name = "cus_fax")
    private int cusFax;
    @Basic(optional = false)
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;

    public CustomerMaster() {
    }

    public CustomerMaster(Integer cusId) {
        this.cusId = cusId;
    }

    public CustomerMaster(Integer cusId, String fName, String mName, String lName, String addresLane1, String addressLane2, String addressLane3, String nic, int cusMobile, int cusFax, Date date) {
        this.cusId = cusId;
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.addresLane1 = addresLane1;
        this.addressLane2 = addressLane2;
        this.addressLane3 = addressLane3;
        this.nic = nic;
        this.cusMobile = cusMobile;
        this.cusFax = cusFax;
        this.date = date;
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getAddresLane1() {
        return addresLane1;
    }

    public void setAddresLane1(String addresLane1) {
        this.addresLane1 = addresLane1;
    }

    public String getAddressLane2() {
        return addressLane2;
    }

    public void setAddressLane2(String addressLane2) {
        this.addressLane2 = addressLane2;
    }

    public String getAddressLane3() {
        return addressLane3;
    }

    public void setAddressLane3(String addressLane3) {
        this.addressLane3 = addressLane3;
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

    public int getCusFax() {
        return cusFax;
    }

    public void setCusFax(int cusFax) {
        this.cusFax = cusFax;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cusId != null ? cusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerMaster)) {
            return false;
        }
        CustomerMaster other = (CustomerMaster) object;
        if ((this.cusId == null && other.cusId != null) || (this.cusId != null && !this.cusId.equals(other.cusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Entity.CustomerMaster[ cusId=" + cusId + " ]";
    }
    
}
