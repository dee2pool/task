package com.hngd.server;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hngd.client.TaskClient;
import com.hngd.rpc.dg.CommonResponse;
import com.hngd.rpc.dg.DgApiGrpc.DgApiImplBase;
import com.hngd.rpc.dg.QuryFileRequest;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class TaskServer {
	private static final Logger logger = LoggerFactory.getLogger(TaskClient.class);
	
	private Server server;
	
	static class QueryFileOperationImpl extends DgApiImplBase{

		@Override
		public void queryFileOperation(QuryFileRequest request, StreamObserver<CommonResponse> responseObserver) {
			
			
			super.queryFileOperation(request, responseObserver);
		}
		
	}
}
