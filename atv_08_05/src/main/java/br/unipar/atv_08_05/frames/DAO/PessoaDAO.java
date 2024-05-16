/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.atv_08_05.frames.DAO;

import br.unipar.atv_08_05.models.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.util.List;


/**
 *
 * @author victo
 */
public class PessoaDAO {
    public EntityManager em;

    public PessoaDAO(EntityManager em) {
        this.em = em;
    }
     
    public Pessoa insert(Pessoa pessoa){
        EntityTransaction transaction = em.getTransaction();
        
        transaction.begin();
        em.persist(pessoa);
        transaction.commit();
        em.close();
        
        System.out.println("Pessoa criado com suscesse!");
        
        return pessoa;
    }
    
    public List<Pessoa> findAll(){
        return em.createQuery("SELECT p FROM Pessoa p").getResultList();
    }
    
}
