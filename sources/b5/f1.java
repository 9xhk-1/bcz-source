package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.l0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class f1 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.l0 f5850a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<f1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5851a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5851a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.PreloadResourceReq", aVar);
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
            h(hVar, ((f1) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return f1.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{l0.a.f71980a};
        }

        @m80.k
        public final m3.l0 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return f1.b((m3.l0) decoder.decodeInline(descriptor).decodeSerializableValue(l0.a.f71980a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.l0 l0Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(l0Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-PreloadResourceReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(l0.a.f71980a, l0Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<f1> serializer() {
            return a.f5851a;
        }

        public b() {
        }
    }

    public /* synthetic */ f1(m3.l0 l0Var) {
        this.f5850a = l0Var;
    }

    public static final /* synthetic */ f1 a(m3.l0 l0Var) {
        return new f1(l0Var);
    }

    @m80.k
    public static m3.l0 b(@m80.k m3.l0 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.l0 l0Var, Object obj) {
        return (obj instanceof f1) && kotlin.jvm.internal.g0.g(l0Var, ((f1) obj).h());
    }

    public static final boolean d(m3.l0 l0Var, m3.l0 l0Var2) {
        return kotlin.jvm.internal.g0.g(l0Var, l0Var2);
    }

    public static int f(m3.l0 l0Var) {
        return l0Var.hashCode();
    }

    public static String g(m3.l0 l0Var) {
        return "PreloadResourceReq(value=" + l0Var + ')';
    }

    @m80.k
    public final m3.l0 e() {
        return this.f5850a;
    }

    public boolean equals(Object obj) {
        return c(this.f5850a, obj);
    }

    public final /* synthetic */ m3.l0 h() {
        return this.f5850a;
    }

    public int hashCode() {
        return f(this.f5850a);
    }

    public String toString() {
        return g(this.f5850a);
    }
}
