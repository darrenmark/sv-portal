package com.nd.sv.presentation.gwt.client.rpc;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 */
@RemoteServiceRelativePath("../rpc/rpcTest.rpc")
public interface TestRpc extends RemoteService {

    String getName();

    public static class App {
        private static final TestRpcAsync instance = (TestRpcAsync) GWT.create(TestRpc.class);

        public static TestRpcAsync getInstance() {
            return instance;
        }
    }
}
