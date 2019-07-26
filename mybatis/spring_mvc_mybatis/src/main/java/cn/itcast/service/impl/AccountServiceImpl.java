package cn.itcast.service.impl;

import cn.itcast.domain.Account;
import cn.itcast.mapper.AccountMapper;
import cn.itcast.service.AccountService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author : YYC
 * @Description : 查询用户账户
 * @Creation Date: 2019-07-20 18:37
 * @ModificationHistory Who  When  What
 * -----------------------------------------------------
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> findAll() {
        //通过mapper，使用mybatis执行查询
        List<Account> list = accountMapper.findAll();
        return list;
    }

    @Override
    public int save(List<Account> accountList) {
        //通过mapper，使用mybatis执行存储数据
        try {
            Account account = accountList.get(0);
            int save = accountMapper.save(account);
            return save;
        } catch (Exception e){
            return -1;
        }
    }
}
