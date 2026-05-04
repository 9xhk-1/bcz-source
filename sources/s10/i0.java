package s10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface i0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f87196a = a.f87197a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f87197a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final p10.z<i0> f87198b = new p10.z<>("PackageViewDescriptorFactory");

        @m80.k
        public final p10.z<i0> a() {
            return f87198b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements i0 {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final b f87199b = new b();

        @Override // s10.i0
        @m80.k
        public p10.n0 a(@m80.k f0 module, @m80.k n20.c fqName, @m80.k d30.n storageManager) {
            kotlin.jvm.internal.g0.p(module, "module");
            kotlin.jvm.internal.g0.p(fqName, "fqName");
            kotlin.jvm.internal.g0.p(storageManager, "storageManager");
            return new x(module, fqName, storageManager);
        }
    }

    @m80.k
    p10.n0 a(@m80.k f0 f0Var, @m80.k n20.c cVar, @m80.k d30.n nVar);
}
