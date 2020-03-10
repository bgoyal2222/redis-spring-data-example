package com.bhavesh.redisexample.service;

import com.bhavesh.redisexample.model.LivePrice;
import com.bhavesh.redisexample.repository.LivePriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivePriceService {

    @Autowired
    private LivePriceRepository livePriceRepository;

    public List<LivePrice> getAll() {
        List<LivePrice> livePrices = new ArrayList<>();
        livePriceRepository.findAll()
                .forEach(livePrices::add);
        return livePrices;
    }

    public List<LivePrice> getAllById(ArrayList<String> id) {
        List<LivePrice> livePrices = new ArrayList<>();
        livePriceRepository.findAllById(id)
                .forEach(livePrices::add);
        return livePrices;
    }

    public void create(LivePrice livePrice) {
        livePriceRepository.save(livePrice);
    }

    public void createMany(ArrayList<LivePrice> livePrice) {
        livePriceRepository.saveAll(livePrice);
    }
}
