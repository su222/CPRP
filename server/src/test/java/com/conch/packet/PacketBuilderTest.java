package com.conch.packet;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.cprp.packet.PacketBuilder;
import com.cprp.packet.request.BaseRequestPacket;
import com.cprp.packet.request.LoginPacket;
import com.cprp.packet.request.LogoutPacket;

public class PacketBuilderTest extends ProtobufTest {
	
	
	@Test
	public void testLoginPacket() {
		BaseRequestPacket login = PacketBuilder.buildServerPacket((byte)0);
		assertTrue(login instanceof LoginPacket);
		
		BaseRequestPacket logout = PacketBuilder.buildServerPacket((byte)1);
		assertTrue(logout instanceof LogoutPacket);
	}
	
	@Test
	public void testLoginPacketDeserialize() {
		byte [] bytes = serializeLoginPacketForTest();
		
		// 0 byte is LoginPacket
		BaseRequestPacket result =  PacketBuilder.buildRequestPacket((byte)0, bytes);
		assertTrue(result instanceof LoginPacket);
		
		LoginPacket loginPacket = (LoginPacket)result;
		assertTrue(loginPacket.getUserId().equals(TEST_USER_ID));
		assertTrue(loginPacket.getUserPassword().equals(TEST_USER_PASSWORD));
	}
}
