package com.cprp.packet;

import com.cprp.packet.request.LoginPacket;
import com.cprp.packet.request.LogoutPacket;

public enum RequestPacketType {
	
	LOGIN(LoginPacket.class),
	LOGOUT(LogoutPacket.class);
	
	private Class<?> clazz;
	
	private RequestPacketType(Class<?> type) {
		this.clazz = type;
	}
	
	public Class<?> getPacketClass() {
		return this.clazz;
	}
}
