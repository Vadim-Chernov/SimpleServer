package cvr.mserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mscontrol")
public class MSController {
    @RequestMapping(value = "/get", method =  RequestMethod.GET)
    @ResponseBody
    public String getMSControll(ModelMap model){
        return "getMSControll123";
    }

}
