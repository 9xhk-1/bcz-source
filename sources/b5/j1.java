package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.p0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class j1 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.p0 f5906a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<j1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5907a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5907a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.RechargeStarReq", aVar);
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
            h(hVar, ((j1) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return j1.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{p0.a.f72044a};
        }

        @m80.k
        public final m3.p0 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return j1.b((m3.p0) decoder.decodeInline(descriptor).decodeSerializableValue(p0.a.f72044a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.p0 p0Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(p0Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-RechargeStarReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(p0.a.f72044a, p0Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<j1> serializer() {
            return a.f5907a;
        }

        public b() {
        }
    }

    public /* synthetic */ j1(m3.p0 p0Var) {
        this.f5906a = p0Var;
    }

    public static final /* synthetic */ j1 a(m3.p0 p0Var) {
        return new j1(p0Var);
    }

    @m80.k
    public static m3.p0 b(@m80.k m3.p0 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.p0 p0Var, Object obj) {
        return (obj instanceof j1) && kotlin.jvm.internal.g0.g(p0Var, ((j1) obj).h());
    }

    public static final boolean d(m3.p0 p0Var, m3.p0 p0Var2) {
        return kotlin.jvm.internal.g0.g(p0Var, p0Var2);
    }

    public static int f(m3.p0 p0Var) {
        return p0Var.hashCode();
    }

    public static String g(m3.p0 p0Var) {
        return "RechargeStarReq(value=" + p0Var + ')';
    }

    @m80.k
    public final m3.p0 e() {
        return this.f5906a;
    }

    public boolean equals(Object obj) {
        return c(this.f5906a, obj);
    }

    public final /* synthetic */ m3.p0 h() {
        return this.f5906a;
    }

    public int hashCode() {
        return f(this.f5906a);
    }

    public String toString() {
        return g(this.f5906a);
    }
}
