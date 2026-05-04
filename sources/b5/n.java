package b5;

import j50.p0;
import kotlin.DeprecationLevel;
import m3.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class n implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m3.i f5967a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5968a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5968a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.CollectWord2BooksReq", aVar);
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
            h(hVar, ((n) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return n.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{i.a.f71941a};
        }

        @m80.k
        public final m3.i g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return n.b((m3.i) decoder.decodeInline(descriptor).decodeSerializableValue(i.a.f71941a));
        }

        public final void h(@m80.k i50.h encoder, @m80.k m3.i iVar) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(iVar, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-CollectWord2BooksReq$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(i.a.f71941a, iVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<n> serializer() {
            return a.f5968a;
        }

        public b() {
        }
    }

    public /* synthetic */ n(m3.i iVar) {
        this.f5967a = iVar;
    }

    public static final /* synthetic */ n a(m3.i iVar) {
        return new n(iVar);
    }

    @m80.k
    public static m3.i b(@m80.k m3.i value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(m3.i iVar, Object obj) {
        return (obj instanceof n) && kotlin.jvm.internal.g0.g(iVar, ((n) obj).h());
    }

    public static final boolean d(m3.i iVar, m3.i iVar2) {
        return kotlin.jvm.internal.g0.g(iVar, iVar2);
    }

    public static int f(m3.i iVar) {
        return iVar.hashCode();
    }

    public static String g(m3.i iVar) {
        return "CollectWord2BooksReq(value=" + iVar + ')';
    }

    @m80.k
    public final m3.i e() {
        return this.f5967a;
    }

    public boolean equals(Object obj) {
        return c(this.f5967a, obj);
    }

    public final /* synthetic */ m3.i h() {
        return this.f5967a;
    }

    public int hashCode() {
        return f(this.f5967a);
    }

    public String toString() {
        return g(this.f5967a);
    }
}
