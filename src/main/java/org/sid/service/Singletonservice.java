package org.sid.service;

import org.sid.dao.AvisDAOimpl;

public class Singletonservice {
	private static AvisServiceImpl service;
	static {
		AvisDAOimpl dao = new AvisDAOimpl();
		dao.init();
		service = new AvisServiceImpl();
		service.setDao(dao);

	}

	public static AvisServiceImpl getservice() {

		return service;

	}

}
