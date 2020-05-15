package com.jiguiquan.www.service.impl;

import com.jiguiquan.www.dao.DeviceMapper;
import com.jiguiquan.www.entities.Device;
import com.jiguiquan.www.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jigq
 * @create 2020-05-15 17:27
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceMapper mapper;


    @Override
    public List<Device> getDevices() {
        return mapper.getDevices();
    }
}
