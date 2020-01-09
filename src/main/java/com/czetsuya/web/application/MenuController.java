package com.czetsuya.web.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czetsuya.business.domain.MenuDto;
import com.czetsuya.business.service.MenuService;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
@RestController
@RequestMapping(path = "/iam/menus", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<MenuDto> findMenu() {
        return menuService.findMenu();
    }
}
