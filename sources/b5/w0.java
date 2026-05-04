package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class w0 implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.e0 f6083a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<w0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6084a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6084a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.LookupRsp", aVar);
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
            h(hVar, ((w0) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return w0.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{e0.a.f71896a};
        }

        @m80.k
        public final m3.e0 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return w0.b((m3.e0) decoder.decodeInline(descriptor).decodeSerializableValue(e0.a.f71896a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.e0 e0Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(e0Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-LookupRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(e0.a.f71896a, e0Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<w0> serializer() {
            return a.f6084a;
        }

        public b() {
        }
    }

    public /* synthetic */ w0(m3.e0 e0Var) {
        this.f6083a = e0Var;
    }

    public static final /* synthetic */ w0 a(m3.e0 e0Var) {
        return new w0(e0Var);
    }

    @m80.k
    public static m3.e0 b(@m80.k m3.e0 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.e0 e0Var, Object obj) {
        return (obj instanceof w0) && kotlin.jvm.internal.g0.g(e0Var, ((w0) obj).h());
    }

    public static final boolean d(m3.e0 e0Var, m3.e0 e0Var2) {
        return kotlin.jvm.internal.g0.g(e0Var, e0Var2);
    }

    public static int f(m3.e0 e0Var) {
        return e0Var.hashCode();
    }

    public static String g(m3.e0 e0Var) {
        return "LookupRsp(value=" + e0Var + ')';
    }

    @m80.k
    public final m3.e0 e() {
        return this.f6083a;
    }

    public boolean equals(Object obj) {
        return c(this.f6083a, obj);
    }

    public final /* synthetic */ m3.e0 h() {
        return this.f6083a;
    }

    public int hashCode() {
        return f(this.f6083a);
    }

    public String toString() {
        return g(this.f6083a);
    }
}
