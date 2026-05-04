package b5;

import j50.d3;
import j50.p0;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class k1 implements x0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f5918a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<k1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5919a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5919a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.Report", aVar);
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
            h(hVar, ((k1) obj).h());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return k1.a(g(fVar));
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{d3.f63348a};
        }

        @m80.k
        public final String g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return k1.b(decoder.decodeInline(descriptor).decodeString());
        }

        public final void h(@m80.k i50.h encoder, @m80.k String str) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(str, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-Report$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeString(str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<k1> serializer() {
            return a.f5919a;
        }

        public b() {
        }
    }

    public /* synthetic */ k1(String str) {
        this.f5918a = str;
    }

    public static final /* synthetic */ k1 a(String str) {
        return new k1(str);
    }

    @m80.k
    public static String b(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof k1) && kotlin.jvm.internal.g0.g(str, ((k1) obj).h());
    }

    public static final boolean d(String str, String str2) {
        return kotlin.jvm.internal.g0.g(str, str2);
    }

    public static int f(String str) {
        return str.hashCode();
    }

    public static String g(String str) {
        return "Report(value=" + str + ')';
    }

    @m80.k
    public final String e() {
        return this.f5918a;
    }

    public boolean equals(Object obj) {
        return c(this.f5918a, obj);
    }

    public final /* synthetic */ String h() {
        return this.f5918a;
    }

    public int hashCode() {
        return f(this.f5918a);
    }

    public String toString() {
        return g(this.f5918a);
    }
}
