package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.o2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class z implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o2 f6099a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<z> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6100a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6100a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.GetCurrentGameRsp", aVar);
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
            h(hVar, ((z) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return z.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{o2.a.f72037a};
        }

        @m80.k
        public final o2 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return z.b((o2) decoder.decodeInline(descriptor).decodeSerializableValue(o2.a.f72037a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k o2 o2Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(o2Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetCurrentGameRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(o2.a.f72037a, o2Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<z> serializer() {
            return a.f6100a;
        }

        public b() {
        }
    }

    public /* synthetic */ z(o2 o2Var) {
        this.f6099a = o2Var;
    }

    public static final /* synthetic */ z a(o2 o2Var) {
        return new z(o2Var);
    }

    @m80.k
    public static o2 b(@m80.k o2 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(o2 o2Var, Object obj) {
        return (obj instanceof z) && kotlin.jvm.internal.g0.g(o2Var, ((z) obj).h());
    }

    public static final boolean d(o2 o2Var, o2 o2Var2) {
        return kotlin.jvm.internal.g0.g(o2Var, o2Var2);
    }

    public static int f(o2 o2Var) {
        return o2Var.hashCode();
    }

    public static String g(o2 o2Var) {
        return "GetCurrentGameRsp(value=" + o2Var + ')';
    }

    @m80.k
    public final o2 e() {
        return this.f6099a;
    }

    public boolean equals(Object obj) {
        return c(this.f6099a, obj);
    }

    public final /* synthetic */ o2 h() {
        return this.f6099a;
    }

    public int hashCode() {
        return f(this.f6099a);
    }

    public String toString() {
        return g(this.f6099a);
    }
}
