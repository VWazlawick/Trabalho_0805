/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.atv_08_05.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
/**
 *
 * @author victo
 */
public class EntityManagerUtil {
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public static EntityManagerFactory getEntityManagerFactory(){
        if(emf==null){
            emf = Persistence.createEntityManagerFactory("postgres");
            System.out.println("Conexão aberta");
        }
        return emf;
    }
    
    public static EntityManager getManager(){
        if(em == null || !em.isOpen()){
            em = emf.createEntityManager();
            System.out.println("Entity Manager aberta");
        }
        return em;
    }
    
    public static void closeEntityManagerFactory(){
        if(emf!=null){
            emf.close();
            System.out.println("Conexão fechada");
        }
    }
}
