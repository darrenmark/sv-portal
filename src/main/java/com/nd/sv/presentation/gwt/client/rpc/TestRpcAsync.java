package com.nd.sv.presentation.gwt.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;

public interface TestRpcAsync {
    void getName(AsyncCallback<String> async);
}
