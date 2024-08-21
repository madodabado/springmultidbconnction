package com.techcode.repository.secondary;

import com.techcode.entity.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryEntityRepository extends JpaRepository<Account, Long> { }