package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class o implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.l f5973a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<o> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5974a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5974a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.ComboInfoRsp", aVar);
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
            h(hVar, ((o) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return o.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{l.a.f71975a};
        }

        @m80.k
        public final m3.l g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return o.b((m3.l) decoder.decodeInline(descriptor).decodeSerializableValue(l.a.f71975a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.l lVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(lVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-ComboInfoRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(l.a.f71975a, lVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<o> serializer() {
            return a.f5974a;
        }

        public b() {
        }
    }

    public /* synthetic */ o(m3.l lVar) {
        this.f5973a = lVar;
    }

    public static final /* synthetic */ o a(m3.l lVar) {
        return new o(lVar);
    }

    @m80.k
    public static m3.l b(@m80.k m3.l value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.l lVar, Object obj) {
        return (obj instanceof o) && kotlin.jvm.internal.g0.g(lVar, ((o) obj).h());
    }

    public static final boolean d(m3.l lVar, m3.l lVar2) {
        return kotlin.jvm.internal.g0.g(lVar, lVar2);
    }

    public static int f(m3.l lVar) {
        return lVar.hashCode();
    }

    public static String g(m3.l lVar) {
        return "ComboInfoRsp(value=" + lVar + ')';
    }

    @m80.k
    public final m3.l e() {
        return this.f5973a;
    }

    public boolean equals(Object obj) {
        return c(this.f5973a, obj);
    }

    public final /* synthetic */ m3.l h() {
        return this.f5973a;
    }

    public int hashCode() {
        return f(this.f5973a);
    }

    public String toString() {
        return g(this.f5973a);
    }
}
