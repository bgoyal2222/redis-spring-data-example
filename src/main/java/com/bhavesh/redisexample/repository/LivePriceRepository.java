package com.bhavesh.redisexample.repository;
import com.bhavesh.redisexample.model.LivePrice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivePriceRepository extends CrudRepository<LivePrice, String> {
}
