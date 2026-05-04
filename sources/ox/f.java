package ox;

import a00.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<e> f78472a = new ArrayList();

    @m80.k
    public final e a() {
        return this.f78472a.size() == 1 ? (e) r0.G2(this.f78472a) : new s(this.f78472a);
    }

    @m80.k
    public final f b(@m80.k String value) {
        g0.p(value, "value");
        this.f78472a.add(new u(value));
        return this;
    }

    @m80.k
    public final f c(@m80.k e grammar) {
        g0.p(grammar, "grammar");
        this.f78472a.add(grammar);
        return this;
    }

    public final void d(@m80.k String str) {
        g0.p(str, "<this>");
        this.f78472a.add(new u(str));
    }

    public final void e(@m80.k e eVar) {
        g0.p(eVar, "<this>");
        this.f78472a.add(eVar);
    }

    public final void f(@m80.k x00.a<? extends e> aVar) {
        g0.p(aVar, "<this>");
        this.f78472a.add(aVar.invoke());
    }
}
