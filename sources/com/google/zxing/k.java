package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f35075a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f35076b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35077c;

    /* renamed from: d, reason: collision with root package name */
    public l[] f35078d;

    /* renamed from: e, reason: collision with root package name */
    public final BarcodeFormat f35079e;

    /* renamed from: f, reason: collision with root package name */
    public Map<ResultMetadataType, Object> f35080f;

    /* renamed from: g, reason: collision with root package name */
    public final long f35081g;

    public k(String str, byte[] bArr, l[] lVarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, lVarArr, barcodeFormat, System.currentTimeMillis());
    }

    public void a(l[] lVarArr) {
        l[] lVarArr2 = this.f35078d;
        if (lVarArr2 == null) {
            this.f35078d = lVarArr;
            return;
        }
        if (lVarArr == null || lVarArr.length <= 0) {
            return;
        }
        l[] lVarArr3 = new l[lVarArr2.length + lVarArr.length];
        System.arraycopy(lVarArr2, 0, lVarArr3, 0, lVarArr2.length);
        System.arraycopy(lVarArr, 0, lVarArr3, lVarArr2.length, lVarArr.length);
        this.f35078d = lVarArr3;
    }

    public BarcodeFormat b() {
        return this.f35079e;
    }

    public int c() {
        return this.f35077c;
    }

    public byte[] d() {
        return this.f35076b;
    }

    public Map<ResultMetadataType, Object> e() {
        return this.f35080f;
    }

    public l[] f() {
        return this.f35078d;
    }

    public String g() {
        return this.f35075a;
    }

    public long h() {
        return this.f35081g;
    }

    public void i(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f35080f;
            if (map2 == null) {
                this.f35080f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void j(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f35080f == null) {
            this.f35080f = new EnumMap(ResultMetadataType.class);
        }
        this.f35080f.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f35075a;
    }

    public k(String str, byte[] bArr, l[] lVarArr, BarcodeFormat barcodeFormat, long j11) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, lVarArr, barcodeFormat, j11);
    }

    public k(String str, byte[] bArr, int i11, l[] lVarArr, BarcodeFormat barcodeFormat, long j11) {
        this.f35075a = str;
        this.f35076b = bArr;
        this.f35077c = i11;
        this.f35078d = lVarArr;
        this.f35079e = barcodeFormat;
        this.f35080f = null;
        this.f35081g = j11;
    }
}
