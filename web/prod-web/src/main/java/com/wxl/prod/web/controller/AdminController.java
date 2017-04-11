package com.wxl.prod.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin")
public class AdminController extends BaseController {

    @RequestMapping("activity")
    @ResponseBody
    public String activity(@RequestParam("sign") String sign) {
        return "{\"code\":0, \"msg\":\"migrationActivityMessage success\"}";
    }

    @RequestMapping("user")
    @ResponseBody
    public String user(@RequestParam("sign") String sign) {
        return "{\"code\":0, \"msg\":\"migrationUserMessage success\"}";
    }

    @RequestMapping("restore")
    @ResponseBody
    public String restoreAll(@RequestParam("sign") String sign) {
        return "{\"code\":0, \"msg\":\"restoreAll success\"}";
    }
    
    @RequestMapping("clear")
    @ResponseBody
    public String clear(@RequestParam("sign") String sign) {
        return "{\"code\":0, \"msg\":\"clear success\"}";
    }

    @RequestMapping("curl")
    @ResponseBody
    public String curl() {
        return "{\"code\":0, \"msg\":\"success\"}";
    }
}
