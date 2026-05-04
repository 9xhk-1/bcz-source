package com.huawei.hms.base.log;

import android.content.Context;
import com.huawei.hms.support.log.HMSExtLogger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final HMSExtLogger f35466a;

    /* renamed from: b, reason: collision with root package name */
    private d f35467b;

    public a(HMSExtLogger hMSExtLogger) {
        this.f35466a = hMSExtLogger;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(Context context, String str) {
        d dVar = this.f35467b;
        if (dVar != null) {
            dVar.a(context, str);
        }
    }

    @Override // com.huawei.hms.base.log.d
    public void a(d dVar) {
        this.f35467b = dVar;
    }

    @Override // com.huawei.hms.base.log.d
    public void a(String str, int i11, String str2, String str3) {
        HMSExtLogger hMSExtLogger = this.f35466a;
        if (hMSExtLogger != null) {
            if (i11 == 3) {
                hMSExtLogger.d(str2, str3);
            } else if (i11 == 4) {
                hMSExtLogger.i(str2, str3);
            } else if (i11 != 5) {
                hMSExtLogger.e(str2, str3);
            } else {
                hMSExtLogger.w(str2, str3);
            }
        }
        d dVar = this.f35467b;
        if (dVar != null) {
            dVar.a(str, i11, str2, str3);
        }
    }
}
