package com.jiguiquan.www.controller;

import com.jiguiquan.www.common.CommonResult;
import com.jiguiquan.www.entities.Device;
import com.jiguiquan.www.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jigq
 * @create 2020-05-15 17:26
 */
@RestController
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @GetMapping("/device/list")
    public CommonResult getDevice(){
        List<Device> devices = deviceService.getDevices();
        return new CommonResult(200, "获取设备列表成功", devices);
    }
}
