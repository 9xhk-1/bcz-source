package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.y1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class f2 implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.y1 f5852a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<f2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5853a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5853a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.UserEntitlementSaleInfoRsp", aVar);
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
            h(hVar, ((f2) obj).g());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return f2.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{y1.a.f72122a};
        }

        @m80.k
        public final m3.y1 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return f2.b((m3.y1) decoder.decodeInline(descriptor).decodeSerializableValue(y1.a.f72122a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.y1 y1Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(y1Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-UserEntitlementSaleInfoRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(y1.a.f72122a, y1Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<f2> serializer() {
            return a.f5853a;
        }

        public b() {
        }
    }

    public /* synthetic */ f2(m3.y1 y1Var) {
        this.f5852a = y1Var;
    }

    public static final /* synthetic */ f2 a(m3.y1 y1Var) {
        return new f2(y1Var);
    }

    @m80.k
    public static m3.y1 b(@m80.k m3.y1 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.y1 y1Var, Object obj) {
        return (obj instanceof f2) && kotlin.jvm.internal.g0.g(y1Var, ((f2) obj).g());
    }

    public static final boolean d(m3.y1 y1Var, m3.y1 y1Var2) {
        return kotlin.jvm.internal.g0.g(y1Var, y1Var2);
    }

    public static int e(m3.y1 y1Var) {
        return y1Var.hashCode();
    }

    public static String f(m3.y1 y1Var) {
        return "UserEntitlementSaleInfoRsp(value=" + y1Var + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f5852a, obj);
    }

    public final /* synthetic */ m3.y1 g() {
        return this.f5852a;
    }

    public int hashCode() {
        return e(this.f5852a);
    }

    public String toString() {
        return f(this.f5852a);
    }
}
