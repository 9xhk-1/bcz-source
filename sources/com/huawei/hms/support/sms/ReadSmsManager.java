package com.huawei.hms.support.sms;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.hwid.ah;
import com.huawei.hms.hwid.aj;
import fr.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ReadSmsManager {

    /* renamed from: a, reason: collision with root package name */
    private static final Api<Api.ApiOptions.NoOptions> f36437a = new Api<>(HuaweiApiAvailability.HMS_API_NAME_ID);

    /* renamed from: b, reason: collision with root package name */
    private static final ah f36438b = new ah();

    public static k<Void> start(Activity activity) {
        return new aj(activity, f36437a, (Api.ApiOptions.NoOptions) null, (AbstractClientBuilder) f36438b).a();
    }

    public static k<Void> startConsent(Activity activity, String str) {
        return new aj(activity, f36437a, (Api.ApiOptions.NoOptions) null, (AbstractClientBuilder) f36438b).a(str);
    }

    public static k<Void> start(Context context) {
        return new aj(context, f36437a, (Api.ApiOptions.NoOptions) null, f36438b).a();
    }
}
