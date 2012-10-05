package com.nd.sv.presentation.gwt.server;

import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.nd.sv.presentation.gwt.client.rpc.TestRpc;
import com.nd.sv.presentation.login.LoginController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 */
@Controller
public class TestRpcImpl implements TestRpc {
    @Autowired LoginController loginController;
    @Override
    public String getName() {
        return  loginController.getName();
    }
}
