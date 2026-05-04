package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class t0 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.c0 f6054a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<t0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6055a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6055a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.LogReq", aVar);
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
            h(hVar, ((t0) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return t0.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{c0.a.f71877a};
        }

        @m80.k
        public final m3.c0 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return t0.b((m3.c0) decoder.decodeInline(descriptor).decodeSerializableValue(c0.a.f71877a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.c0 c0Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(c0Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-LogReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(c0.a.f71877a, c0Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<t0> serializer() {
            return a.f6055a;
        }

        public b() {
        }
    }

    public /* synthetic */ t0(m3.c0 c0Var) {
        this.f6054a = c0Var;
    }

    public static final /* synthetic */ t0 a(m3.c0 c0Var) {
        return new t0(c0Var);
    }

    @m80.k
    public static m3.c0 b(@m80.k m3.c0 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.c0 c0Var, Object obj) {
        return (obj instanceof t0) && kotlin.jvm.internal.g0.g(c0Var, ((t0) obj).h());
    }

    public static final boolean d(m3.c0 c0Var, m3.c0 c0Var2) {
        return kotlin.jvm.internal.g0.g(c0Var, c0Var2);
    }

    public static int f(m3.c0 c0Var) {
        return c0Var.hashCode();
    }

    public static String g(m3.c0 c0Var) {
        return "LogReq(value=" + c0Var + ')';
    }

    @m80.k
    public final m3.c0 e() {
        return this.f6054a;
    }

    public boolean equals(Object obj) {
        return c(this.f6054a, obj);
    }

    public final /* synthetic */ m3.c0 h() {
        return this.f6054a;
    }

    public int hashCode() {
        return f(this.f6054a);
    }

    public String toString() {
        return g(this.f6054a);
    }
}
