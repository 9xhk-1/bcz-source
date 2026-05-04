package com.baicizhan.client.business.thrift;

import android.content.Context;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.UserRecord;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class o {
    public static boolean a(Context context) {
        if (c.b().j("access_token")) {
            return true;
        }
        UserRecord c11 = i9.m.c(context);
        if (TextUtils.isEmpty(c11.getToken())) {
            return false;
        }
        c.b().k("access_token", c11.getToken());
        return true;
    }
}
