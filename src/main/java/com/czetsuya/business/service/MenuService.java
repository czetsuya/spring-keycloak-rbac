package com.czetsuya.business.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.czetsuya.business.domain.MenuDto;
import com.czetsuya.data.entity.Menu;
import com.czetsuya.data.repository.MenuRepository;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
@Service
public class MenuService extends BaseService {

    @Autowired
    private MenuRepository menuRepository;

    public List<MenuDto> findMenu() {

        CurrentUser cu = getCurrentUser();

        List<Menu> unorderedMenus = menuRepository.findMenuByRoles(cu.getRoles());
        List<MenuDto> parentMenuDtos = unorderedMenus.stream().filter(e -> e.getParentMenu() == null).map(MenuDto::new).collect(Collectors.toList());

        parentMenuDtos = parentMenuDtos.stream().map(e -> {
            e.setSubMenus(unorderedMenus.stream().filter(sm -> sm.getParentMenu() != null && sm.getParentMenu().getId().equals(e.getId())).sorted().map(MenuDto::new)
                    .collect(Collectors.toList()));
            return e;
        }).collect(Collectors.toList());

        return parentMenuDtos;
    }
}
