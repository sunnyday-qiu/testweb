package com.sunnyday.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

/**
 * Description:
 *
 * @author sunnyday
 * @date 2023/2/1
 */
public class MysqlSession {

    private static final String RESOURCE = "mybatis-config.xml";

    public static <T> T getMapper(Class<T> daoInterface) {
        return (T) Proxy.newProxyInstance(MysqlSession.class.getClassLoader(),
                new Class[]{daoInterface},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        InputStream in = Resources.getResourceAsStream(RESOURCE);

                        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(in);

                        SqlSession sqlSession = ssf.openSession();
                        String methodName = method.getName();
                        String canonicalName = daoInterface.getCanonicalName();
                        List<Object> list = sqlSession.selectList(canonicalName + "." + methodName, args);
                        return list;
                    }
                }
        );
    }

}
