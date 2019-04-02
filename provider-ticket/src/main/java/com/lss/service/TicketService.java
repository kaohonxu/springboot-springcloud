package com.lss.service;

import org.springframework.stereotype.Service;

/**
 * @author LiuSanSui
 */
@Service
public class TicketService {
    public String getTicker(){
        System.out.println("翻炒");
        return "尼玛你个笔";
    }
}
