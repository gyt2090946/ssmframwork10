package com.wreck.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class club {
    private int id;
    private String clubname;
    private int predidentid;
    private String describe;
}
