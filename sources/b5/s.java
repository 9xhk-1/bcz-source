package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class s implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.n f6033a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<s> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6034a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6034a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.EnableSpellReq", aVar);
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
            h(hVar, ((s) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return s.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{n.a.f72002a};
        }

        @m80.k
        public final m3.n g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return s.b((m3.n) decoder.decodeInline(descriptor).decodeSerializableValue(n.a.f72002a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.n nVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(nVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-EnableSpellReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(n.a.f72002a, nVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<s> serializer() {
            return a.f6034a;
        }

        public b() {
        }
    }

    public /* synthetic */ s(m3.n nVar) {
        this.f6033a = nVar;
    }

    public static final /* synthetic */ s a(m3.n nVar) {
        return new s(nVar);
    }

    @m80.k
    public static m3.n b(@m80.k m3.n value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.n nVar, Object obj) {
        return (obj instanceof s) && kotlin.jvm.internal.g0.g(nVar, ((s) obj).h());
    }

    public static final boolean d(m3.n nVar, m3.n nVar2) {
        return kotlin.jvm.internal.g0.g(nVar, nVar2);
    }

    public static int f(m3.n nVar) {
        return nVar.hashCode();
    }

    public static String g(m3.n nVar) {
        return "EnableSpellReq(value=" + nVar + ')';
    }

    @m80.k
    public final m3.n e() {
        return this.f6033a;
    }

    public boolean equals(Object obj) {
        return c(this.f6033a, obj);
    }

    public final /* synthetic */ m3.n h() {
        return this.f6033a;
    }

    public int hashCode() {
        return f(this.f6033a);
    }

    public String toString() {
        return g(this.f6033a);
    }
}
