package com.bypay.controller;

import com.bypay.domian.HxUserLevel;
import com.bypay.domian.HxUserSuppinfo;
import com.bypay.service.HxUserLevelService;
import com.bypay.service.HxUserSuppinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by CC on 2017/8/24.
 */
@Controller
@RequestMapping("user")
public class HxUserController {

    @Autowired
    private HxUserLevelService hxUserLevelService;

    @Autowired
    private HxUserSuppinfoService hxUserSuppinfoService;

    @RequestMapping("getUserLevel/{page}/{pageSize}")
    @ResponseBody
    List<HxUserLevel> getUserLevel(@PathVariable("page") int page,
                                   @PathVariable("pageSize") int pageSize){
        Map<String,Object> map = new HashMap<String,Object>();
        HxUserLevel hxUserLevel = new HxUserLevel();
        map.put("hxUserLevel",hxUserLevel);
        map.put("page",page);
        map.put("pageSize",pageSize);
        return hxUserLevelService.selHxUserLevel(map);
    }

    @RequestMapping("getUserSupInfo/{userId}")
    @ResponseBody
    HxUserSuppinfo getUserSupInfo(@PathVariable("userId") String userId){
        HxUserSuppinfo hus = new HxUserSuppinfo();
        hus.setUserId(userId);
        return hxUserSuppinfoService.selectHxUserSuppinfoOne(hus);
    }


}
