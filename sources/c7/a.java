package c7;

import android.app.Application;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAppRepo.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppRepo.android.kt\ncom/baicizhan/app/biz/platform/AppPlatformRepo\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,13:1\n58#2,6:14\n*S KotlinDebug\n*F\n+ 1 AppRepo.android.kt\ncom/baicizhan/app/biz/platform/AppPlatformRepo\n*L\n8#1:14,6\n*E\n"})
/* loaded from: classes3.dex */
public final class a implements c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f8229b = e0.b(jb0.c.f64013a.b(), new C0136a(this, null, null));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    /* renamed from: c7.a$a, reason: collision with other inner class name */
    public static final class C0136a implements x00.a<Application> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f8230a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f8231b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f8232c;

        public C0136a(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f8230a = aVar;
            this.f8231b = aVar2;
            this.f8232c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [android.app.Application, java.lang.Object] */
        @Override // x00.a
        public final Application invoke() {
            pa0.a aVar = this.f8230a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(Application.class), this.f8231b, this.f8232c);
        }
    }

    private final Application a() {
        return (Application) this.f8229b.getValue();
    }

    public final long b() {
        return n.a(a());
    }

    @m80.k
    public final String c() {
        return n.b(a());
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
