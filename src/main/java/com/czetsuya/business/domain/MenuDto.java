package com.czetsuya.business.domain;

import java.util.List;
import java.util.UUID;

import com.czetsuya.data.entity.Menu;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version
 * @since
 */
@Data
@NoArgsConstructor
public class MenuDto {

    private UUID id;
    private String label;
    private String icon;
    private int sortOrder;
    private String route;

    private List<MenuDto> subMenus;

    public MenuDto(Menu e) {

        id = e.getId();
        label = e.getLabel();
        icon = e.getIcon();
        sortOrder = e.getSortOrder();
        route = e.getRoute();
    }
}
