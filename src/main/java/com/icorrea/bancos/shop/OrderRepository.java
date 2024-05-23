package com.icorrea.bancos.shop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface OrderRepository extends CrudRepository<Order, String> {}