package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class n1 implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.u0 f5971a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<n1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5972a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5972a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.ResetComboInfoRsp", aVar);
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
            h(hVar, ((n1) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return n1.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{u0.a.f72088a};
        }

        @m80.k
        public final m3.u0 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return n1.b((m3.u0) decoder.decodeInline(descriptor).decodeSerializableValue(u0.a.f72088a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.u0 u0Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(u0Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-ResetComboInfoRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(u0.a.f72088a, u0Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<n1> serializer() {
            return a.f5972a;
        }

        public b() {
        }
    }

    public /* synthetic */ n1(m3.u0 u0Var) {
        this.f5971a = u0Var;
    }

    public static final /* synthetic */ n1 a(m3.u0 u0Var) {
        return new n1(u0Var);
    }

    @m80.k
    public static m3.u0 b(@m80.k m3.u0 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.u0 u0Var, Object obj) {
        return (obj instanceof n1) && kotlin.jvm.internal.g0.g(u0Var, ((n1) obj).h());
    }

    public static final boolean d(m3.u0 u0Var, m3.u0 u0Var2) {
        return kotlin.jvm.internal.g0.g(u0Var, u0Var2);
    }

    public static int f(m3.u0 u0Var) {
        return u0Var.hashCode();
    }

    public static String g(m3.u0 u0Var) {
        return "ResetComboInfoRsp(value=" + u0Var + ')';
    }

    @m80.k
    public final m3.u0 e() {
        return this.f5971a;
    }

    public boolean equals(Object obj) {
        return c(this.f5971a, obj);
    }

    public final /* synthetic */ m3.u0 h() {
        return this.f5971a;
    }

    public int hashCode() {
        return f(this.f5971a);
    }

    public String toString() {
        return g(this.f5971a);
    }
}
