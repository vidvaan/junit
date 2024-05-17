package com.ciq.utiltest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.hibernate.Session;
import org.junit.Test;

import com.ciq.util.SessionUtil;

public class SessionUtilTest {

	@Test
	public void sessionTest1() {
		// Get Session Test
		Session session = null;
		session = SessionUtil.getSession();
		assertNotNull(session);

		// Close Session Test
		SessionUtil.close(session);
		assertTrue(!session.isConnected());

	}

}
