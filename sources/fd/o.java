package fd;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final int f51678c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f51679a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<q> f51680b;

    public o(@m80.k String title, @m80.k List<q> items) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(items, "items");
        this.f51679a = title;
        this.f51680b = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ o d(o oVar, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = oVar.f51679a;
        }
        if ((i11 & 2) != 0) {
            list = oVar.f51680b;
        }
        return oVar.c(str, list);
    }

    @m80.k
    public final String a() {
        return this.f51679a;
    }

    @m80.k
    public final List<q> b() {
        return this.f51680b;
    }

    @m80.k
    public final o c(@m80.k String title, @m80.k List<q> items) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(items, "items");
        return new o(title, items);
    }

    @m80.k
    public final List<q> e() {
        return this.f51680b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.g0.g(this.f51679a, oVar.f51679a) && kotlin.jvm.internal.g0.g(this.f51680b, oVar.f51680b);
    }

    @m80.k
    public final String f() {
        return this.f51679a;
    }

    public int hashCode() {
        return (this.f51679a.hashCode() * 31) + this.f51680b.hashCode();
    }

    @m80.k
    public String toString() {
        return "ExtensionItemGroup(title=" + this.f51679a + ", items=" + this.f51680b + pn.j.f81007d;
    }
}
