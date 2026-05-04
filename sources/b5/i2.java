package b5;

import j50.p0;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class i2 implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5902a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<i2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5903a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5903a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.WinningStreakRsp", aVar);
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
            h(hVar, ((i2) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return i2.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{j50.i.f63378a};
        }

        public final boolean g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return i2.b(decoder.decodeInline(descriptor).decodeBoolean());
        }

        public final void h(@m80.k i50.h encoder, boolean z11) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeBoolean(z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<i2> serializer() {
            return a.f5903a;
        }

        public b() {
        }
    }

    public /* synthetic */ i2(boolean z11) {
        this.f5902a = z11;
    }

    public static final /* synthetic */ i2 a(boolean z11) {
        return new i2(z11);
    }

    public static boolean c(boolean z11, Object obj) {
        return (obj instanceof i2) && z11 == ((i2) obj).h();
    }

    public static final boolean d(boolean z11, boolean z12) {
        return z11 == z12;
    }

    public static int f(boolean z11) {
        return Boolean.hashCode(z11);
    }

    public static String g(boolean z11) {
        return "WinningStreakRsp(value=" + z11 + ')';
    }

    public final boolean e() {
        return this.f5902a;
    }

    public boolean equals(Object obj) {
        return c(this.f5902a, obj);
    }

    public final /* synthetic */ boolean h() {
        return this.f5902a;
    }

    public int hashCode() {
        return f(this.f5902a);
    }

    public String toString() {
        return g(this.f5902a);
    }

    public static boolean b(boolean z11) {
        return z11;
    }
}
