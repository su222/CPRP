package com.cprp.packet.request;

import io.netty.channel.ChannelHandlerContext;

import com.cprp.server.task.LogoutTask;
import com.cprp.server.task.ServerTask;
import com.cprp.service.SessionManagerService;


public class LogoutPacket extends BaseRequestPacket {

	@Override
	public ServerTask createTask(ChannelHandlerContext ctx, SessionManagerService sessionService) {
		return new LogoutTask();
	}

}
