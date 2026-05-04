package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class h2 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.c2 f5879a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<h2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5880a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5880a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.WinningStreakReq", aVar);
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
            h(hVar, ((h2) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return h2.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{c2.a.f71883a};
        }

        @m80.k
        public final m3.c2 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return h2.b((m3.c2) decoder.decodeInline(descriptor).decodeSerializableValue(c2.a.f71883a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.c2 c2Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(c2Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-WinningStreakReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(c2.a.f71883a, c2Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<h2> serializer() {
            return a.f5880a;
        }

        public b() {
        }
    }

    public /* synthetic */ h2(m3.c2 c2Var) {
        this.f5879a = c2Var;
    }

    public static final /* synthetic */ h2 a(m3.c2 c2Var) {
        return new h2(c2Var);
    }

    @m80.k
    public static m3.c2 b(@m80.k m3.c2 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.c2 c2Var, Object obj) {
        return (obj instanceof h2) && kotlin.jvm.internal.g0.g(c2Var, ((h2) obj).h());
    }

    public static final boolean d(m3.c2 c2Var, m3.c2 c2Var2) {
        return kotlin.jvm.internal.g0.g(c2Var, c2Var2);
    }

    public static int f(m3.c2 c2Var) {
        return c2Var.hashCode();
    }

    public static String g(m3.c2 c2Var) {
        return "WinningStreakReq(value=" + c2Var + ')';
    }

    @m80.k
    public final m3.c2 e() {
        return this.f5879a;
    }

    public boolean equals(Object obj) {
        return c(this.f5879a, obj);
    }

    public final /* synthetic */ m3.c2 h() {
        return this.f5879a;
    }

    public int hashCode() {
        return f(this.f5879a);
    }

    public String toString() {
        return g(this.f5879a);
    }
}
