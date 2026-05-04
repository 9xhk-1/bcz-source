package tl;

import androidx.annotation.Nullable;
import l50.b;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f90767c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f90768d = -2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f90769e = -4;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f90770f = -10;

    /* renamed from: g, reason: collision with root package name */
    public static final int f90771g = -12;

    /* renamed from: h, reason: collision with root package name */
    public static final int f90772h = -7;

    /* renamed from: i, reason: collision with root package name */
    public static final int f90773i = -8;

    /* renamed from: a, reason: collision with root package name */
    public int f90774a;

    /* renamed from: b, reason: collision with root package name */
    public String f90775b;

    public a() {
    }

    public int a() {
        return this.f90774a;
    }

    @Nullable
    public String b() {
        return this.f90775b;
    }

    public void c(int i11) {
        this.f90774a = i11;
    }

    public void d(String str) {
        this.f90775b = str;
    }

    public String toString() {
        return "Error{errorCode=" + this.f90774a + ", errorMsg='" + this.f90775b + '\'' + b.f69928j;
    }

    public a(int i11, String str) {
        this.f90774a = i11;
        this.f90775b = str;
    }
}
