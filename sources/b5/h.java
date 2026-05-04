package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class h implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.f f5873a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<h> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5874a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5874a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.CheckNextLevelRsp", aVar);
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
            h(hVar, ((h) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return h.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{f.a.f71899a};
        }

        @m80.k
        public final m3.f g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return h.b((m3.f) decoder.decodeInline(descriptor).decodeSerializableValue(f.a.f71899a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.f fVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(fVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-CheckNextLevelRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(f.a.f71899a, fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<h> serializer() {
            return a.f5874a;
        }

        public b() {
        }
    }

    public /* synthetic */ h(m3.f fVar) {
        this.f5873a = fVar;
    }

    public static final /* synthetic */ h a(m3.f fVar) {
        return new h(fVar);
    }

    @m80.k
    public static m3.f b(@m80.k m3.f value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.f fVar, Object obj) {
        return (obj instanceof h) && kotlin.jvm.internal.g0.g(fVar, ((h) obj).h());
    }

    public static final boolean d(m3.f fVar, m3.f fVar2) {
        return kotlin.jvm.internal.g0.g(fVar, fVar2);
    }

    public static int f(m3.f fVar) {
        return fVar.hashCode();
    }

    public static String g(m3.f fVar) {
        return "CheckNextLevelRsp(value=" + fVar + ')';
    }

    @m80.k
    public final m3.f e() {
        return this.f5873a;
    }

    public boolean equals(Object obj) {
        return c(this.f5873a, obj);
    }

    public final /* synthetic */ m3.f h() {
        return this.f5873a;
    }

    public int hashCode() {
        return f(this.f5873a);
    }

    public String toString() {
        return g(this.f5873a);
    }
}
