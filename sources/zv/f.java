package zv;

import android.content.Context;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f implements n {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yv.f f102910b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102911c;

    public f(@m80.k yv.f pluralsRes, int i11) {
        g0.p(pluralsRes, "pluralsRes");
        this.f102910b = pluralsRes;
        this.f102911c = i11;
    }

    public static /* synthetic */ f e(f fVar, yv.f fVar2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fVar2 = fVar.f102910b;
        }
        if ((i12 & 2) != 0) {
            i11 = fVar.f102911c;
        }
        return fVar.d(fVar2, i11);
    }

    @Override // zv.n
    @m80.k
    public String a(@m80.k Context context) {
        g0.p(context, "context");
        String quantityString = p.f102926a.c(context).getQuantityString(this.f102910b.b(), this.f102911c);
        g0.o(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @m80.k
    public final yv.f b() {
        return this.f102910b;
    }

    public final int c() {
        return this.f102911c;
    }

    @m80.k
    public final f d(@m80.k yv.f pluralsRes, int i11) {
        g0.p(pluralsRes, "pluralsRes");
        return new f(pluralsRes, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return g0.g(this.f102910b, fVar.f102910b) && this.f102911c == fVar.f102911c;
    }

    public final int f() {
        return this.f102911c;
    }

    @m80.k
    public final yv.f g() {
        return this.f102910b;
    }

    public int hashCode() {
        return (this.f102910b.hashCode() * 31) + Integer.hashCode(this.f102911c);
    }

    @m80.k
    public String toString() {
        return "PluralStringDesc(pluralsRes=" + this.f102910b + ", number=" + this.f102911c + pn.j.f81007d;
    }
}
