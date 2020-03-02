package com.imooc.passbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;

/**
 * <h1>Merchants object model</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "merchants")
public class Merchants {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Integer id;

    /** the name of merchants */
    @Basic
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    /** the logo of merchants */
    @Basic
    @Column(name = "logoUrl", nullable = false)
    private String logoUrl;

    /** the business license url for merchants */
    @Basic
    @Column(name = "businessLicenseUrl", nullable = false)
    private String businessLicenseUrl;

    /** the phone of merchants */
    @Basic
    @Column(name = "phone", nullable = false)
    private String phone;

    /** the address for merchants */
    @Basic
    @Column(name = "address", nullable = false)
    private String address;

    /** if the merchants has been audited */
    @Basic
    @Column(name = "is_audit", nullable = false)
    private Boolean is_audit;

}
