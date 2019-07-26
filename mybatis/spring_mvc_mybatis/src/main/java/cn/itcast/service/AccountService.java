package cn.itcast.service;

import cn.itcast.domain.Account;

import java.io.IOException;
import java.util.List;

public interface AccountService {
    //查询账户数据
    List<Account> findAll() throws IOException;

    int save(List<Account> accountList);
}
