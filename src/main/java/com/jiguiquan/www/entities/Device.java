package com.jiguiquan.www.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jigq
 * @create 2020-05-15 17:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {
    private String id;
    private String name;
    private Double price;
}
