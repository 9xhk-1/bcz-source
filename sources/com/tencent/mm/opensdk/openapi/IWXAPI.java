package com.tencent.mm.opensdk.openapi;

import android.content.Intent;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.ILog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface IWXAPI {
    void detach();

    int getWXAppSupportAPI();

    boolean handleIntent(Intent intent, IWXAPIEventHandler iWXAPIEventHandler);

    boolean isWXAppInstalled();

    boolean openWXApp();

    boolean registerApp(String str);

    boolean registerApp(String str, long j11);

    boolean sendReq(BaseReq baseReq);

    boolean sendReq(BaseReq baseReq, SendReqCallback sendReqCallback);

    boolean sendResp(BaseResp baseResp);

    void setLogImpl(ILog iLog);

    void unregisterApp();
}
