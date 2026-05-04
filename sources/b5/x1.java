package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.n1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class x1 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.n1 f6093a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<x1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6094a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6094a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.SubmitGameReq", aVar);
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
            h(hVar, ((x1) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return x1.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{n1.a.f72014a};
        }

        @m80.k
        public final m3.n1 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return x1.b((m3.n1) decoder.decodeInline(descriptor).decodeSerializableValue(n1.a.f72014a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.n1 n1Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(n1Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-SubmitGameReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(n1.a.f72014a, n1Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<x1> serializer() {
            return a.f6094a;
        }

        public b() {
        }
    }

    public /* synthetic */ x1(m3.n1 n1Var) {
        this.f6093a = n1Var;
    }

    public static final /* synthetic */ x1 a(m3.n1 n1Var) {
        return new x1(n1Var);
    }

    @m80.k
    public static m3.n1 b(@m80.k m3.n1 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.n1 n1Var, Object obj) {
        return (obj instanceof x1) && kotlin.jvm.internal.g0.g(n1Var, ((x1) obj).h());
    }

    public static final boolean d(m3.n1 n1Var, m3.n1 n1Var2) {
        return kotlin.jvm.internal.g0.g(n1Var, n1Var2);
    }

    public static int f(m3.n1 n1Var) {
        return n1Var.hashCode();
    }

    public static String g(m3.n1 n1Var) {
        return "SubmitGameReq(value=" + n1Var + ')';
    }

    @m80.k
    public final m3.n1 e() {
        return this.f6093a;
    }

    public boolean equals(Object obj) {
        return c(this.f6093a, obj);
    }

    public final /* synthetic */ m3.n1 h() {
        return this.f6093a;
    }

    public int hashCode() {
        return f(this.f6093a);
    }

    public String toString() {
        return g(this.f6093a);
    }
}
