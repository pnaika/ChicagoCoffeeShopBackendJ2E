/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.pnaika.chicagocoffeeshopbackend;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Prashanth
 */
@Entity
@Table(name = "customernew")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customernew.findAll", query = "SELECT c FROM Customernew c"),
    @NamedQuery(name = "Customernew.findByCustomerId", query = "SELECT c FROM Customernew c WHERE c.customerId = :customerId"),
    @NamedQuery(name = "Customernew.findByFirstName", query = "SELECT c FROM Customernew c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Customernew.findByLastName", query = "SELECT c FROM Customernew c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Customernew.findByCustomerEmail", query = "SELECT c FROM Customernew c WHERE c.customerEmail = :customerEmail"),
    @NamedQuery(name = "Customernew.findByCustomerPhone", query = "SELECT c FROM Customernew c WHERE c.customerPhone = :customerPhone"),
    @NamedQuery(name = "Customernew.findByCustomerGender", query = "SELECT c FROM Customernew c WHERE c.customerGender = :customerGender"),
    @NamedQuery(name = "Customernew.findByCustomerAge", query = "SELECT c FROM Customernew c WHERE c.customerAge = :customerAge"),
    @NamedQuery(name = "Customernew.findByCustomerComments", query = "SELECT c FROM Customernew c WHERE c.customerComments = :customerComments")})
public class Customernew implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "customerId")
    private Integer customerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "firstName")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "lastName")
    private String lastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "customerEmail")
    private String customerEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "customerPhone")
    private String customerPhone;
    @Size(max = 45)
    @Column(name = "customerGender")
    private String customerGender;
    @Size(max = 45)
    @Column(name = "customerAge")
    private String customerAge;
    @Size(max = 45)
    @Column(name = "customerComments")
    private String customerComments;

    public Customernew() {
    }

    public Customernew(Integer customerId) {
        this.customerId = customerId;
    }

    public Customernew(Integer customerId, String firstName, String lastName, String customerEmail, String customerPhone) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(String customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerComments() {
        return customerComments;
    }

    public void setCustomerComments(String customerComments) {
        this.customerComments = customerComments;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customernew)) {
            return false;
        }
        Customernew other = (Customernew) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.iit.sat.itmd4515.pnaika.chicagocoffeeshopbackend.Customernew[ customerId=" + customerId + " ]";
    }
    
}
