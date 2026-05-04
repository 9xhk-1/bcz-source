package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.b1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class r1 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.b1 f6031a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<r1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6032a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6032a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.SetSettingReq", aVar);
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
            h(hVar, ((r1) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return r1.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{b1.a.f71861a};
        }

        @m80.k
        public final m3.b1 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return r1.b((m3.b1) decoder.decodeInline(descriptor).decodeSerializableValue(b1.a.f71861a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.b1 b1Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(b1Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-SetSettingReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(b1.a.f71861a, b1Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<r1> serializer() {
            return a.f6032a;
        }

        public b() {
        }
    }

    public /* synthetic */ r1(m3.b1 b1Var) {
        this.f6031a = b1Var;
    }

    public static final /* synthetic */ r1 a(m3.b1 b1Var) {
        return new r1(b1Var);
    }

    @m80.k
    public static m3.b1 b(@m80.k m3.b1 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.b1 b1Var, Object obj) {
        return (obj instanceof r1) && kotlin.jvm.internal.g0.g(b1Var, ((r1) obj).h());
    }

    public static final boolean d(m3.b1 b1Var, m3.b1 b1Var2) {
        return kotlin.jvm.internal.g0.g(b1Var, b1Var2);
    }

    public static int f(m3.b1 b1Var) {
        return b1Var.hashCode();
    }

    public static String g(m3.b1 b1Var) {
        return "SetSettingReq(value=" + b1Var + ')';
    }

    @m80.k
    public final m3.b1 e() {
        return this.f6031a;
    }

    public boolean equals(Object obj) {
        return c(this.f6031a, obj);
    }

    public final /* synthetic */ m3.b1 h() {
        return this.f6031a;
    }

    public int hashCode() {
        return f(this.f6031a);
    }

    public String toString() {
        return g(this.f6031a);
    }
}
