package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class n0 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.u f5969a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<n0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5970a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5970a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.GetWordCollectionStatusReq", aVar);
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
            h(hVar, ((n0) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return n0.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{u.a.f72083a};
        }

        @m80.k
        public final m3.u g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return n0.b((m3.u) decoder.decodeInline(descriptor).decodeSerializableValue(u.a.f72083a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.u uVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(uVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetWordCollectionStatusReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(u.a.f72083a, uVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<n0> serializer() {
            return a.f5970a;
        }

        public b() {
        }
    }

    public /* synthetic */ n0(m3.u uVar) {
        this.f5969a = uVar;
    }

    public static final /* synthetic */ n0 a(m3.u uVar) {
        return new n0(uVar);
    }

    @m80.k
    public static m3.u b(@m80.k m3.u value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.u uVar, Object obj) {
        return (obj instanceof n0) && kotlin.jvm.internal.g0.g(uVar, ((n0) obj).h());
    }

    public static final boolean d(m3.u uVar, m3.u uVar2) {
        return kotlin.jvm.internal.g0.g(uVar, uVar2);
    }

    public static int f(m3.u uVar) {
        return uVar.hashCode();
    }

    public static String g(m3.u uVar) {
        return "GetWordCollectionStatusReq(value=" + uVar + ')';
    }

    @m80.k
    public final m3.u e() {
        return this.f5969a;
    }

    public boolean equals(Object obj) {
        return c(this.f5969a, obj);
    }

    public final /* synthetic */ m3.u h() {
        return this.f5969a;
    }

    public int hashCode() {
        return f(this.f5969a);
    }

    public String toString() {
        return g(this.f5969a);
    }
}
