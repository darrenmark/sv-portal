package com.nd.sv.presentation.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.nd.sv.presentation.gwt.client.rpc.TestRpc;
import com.nd.sv.presentation.gwt.client.rpc.TestRpcAsync;
import com.sencha.gxt.widget.core.client.box.MessageBox;

/**
 */
public class Main implements EntryPoint {
    private TestRpcAsync async = TestRpc.App.getInstance();

    public void onModuleLoad() {
        GWT.log("Loading application");
        async.getName(new AsyncCallback<String>() {
            @Override
            public void onFailure(Throwable throwable) {
                Window.alert("Failure");
            }

            @Override
            public void onSuccess(String s) {
                MessageBox popup = new MessageBox("Welcome", s);
                RootPanel.get().add(popup);
                popup.show();
            }
        });
//        MessageBox popup = new MessageBox("On the 8th day, God said...", "Hello World");
//        RootPanel.get().add(popup);
//        popup.show();
    }
}
