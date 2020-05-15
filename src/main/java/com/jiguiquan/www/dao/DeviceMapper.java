package com.jiguiquan.www.dao;

import com.jiguiquan.www.entities.Device;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author jigq
 * @create 2020-05-15 17:27
 */
@Mapper
public interface DeviceMapper {
    List<Device> getDevices();
}
