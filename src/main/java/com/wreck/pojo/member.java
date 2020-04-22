package com.wreck.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class member {
    private int id;
    private int clubid;
    private int userid;
    private int usertype;
}
