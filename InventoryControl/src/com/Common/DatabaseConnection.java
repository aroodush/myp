/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Common;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Lahiru
 */
public class DatabaseConnection {

    public static EntityManagerFactory getEntityManagerFactory() {       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InventoryControlPU");
        return emf;
    }
}
