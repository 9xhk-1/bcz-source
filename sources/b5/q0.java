package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class q0 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.y f6013a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<q0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6014a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6014a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.GetWordRootResourceReq", aVar);
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
            h(hVar, ((q0) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return q0.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{y.a.f72117a};
        }

        @m80.k
        public final m3.y g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return q0.b((m3.y) decoder.decodeInline(descriptor).decodeSerializableValue(y.a.f72117a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.y yVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(yVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetWordRootResourceReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(y.a.f72117a, yVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<q0> serializer() {
            return a.f6014a;
        }

        public b() {
        }
    }

    public /* synthetic */ q0(m3.y yVar) {
        this.f6013a = yVar;
    }

    public static final /* synthetic */ q0 a(m3.y yVar) {
        return new q0(yVar);
    }

    @m80.k
    public static m3.y b(@m80.k m3.y value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.y yVar, Object obj) {
        return (obj instanceof q0) && kotlin.jvm.internal.g0.g(yVar, ((q0) obj).h());
    }

    public static final boolean d(m3.y yVar, m3.y yVar2) {
        return kotlin.jvm.internal.g0.g(yVar, yVar2);
    }

    public static int f(m3.y yVar) {
        return yVar.hashCode();
    }

    public static String g(m3.y yVar) {
        return "GetWordRootResourceReq(value=" + yVar + ')';
    }

    @m80.k
    public final m3.y e() {
        return this.f6013a;
    }

    public boolean equals(Object obj) {
        return c(this.f6013a, obj);
    }

    public final /* synthetic */ m3.y h() {
        return this.f6013a;
    }

    public int hashCode() {
        return f(this.f6013a);
    }

    public String toString() {
        return g(this.f6013a);
    }
}
