/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import javax.annotation.Resource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.TransactionIsolationLevel;

/**
 *
 * @author Usuario
 */
public class MyBatisUtil {
    private String resource = "cl/mybatis/mybatis-config.xml";
    private SqlSession session = null;
    
    public SqlSession getSession(){
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new  SqlSessionFactoryBuilder().build(reader);
            session = sqlMapper.openSession();
               
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return session;
    }
}
