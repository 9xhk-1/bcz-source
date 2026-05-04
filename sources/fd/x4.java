package fd;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class x4 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f51798c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f51799a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<z4> f51800b;

    public x4(@m80.k String title, @m80.k List<z4> items) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(items, "items");
        this.f51799a = title;
        this.f51800b = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x4 d(x4 x4Var, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = x4Var.f51799a;
        }
        if ((i11 & 2) != 0) {
            list = x4Var.f51800b;
        }
        return x4Var.c(str, list);
    }

    @m80.k
    public final String a() {
        return this.f51799a;
    }

    @m80.k
    public final List<z4> b() {
        return this.f51800b;
    }

    @m80.k
    public final x4 c(@m80.k String title, @m80.k List<z4> items) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(items, "items");
        return new x4(title, items);
    }

    @m80.k
    public final List<z4> e() {
        return this.f51800b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        return kotlin.jvm.internal.g0.g(this.f51799a, x4Var.f51799a) && kotlin.jvm.internal.g0.g(this.f51800b, x4Var.f51800b);
    }

    @m80.k
    public final String f() {
        return this.f51799a;
    }

    public int hashCode() {
        return (this.f51799a.hashCode() * 31) + this.f51800b.hashCode();
    }

    @m80.k
    public String toString() {
        return "TrainingItemGroup(title=" + this.f51799a + ", items=" + this.f51800b + pn.j.f81007d;
    }
}
