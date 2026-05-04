package ow;

import c40.m0;
import io.ktor.utils.io.c0;
import java.net.Proxy;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public int f78449a = 4;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public m0 f78450b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f78451c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public Proxy f78452d;

    @m80.l
    public final m0 a() {
        return this.f78450b;
    }

    public final boolean b() {
        return this.f78451c;
    }

    @m80.l
    public final Proxy c() {
        return this.f78452d;
    }

    public final int d() {
        return this.f78449a;
    }

    public final void f(@m80.l m0 m0Var) {
        this.f78450b = m0Var;
    }

    public final void g(boolean z11) {
        this.f78451c = z11;
    }

    public final void h(@m80.l Proxy proxy) {
        this.f78452d = proxy;
    }

    public final void i(int i11) {
        this.f78449a = i11;
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "The [threadsCount] property is deprecated. Consider setting [dispatcher] instead.")
    public static /* synthetic */ void e() {
    }
}
