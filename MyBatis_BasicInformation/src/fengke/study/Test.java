package fengke.study;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import fengke.study.bean.User;
/**
 * 测试
 * @author 锋客
 *	主要内容：
 *	1.获取sqlsession的两种方式：reader，inputstream
 *	2.获取sqlsession的步骤：
 *						获取核心的配置文件；
 *						创建SqlSessionFactory；
 *						开启SqlSession；
 *						测试内容；
 *						关闭SqlSession；
 */
public class Test {

	public static void main(String[] args) throws IOException {
		//-------------------------获取sqlsession的方法--------------------------
		//核心配置文件的地址（连接数据库，配置数据库映射的文件）
		String loaction="fengke/study/config/mybatis-config.xml";
		//读取核心配置文件的第一种方法
		Reader reader=Resources.getResourceAsReader(loaction);
		//读取核心配置文件的第二种方法
		//InputStream reader = Resources.getResourceAsStream(loaction);
		//创建一个SqlSessionFactory
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		//通过SqlSessionFactory打开一个SqlSession
		SqlSession sqlSession=factory.openSession();
		//--------------------------------------------------------------------
		//测试配置是否成功
		User temp=sqlSession.selectOne("selectUser", 1);
		System.out.println(temp.toString());
		sqlSession.close();
		
	}
}
