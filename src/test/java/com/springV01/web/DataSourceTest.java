package com.springV01.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import javax.inject.Inject;

/**
 * Created by nick on 17. 3. 22.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {"classpath:com/framework/spring/*-context.xml"}
)
public class DataSourceTest {
    @Inject
    private DataSource ds;

    @Test
    public void testConnection() throws Exception{
        try(Connection con = ds.getConnection()) {
            System.out.println("###DBcon: " + con);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
