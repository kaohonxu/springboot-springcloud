package com.lss.controller;

import com.lss.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiuSanSui
 */
@RestController
public class TickerController {
    @Autowired
    TicketService ticketService;

    @RequestMapping("/ticket")
    public String ticket(){
        return ticketService.getTicker();
    }
}
