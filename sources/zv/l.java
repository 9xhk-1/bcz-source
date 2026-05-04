package zv;

import android.content.Context;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l implements n {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yv.m f102915b;

    public l(@m80.k yv.m stringRes) {
        g0.p(stringRes, "stringRes");
        this.f102915b = stringRes;
    }

    public static /* synthetic */ l d(l lVar, yv.m mVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mVar = lVar.f102915b;
        }
        return lVar.c(mVar);
    }

    @Override // zv.n
    @m80.k
    public String a(@m80.k Context context) {
        g0.p(context, "context");
        String string = p.f102926a.c(context).getString(this.f102915b.d());
        g0.o(string, "getString(...)");
        return string;
    }

    @m80.k
    public final yv.m b() {
        return this.f102915b;
    }

    @m80.k
    public final l c(@m80.k yv.m stringRes) {
        g0.p(stringRes, "stringRes");
        return new l(stringRes);
    }

    @m80.k
    public final yv.m e() {
        return this.f102915b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && g0.g(this.f102915b, ((l) obj).f102915b);
    }

    public int hashCode() {
        return this.f102915b.hashCode();
    }

    @m80.k
    public String toString() {
        return "ResourceStringDesc(stringRes=" + this.f102915b + pn.j.f81007d;
    }
}
