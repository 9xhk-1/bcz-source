package ij;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f60637c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final long f60638a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final z f60639b;

    public d0(long j11, @m80.l z zVar) {
        this.f60638a = j11;
        this.f60639b = zVar;
    }

    public static /* synthetic */ d0 d(d0 d0Var, long j11, z zVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = d0Var.f60638a;
        }
        if ((i11 & 2) != 0) {
            zVar = d0Var.f60639b;
        }
        return d0Var.c(j11, zVar);
    }

    public final long a() {
        return this.f60638a;
    }

    @m80.l
    public final z b() {
        return this.f60639b;
    }

    @m80.k
    public final d0 c(long j11, @m80.l z zVar) {
        return new d0(j11, zVar);
    }

    public final long e() {
        return this.f60638a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f60638a == d0Var.f60638a && g0.g(this.f60639b, d0Var.f60639b);
    }

    @m80.l
    public final z f() {
        return this.f60639b;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f60638a) * 31;
        z zVar = this.f60639b;
        return hashCode + (zVar == null ? 0 : zVar.hashCode());
    }

    @m80.k
    public String toString() {
        return "WordFavoriteUpdatedInfo(updatedAt=" + this.f60638a + ", word=" + this.f60639b + pn.j.f81007d;
    }
}
