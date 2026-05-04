package rw;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
@kotlin.jvm.internal.u0({"SMAP\nHttpPlainText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpPlainText.kt\nio/ktor/client/plugins/HttpPlainTextConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public Charset f84563c;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Set<Charset> f84561a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<Charset, Float> f84562b = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public Charset f84564d = u30.d.f91599b;

    public static /* synthetic */ void f(a0 a0Var, Charset charset, Float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = null;
        }
        a0Var.e(charset, f11);
    }

    @m80.k
    public final Map<Charset, Float> a() {
        return this.f84562b;
    }

    @m80.k
    public final Set<Charset> b() {
        return this.f84561a;
    }

    @m80.k
    public final Charset c() {
        return this.f84564d;
    }

    @m80.l
    public final Charset d() {
        return this.f84563c;
    }

    public final void e(@m80.k Charset charset, @m80.l Float f11) {
        kotlin.jvm.internal.g0.p(charset, "charset");
        if (f11 != null) {
            double floatValue = f11.floatValue();
            if (0.0d > floatValue || floatValue > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.f84561a.add(charset);
        if (f11 == null) {
            this.f84562b.remove(charset);
        } else {
            this.f84562b.put(charset, f11);
        }
    }

    public final void g(@m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(charset, "<set-?>");
        this.f84564d = charset;
    }

    public final void h(@m80.l Charset charset) {
        this.f84563c = charset;
    }
}
