package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;
}
