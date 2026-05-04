package com.bun.miitmdid;

import android.app.Activity;
import android.content.Context;
import com.heytap.openid.bean.OpenIDInfo;
import com.heytap.openid.sdk.OpenIDSDK;

/* loaded from: classes6.dex */
public class v extends n {

    /* renamed from: g, reason: collision with root package name */
    public Context f28982g;

    /* renamed from: h, reason: collision with root package name */
    public OpenIDInfo f28983h;

    public v(Context context) {
        this.f28982g = context;
        Context checkContext = checkContext(context);
        this.f28982g = checkContext;
        OpenIDSDK.init(checkContext);
        if (i0.f28938a) {
            OpenIDSDK.setLoggable(true);
        }
    }

    @Override // com.bun.miitmdid.n
    public native g a();

    public final native void b();

    @Override // com.bun.miitmdid.n, com.bun.miitmdid.interfaces.IIdProvider
    public native void doStart();

    @Override // com.bun.miitmdid.o, com.bun.miitmdid.interfaces.IdSupplier
    public native void requestOAIDPermission(Activity activity, int i11);
}
