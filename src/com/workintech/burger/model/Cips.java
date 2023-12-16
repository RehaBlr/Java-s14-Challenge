package com.workintech.burger.model;

import com.workintech.burger.enums.CipsType;

public class Cips {
    private CipsType type;

    public Cips(CipsType type) {
        this.type = type;
    }

    public CipsType getType() {
        return type;
    }
}
