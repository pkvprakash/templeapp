package com.pkvprakash.temple.service;
import com.pkvprakash.temple.model.*;
import ArrayList<com.pkvprakash.temple.model.User>;
import java.util.ArrayList<DevoteeRecord>;
import com.pkvprakash.temple.model.User;
/**
*/
public interface UserService {
/**
 * @param user 
*/
public abstract void create(com.pkvprakash.temple.model.User user);
/**
 * @param user 
*/
public abstract void delete(com.pkvprakash.temple.model.User user);
/**
 * @param user 
*/
public abstract void update(com.pkvprakash.temple.model.User user);
/**
 * @param user 
*/
public abstract void checkLogin(com.pkvprakash.temple.model.User user);
/**
 * @param user 
 * @return 
*/
public abstract User find(com.pkvprakash.temple.model.User user);
/**
 * @param user 
 * @return 
*/
public abstract User> findAll(User user);
}

