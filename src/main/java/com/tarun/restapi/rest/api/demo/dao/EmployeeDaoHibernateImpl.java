package com.tarun.restapi.rest.api.demo.dao;

import com.tarun.restapi.rest.api.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDaoHibernateImpl implements EmployeeDao{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoHibernateImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Employee> theQuery = currentSession.createQuery("from Employee",Employee.class);

        return theQuery.getResultList();
    }



}
