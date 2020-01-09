package com.czetsuya.business.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version
 * @since
 */
public abstract class BaseService {

    @Autowired
    CurrentUserProvider currentUserProvider;

    protected CurrentUser getCurrentUser() {
        return currentUserProvider.getCurrentUser();
    }
}
