package com.tencent.connect;

import android.content.Context;
import android.os.Bundle;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.open.SocialOperation;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.g;
import com.tencent.tauth.IUiListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class UnionInfo extends BaseApi {
    public static final String URL_GET_UNION_ID = "https://openmobile.qq.com/oauth2.0/me";

    public UnionInfo(Context context, QQToken qQToken) {
        super(qQToken);
    }

    public void getUnionId(IUiListener iUiListener) {
        Bundle a11 = a();
        a11.putString(SocialOperation.GAME_UNION_ID, "1");
        HttpUtils.requestAsync(this.f42865c, g.a(), URL_GET_UNION_ID, a11, "GET", new BaseApi.TempRequestListener(iUiListener));
    }
}
