package com.space.service;

import com.space.model.Ship;

import java.util.List;

public interface ShipService {

    List<Ship> findAll();
    Ship saveShip(Ship ship);
    Ship findById(Long id);
    void deleteById(Long id);

}
