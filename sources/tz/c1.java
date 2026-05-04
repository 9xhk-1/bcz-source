package tz;

import android.text.TextUtils;

/* loaded from: classes8.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f91251a = false;

    /* renamed from: b, reason: collision with root package name */
    public final int f91252b;

    /* renamed from: c, reason: collision with root package name */
    public final String f91253c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f91254d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f91255e;

    public c1(int i11, String str, Long l11, Long l12) {
        this.f91252b = i11;
        this.f91253c = str;
        this.f91254d = l11;
        this.f91255e = l12;
    }

    public static c1 a() {
        return new c1(0, "$register", Long.valueOf(System.currentTimeMillis()), 1L);
    }

    public static c1 b(long j11) {
        return new c1(1, null, Long.valueOf(System.currentTimeMillis()), Long.valueOf(j11));
    }

    public static c1 c(String str, long j11) {
        return new c1(2, str, Long.valueOf(System.currentTimeMillis()), Long.valueOf(j11));
    }

    public void d(boolean z11) {
        this.f91251a = z11;
    }

    public int e() {
        return this.f91252b;
    }

    public boolean f() {
        return this.f91251a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(this.f91253c)) {
            sb2.append(this.f91253c);
            sb2.append(",");
        }
        Long l11 = this.f91254d;
        if (l11 != null) {
            sb2.append(l11);
            sb2.append(",");
        }
        Long l12 = this.f91255e;
        if (l12 != null) {
            sb2.append(l12);
            sb2.append(",");
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
            sb2.append(com.alipay.sdk.m.u.i.f11097b);
        }
        return sb2.toString();
    }
}
