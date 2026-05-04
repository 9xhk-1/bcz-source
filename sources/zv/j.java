package zv;

import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j implements n {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yv.m f102913b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Object> f102914c;

    public j(@m80.k yv.m stringRes, @m80.k List<? extends Object> args) {
        g0.p(stringRes, "stringRes");
        g0.p(args, "args");
        this.f102913b = stringRes;
        this.f102914c = args;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j e(j jVar, yv.m mVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mVar = jVar.f102913b;
        }
        if ((i11 & 2) != 0) {
            list = jVar.f102914c;
        }
        return jVar.d(mVar, list);
    }

    @Override // zv.n
    @m80.k
    public String a(@m80.k Context context) {
        g0.p(context, "context");
        p pVar = p.f102926a;
        Resources c11 = pVar.c(context);
        int d11 = this.f102913b.d();
        Object[] b11 = pVar.b(this.f102914c, context);
        String string = c11.getString(d11, Arrays.copyOf(b11, b11.length));
        g0.o(string, "getString(...)");
        return string;
    }

    @m80.k
    public final yv.m b() {
        return this.f102913b;
    }

    @m80.k
    public final List<Object> c() {
        return this.f102914c;
    }

    @m80.k
    public final j d(@m80.k yv.m stringRes, @m80.k List<? extends Object> args) {
        g0.p(stringRes, "stringRes");
        g0.p(args, "args");
        return new j(stringRes, args);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return g0.g(this.f102913b, jVar.f102913b) && g0.g(this.f102914c, jVar.f102914c);
    }

    @m80.k
    public final List<Object> f() {
        return this.f102914c;
    }

    @m80.k
    public final yv.m g() {
        return this.f102913b;
    }

    public int hashCode() {
        return (this.f102913b.hashCode() * 31) + this.f102914c.hashCode();
    }

    @m80.k
    public String toString() {
        return "ResourceFormattedStringDesc(stringRes=" + this.f102913b + ", args=" + this.f102914c + pn.j.f81007d;
    }
}
