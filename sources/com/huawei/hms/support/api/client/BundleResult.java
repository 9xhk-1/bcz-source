package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BundleResult {

    /* renamed from: a, reason: collision with root package name */
    private int f36278a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f36279b;

    public BundleResult(int i11, Bundle bundle) {
        this.f36278a = i11;
        this.f36279b = bundle;
    }

    public int getResultCode() {
        return this.f36278a;
    }

    public Bundle getRspBody() {
        return this.f36279b;
    }

    public void setResultCode(int i11) {
        this.f36278a = i11;
    }

    public void setRspBody(Bundle bundle) {
        this.f36279b = bundle;
    }
}
