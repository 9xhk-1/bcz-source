package io.ktor.websocket;

import io.ktor.websocket.d;
import io.ktor.websocket.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import org.junit.jupiter.api.j2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSocketDeflateExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketDeflateExtension.kt\nio/ktor/websocket/WebSocketDeflateExtension\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,240:1\n1#2:241\n18#3:242\n58#4,16:243\n*S KotlinDebug\n*F\n+ 1 WebSocketDeflateExtension.kt\nio/ktor/websocket/WebSocketDeflateExtension\n*L\n229#1:242\n229#1:243,16\n*E\n"})
/* loaded from: classes8.dex */
public final class s implements z<b> {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final a f62551i = new a(0 == true ? 1 : 0);

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final xy.a<s> f62552j;

    /* renamed from: k, reason: collision with root package name */
    public static final boolean f62553k;

    /* renamed from: l, reason: collision with root package name */
    public static final boolean f62554l = false;

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f62555m = false;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b f62556a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final a0<b, ? extends z<b>> f62557b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<c0> f62558c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Inflater f62559d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Deflater f62560e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f62561f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f62562g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f62563h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements a0<b, s> {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @Override // io.ktor.websocket.a0
        public boolean b() {
            return s.f62555m;
        }

        @Override // io.ktor.websocket.a0
        public boolean c() {
            return s.f62553k;
        }

        @Override // io.ktor.websocket.a0
        public boolean d() {
            return s.f62554l;
        }

        @Override // io.ktor.websocket.a0
        @m80.k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public s a(@m80.k x00.l<? super b, g2> config) {
            kotlin.jvm.internal.g0.p(config, "config");
            b bVar = new b();
            config.invoke(bVar);
            return new s(bVar);
        }

        @Override // io.ktor.websocket.a0
        @m80.k
        public xy.a<s> getKey() {
            return s.f62552j;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f62564a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f62565b;

        /* renamed from: c, reason: collision with root package name */
        public int f62566c = -1;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public x00.l<? super List<c0>, g2> f62567d = new x00.l() { // from class: io.ktor.websocket.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 s11;
                s11 = s.b.s((List) obj);
                return s11;
            }
        };

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public x00.l<? super d, Boolean> f62568e = new x00.l() { // from class: io.ktor.websocket.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean g11;
                g11 = s.b.g((d) obj);
                return Boolean.valueOf(g11);
            }
        };

        public static final boolean g(d it) {
            kotlin.jvm.internal.g0.p(it, "it");
            return true;
        }

        public static final boolean i(x00.l lVar, x00.l lVar2, d it) {
            kotlin.jvm.internal.g0.p(it, "it");
            return ((Boolean) lVar.invoke(it)).booleanValue() && ((Boolean) lVar2.invoke(it)).booleanValue();
        }

        public static final boolean k(int i11, d frame) {
            kotlin.jvm.internal.g0.p(frame, "frame");
            return frame.d().length > i11;
        }

        public static final g2 m(x00.l lVar, x00.l lVar2, List it) {
            kotlin.jvm.internal.g0.p(it, "it");
            lVar.invoke(it);
            lVar2.invoke(it);
            return g2.f100423a;
        }

        public static final g2 s(List it) {
            kotlin.jvm.internal.g0.p(it, "it");
            return g2.f100423a;
        }

