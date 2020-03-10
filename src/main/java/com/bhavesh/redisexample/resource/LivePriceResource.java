package com.bhavesh.redisexample.resource;

import com.bhavesh.redisexample.model.LivePrice;
import com.bhavesh.redisexample.service.LivePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/liveprice")
@EnableAutoConfiguration
public class LivePriceResource {

    @Autowired
    private LivePriceService livePriceService;

    @GetMapping
    public List<LivePrice> getAllUsers() {
        return livePriceService.getAll();
    }

    @PostMapping("id")
    public List<LivePrice> getById(@RequestBody final ArrayList<String> id){

        return livePriceService.getAllById(id);
    }

    @PostMapping
    public List<LivePrice> create(@RequestBody final LivePrice livePrice){

        livePriceService.create(livePrice);

        return livePriceService.getAll();
    }

    @PostMapping("list")
    public List<LivePrice> createList(@RequestBody final ArrayList<LivePrice> livePricelist){

        livePriceService.createMany(livePricelist);

        return livePriceService.getAll();
    }
}
