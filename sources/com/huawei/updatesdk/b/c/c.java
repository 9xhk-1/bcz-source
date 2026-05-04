package com.huawei.updatesdk.b.c;

import android.os.Build;
import android.text.TextUtils;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private String f36883a;

    /* renamed from: b, reason: collision with root package name */
    private String f36884b;

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public String d() {
        if (!TextUtils.isEmpty(this.f36884b)) {
            return this.f36884b;
        }
        String c11 = c();
        this.f36884b = c11;
        if (TextUtils.isEmpty(c11)) {
            this.f36884b = Build.MANUFACTURER;
        }
        return this.f36884b;
    }

    public String e() {
        if (!TextUtils.isEmpty(this.f36883a)) {
            return this.f36883a;
        }
        String a11 = a();
        this.f36883a = a11;
        if (TextUtils.isEmpty(a11)) {
            this.f36883a = Build.MODEL;
        }
        return this.f36883a;
    }

    public abstract List<String> f();
}
