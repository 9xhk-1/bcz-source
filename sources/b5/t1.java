package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.d1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class t1 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.d1 f6056a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<t1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6057a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6057a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.StartGameReq", aVar);
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
            h(hVar, ((t1) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return t1.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{d1.a.f71890a};
        }

        @m80.k
        public final m3.d1 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return t1.b((m3.d1) decoder.decodeInline(descriptor).decodeSerializableValue(d1.a.f71890a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.d1 d1Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(d1Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-StartGameReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(d1.a.f71890a, d1Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<t1> serializer() {
            return a.f6057a;
        }

        public b() {
        }
    }

    public /* synthetic */ t1(m3.d1 d1Var) {
        this.f6056a = d1Var;
    }

    public static final /* synthetic */ t1 a(m3.d1 d1Var) {
        return new t1(d1Var);
    }

    @m80.k
    public static m3.d1 b(@m80.k m3.d1 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.d1 d1Var, Object obj) {
        return (obj instanceof t1) && kotlin.jvm.internal.g0.g(d1Var, ((t1) obj).h());
    }

    public static final boolean d(m3.d1 d1Var, m3.d1 d1Var2) {
        return kotlin.jvm.internal.g0.g(d1Var, d1Var2);
    }

    public static int f(m3.d1 d1Var) {
        return d1Var.hashCode();
    }

    public static String g(m3.d1 d1Var) {
        return "StartGameReq(value=" + d1Var + ')';
    }

    @m80.k
    public final m3.d1 e() {
        return this.f6056a;
    }

    public boolean equals(Object obj) {
        return c(this.f6056a, obj);
    }

    public final /* synthetic */ m3.d1 h() {
        return this.f6056a;
    }

    public int hashCode() {
        return f(this.f6056a);
    }

    public String toString() {
        return g(this.f6056a);
    }
}
