package com.tencent.connect;

import android.content.Context;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.auth.c;
import com.tencent.connect.common.BaseApi;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.g;
import com.tencent.tauth.IUiListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UserInfo extends BaseApi {
    public static final String GRAPH_OPEN_ID = "oauth2.0/m_me";

    public UserInfo(Context context, QQToken qQToken) {
        super(qQToken);
    }

    public void getOpenId(IUiListener iUiListener) {
        HttpUtils.requestAsync(this.f42865c, g.a(), GRAPH_OPEN_ID, a(), "GET", new BaseApi.TempRequestListener(iUiListener));
    }

    public void getUserInfo(IUiListener iUiListener) {
        HttpUtils.requestAsync(this.f42865c, g.a(), "user/get_simple_userinfo", a(), "GET", new BaseApi.TempRequestListener(iUiListener));
    }

    public UserInfo(Context context, c cVar, QQToken qQToken) {
        super(cVar, qQToken);
    }
}
