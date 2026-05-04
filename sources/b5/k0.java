package b5;

import j50.p0;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import l3.i0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
@w00.h
/* loaded from: classes3.dex */
public final class k0 implements c1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f5915b = {yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: b5.j0
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = k0.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<l3.i0> f5916a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<k0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f5917a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f5917a = aVar;
            j50.u0 u0Var = new j50.u0("com.baicizhan.app.biz.game.impl.unity.command.GetTopicResourceRsp", aVar);
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
            h(hVar, ((k0) obj).k());
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return p0.a.a(this);
        }

        @Override // f50.e
        public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
            return k0.d(g(fVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{k0.f5915b[0].getValue()};
        }

        @m80.k
        public final List<? extends l3.i0> g(@m80.k i50.f decoder) {
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            return k0.e((List) decoder.decodeInline(descriptor).decodeSerializableValue(new j50.f(i0.a.f69352a)));
        }

        public final void h(@m80.k i50.h encoder, @m80.k List<? extends l3.i0> list) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(list, "$v$c$com-baicizhan-app-biz-game-impl-unity-command-GetTopicResourceRsp$-value$0");
            i50.h encodeInline = encoder.encodeInline(descriptor);
            if (encodeInline == null) {
                return;
            }
            encodeInline.encodeSerializableValue(new j50.f(i0.a.f69352a), list);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<k0> serializer() {
            return a.f5917a;
        }

        public b() {
        }
    }

    public /* synthetic */ k0(List list) {
        this.f5916a = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ f50.i b() {
        return new j50.f(i0.a.f69352a);
    }

    public static final /* synthetic */ k0 d(List list) {
        return new k0(list);
    }

    @m80.k
    public static List<? extends l3.i0> e(@m80.k List<l3.i0> value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return value;
    }

    public static boolean f(List<? extends l3.i0> list, Object obj) {
        return (obj instanceof k0) && kotlin.jvm.internal.g0.g(list, ((k0) obj).k());
    }

    public static final boolean g(List<? extends l3.i0> list, List<? extends l3.i0> list2) {
        return kotlin.jvm.internal.g0.g(list, list2);
    }

    public static int i(List<? extends l3.i0> list) {
        return list.hashCode();
    }

    public static String j(List<? extends l3.i0> list) {
        return "GetTopicResourceRsp(value=" + list + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f5916a, obj);
    }

    @m80.k
    public final List<l3.i0> h() {
        return this.f5916a;
    }

    public int hashCode() {
        return i(this.f5916a);
    }

    public final /* synthetic */ List k() {
        return this.f5916a;
    }

    public String toString() {
        return j(this.f5916a);
    }
}
