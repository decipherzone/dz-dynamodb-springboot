package com.decipherzone.dynamodb.controller;

import com.decipherzone.dynamodb.model.ProductInfo;
import com.decipherzone.dynamodb.repositories.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created on 10/6/17 1:55 PM by Raja Dushyant Vashishtha
 * Sr. Software Engineer
 * rajad@decipherzone.com
 * Decipher Zone Softwares
 * www.decipherzone.com
 */

@Controller
public class AppController {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    public AppController() {
        System.out.println("productInfoRepository = " + productInfoRepository);
    }

    @RequestMapping(value = "/raja", method = {RequestMethod.GET})
    public @ResponseBody String home() {

        ProductInfo info = new ProductInfo();
        info.setCost("123");

        ProductInfo save = productInfoRepository.save(info);

        Iterable<ProductInfo> productInfos = productInfoRepository.findAll();
        for (ProductInfo productInfo : productInfos) {
            System.out.println("productInfo.getId() = " + productInfo.getId());
        }

        return "Hello";
    }

}
