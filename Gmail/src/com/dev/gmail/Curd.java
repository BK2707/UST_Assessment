package com.dev.gmail;

public interface Curd {

	public void addAccount(String key,Account ac);
	public void addInbox(Inbox in);
	public void showInbox();
	public void login();
	public void compose(int message_id, String message, Inbox in);
	public void register(Account ac); 
}
