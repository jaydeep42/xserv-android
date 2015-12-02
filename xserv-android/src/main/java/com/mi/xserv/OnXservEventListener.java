package com.mi.xserv;

import org.json.JSONObject;

public interface OnXservEventListener {

    void OnOpen();

    void OnClose();

    void OnError();

    void OnEvents(JSONObject json);

    void OnEventsOp(JSONObject json);
}