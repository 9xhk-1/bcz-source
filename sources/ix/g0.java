package ix;

import ix.p1;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g0 implements p1 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final g0 f62796d = new g0();

    @Override // xy.u1
    @m80.l
    public List<String> a(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return null;
    }

    @Override // xy.u1
    public boolean b() {
        return true;
    }

    @Override // xy.u1
    public boolean c(@m80.k String str, @m80.k String str2) {
        return p1.b.b(this, str, str2);
    }

    @Override // xy.u1
    public boolean contains(@m80.k String str) {
        return p1.b.a(this, str);
    }

    @Override // xy.u1
    public void d(@m80.k x00.p<? super String, ? super List<String>, yz.g2> pVar) {
        p1.b.c(this, pVar);
    }

    @Override // xy.u1
    @m80.k
    public Set<Map.Entry<String, List<String>>> entries() {
        return a00.w1.k();
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof p1) && ((p1) obj).isEmpty();
    }

    @Override // xy.u1
    @m80.l
    public String get(@m80.k String str) {
        return p1.b.d(this, str);
    }

    @Override // xy.u1
    public boolean isEmpty() {
        return true;
    }

    @Override // xy.u1
    @m80.k
    public Set<String> names() {
        return a00.w1.k();
    }

    @m80.k
    public String toString() {
        return "Parameters " + entries();
    }
}
