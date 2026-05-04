package com.vivo.push.model;

import android.text.TextUtils;
import com.alipay.sdk.m.u.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f45043a;

    /* renamed from: d, reason: collision with root package name */
    private String f45046d;

    /* renamed from: b, reason: collision with root package name */
    private long f45044b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f45045c = -1;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45047e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f45048f = false;

    public b(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalAccessError("PushPackageInfo need a non-null pkgName.");
        }
        this.f45043a = str;
    }

    public final String a() {
        return this.f45043a;
    }

    public final long b() {
        return this.f45044b;
    }

    public final boolean c() {
        return this.f45047e;
    }

    public final boolean d() {
        return this.f45048f;
    }

    public final String toString() {
        return "PushPackageInfo{mPackageName=" + this.f45043a + ", mPushVersion=" + this.f45044b + ", mPackageVersion=" + this.f45045c + ", mInBlackList=" + this.f45047e + ", mPushEnable=" + this.f45048f + i.f11099d;
    }

    public final void a(long j11) {
        this.f45044b = j11;
    }

    public final void b(boolean z11) {
        this.f45048f = z11;
    }

    public final void a(boolean z11) {
        this.f45047e = z11;
    }

    public final void a(int i11) {
        this.f45045c = i11;
    }

    public final void a(String str) {
        this.f45046d = str;
    }
}
