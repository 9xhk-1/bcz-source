package com.airbnb.lottie.model;

import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class DocumentData {

    /* renamed from: a, reason: collision with root package name */
    public String f9995a;

    /* renamed from: b, reason: collision with root package name */
    public String f9996b;

    /* renamed from: c, reason: collision with root package name */
    public float f9997c;

    /* renamed from: d, reason: collision with root package name */
    public Justification f9998d;

    /* renamed from: e, reason: collision with root package name */
    public int f9999e;

    /* renamed from: f, reason: collision with root package name */
    public float f10000f;

    /* renamed from: g, reason: collision with root package name */
    public float f10001g;

    /* renamed from: h, reason: collision with root package name */
    @ColorInt
    public int f10002h;

    /* renamed from: i, reason: collision with root package name */
    @ColorInt
    public int f10003i;

    /* renamed from: j, reason: collision with root package name */
    public float f10004j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10005k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f11, Justification justification, int i11, float f12, float f13, @ColorInt int i12, @ColorInt int i13, float f14, boolean z11) {
        a(str, str2, f11, justification, i11, f12, f13, i12, i13, f14, z11);
    }

    public void a(String str, String str2, float f11, Justification justification, int i11, float f12, float f13, @ColorInt int i12, @ColorInt int i13, float f14, boolean z11) {
        this.f9995a = str;
        this.f9996b = str2;
        this.f9997c = f11;
        this.f9998d = justification;
        this.f9999e = i11;
        this.f10000f = f12;
        this.f10001g = f13;
        this.f10002h = i12;
        this.f10003i = i13;
        this.f10004j = f14;
        this.f10005k = z11;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f9995a.hashCode() * 31) + this.f9996b.hashCode()) * 31) + this.f9997c)) * 31) + this.f9998d.ordinal()) * 31) + this.f9999e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f10000f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f10002h;
    }

    public DocumentData() {
    }
}
