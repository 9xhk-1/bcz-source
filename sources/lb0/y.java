package lb0;

import java.util.Objects;
import javax.annotation.Nullable;
import lb0.m;
import okhttp3.Protocol;
import okhttp3.l;
import okhttp3.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class y<T> {

    /* renamed from: a, reason: collision with root package name */
    public final okhttp3.n f71022a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final T f71023b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final okhttp3.o f71024c;

    public y(okhttp3.n nVar, @Nullable T t11, @Nullable okhttp3.o oVar) {
        this.f71022a = nVar;
        this.f71023b = t11;
        this.f71024c = oVar;
    }

    public static <T> y<T> c(int i11, okhttp3.o oVar) {
        Objects.requireNonNull(oVar, "body == null");
        if (i11 >= 400) {
            return d(oVar, new n.a().b(new m.c(oVar.r(), oVar.q())).g(i11).y("Response.error()").B(Protocol.HTTP_1_1).E(new l.a().B("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 400: " + i11);
    }

    public static <T> y<T> d(okhttp3.o oVar, okhttp3.n nVar) {
        Objects.requireNonNull(oVar, "body == null");
        Objects.requireNonNull(nVar, "rawResponse == null");
        if (nVar.S5()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new y<>(nVar, null, oVar);
    }

    public static <T> y<T> j(int i11, @Nullable T t11) {
        if (i11 >= 200 && i11 < 300) {
            return m(t11, new n.a().g(i11).y("Response.success()").B(Protocol.HTTP_1_1).E(new l.a().B("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i11);
    }

    public static <T> y<T> k(@Nullable T t11) {
        return m(t11, new n.a().g(200).y("OK").B(Protocol.HTTP_1_1).E(new l.a().B("http://localhost/").b()).c());
    }

    public static <T> y<T> l(@Nullable T t11, okhttp3.h hVar) {
        Objects.requireNonNull(hVar, "headers == null");
        return m(t11, new n.a().g(200).y("OK").B(Protocol.HTTP_1_1).w(hVar).E(new l.a().B("http://localhost/").b()).c());
    }

    public static <T> y<T> m(@Nullable T t11, okhttp3.n nVar) {
        Objects.requireNonNull(nVar, "rawResponse == null");
        if (nVar.S5()) {
            return new y<>(nVar, t11, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @Nullable
    public T a() {
        return this.f71023b;
    }

    public int b() {
        return this.f71022a.Z();
    }

    @Nullable
    public okhttp3.o e() {
        return this.f71024c;
    }

    public okhttp3.h f() {
        return this.f71022a.k0();
    }

    public boolean g() {
        return this.f71022a.S5();
    }

    public String h() {
        return this.f71022a.o0();
    }

    public okhttp3.n i() {
        return this.f71022a;
    }

    public String toString() {
        return this.f71022a.toString();
    }
}
