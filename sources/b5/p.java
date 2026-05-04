package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class p implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.m f5990a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<p> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5991a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5991a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.ComboReq", aVar);
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
            h(hVar, ((p) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return p.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{m.a.f71995a};
        }

        @m80.k
        public final m3.m g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return p.b((m3.m) decoder.decodeInline(descriptor).decodeSerializableValue(m.a.f71995a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.m mVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(mVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-ComboReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(m.a.f71995a, mVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<p> serializer() {
            return a.f5991a;
        }

        public b() {
        }
    }

    public /* synthetic */ p(m3.m mVar) {
        this.f5990a = mVar;
    }

    public static final /* synthetic */ p a(m3.m mVar) {
        return new p(mVar);
    }

    @m80.k
    public static m3.m b(@m80.k m3.m value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.m mVar, Object obj) {
        return (obj instanceof p) && kotlin.jvm.internal.g0.g(mVar, ((p) obj).h());
    }

    public static final boolean d(m3.m mVar, m3.m mVar2) {
        return kotlin.jvm.internal.g0.g(mVar, mVar2);
    }

    public static int f(m3.m mVar) {
        return mVar.hashCode();
    }

    public static String g(m3.m mVar) {
        return "ComboReq(value=" + mVar + ')';
    }

    @m80.k
    public final m3.m e() {
        return this.f5990a;
    }

    public boolean equals(Object obj) {
        return c(this.f5990a, obj);
    }

    public final /* synthetic */ m3.m h() {
        return this.f5990a;
    }

    public int hashCode() {
        return f(this.f5990a);
    }

    public String toString() {
        return g(this.f5990a);
    }
}
