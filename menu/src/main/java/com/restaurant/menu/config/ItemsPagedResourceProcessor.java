package com.restaurant.menu.config;

import com.restaurant.menu.command.api.MenuItemsCommandsController;
import com.restaurant.menu.query.Item;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.Resources;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Component
public class ItemsPagedResourceProcessor implements ResourceProcessor<Resources<Item>> {

    @Override
    public Resources<Item> process(Resources<Item> resources) {
        resources.add(linkTo(methodOn(MenuItemsCommandsController.class).getCommands()).withRel("commands"));
        return resources;
    }
}

