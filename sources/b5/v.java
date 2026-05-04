package b5;

import j50.d3;
import j50.p0;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class v implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f6067b = {yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: b5.u
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = v.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<String, String> f6068a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<v> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f6069a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f6069a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.GetABTestConfigRsp", aVar);
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
            h(hVar, ((v) obj).k());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return v.d(g(fVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{v.f6067b[0].getValue()};
        }

        @m80.k
        public final Map<String, ? extends String> g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            i50.f decodeInline = decoder.decodeInline(descriptor);
            d3 d3Var = d3.f63348a;
            return v.e((Map) decodeInline.decodeSerializableValue(new j50.f1(d3Var, d3Var)));
        }

        public final void h(@m80.k i50.h encoder, @m80.k Map<String, ? extends String> map) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(map, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetABTestConfigRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            d3 d3Var = d3.f63348a;
            encodeInline.encodeSerializableValue(new j50.f1(d3Var, d3Var), map);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<v> serializer() {
            return a.f6069a;
        }

        public b() {
        }
    }

    public /* synthetic */ v(Map map) {
        this.f6068a = map;
    }

    public static final /* synthetic */ f50.i b() {
        d3 d3Var = d3.f63348a;
        return new j50.f1(d3Var, d3Var);
    }

    public static final /* synthetic */ v d(Map map) {
        return new v(map);
    }

    @m80.k
    public static Map<String, ? extends String> e(@m80.k Map<String, String> value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean f(Map<String, ? extends String> map, Object obj) {
        return (obj instanceof v) && kotlin.jvm.internal.g0.g(map, ((v) obj).k());
    }

    public static final boolean g(Map<String, ? extends String> map, Map<String, ? extends String> map2) {
        return kotlin.jvm.internal.g0.g(map, map2);
    }

    public static int i(Map<String, ? extends String> map) {
        return map.hashCode();
    }

    public static String j(Map<String, ? extends String> map) {
        return "GetABTestConfigRsp(value=" + map + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f6068a, obj);
    }

    @m80.k
    public final Map<String, String> h() {
        return this.f6068a;
    }

    public int hashCode() {
        return i(this.f6068a);
    }

    public final /* synthetic */ Map k() {
        return this.f6068a;
    }

    public String toString() {
        return j(this.f6068a);
    }
}
