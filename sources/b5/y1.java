package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.l1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class y1 implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.l1 f6097a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<y1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6098a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6098a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.SubmitGameRsp", aVar);
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
            h(hVar, ((y1) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return y1.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{l1.a.f71992a};
        }

        @m80.k
        public final m3.l1 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return y1.b((m3.l1) decoder.decodeInline(descriptor).decodeSerializableValue(l1.a.f71992a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.l1 l1Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(l1Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-SubmitGameRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(l1.a.f71992a, l1Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<y1> serializer() {
            return a.f6098a;
        }

        public b() {
        }
    }

    public /* synthetic */ y1(m3.l1 l1Var) {
        this.f6097a = l1Var;
    }

    public static final /* synthetic */ y1 a(m3.l1 l1Var) {
        return new y1(l1Var);
    }

    @m80.k
    public static m3.l1 b(@m80.k m3.l1 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.l1 l1Var, Object obj) {
        return (obj instanceof y1) && kotlin.jvm.internal.g0.g(l1Var, ((y1) obj).h());
    }

    public static final boolean d(m3.l1 l1Var, m3.l1 l1Var2) {
        return kotlin.jvm.internal.g0.g(l1Var, l1Var2);
    }

    public static int f(m3.l1 l1Var) {
        return l1Var.hashCode();
    }

    public static String g(m3.l1 l1Var) {
        return "SubmitGameRsp(value=" + l1Var + ')';
    }

    @m80.k
    public final m3.l1 e() {
        return this.f6097a;
    }

    public boolean equals(Object obj) {
        return c(this.f6097a, obj);
    }

    public final /* synthetic */ m3.l1 h() {
        return this.f6097a;
    }

    public int hashCode() {
        return f(this.f6097a);
    }

    public String toString() {
        return g(this.f6097a);
    }
}
