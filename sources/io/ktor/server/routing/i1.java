package io.ktor.server.routing;

import io.ktor.server.routing.i1;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i1 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f61647b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final i1 f61648c = new i1(a00.h0.J());

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<j1> f61649a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static final boolean e(String it) {
            kotlin.jvm.internal.g0.p(it, "it");
            return it.length() > 0;
        }

        public static final j1 f(String segment) {
            kotlin.jvm.internal.g0.p(segment, "segment");
            return (u30.k0.m3(segment, l50.b.f69927i, false, 2, null) && u30.k0.m3(segment, l50.b.f69928j, false, 2, null)) ? new j1(segment, RoutingPathSegmentKind.Parameter) : new j1(ix.f.i(segment, 0, 0, null, 7, null), RoutingPathSegmentKind.Constant);
        }

        @m80.k
        public final i1 c() {
            return i1.f61648c;
        }

        @m80.k
        public final i1 d(@m80.k String path) {
            kotlin.jvm.internal.g0.p(path, "path");
            return kotlin.jvm.internal.g0.g(path, "/") ? c() : new i1(q30.k0.I3(q30.k0.N1(q30.k0.P0(u30.k0.u5(path, new String[]{"/"}, false, 0, 6, null), new x00.l() { // from class: io.ktor.server.routing.g1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean e11;
                    e11 = i1.a.e((String) obj);
                    return Boolean.valueOf(e11);
                }
            }), new x00.l() { // from class: io.ktor.server.routing.h1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    j1 f11;
                    f11 = i1.a.f((String) obj);
                    return f11;
                }
            })), null);
        }

        public a() {
        }
    }

    public /* synthetic */ i1(List list, kotlin.jvm.internal.v vVar) {
        this(list);
    }

    public static final CharSequence d(j1 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.f();
    }

    @m80.k
    public final List<j1> c() {
        return this.f61649a;
    }

    @m80.k
    public String toString() {
        return a00.r0.r3(this.f61649a, "/", null, null, 0, null, new x00.l() { // from class: io.ktor.server.routing.f1
            @Override // x00.l
            public final Object invoke(Object obj) {
                CharSequence d11;
                d11 = i1.d((j1) obj);
                return d11;
            }
        }, 30, null);
    }

    public i1(List<j1> list) {
        this.f61649a = list;
    }
}
