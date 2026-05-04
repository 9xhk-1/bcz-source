package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10150a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10151b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10152c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10153d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10154e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Bitmap f10155f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public p0(int i11, int i12, String str, String str2, String str3) {
        this.f10150a = i11;
        this.f10151b = i12;
        this.f10152c = str;
        this.f10153d = str2;
        this.f10154e = str3;
    }

    @Nullable
    public Bitmap a() {
        return this.f10155f;
    }

    public String b() {
        return this.f10154e;
    }

    public String c() {
        return this.f10153d;
    }

    public int d() {
        return this.f10151b;
    }

    public String e() {
        return this.f10152c;
    }

    public int f() {
        return this.f10150a;
    }

    public boolean g() {
        if (this.f10155f == null) {
            return this.f10153d.startsWith("data:") && this.f10153d.indexOf("base64,") > 0;
        }
        return true;
    }

    public void h(@Nullable Bitmap bitmap) {
        this.f10155f = bitmap;
    }
}
