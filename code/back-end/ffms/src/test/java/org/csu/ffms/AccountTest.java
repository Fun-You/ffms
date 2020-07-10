package org.csu.ffms;

import org.csu.ffms.persistence.AccountMapper;
import org.junit.jupiter.api.Test;
import org.csu.ffms.domain.Account;
import org.csu.ffms.service.AccountService;
import static org.junit.jupiter.api.Assertions.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("org.csu.ffms.persistence")
class AccountTest {

    @Autowired
    AccountService accountService;

    @Test
    void getAccountByUserid() {
        System.out.println("get userid:1 ");
        Account account=accountService.getAccount("1");
        System.out.println(account.getUsername());
        System.out.println(account.toString());
    }

    @Test
    void getAccountByUseridAndPassword() {
        Account account=accountService.getAccount("1","123");
        System.out.println(account.toString());
    }

    @Test
    void insertAccount() {
    }

    @Test
    void insertRelation() {
    }

    @Test
    void insertSignon() {
    }

    @Autowired
    AccountMapper accountMapper;

    @Test
    void updateAccount() {
        Account account = new Account();
        account.setUserid("1");
        account.setPassword("11");
        account.setUsername("lzh");
        account.setEmail("1@qq.com");
        account.setPhone("123");
        accountMapper.updateAccount(account);
        accountMapper.updateRelation(account);
        accountMapper.updateSignon(account);
    }

    @Test
    void updateRelation() {
    }

    @Test
    void updateSignon() {
    }

    @Test
    void getAllAccount() {
    }

    @Test
    void deleteAccount() {
    }

    @Test
    void deleteRelation() {
    }

    @Test
    void deleteSignon() {
    }

    @Test
    void getAllAccountByFamilyidTest(){
        List<Account> accountList= accountService.getAllAccountByFamilyid("1");
        for (Account a : accountList) {
            System.out.println(a.toString());
        }

    }
}