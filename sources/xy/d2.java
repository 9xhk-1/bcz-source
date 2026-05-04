package xy;

import java.util.List;
import java.util.Map;
import java.util.Set;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class d2 implements u1 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f98495d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f98496e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final List<String> f98497f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Map.Entry<String, List<? extends String>>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final String f98498a;

        /* renamed from: b, reason: collision with root package name */
        public final List<String> f98499b;

        public a(d2 d2Var) {
            this.f98498a = d2Var.e();
            this.f98499b = d2Var.f();
        }

        @Override // java.util.Map.Entry
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            return this.f98498a;
        }

        @Override // java.util.Map.Entry
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<String> getValue() {
            return this.f98499b;
        }

        public List<String> c(List<String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return kotlin.jvm.internal.g0.g(entry.getKey(), getKey()) && kotlin.jvm.internal.g0.g(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ List<? extends String> setValue(List<? extends String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return getKey() + '=' + getValue();
        }
    }

    public d2(boolean z11, @m80.k String name, @m80.k List<String> values) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
        this.f98495d = z11;
        this.f98496e = name;
        this.f98497f = values;
    }

    @Override // xy.u1
    @m80.l
    public List<String> a(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        if (u30.f0.c2(this.f98496e, name, b())) {
            return this.f98497f;
        }
        return null;
    }

    @Override // xy.u1
    public boolean b() {
        return this.f98495d;
    }

    @Override // xy.u1
    public boolean c(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        return u30.f0.c2(name, this.f98496e, b()) && this.f98497f.contains(value);
    }

    @Override // xy.u1
    public boolean contains(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return u30.f0.c2(name, this.f98496e, b());
    }

    @Override // xy.u1
    public void d(@m80.k x00.p<? super String, ? super List<String>, g2> body) {
        kotlin.jvm.internal.g0.p(body, "body");
        body.invoke(this.f98496e, this.f98497f);
    }

    @m80.k
    public final String e() {
        return this.f98496e;
    }

    @Override // xy.u1
    @m80.k
    public Set<Map.Entry<String, List<String>>> entries() {
        return a00.v1.f(new a(this));
    }

    public boolean equals(@m80.l Object obj) {
        boolean k11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (b() != u1Var.b()) {
            return false;
        }
        k11 = c2.k(entries(), u1Var.entries());
        return k11;
    }

    @m80.k
    public final List<String> f() {
        return this.f98497f;
    }

    @Override // xy.u1
    @m80.l
    public String get(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        if (u30.f0.c2(name, this.f98496e, b())) {
            return (String) a00.r0.L2(this.f98497f);
        }
        return null;
    }

    public int hashCode() {
        int l11;
        l11 = c2.l(entries(), Boolean.hashCode(b()) * 31);
        return l11;
    }

    @Override // xy.u1
    public boolean isEmpty() {
        return false;
    }

    @Override // xy.u1
    @m80.k
    public Set<String> names() {
        return a00.v1.f(this.f98496e);
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StringValues(case=");
        sb2.append(!b());
        sb2.append(") ");
        sb2.append(entries());
        return sb2.toString();
    }
}
