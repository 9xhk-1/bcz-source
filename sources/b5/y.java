package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class y implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.r f6095a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<y> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6096a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6096a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.GetCurrentGameReq", aVar);
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
            h(hVar, ((y) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return y.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{r.a.f72059a};
        }

        @m80.k
        public final m3.r g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return y.b((m3.r) decoder.decodeInline(descriptor).decodeSerializableValue(r.a.f72059a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.r rVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(rVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetCurrentGameReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(r.a.f72059a, rVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<y> serializer() {
            return a.f6096a;
        }

        public b() {
        }
    }

    public /* synthetic */ y(m3.r rVar) {
        this.f6095a = rVar;
    }

    public static final /* synthetic */ y a(m3.r rVar) {
        return new y(rVar);
    }

    @m80.k
    public static m3.r b(@m80.k m3.r value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.r rVar, Object obj) {
        return (obj instanceof y) && kotlin.jvm.internal.g0.g(rVar, ((y) obj).h());
    }

    public static final boolean d(m3.r rVar, m3.r rVar2) {
        return kotlin.jvm.internal.g0.g(rVar, rVar2);
    }

    public static int f(m3.r rVar) {
        return rVar.hashCode();
    }

    public static String g(m3.r rVar) {
        return "GetCurrentGameReq(value=" + rVar + ')';
    }

    @m80.k
    public final m3.r e() {
        return this.f6095a;
    }

    public boolean equals(Object obj) {
        return c(this.f6095a, obj);
    }

    public final /* synthetic */ m3.r h() {
        return this.f6095a;
    }

    public int hashCode() {
        return f(this.f6095a);
    }

    public String toString() {
        return g(this.f6095a);
    }
}
