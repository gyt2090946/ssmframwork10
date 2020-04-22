package com.wreck.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class invoices {
    private int id;
    private String num;
    private String date;
    private String detail;
    private int typeid;
    private int clubid;
    private int userid;
    private int forall;
}
