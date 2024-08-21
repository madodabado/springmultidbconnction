package com.techcode.repository.primary;

import com.techcode.entity.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryEntityRepository extends JpaRepository<Customer, Long>
{

}

