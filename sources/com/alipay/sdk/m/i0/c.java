package com.alipay.sdk.m.i0;

import android.text.TextUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public String f10589a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f10590b;

    public void a(boolean z11) {
        this.f10590b = Boolean.valueOf(z11);
    }

    public void b(String str) {
        this.f10589a = str;
    }

    public boolean a() {
        return this.f10590b != null;
    }

    public boolean b() {
        Boolean bool = this.f10590b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f10589a, str);
    }
}
