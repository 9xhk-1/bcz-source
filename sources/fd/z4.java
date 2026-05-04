package fd;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class z4 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f51812e = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f51813a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f51814b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Pair<Integer, Integer> f51815c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x00.a<yz.g2> f51816d;

    public z4(@m80.k String title, @m80.k String description, @m80.l Pair<Integer, Integer> pair, @m80.k x00.a<yz.g2> handler) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(description, "description");
        kotlin.jvm.internal.g0.p(handler, "handler");
        this.f51813a = title;
        this.f51814b = description;
        this.f51815c = pair;
        this.f51816d = handler;
    }

    public static final yz.g2 b() {
        return yz.g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ z4 h(z4 z4Var, String str, String str2, Pair pair, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = z4Var.f51813a;
        }
        if ((i11 & 2) != 0) {
            str2 = z4Var.f51814b;
        }
        if ((i11 & 4) != 0) {
            pair = z4Var.f51815c;
        }
        if ((i11 & 8) != 0) {
            aVar = z4Var.f51816d;
        }
        return z4Var.g(str, str2, pair, aVar);
    }

    @m80.k
    public final String c() {
        return this.f51813a;
    }

    @m80.k
    public final String d() {
        return this.f51814b;
    }

    @m80.l
    public final Pair<Integer, Integer> e() {
        return this.f51815c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return kotlin.jvm.internal.g0.g(this.f51813a, z4Var.f51813a) && kotlin.jvm.internal.g0.g(this.f51814b, z4Var.f51814b) && kotlin.jvm.internal.g0.g(this.f51815c, z4Var.f51815c) && kotlin.jvm.internal.g0.g(this.f51816d, z4Var.f51816d);
    }

    @m80.k
    public final x00.a<yz.g2> f() {
        return this.f51816d;
    }

    @m80.k
    public final z4 g(@m80.k String title, @m80.k String description, @m80.l Pair<Integer, Integer> pair, @m80.k x00.a<yz.g2> handler) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(description, "description");
        kotlin.jvm.internal.g0.p(handler, "handler");
        return new z4(title, description, pair, handler);
    }

    public int hashCode() {
        int hashCode = ((this.f51813a.hashCode() * 31) + this.f51814b.hashCode()) * 31;
        Pair<Integer, Integer> pair = this.f51815c;
        return ((hashCode + (pair == null ? 0 : pair.hashCode())) * 31) + this.f51816d.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f51814b;
    }

    @m80.k
    public final x00.a<yz.g2> j() {
        return this.f51816d;
    }

    @m80.l
    public final Pair<Integer, Integer> k() {
        return this.f51815c;
    }

    @m80.k
    public final String l() {
        return this.f51813a;
    }

    @m80.k
    public String toString() {
        return "TrainingItemInfo(title=" + this.f51813a + ", description=" + this.f51814b + ", status=" + this.f51815c + ", handler=" + this.f51816d + pn.j.f81007d;
    }

    public /* synthetic */ z4(String str, String str2, Pair pair, x00.a aVar, int i11, kotlin.jvm.internal.v vVar) {
        this(str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? null : pair, (i11 & 8) != 0 ? new x00.a() { // from class: fd.y4
            @Override // x00.a
            public final Object invoke() {
                yz.g2 b11;
                b11 = z4.b();
                return b11;
            }
        } : aVar);
    }
}
