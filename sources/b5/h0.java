package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class h0 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.t f5875a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<h0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5876a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5876a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.GetTopicResource", aVar);
            u0Var.q("value", false);
            descriptor = u0Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @m80.k
        public final h50.f a() {
            return descriptor;
        }

        @Override // f50.b0
        public /* bridge */ /* synthetic */ void b(i50.h hVar, Object obj) {
            h(hVar, ((h0) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return h0.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{t.a.f72078a};
        }

        @m80.k
        public final m3.t g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return h0.b((m3.t) decoder.decodeInline(descriptor).decodeSerializableValue(t.a.f72078a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.t tVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(tVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetTopicResource$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(t.a.f72078a, tVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<h0> serializer() {
            return a.f5876a;
        }

        public b() {
        }
    }

    public /* synthetic */ h0(m3.t tVar) {
        this.f5875a = tVar;
    }

    public static final /* synthetic */ h0 a(m3.t tVar) {
        return new h0(tVar);
    }

    @m80.k
    public static m3.t b(@m80.k m3.t value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.t tVar, Object obj) {
        return (obj instanceof h0) && kotlin.jvm.internal.g0.g(tVar, ((h0) obj).h());
    }

    public static final boolean d(m3.t tVar, m3.t tVar2) {
        return kotlin.jvm.internal.g0.g(tVar, tVar2);
    }

    public static int f(m3.t tVar) {
        return tVar.hashCode();
    }

    public static String g(m3.t tVar) {
        return "GetTopicResource(value=" + tVar + ')';
    }

    @m80.k
    public final m3.t e() {
        return this.f5875a;
    }

    public boolean equals(Object obj) {
        return c(this.f5875a, obj);
    }

    public final /* synthetic */ m3.t h() {
        return this.f5875a;
    }

    public int hashCode() {
        return f(this.f5875a);
    }

    public String toString() {
        return g(this.f5875a);
    }
}
