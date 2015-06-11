package com.cprp.packet.request;

import io.netty.channel.ChannelHandlerContext;

import com.cprp.packet.RequestPacketType;
import com.cprp.server.task.ServerTask;
import com.cprp.service.SessionManagerService;

public abstract class BaseRequestPacket {
	// trasient로 해야  protubuf가 serialize 안함
	private transient RequestPacketType packetType;
	
	public RequestPacketType getPacketType() {
		return packetType;
	}

	public void setPacketType(RequestPacketType packetType) {
		this.packetType = packetType;
	}
	
	public abstract ServerTask createTask(ChannelHandlerContext ctx, SessionManagerService sessionService);
}
