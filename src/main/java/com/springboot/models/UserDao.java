package com.springboot.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by qlxrc on 2016/10/15.
 */
@Repository
@Transactional
@Qualifier("UserDao")
public interface UserDao extends CrudRepository<User, Long> {

    public User findByName(String name);
}
