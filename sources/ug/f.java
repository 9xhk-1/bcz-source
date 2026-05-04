package ug;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final int f92203e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f92204a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f92205b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f92206c;

    /* renamed from: d, reason: collision with root package name */
    public final int f92207d;

    public f(int i11, @k String name, @k String avatar, int i12) {
        g0.p(name, "name");
        g0.p(avatar, "avatar");
        this.f92204a = i11;
        this.f92205b = name;
        this.f92206c = avatar;
        this.f92207d = i12;
    }

    public static /* synthetic */ f f(f fVar, int i11, String str, String str2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = fVar.f92204a;
        }
        if ((i13 & 2) != 0) {
            str = fVar.f92205b;
        }
        if ((i13 & 4) != 0) {
            str2 = fVar.f92206c;
        }
        if ((i13 & 8) != 0) {
            i12 = fVar.f92207d;
        }
        return fVar.e(i11, str, str2, i12);
    }

    public final int a() {
        return this.f92204a;
    }

    @k
    public final String b() {
        return this.f92205b;
    }

    @k
    public final String c() {
        return this.f92206c;
    }

    public final int d() {
        return this.f92207d;
    }

    @k
    public final f e(int i11, @k String name, @k String avatar, int i12) {
        g0.p(name, "name");
        g0.p(avatar, "avatar");
        return new f(i11, name, avatar, i12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f92204a == fVar.f92204a && g0.g(this.f92205b, fVar.f92205b) && g0.g(this.f92206c, fVar.f92206c) && this.f92207d == fVar.f92207d;
    }

    @k
    public final String g() {
        return this.f92206c;
    }

    public final int h() {
        return this.f92204a;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f92204a) * 31) + this.f92205b.hashCode()) * 31) + this.f92206c.hashCode()) * 31) + Integer.hashCode(this.f92207d);
    }

    public final int i() {
        return this.f92207d;
    }

    @k
    public final String j() {
        return this.f92205b;
    }

    @k
    public String toString() {
        return "UserProfile(bid=" + this.f92204a + ", name=" + this.f92205b + ", avatar=" + this.f92206c + ", grade=" + this.f92207d + j.f81007d;
    }
}
