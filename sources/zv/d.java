package zv;

import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d implements n {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yv.f f102907b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102908c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<Object> f102909d;

    public d(@m80.k yv.f pluralsRes, int i11, @m80.k List<? extends Object> args) {
        g0.p(pluralsRes, "pluralsRes");
        g0.p(args, "args");
        this.f102907b = pluralsRes;
        this.f102908c = i11;
        this.f102909d = args;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d f(d dVar, yv.f fVar, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fVar = dVar.f102907b;
        }
        if ((i12 & 2) != 0) {
            i11 = dVar.f102908c;
        }
        if ((i12 & 4) != 0) {
            list = dVar.f102909d;
        }
        return dVar.e(fVar, i11, list);
    }

    @Override // zv.n
    @m80.k
    public String a(@m80.k Context context) {
        g0.p(context, "context");
        p pVar = p.f102926a;
        Resources c11 = pVar.c(context);
        int b11 = this.f102907b.b();
        int i11 = this.f102908c;
        Object[] b12 = pVar.b(this.f102909d, context);
        String quantityString = c11.getQuantityString(b11, i11, Arrays.copyOf(b12, b12.length));
        g0.o(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    @m80.k
    public final yv.f b() {
        return this.f102907b;
    }

    public final int c() {
        return this.f102908c;
    }

    @m80.k
    public final List<Object> d() {
        return this.f102909d;
    }

    @m80.k
    public final d e(@m80.k yv.f pluralsRes, int i11, @m80.k List<? extends Object> args) {
        g0.p(pluralsRes, "pluralsRes");
        g0.p(args, "args");
        return new d(pluralsRes, i11, args);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return g0.g(this.f102907b, dVar.f102907b) && this.f102908c == dVar.f102908c && g0.g(this.f102909d, dVar.f102909d);
    }

    @m80.k
    public final List<Object> g() {
        return this.f102909d;
    }

    public final int h() {
        return this.f102908c;
    }

    public int hashCode() {
        return (((this.f102907b.hashCode() * 31) + Integer.hashCode(this.f102908c)) * 31) + this.f102909d.hashCode();
    }

    @m80.k
    public final yv.f i() {
        return this.f102907b;
    }

    @m80.k
    public String toString() {
        return "PluralFormattedStringDesc(pluralsRes=" + this.f102907b + ", number=" + this.f102908c + ", args=" + this.f102909d + pn.j.f81007d;
    }
}
