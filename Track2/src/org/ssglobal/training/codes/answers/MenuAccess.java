package org.ssglobal.training.codes.answers;

import org.ssglobal.training.codes.login.LogInFactory;

public class MenuAccess {

	public void showMenu() {
		LogInFactory login = new LogInFactory();
		login.isValidUser();
	}
}
