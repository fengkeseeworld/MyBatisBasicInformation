package fengke.study;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import fengke.study.bean.User;
/**
 * ����
 * @author ���
 *	��Ҫ���ݣ�
 *	1.��ȡsqlsession�����ַ�ʽ��reader��inputstream
 *	2.��ȡsqlsession�Ĳ��裺
 *						��ȡ���ĵ������ļ���
 *						����SqlSessionFactory��
 *						����SqlSession��
 *						�������ݣ�
 *						�ر�SqlSession��
 */
public class Test {

	public static void main(String[] args) throws IOException {
		//-------------------------��ȡsqlsession�ķ���--------------------------
		//���������ļ��ĵ�ַ���������ݿ⣬�������ݿ�ӳ����ļ���
		String loaction="fengke/study/config/mybatis-config.xml";
		//��ȡ���������ļ��ĵ�һ�ַ���
		Reader reader=Resources.getResourceAsReader(loaction);
		//��ȡ���������ļ��ĵڶ��ַ���
		//InputStream reader = Resources.getResourceAsStream(loaction);
		//����һ��SqlSessionFactory
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		//ͨ��SqlSessionFactory��һ��SqlSession
		SqlSession sqlSession=factory.openSession();
		//--------------------------------------------------------------------
		//���������Ƿ�ɹ�
		User temp=sqlSession.selectOne("selectUser", 1);
		System.out.println(temp.toString());
		sqlSession.close();
		
	}
}
