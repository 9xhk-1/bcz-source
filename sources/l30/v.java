package l30;

import e30.c1;
import e30.r0;
import kotlin.jvm.internal.g0;
import l30.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class v implements f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f69839a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<n10.j, r0> f69840b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f69841c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends v {

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public static final a f69842d = new a();

        public a() {
            super("Boolean", u.f69838a, null);
        }

        public static final r0 c(n10.j jVar) {
            g0.p(jVar, "<this>");
            c1 n11 = jVar.n();
            g0.o(n11, "getBooleanType(...)");
            return n11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends v {

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public static final b f69843d = new b();

        public b() {
            super("Int", w.f69845a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r0 c(n10.j jVar) {
            g0.p(jVar, "<this>");
            c1 D = jVar.D();
            g0.o(D, "getIntType(...)");
            return D;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends v {

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public static final c f69844d = new c();

        public c() {
            super("Unit", x.f69846a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r0 c(n10.j jVar) {
            g0.p(jVar, "<this>");
            c1 Z = jVar.Z();
            g0.o(Z, "getUnitType(...)");
            return Z;
        }
    }

    public /* synthetic */ v(String str, x00.l lVar, kotlin.jvm.internal.v vVar) {
        this(str, lVar);
    }

    @Override // l30.f
    @m80.l
    public String a(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // l30.f
    public boolean b(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        g0.p(functionDescriptor, "functionDescriptor");
        return g0.g(functionDescriptor.getReturnType(), this.f69840b.invoke(u20.e.m(functionDescriptor)));
    }

    @Override // l30.f
    @m80.k
    public String getDescription() {
        return this.f69841c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(String str, x00.l<? super n10.j, ? extends r0> lVar) {
        this.f69839a = str;
        this.f69840b = lVar;
        this.f69841c = "must return " + str;
    }
}
