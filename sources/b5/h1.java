package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class h1 implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.o0 f5877a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<h1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5878a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5878a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.RechargeInfoRsp", aVar);
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
            h(hVar, ((h1) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return h1.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{o0.a.f72022a};
        }

        @m80.k
        public final m3.o0 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return h1.b((m3.o0) decoder.decodeInline(descriptor).decodeSerializableValue(o0.a.f72022a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.o0 o0Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(o0Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-RechargeInfoRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(o0.a.f72022a, o0Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<h1> serializer() {
            return a.f5878a;
        }

        public b() {
        }
    }

    public /* synthetic */ h1(m3.o0 o0Var) {
        this.f5877a = o0Var;
    }

    public static final /* synthetic */ h1 a(m3.o0 o0Var) {
        return new h1(o0Var);
    }

    @m80.k
    public static m3.o0 b(@m80.k m3.o0 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.o0 o0Var, Object obj) {
        return (obj instanceof h1) && kotlin.jvm.internal.g0.g(o0Var, ((h1) obj).h());
    }

    public static final boolean d(m3.o0 o0Var, m3.o0 o0Var2) {
        return kotlin.jvm.internal.g0.g(o0Var, o0Var2);
    }

    public static int f(m3.o0 o0Var) {
        return o0Var.hashCode();
    }

    public static String g(m3.o0 o0Var) {
        return "RechargeInfoRsp(value=" + o0Var + ')';
    }

    @m80.k
    public final m3.o0 e() {
        return this.f5877a;
    }

    public boolean equals(Object obj) {
        return c(this.f5877a, obj);
    }

    public final /* synthetic */ m3.o0 h() {
        return this.f5877a;
    }

    public int hashCode() {
        return f(this.f5877a);
    }

    public String toString() {
        return g(this.f5877a);
    }
}
