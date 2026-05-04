package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class l implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.g f5920a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5921a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5921a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.ClaimFreeMembershipReq", aVar);
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
            h(hVar, ((l) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return l.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{g.a.f71914a};
        }

        @m80.k
        public final m3.g g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return l.b((m3.g) decoder.decodeInline(descriptor).decodeSerializableValue(g.a.f71914a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.g gVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(gVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-ClaimFreeMembershipReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(g.a.f71914a, gVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<l> serializer() {
            return a.f5921a;
        }

        public b() {
        }
    }

    public /* synthetic */ l(m3.g gVar) {
        this.f5920a = gVar;
    }

    public static final /* synthetic */ l a(m3.g gVar) {
        return new l(gVar);
    }

    @m80.k
    public static m3.g b(@m80.k m3.g value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.g gVar, Object obj) {
        return (obj instanceof l) && kotlin.jvm.internal.g0.g(gVar, ((l) obj).h());
    }

    public static final boolean d(m3.g gVar, m3.g gVar2) {
        return kotlin.jvm.internal.g0.g(gVar, gVar2);
    }

    public static int f(m3.g gVar) {
        return gVar.hashCode();
    }

    public static String g(m3.g gVar) {
        return "ClaimFreeMembershipReq(value=" + gVar + ')';
    }

    @m80.k
    public final m3.g e() {
        return this.f5920a;
    }

    public boolean equals(Object obj) {
        return c(this.f5920a, obj);
    }

    public final /* synthetic */ m3.g h() {
        return this.f5920a;
    }

    public int hashCode() {
        return f(this.f5920a);
    }

    public String toString() {
        return g(this.f5920a);
    }
}
