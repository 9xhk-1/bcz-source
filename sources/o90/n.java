package o90;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class n<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> extends p<T> implements v<Object> {

    /* renamed from: i, reason: collision with root package name */
    public final w<Object> f76684i;

    public n() {
        this(1000);
    }

    @Override // o90.p
    public void G(Object[] objArr, T t11) {
        this.f76684i.a(objArr, t11);
    }

    public <V> List<V> H(int i11, Class<V> cls) {
        return this.f76684i.d(i11, cls);
    }

    public <V> List<V> I(String str, Class<V> cls) {
        return this.f76684i.e(str, cls);
    }

    @Override // o90.v
    public final String[] a() {
        return this.f76684i.i();
    }

    @Override // o90.v
    public final Map<String, List<Object>> d() {
        return this.f76684i.g();
    }

    @Override // o90.v
    public List<Object> f(int i11) {
        return this.f76684i.d(i11, Object.class);
    }

    @Override // o90.p, o90.z
    public void h(T t11) {
        super.h(t11);
        this.f76684i.m();
    }

    @Override // o90.v
    public List<Object> k(String str) {
        return this.f76684i.e(str, Object.class);
    }

    @Override // o90.v
    public final List<List<Object>> l() {
        return this.f76684i.c();
    }

    @Override // o90.v
    public final void o(Map<Integer, List<Object>> map) {
        this.f76684i.k(map);
    }

    @Override // o90.v
    public final Map<Integer, List<Object>> u() {
        return this.f76684i.f();
    }

    @Override // o90.v
    public final void v(Map<String, List<Object>> map) {
        this.f76684i.l(map);
    }

    public n(int i11) {
        this.f76684i = new w<>(i11);
    }
}
