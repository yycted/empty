package cn.itcast.mapper;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountMapper {
    //查询账户数据
    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account (id,name,money) values (null,#{name},#{money})")
    int save(Account account);
}
