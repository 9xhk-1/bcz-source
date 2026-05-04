package c7;

import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import oa0.r;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {h.class})
@u0({"SMAP\nAppRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRepo.kt\ncom/baicizhan/app/biz/platform/AppRepoImpl\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,31:1\n58#2,6:32\n58#2,6:38\n*S KotlinDebug\n*F\n+ 1 AppRepo.kt\ncom/baicizhan/app/biz/platform/AppRepoImpl\n*L\n18#1:32,6\n19#1:38,6\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements h, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f8233b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f8234c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class a implements x00.a<c4.k> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f8235a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f8236b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f8237c;

        public a(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f8235a = aVar;
            this.f8236b = aVar2;
            this.f8237c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [c4.k, java.lang.Object] */
        @Override // x00.a
        public final c4.k invoke() {
            pa0.a aVar = this.f8235a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(c4.k.class), this.f8236b, this.f8237c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    /* renamed from: c7.b$b, reason: collision with other inner class name */
    public static final class C0137b implements x00.a<c7.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f8238a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f8239b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f8240c;

        public C0137b(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f8238a = aVar;
            this.f8239b = aVar2;
            this.f8240c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [c7.a, java.lang.Object] */
        @Override // x00.a
        public final c7.a invoke() {
            pa0.a aVar = this.f8238a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(c7.a.class), this.f8239b, this.f8240c);
        }
    }

    public b() {
        jb0.c cVar = jb0.c.f64013a;
        this.f8233b = e0.b(cVar.b(), new a(this, null, null));
        this.f8234c = e0.b(cVar.b(), new C0137b(this, null, null));
    }

    @Override // c7.h
    @m80.k
    public String a() {
        return c().c();
    }

    @Override // c7.h
    public long b() {
        return c().b();
    }

    public final c7.a c() {
        return (c7.a) this.f8234c.getValue();
    }

    public final c4.k d() {
        return (c4.k) this.f8233b.getValue();
    }

    @Override // c7.h
    @m80.k
    public String getChannel() {
        return d().i();
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
