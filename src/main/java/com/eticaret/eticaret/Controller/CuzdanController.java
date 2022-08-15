package com.eticaret.eticaret.Controller;

import com.eticaret.eticaret.Model.Cuzdan;
import com.eticaret.eticaret.Service.CuzdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cuzdan")
public class CuzdanController {

    @Autowired
    private CuzdanService cuzdanService;

    @GetMapping("getCuzdan")
    public List<Cuzdan> getCuzdan()
    {
        return cuzdanService.getCuzdan();
    }
}
