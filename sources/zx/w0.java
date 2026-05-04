package zx;

import io.ktor.server.engine.a2;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f f103132a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<x00.l<a, g2>> f103133b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public List<String> f103134c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public String f103135d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f103136e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public kotlin.coroutines.d f103137f;

    public w0(@m80.k f environment) {
        kotlin.jvm.internal.g0.p(environment, "environment");
        this.f103132a = environment;
        this.f103133b = new ArrayList();
        this.f103134c = a00.g0.l(a2.a());
        this.f103135d = "";
        this.f103136e = io.ktor.util.a.f61985a.b();
        this.f103137f = EmptyCoroutineContext.INSTANCE;
    }

    @m80.k
    public final v0 a() {
        return new v0(this.f103132a, this.f103133b, this.f103134c, this.f103135d, this.f103136e, this.f103137f);
    }

    public final boolean b() {
        return this.f103136e;
    }

    @m80.k
    public final f c() {
        return this.f103132a;
    }

    @m80.k
    public final List<x00.l<a, g2>> d() {
        return this.f103133b;
    }

    @m80.k
    public final kotlin.coroutines.d e() {
        return this.f103137f;
    }

    @m80.k
    public final String f() {
        return this.f103135d;
    }

    @m80.k
    public final List<String> g() {
        return this.f103134c;
    }

    public final void h(@m80.k x00.l<? super a, g2> body) {
        kotlin.jvm.internal.g0.p(body, "body");
        this.f103133b.add(body);
    }

    public final void i(boolean z11) {
        this.f103136e = z11;
    }

    public final void j(@m80.k kotlin.coroutines.d dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<set-?>");
        this.f103137f = dVar;
    }

    public final void k(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f103135d = str;
    }

    public final void l(@m80.k List<String> list) {
        kotlin.jvm.internal.g0.p(list, "<set-?>");
        this.f103134c = list;
    }
}
