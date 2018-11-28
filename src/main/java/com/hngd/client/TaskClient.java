package com.hngd.client;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hngd.rpc.dg.CommonResponse;
import com.hngd.rpc.dg.DeviceInfo;
import com.hngd.rpc.dg.DeviceInfo.Builder;
import com.hngd.rpc.dg.DgApiGrpc;
import com.hngd.rpc.dg.PerTaskRequest;
import com.hngd.rpc.dg.DgApiGrpc.DgApiStub;
import com.hngd.rpc.dg.QuryFileRequest;
import com.hngd.rpc.dg.RecordQueryParam;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
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
	
	public CommonResponse QueryFileOperation(Map<String,String> device,Map<String,String> queryParam,String taskId) {
		Builder db=DeviceInfo.newBuilder();
		db.setStrDeviceCode(device.get("deviceCode"));
		if(device.get("loginName")!=null) {
			db.setStrLoginName(device.get("loginName"));
		}
		if(device.get("loginPwd")!=null) {
			db.setStrLoginPwd(device.get("loginPwd"));
		}
		if(device.get("port")!=null) {
			db.setNPort(Integer.parseInt(device.get("port")));
		}
		if(device.get("strIp")!=null) {
			db.setStrIP(device.get("strIp"));
		}
		if(device.get("nChannel")!=null) {
			db.setNChannel(Integer.parseInt(device.get("nChannel")));
		}
		if(device.get("deviceTypeCode")!=null) {
			db.setDeviceTypeCode(device.get("deviceTypeCode"));
		}
		if(device.get("enVendor")!=null) {
			db.setEnVendor(device.get("enVendor"));
		}
		DeviceInfo deviceInfo=db.build();
		QuryFileRequest request=QuryFileRequest.newBuilder().setDevInfo(deviceInfo).
				setReQueryParam(RecordQueryParam.newBuilder().setSubStream(Integer.parseInt(queryParam.get("subStream"))).
						setFileType(queryParam.get("fileType")).setStartTime(Long.parseLong(queryParam.get("startTime")))
						.setEndTime(Long.parseLong(queryParam.get("endTime"))).build()).setTaskID(taskId).build();
		CommonResponse response;
		try {
			response=blockingStub.queryFileOperation(request);
		} catch (StatusRuntimeException e) {
			logger.error("RPC 通信异常 ");
			return null;
		}
		return response;
	}
	
	public CommonResponse PeriodicTaskConfig(Map<String,String> device,Map<String,String> queryParam,Integer perSecs,String taskId) {
		Builder db=DeviceInfo.newBuilder();
		db.setStrDeviceCode(device.get("deviceCode"));
		if(device.get("loginName")!=null) {
			db.setStrLoginName(device.get("loginName"));
		}
		if(device.get("loginPwd")!=null) {
			db.setStrLoginPwd(device.get("loginPwd"));
		}
		if(device.get("port")!=null) {
			db.setNPort(Integer.parseInt(device.get("port")));
		}
		if(device.get("strIp")!=null) {
			db.setStrIP(device.get("strIp"));
		}
		if(device.get("nChannel")!=null) {
			db.setNChannel(Integer.parseInt(device.get("nChannel")));
		}
		if(device.get("deviceTypeCode")!=null) {
			db.setDeviceTypeCode(device.get("deviceTypeCode"));
		}
		if(device.get("enVendor")!=null) {
			db.setEnVendor(device.get("enVendor"));
		}
		DeviceInfo deviceInfo=db.build();
		PerTaskRequest request=PerTaskRequest.newBuilder().setDevInfo(deviceInfo)
														.setReQueryParam(RecordQueryParam.newBuilder().setSubStream(Integer.parseInt(queryParam.get("subStream"))).
						setFileType(queryParam.get("fileType")).setStartTime(Long.parseLong(queryParam.get("startTime")))
						.setEndTime(Long.parseLong(queryParam.get("endTime"))).build()).setPerSecs(perSecs).setTaskID(taskId).build();
		CommonResponse response;
		try {
			response=blockingStub.periodicTaskConfig(request);
		} catch (StatusRuntimeException e) {
			logger.error("RPC 通信异常 ");
			return null;
		}
		return response;
	}

}
