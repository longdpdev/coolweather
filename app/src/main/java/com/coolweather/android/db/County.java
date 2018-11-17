package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
}
