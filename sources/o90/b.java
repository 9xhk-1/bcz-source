package o90;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class b<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> extends p<T> implements z<T>, s<Object> {

    /* renamed from: i, reason: collision with root package name */
    public final w<Object> f76628i;

    /* renamed from: j, reason: collision with root package name */
    public final int f76629j;

    /* renamed from: k, reason: collision with root package name */
    public int f76630k;

    /* renamed from: l, reason: collision with root package name */
    public int f76631l;

    public b(int i11) {
        this.f76628i = new w<>(i11);
        this.f76629j = i11;
    }

    @Override // o90.p
    public void G(Object[] objArr, T t11) {
        this.f76628i.a(objArr, t11);
        int i11 = this.f76630k + 1;
        this.f76630k = i11;
        if (i11 >= this.f76629j) {
            r(i11);
            this.f76630k = 0;
            this.f76628i.b();
            this.f76631l++;
        }
    }

    public <V> List<V> H(int i11, Class<V> cls) {
        return this.f76628i.d(i11, cls);
    }

    public <V> List<V> I(String str, Class<V> cls) {
        return this.f76628i.e(str, cls);
    }

    @Override // o90.v
    public final String[] a() {
        return this.f76628i.i();
    }

    @Override // o90.v
    public final Map<String, List<Object>> d() {
        return this.f76628i.g();
    }

    @Override // o90.v
    public List<Object> f(int i11) {
        return this.f76628i.d(i11, Object.class);
    }

    @Override // o90.p, o90.z
    public void h(T t11) {
        super.h(t11);
        this.f76628i.m();
        this.f76630k = 0;
        this.f76631l = 0;
    }

    @Override // o90.p, o90.z
    public void i(T t11) {
        super.i(t11);
        int i11 = this.f76630k;
        if (i11 > 0) {
            r(i11);
        }
    }

    @Override // o90.s
    public int j() {
        return this.f76631l;
    }

    @Override // o90.v
    public List<Object> k(String str) {
        return this.f76628i.e(str, Object.class);
    }

    @Override // o90.v
    public final List<List<Object>> l() {
        return this.f76628i.c();
    }

    @Override // o90.s
    public int m() {
        return this.f76629j;
    }

    @Override // o90.v
    public final void o(Map<Integer, List<Object>> map) {
        this.f76628i.k(map);
    }

    @Override // o90.s
    public abstract void r(int i11);

    @Override // o90.v
    public final Map<Integer, List<Object>> u() {
        return this.f76628i.f();
    }

    @Override // o90.v
    public final void v(Map<String, List<Object>> map) {
        this.f76628i.l(map);
    }
}
