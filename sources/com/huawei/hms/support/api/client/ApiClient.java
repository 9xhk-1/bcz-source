package com.huawei.hms.support.api.client;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface ApiClient {
    String getAppID();

    Context getContext();

    String getCpID();

    String getPackageName();

    String getSessionId();

    SubAppInfo getSubAppInfo();

    String getTransportName();

    boolean isConnected();
}
