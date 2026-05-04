package io.ktor.server.plugins.calllogging;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "io.ktor.server.plugins.calllogging.CallLoggingKt$logCallsWithMDC$3", f = "CallLogging.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nCallLogging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallLogging.kt\nio/ktor/server/plugins/calllogging/CallLoggingKt$logCallsWithMDC$3\n+ 2 MDCEntryUtils.kt\nio/ktor/server/plugins/calllogging/MDCEntryUtilsKt\n*L\n1#1,115:1\n20#2,8:116\n*S KotlinDebug\n*F\n+ 1 CallLogging.kt\nio/ktor/server/plugins/calllogging/CallLoggingKt$logCallsWithMDC$3\n*L\n90#1:116,8\n*E\n"})
/* loaded from: classes8.dex */
public final class CallLoggingKt$logCallsWithMDC$3 extends SuspendLambda implements p<zx.b, j00.c<? super g2>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f61514a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f61515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<j> f61516c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x00.l<zx.b, g2> f61517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CallLoggingKt$logCallsWithMDC$3(List<j> list, x00.l<? super zx.b, g2> lVar, j00.c<? super CallLoggingKt$logCallsWithMDC$3> cVar) {
        super(2, cVar);
        this.f61516c = list;
        this.f61517d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        CallLoggingKt$logCallsWithMDC$3 callLoggingKt$logCallsWithMDC$3 = new CallLoggingKt$logCallsWithMDC$3(this.f61516c, this.f61517d, cVar);
        callLoggingKt$logCallsWithMDC$3.f61515b = obj;
        return callLoggingKt$logCallsWithMDC$3;
    }

    @Override // x00.p
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(zx.b bVar, j00.c<? super g2> cVar) {
        return ((CallLoggingKt$logCallsWithMDC$3) create(bVar, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.f61514a;
        if (i11 == 0) {
            kotlin.e.n(obj);
            zx.b bVar = (zx.b) this.f61515b;
            List<j> list = this.f61516c;
            x00.l<zx.b, g2> lVar = this.f61517d;
            l40.a aVar = new l40.a(MDCEntryUtilsKt.c(list, bVar));
            CallLoggingKt$logCallsWithMDC$3$invokeSuspend$$inlined$withMDC$1 callLoggingKt$logCallsWithMDC$3$invokeSuspend$$inlined$withMDC$1 = new CallLoggingKt$logCallsWithMDC$3$invokeSuspend$$inlined$withMDC$1(list, null, lVar, bVar);
            this.f61514a = 1;
            if (c40.i.h(aVar, callLoggingKt$logCallsWithMDC$3$invokeSuspend$$inlined$withMDC$1, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
