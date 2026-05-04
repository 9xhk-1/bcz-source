package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class g implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.d f5854a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<g> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5855a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5855a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.CheckNextLevelReq", aVar);
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
            h(hVar, ((g) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return g.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{d.a.f71885a};
        }

        @m80.k
        public final m3.d g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return g.b((m3.d) decoder.decodeInline(descriptor).decodeSerializableValue(d.a.f71885a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.d dVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(dVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-CheckNextLevelReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(d.a.f71885a, dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<g> serializer() {
            return a.f5855a;
        }

        public b() {
        }
    }

    public /* synthetic */ g(m3.d dVar) {
        this.f5854a = dVar;
    }

    public static final /* synthetic */ g a(m3.d dVar) {
        return new g(dVar);
    }

    @m80.k
    public static m3.d b(@m80.k m3.d value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.d dVar, Object obj) {
        return (obj instanceof g) && kotlin.jvm.internal.g0.g(dVar, ((g) obj).h());
    }

    public static final boolean d(m3.d dVar, m3.d dVar2) {
        return kotlin.jvm.internal.g0.g(dVar, dVar2);
    }

    public static int f(m3.d dVar) {
        return dVar.hashCode();
    }

    public static String g(m3.d dVar) {
        return "CheckNextLevelReq(value=" + dVar + ')';
    }

    @m80.k
    public final m3.d e() {
        return this.f5854a;
    }

    public boolean equals(Object obj) {
        return c(this.f5854a, obj);
    }

    public final /* synthetic */ m3.d h() {
        return this.f5854a;
    }

    public int hashCode() {
        return f(this.f5854a);
    }

    public String toString() {
        return g(this.f5854a);
    }
}
