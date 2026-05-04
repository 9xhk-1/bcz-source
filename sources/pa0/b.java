package pa0;

import androidx.exifinterface.media.ExifInterface;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 2 Scope.kt\norg/koin/core/scope/Scope\n+ 3 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n142#2:65\n142#2:67\n127#3:66\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n46#1:65\n48#1:67\n48#1:66\n*E\n"})
/* loaded from: classes9.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nKoinComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n*L\n1#1,64:1\n45#2,2:65\n48#2:68\n142#3:67\n127#4:69\n*S KotlinDebug\n*F\n+ 1 KoinComponent.kt\norg/koin/core/component/KoinComponentKt$inject$1\n*L\n63#1:65,2\n63#1:68\n63#1:67\n63#1:69\n*E\n"})
    public static final class a<T> implements x00.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ pa0.a f80326a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ za0.a f80327b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<ya0.a> f80328c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(pa0.a aVar, za0.a aVar2, x00.a<? extends ya0.a> aVar3) {
            this.f80326a = aVar;
            this.f80327b = aVar2;
            this.f80328c = aVar3;
        }

        @Override // x00.a
        public final T invoke() {
            pa0.a aVar = this.f80326a;
            za0.a aVar2 = this.f80327b;
            x00.a<ya0.a> aVar3 = this.f80328c;
            cb0.b scope = aVar instanceof c ? ((c) aVar).getScope() : aVar.r().P().h();
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) scope.i(o0.d(Object.class), aVar2, aVar3);
        }
    }

    public static final /* synthetic */ <T> T a(pa0.a aVar, za0.a aVar2, x00.a<? extends ya0.a> aVar3) {
        g0.p(aVar, "<this>");
        if (aVar instanceof c) {
            cb0.b scope = ((c) aVar).getScope();
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) scope.i(o0.d(Object.class), aVar2, aVar3);
        }
        cb0.b h11 = aVar.r().P().h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) h11.i(o0.d(Object.class), aVar2, aVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object b(pa0.a aVar, za0.a aVar2, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar2 = null;
        }
        if ((i11 & 2) != 0) {
            aVar3 = null;
        }
        g0.p(aVar, "<this>");
        if (aVar instanceof c) {
            cb0.b scope = ((c) aVar).getScope();
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return scope.i(o0.d(Object.class), aVar2, aVar3);
        }
        cb0.b h11 = aVar.r().P().h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return h11.i(o0.d(Object.class), aVar2, aVar3);
    }

    public static final /* synthetic */ <T> c0<T> c(pa0.a aVar, za0.a aVar2, LazyThreadSafetyMode mode, x00.a<? extends ya0.a> aVar3) {
        g0.p(aVar, "<this>");
        g0.p(mode, "mode");
        g0.w();
        return e0.b(mode, new a(aVar, aVar2, aVar3));
    }

    public static /* synthetic */ c0 d(pa0.a aVar, za0.a aVar2, LazyThreadSafetyMode mode, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar2 = null;
        }
        if ((i11 & 2) != 0) {
            mode = jb0.c.f64013a.b();
        }
        if ((i11 & 4) != 0) {
            aVar3 = null;
        }
        g0.p(aVar, "<this>");
        g0.p(mode, "mode");
        g0.w();
        return e0.b(mode, new a(aVar, aVar2, aVar3));
    }
}
