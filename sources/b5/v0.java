package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.d0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class v0 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.d0 f6070a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<v0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6071a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6071a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.LookupReq", aVar);
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
            h(hVar, ((v0) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return v0.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{d0.a.f71887a};
        }

        @m80.k
        public final m3.d0 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return v0.b((m3.d0) decoder.decodeInline(descriptor).decodeSerializableValue(d0.a.f71887a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.d0 d0Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(d0Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-LookupReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(d0.a.f71887a, d0Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<v0> serializer() {
            return a.f6071a;
        }

        public b() {
        }
    }

    public /* synthetic */ v0(m3.d0 d0Var) {
        this.f6070a = d0Var;
    }

    public static final /* synthetic */ v0 a(m3.d0 d0Var) {
        return new v0(d0Var);
    }

    @m80.k
    public static m3.d0 b(@m80.k m3.d0 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.d0 d0Var, Object obj) {
        return (obj instanceof v0) && kotlin.jvm.internal.g0.g(d0Var, ((v0) obj).h());
    }

    public static final boolean d(m3.d0 d0Var, m3.d0 d0Var2) {
        return kotlin.jvm.internal.g0.g(d0Var, d0Var2);
    }

    public static int f(m3.d0 d0Var) {
        return d0Var.hashCode();
    }

    public static String g(m3.d0 d0Var) {
        return "LookupReq(value=" + d0Var + ')';
    }

    @m80.k
    public final m3.d0 e() {
        return this.f6070a;
    }

    public boolean equals(Object obj) {
        return c(this.f6070a, obj);
    }

    public final /* synthetic */ m3.d0 h() {
        return this.f6070a;
    }

    public int hashCode() {
        return f(this.f6070a);
    }

    public String toString() {
        return g(this.f6070a);
    }
}
