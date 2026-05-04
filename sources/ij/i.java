package ij;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final int f60647c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f60648a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final String f60649b;

    public i(boolean z11, @m80.l String str) {
        this.f60648a = z11;
        this.f60649b = str;
    }

    public static /* synthetic */ i d(i iVar, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = iVar.f60648a;
        }
        if ((i11 & 2) != 0) {
            str = iVar.f60649b;
        }
        return iVar.c(z11, str);
    }

    public final boolean a() {
        return this.f60648a;
    }

    @m80.l
    public final String b() {
        return this.f60649b;
    }

    @m80.k
    public final i c(boolean z11, @m80.l String str) {
        return new i(z11, str);
    }

    @m80.l
    public final String e() {
        return this.f60649b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f60648a == iVar.f60648a && g0.g(this.f60649b, iVar.f60649b);
    }

    public final boolean f() {
        return this.f60648a;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f60648a) * 31;
        String str = this.f60649b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "ShareCodeInfo(valid=" + this.f60648a + ", bookName=" + this.f60649b + pn.j.f81007d;
    }
}
