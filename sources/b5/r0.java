package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class r0 implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final j2 f6029a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<r0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6030a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6030a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.GetWordRootResourceRsp", aVar);
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
            h(hVar, ((r0) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return r0.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{j2.a.f71964a};
        }

        @m80.k
        public final j2 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return r0.b((j2) decoder.decodeInline(descriptor).decodeSerializableValue(j2.a.f71964a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k j2 j2Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(j2Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetWordRootResourceRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(j2.a.f71964a, j2Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<r0> serializer() {
            return a.f6030a;
        }

        public b() {
        }
    }

    public /* synthetic */ r0(j2 j2Var) {
        this.f6029a = j2Var;
    }

    public static final /* synthetic */ r0 a(j2 j2Var) {
        return new r0(j2Var);
    }

    @m80.k
    public static j2 b(@m80.k j2 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(j2 j2Var, Object obj) {
        return (obj instanceof r0) && kotlin.jvm.internal.g0.g(j2Var, ((r0) obj).h());
    }

    public static final boolean d(j2 j2Var, j2 j2Var2) {
        return kotlin.jvm.internal.g0.g(j2Var, j2Var2);
    }

    public static int f(j2 j2Var) {
        return j2Var.hashCode();
    }

    public static String g(j2 j2Var) {
        return "GetWordRootResourceRsp(value=" + j2Var + ')';
    }

    @m80.k
    public final j2 e() {
        return this.f6029a;
    }

    public boolean equals(Object obj) {
        return c(this.f6029a, obj);
    }

    public final /* synthetic */ j2 h() {
        return this.f6029a;
    }

    public int hashCode() {
        return f(this.f6029a);
    }

    public String toString() {
        return g(this.f6029a);
    }
}
