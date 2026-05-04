package ca;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final int f8450c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f8451a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8452b;

    public e(int i11, boolean z11) {
        this.f8451a = i11;
        this.f8452b = z11;
    }

    public static /* synthetic */ e d(e eVar, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = eVar.f8451a;
        }
        if ((i12 & 2) != 0) {
            z11 = eVar.f8452b;
        }
        return eVar.c(i11, z11);
    }

    public final int a() {
        return this.f8451a;
    }

    public final boolean b() {
        return this.f8452b;
    }

    @k
    public final e c(int i11, boolean z11) {
        return new e(i11, z11);
    }

    public final int e() {
        return this.f8451a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8451a == eVar.f8451a && this.f8452b == eVar.f8452b;
    }

    public final boolean f() {
        return this.f8452b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f8451a) * 31) + Boolean.hashCode(this.f8452b);
    }

    @k
    public String toString() {
        return "WinningStreakDate(date=" + this.f8451a + ", trusted=" + this.f8452b + j.f81007d;
    }
}
