package p10;

import e30.u1;
import kotlin.jvm.internal.PropertyReference1Impl;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w0<T extends x20.k> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b f78618a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<f30.g, T> f78619b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f30.g f78620c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d30.i f78621d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f78617f = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(w0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f78616e = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final <T extends x20.k> w0<T> a(@m80.k b classDescriptor, @m80.k d30.n storageManager, @m80.k f30.g kotlinTypeRefinerForOwnerModule, @m80.k x00.l<? super f30.g, ? extends T> scopeFactory) {
            kotlin.jvm.internal.g0.p(classDescriptor, "classDescriptor");
            kotlin.jvm.internal.g0.p(storageManager, "storageManager");
            kotlin.jvm.internal.g0.p(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            kotlin.jvm.internal.g0.p(scopeFactory, "scopeFactory");
            return new w0<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }

        public a() {
        }
    }

    public /* synthetic */ w0(b bVar, d30.n nVar, x00.l lVar, f30.g gVar, kotlin.jvm.internal.v vVar) {
        this(bVar, nVar, lVar, gVar);
    }

    public static final x20.k d(w0 w0Var, f30.g gVar) {
        return w0Var.f78619b.invoke(gVar);
    }

    public static final x20.k f(w0 w0Var) {
        return w0Var.f78619b.invoke(w0Var.f78620c);
    }

    @m80.k
    public final T c(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.d(u20.e.s(this.f78618a))) {
            return e();
        }
        u1 o11 = this.f78618a.o();
        kotlin.jvm.internal.g0.o(o11, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.e(o11) ? e() : (T) kotlinTypeRefiner.c(this.f78618a, new v0(this, kotlinTypeRefiner));
    }

    public final T e() {
        return (T) d30.m.a(this.f78621d, this, f78617f[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w0(b bVar, d30.n nVar, x00.l<? super f30.g, ? extends T> lVar, f30.g gVar) {
        this.f78618a = bVar;
        this.f78619b = lVar;
        this.f78620c = gVar;
        this.f78621d = nVar.f(new u0(this));
    }
}
