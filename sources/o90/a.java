package o90;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> implements z<T>, s<String> {

    /* renamed from: a, reason: collision with root package name */
    public final w<String> f76624a;

    /* renamed from: b, reason: collision with root package name */
    public final int f76625b;

    /* renamed from: c, reason: collision with root package name */
    public int f76626c;

    /* renamed from: d, reason: collision with root package name */
    public int f76627d;

    public a(int i11) {
        this.f76624a = new w<>(i11);
        this.f76625b = i11;
    }

    @Override // o90.v
    public final String[] a() {
        return this.f76624a.i();
    }

    @Override // o90.v
    public final Map<String, List<String>> d() {
        return this.f76624a.g();
    }

    @Override // o90.v
    public List<String> f(int i11) {
        return this.f76624a.d(i11, String.class);
    }

    @Override // o90.z
    public void h(T t11) {
        this.f76624a.m();
        this.f76626c = 0;
        this.f76627d = 0;
    }

    @Override // o90.z
    public void i(T t11) {
        int i11 = this.f76626c;
        if (i11 > 0) {
            r(i11);
        }
    }

    @Override // o90.s
    public int j() {
        return this.f76627d;
    }

    @Override // o90.v
    public List<String> k(String str) {
        return this.f76624a.e(str, String.class);
    }

    @Override // o90.v
    public final List<List<String>> l() {
        return this.f76624a.c();
    }

    @Override // o90.s
    public int m() {
        return this.f76625b;
    }

    @Override // o90.v
    public final void o(Map<Integer, List<String>> map) {
        this.f76624a.k(map);
    }

    @Override // o90.z
    public void q(String[] strArr, T t11) {
        this.f76624a.a(strArr, t11);
        int i11 = this.f76626c + 1;
        this.f76626c = i11;
        if (i11 >= this.f76625b) {
            r(i11);
            this.f76626c = 0;
            this.f76624a.b();
            this.f76627d++;
        }
    }

    @Override // o90.s
    public abstract void r(int i11);

    @Override // o90.v
    public final Map<Integer, List<String>> u() {
        return this.f76624a.f();
    }

    @Override // o90.v
    public final void v(Map<String, List<String>> map) {
        this.f76624a.l(map);
    }
}
