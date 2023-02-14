package com.helix.spark.iam.controller;

import com.helix.spark.iam.vo.HsiUserVo;
import com.helix.spark.web.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Designed By www.helix.cn
 *
 * @author [Allen Wang]
 * @version V1.0
 * Copyright 2023 www.helix.cn Inc. All rights reserved.
 * @date 2023/2/12 14:48
 **/
@RestController
@RequestMapping("/iam/user")
public class HsiUserController {
    @GetMapping("/{userId}")
    public Result<HsiUserVo> loadUserDetailByUserId(@PathVariable("userId") String userId){
        HsiUserVo hsiUserVo = new HsiUserVo();
        hsiUserVo.setUserId(userId);
        return Result.success(hsiUserVo);
    }
}