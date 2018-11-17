package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

}
