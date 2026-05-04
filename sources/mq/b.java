package mq;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f73632b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f73633c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f73634d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f73635e = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public static final b f73636f = new b(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f73637a;

    public b(int i11) {
        this.f73637a = i11;
    }

    public String a() {
        int i11 = this.f73637a;
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "UNKNOWN" : "SG" : "RU" : "DE" : "CN";
    }

    public final int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b.class == obj.getClass() && this.f73637a == ((b) obj).f73637a;
    }

    public int hashCode() {
        return b(Integer.valueOf(this.f73637a));
    }
}
