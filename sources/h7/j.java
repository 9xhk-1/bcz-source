package h7;

import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import oa0.r;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {h.class})
@u0({"SMAP\nReviewShowRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReviewShowRepo.kt\ncom/baicizhan/app/biz/study4ini/ReviewShowRepoImpl\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,36:1\n58#2,6:37\n*S KotlinDebug\n*F\n+ 1 ReviewShowRepo.kt\ncom/baicizhan/app/biz/study4ini/ReviewShowRepoImpl\n*L\n19#1:37,6\n*E\n"})
/* loaded from: classes3.dex */
public final class j implements h, c4.j {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c0 f58607b = e0.b(jb0.c.f64013a.b(), new a(this, null, new x00.a() { // from class: h7.i
        @Override // x00.a
        public final Object invoke() {
            ya0.a e11;
            e11 = j.e();
            return e11;
        }
    }));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class a implements x00.a<com.baicizhan.app.preferences.g> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f58608a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f58609b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a f58610c;

        public a(pa0.a aVar, za0.a aVar2, x00.a aVar3) {
            this.f58608a = aVar;
            this.f58609b = aVar2;
            this.f58610c = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.baicizhan.app.preferences.g, java.lang.Object] */
        @Override // x00.a
        public final com.baicizhan.app.preferences.g invoke() {
            pa0.a aVar = this.f58608a;
            return (aVar instanceof pa0.c ? ((pa0.c) aVar).getScope() : aVar.r().P().h()).i(o0.d(com.baicizhan.app.preferences.g.class), this.f58609b, this.f58610c);
        }
    }

    private final com.baicizhan.app.preferences.g d() {
        return (com.baicizhan.app.preferences.g) this.f58607b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ya0.a e() {
        return ya0.b.d("REVIEW_SHOW_SCOPE");
    }

    @Override // h7.h
    @m80.l
    public Object a(@m80.k String str, int i11, @m80.k j00.c<? super Boolean> cVar) {
        String b11;
        com.baicizhan.app.preferences.g d11 = d();
        b11 = k.b(str, i11);
        return d11.b(b11, false, cVar);
    }

    @Override // h7.h
    @m80.l
    public Object b(@m80.k String str, int i11, @m80.k j00.c<? super g2> cVar) {
        String b11;
        com.baicizhan.app.preferences.g d11 = d();
        b11 = k.b(str, i11);
        Object g11 = d11.g(b11, true, cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
