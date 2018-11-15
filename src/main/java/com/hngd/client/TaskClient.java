package com.hngd.client;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hngd.rpc.dg.CommonResponse;
import com.hngd.rpc.dg.DeviceInfo;
import com.hngd.rpc.dg.DgApiGrpc;
import com.hngd.rpc.dg.DgApiGrpc.DgApiStub;
import com.hngd.rpc.dg.DoorRequest;
import com.hngd.rpc.dg.DoorStatus;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class TaskClient {
	private static final Logger logger = LoggerFactory.getLogger(TaskClient.class);
	private ManagedChannel channel;
	//创建非阻塞存根
	private DgApiGrpc.DgApiBlockingStub blockingStub;
	
	public TaskClient(String host, int port) {
		super();
		this.channel = ManagedChannelBuilder.forAddress(host, port)
						.usePlaintext(true)
						.build();
		this.blockingStub = DgApiGrpc.newBlockingStub(channel);
	}
	
	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5,TimeUnit.SECONDS);
	}
}
