package o90;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class e<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> implements z<T>, v<String> {

    /* renamed from: a, reason: collision with root package name */
    public final w<String> f76634a;

    public e() {
        this(1000);
    }

    @Override // o90.v
    public final String[] a() {
        return this.f76634a.i();
    }

    @Override // o90.v
    public final Map<String, List<String>> d() {
        return this.f76634a.g();
    }

    @Override // o90.v
    public List<String> f(int i11) {
        return this.f76634a.d(i11, String.class);
    }

    @Override // o90.z
    public void h(T t11) {
        this.f76634a.m();
    }

    @Override // o90.v
    public List<String> k(String str) {
        return this.f76634a.e(str, String.class);
    }

    @Override // o90.v
    public final List<List<String>> l() {
        return this.f76634a.c();
    }

    @Override // o90.v
    public final void o(Map<Integer, List<String>> map) {
        this.f76634a.k(map);
    }

    @Override // o90.z
    public void q(String[] strArr, T t11) {
        this.f76634a.a(strArr, t11);
    }

    @Override // o90.v
    public final Map<Integer, List<String>> u() {
        return this.f76634a.f();
    }

    @Override // o90.v
    public final void v(Map<String, List<String>> map) {
        this.f76634a.l(map);
    }

    public e(int i11) {
        this.f76634a = new w<>(i11);
    }

    @Override // o90.z
    public void i(T t11) {
    }
}