        @m80.k
        public final List<c0> f() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (this.f62564a) {
                arrayList2.add(y.f62575b);
            }
            if (this.f62565b) {
                arrayList2.add(y.f62576c);
            }
            arrayList.add(new c0(y.f62578e, arrayList2));
            this.f62567d.invoke(arrayList);
            return arrayList;
        }

        public final void h(@m80.k final x00.l<? super d, Boolean> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            final x00.l<? super d, Boolean> lVar = this.f62568e;
            this.f62568e = new x00.l() { // from class: io.ktor.websocket.t
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean i11;
                    i11 = s.b.i(x00.l.this, lVar, (d) obj);
                    return Boolean.valueOf(i11);
                }
            };
        }

        public final void j(final int i11) {
            h(new x00.l() { // from class: io.ktor.websocket.u
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean k11;
                    k11 = s.b.k(i11, (d) obj);
                    return Boolean.valueOf(k11);
                }
            });
        }

        public final void l(@m80.k final x00.l<? super List<c0>, g2> block) {
            kotlin.jvm.internal.g0.p(block, "block");
            final x00.l<? super List<c0>, g2> lVar = this.f62567d;
            this.f62567d = new x00.l() { // from class: io.ktor.websocket.v
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = s.b.m(x00.l.this, block, (List) obj);
                    return m11;
                }
            };
        }

        public final boolean n() {
            return this.f62564a;
        }

        @m80.k
        public final x00.l<d, Boolean> o() {
            return this.f62568e;
        }

        public final int p() {
            return this.f62566c;
        }

        @m80.k
        public final x00.l<List<c0>, g2> q() {
            return this.f62567d;
        }

        public final boolean r() {
            return this.f62565b;
        }

        public final void t(boolean z11) {
            this.f62564a = z11;
        }

        public final void u(@m80.k x00.l<? super d, Boolean> lVar) {
            kotlin.jvm.internal.g0.p(lVar, "<set-?>");
            this.f62568e = lVar;
        }

        public final void v(int i11) {
            this.f62566c = i11;
        }

        public final void w(@m80.k x00.l<? super List<c0>, g2> lVar) {
            kotlin.jvm.internal.g0.p(lVar, "<set-?>");
            this.f62567d = lVar;
        }

        public final void x(boolean z11) {
            this.f62565b = z11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h10.r rVar = null;
        h10.d d11 = o0.d(s.class);
        try {
            rVar = o0.B(s.class);
        } catch (Throwable unused) {
        }
        f62552j = new xy.a<>("WebsocketDeflateExtension", new gz.a(d11, rVar));
        f62553k = true;
    }

    public s(@m80.k b config) {
        kotlin.jvm.internal.g0.p(config, "config");
        this.f62556a = config;
        this.f62557b = f62551i;
        this.f62558c = config.f();
        this.f62559d = new Inflater(true);
        this.f62560e = new Deflater(config.p(), true);
    }

    @Override // io.ktor.websocket.z
    @m80.k
    public a0<b, ? extends z<b>> a() {
        return this.f62557b;
    }

    @Override // io.ktor.websocket.z
    @m80.k
    public List<c0> b() {
        return this.f62558c;
    }

    @Override // io.ktor.websocket.z
    @m80.k
    public d c(@m80.k d frame) {
        kotlin.jvm.internal.g0.p(frame, "frame");
        if ((!(frame instanceof d.f) && !(frame instanceof d.a)) || !this.f62556a.o().invoke(frame).booleanValue()) {
            return frame;
        }
        byte[] a11 = rz.b.a(this.f62560e, frame.d());
        if (this.f62561f) {
            this.f62560e.reset();
        }
        return d.f62381i.a(frame.f(), frame.g(), a11, f62553k, frame.i(), frame.j());
    }

    @Override // io.ktor.websocket.z
    @m80.k
    public d d(@m80.k d frame) {
        boolean b11;
        kotlin.jvm.internal.g0.p(frame, "frame");
        b11 = y.b(frame);
        if (!b11 && !this.f62563h) {
            return frame;
        }
        this.f62563h = true;
        byte[] c11 = rz.b.c(this.f62559d, frame.d());
        if (this.f62562g) {
            this.f62559d.reset();
        }
        if (frame.f()) {
            this.f62563h = false;
        }
        return d.f62381i.a(frame.f(), frame.g(), c11, !f62553k, frame.i(), frame.j());
    }

    @Override // io.ktor.websocket.z
    @m80.k
    public List<c0> e(@m80.k List<c0> requestedProtocols) {
        Object obj;
        kotlin.jvm.internal.g0.p(requestedProtocols, "requestedProtocols");
        Iterator<T> it = requestedProtocols.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.g0.g(((c0) obj).b(), y.f62578e)) {
                break;
            }
        }
        c0 c0Var = (c0) obj;
        if (c0Var == null) {
            return a00.h0.J();
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, String> pair : c0Var.e()) {
            String component1 = pair.component1();
            String component2 = pair.component2();
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.g0.o(locale, "getDefault(...)");
            String lowerCase = component1.toLowerCase(locale);
            kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -708713803:
                    if (!lowerCase.equals(y.f62575b)) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + component1 + j2.O + component2 + ')').toString());
                    }
                    if (!u30.k0.O3(component2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.f62562g = true;
                    arrayList.add(y.f62575b);
                case 646404390:
                    if (!lowerCase.equals(y.f62577d)) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + component1 + j2.O + component2 + ')').toString());
                    }
                case 1266201133:
                    if (!lowerCase.equals(y.f62576c)) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + component1 + j2.O + component2 + ')').toString());
                    }
                    if (!u30.k0.O3(component2)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    this.f62561f = true;
                    arrayList.add(y.f62576c);
                case 2034279582:
                    if (!lowerCase.equals(y.f62574a)) {
                        throw new IllegalStateException(("Unsupported extension parameter: (" + component1 + j2.O + component2 + ')').toString());
                    }
                    if (Integer.parseInt(component2) != 15) {
                        throw new IllegalStateException("Only 15 window size is supported");
                    }
                default:
                    throw new IllegalStateException(("Unsupported extension parameter: (" + component1 + j2.O + component2 + ')').toString());
            }
        }
        return a00.g0.l(new c0(y.f62578e, arrayList));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.ktor.websocket.z
    public boolean f(@m80.k List<c0> negotiatedProtocols) {
        Object obj;
        kotlin.jvm.internal.g0.p(negotiatedProtocols, "negotiatedProtocols");
        Iterator<T> it = negotiatedProtocols.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.g0.g(((c0) obj).b(), y.f62578e)) {
                break;
            }
        }
        c0 c0Var = (c0) obj;
        if (c0Var == null) {
            return false;
        }
        this.f62562g = this.f62556a.r();
        this.f62561f = this.f62556a.n();
        for (Pair<String, String> pair : c0Var.e()) {
            String component1 = pair.component1();
            String component2 = pair.component2();
            switch (component1.hashCode()) {
                case -708713803:
                    if (component1.equals(y.f62575b)) {
                        if (!u30.k0.O3(component2)) {
                            throw new IllegalStateException(("WebSocket permessage-deflate extension parameter client_no_context_takeover shouldn't have a value. Current: " + component2).toString());
                        }
                        this.f62561f = true;
                        break;
                    } else {
                        continue;
                    }
                case 646404390:
                    if (component1.equals(y.f62577d) && !u30.k0.O3(component2) && Integer.parseInt(component2) != 15) {
                        throw new IllegalStateException("Only 15 window size is supported.");
                    }
                    break;
                case 1266201133:
                    if (component1.equals(y.f62576c)) {
                        if (!u30.k0.O3(component2)) {
                            throw new IllegalStateException(("WebSocket permessage-deflate extension parameter server_no_context_takeover shouldn't have a value. Current: " + component2).toString());
                        }
                        this.f62562g = true;
                        break;
                    } else {
                        continue;
                    }
                case 2034279582:
                    component1.equals(y.f62574a);
                    break;
            }
        }
        return true;
    }

    public final boolean k() {
        return this.f62562g;
    }

    public final boolean l() {
        return this.f62561f;
    }

    public final void m(boolean z11) {
        this.f62562g = z11;
    }

    public final void n(boolean z11) {
        this.f62561f = z11;
    }
}
