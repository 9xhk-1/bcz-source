package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.r1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class a2 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.r1 f5772a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<a2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5773a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5773a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.SubmitSentenceGameReq", aVar);
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
            h(hVar, ((a2) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return a2.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{r1.a.f72066a};
        }

        @m80.k
        public final m3.r1 g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return a2.b((m3.r1) decoder.decodeInline(descriptor).decodeSerializableValue(r1.a.f72066a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.r1 r1Var) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(r1Var, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-SubmitSentenceGameReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(r1.a.f72066a, r1Var);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<a2> serializer() {
            return a.f5773a;
        }

        public b() {
        }
    }

    public /* synthetic */ a2(m3.r1 r1Var) {
        this.f5772a = r1Var;
    }

    public static final /* synthetic */ a2 a(m3.r1 r1Var) {
        return new a2(r1Var);
    }

    @m80.k
    public static m3.r1 b(@m80.k m3.r1 value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.r1 r1Var, Object obj) {
        return (obj instanceof a2) && kotlin.jvm.internal.g0.g(r1Var, ((a2) obj).h());
    }

    public static final boolean d(m3.r1 r1Var, m3.r1 r1Var2) {
        return kotlin.jvm.internal.g0.g(r1Var, r1Var2);
    }

    public static int f(m3.r1 r1Var) {
        return r1Var.hashCode();
    }

    public static String g(m3.r1 r1Var) {
        return "SubmitSentenceGameReq(value=" + r1Var + ')';
    }

    @m80.k
    public final m3.r1 e() {
        return this.f5772a;
    }

    public boolean equals(Object obj) {
        return c(this.f5772a, obj);
    }

    public final /* synthetic */ m3.r1 h() {
        return this.f5772a;
    }

    public int hashCode() {
        return f(this.f5772a);
    }

    public String toString() {
        return g(this.f5772a);
    }
}
