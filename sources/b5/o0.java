package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class o0 implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.x f5975a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<o0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5976a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5976a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.GetWordCollectionStatusRsp", aVar);
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
            h(hVar, ((o0) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return o0.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{x.a.f72109a};
        }

        @m80.k
        public final m3.x g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return o0.b((m3.x) decoder.decodeInline(descriptor).decodeSerializableValue(x.a.f72109a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.x xVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(xVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetWordCollectionStatusRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(x.a.f72109a, xVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<o0> serializer() {
            return a.f5976a;
        }

        public b() {
        }
    }

    public /* synthetic */ o0(m3.x xVar) {
        this.f5975a = xVar;
    }

    public static final /* synthetic */ o0 a(m3.x xVar) {
        return new o0(xVar);
    }

    @m80.k
    public static m3.x b(@m80.k m3.x value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.x xVar, Object obj) {
        return (obj instanceof o0) && kotlin.jvm.internal.g0.g(xVar, ((o0) obj).h());
    }

    public static final boolean d(m3.x xVar, m3.x xVar2) {
        return kotlin.jvm.internal.g0.g(xVar, xVar2);
    }

    public static int f(m3.x xVar) {
        return xVar.hashCode();
    }

    public static String g(m3.x xVar) {
        return "GetWordCollectionStatusRsp(value=" + xVar + ')';
    }

    @m80.k
    public final m3.x e() {
        return this.f5975a;
    }

    public boolean equals(Object obj) {
        return c(this.f5975a, obj);
    }

    public final /* synthetic */ m3.x h() {
        return this.f5975a;
    }

    public int hashCode() {
        return f(this.f5975a);
    }

    public String toString() {
        return g(this.f5975a);
    }
}
