package com.nvg.mina.test.request;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoConnector;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.LineDelimiter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

/**
 * @˵�� Mina TCP�ͻ���
 * @author ����ǿ
 * @version 1.0
 * @since
 */
public class MinaTcpClient {
	private static Logger log = Logger.getLogger(MinaTcpClient.class);
	private static String HOST = "192.168.1.101";
	private static int PORT = 9132;

	public static void main(String[] args) {
		PropertyConfigurator
		.configure("D:/IBM/rationalsdp/workspace/Mina4GmpCode/src/com/nvg/mina/test/log/log4j.properties");
		
		IoConnector conn = new NioSocketConnector();
		// �������ӳ�ʱʱ��
		conn.setConnectTimeoutMillis(30000L);
		// ��ӹ�����
		conn.getFilterChain().addLast(
				"codec",
				new ProtocolCodecFilter(new TextLineCodecFactory(Charset
						.forName("UTF-8"), LineDelimiter.WINDOWS.getValue(),
						LineDelimiter.WINDOWS.getValue())));
		// ���ҵ����handler
		conn.setHandler(new MinaClientHandler());
		IoSession session = null;
		try {
			ConnectFuture future = conn.connect(new InetSocketAddress(HOST,
					PORT));// ��������
			future.awaitUninterruptibly();// �ȴ����Ӵ������
			session = future.getSession();// ���session
			session.write("Hello World!");// ������Ϣ
		} catch (Exception e) {
			log.error("�ͻ��������쳣...", e);
		}

		session.getCloseFuture().awaitUninterruptibly();// �ȴ����ӶϿ�
		conn.dispose();

	}
}