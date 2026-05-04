package io.ktor.server.plugins.calllogging;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "io.ktor.server.plugins.calllogging.CallLoggingKt$logCallsWithMDC$1", f = "CallLogging.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nCallLogging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallLogging.kt\nio/ktor/server/plugins/calllogging/CallLoggingKt$logCallsWithMDC$1\n+ 2 MDCEntryUtils.kt\nio/ktor/server/plugins/calllogging/MDCEntryUtilsKt\n*L\n1#1,115:1\n20#2,8:116\n*S KotlinDebug\n*F\n+ 1 CallLogging.kt\nio/ktor/server/plugins/calllogging/CallLoggingKt$logCallsWithMDC$1\n*L\n82#1:116,8\n*E\n"})
/* loaded from: classes8.dex */
public final class CallLoggingKt$logCallsWithMDC$1 extends SuspendLambda implements q<zx.b, x00.l<? super j00.c<? super g2>, ? extends Object>, j00.c<? super g2>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f61506a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f61507b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f61508c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<j> f61509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallLoggingKt$logCallsWithMDC$1(List<j> list, j00.c<? super CallLoggingKt$logCallsWithMDC$1> cVar) {
        super(3, cVar);
        this.f61509d = list;
    }

    @Override // x00.q
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(zx.b bVar, x00.l<? super j00.c<? super g2>, ? extends Object> lVar, j00.c<? super g2> cVar) {
        CallLoggingKt$logCallsWithMDC$1 callLoggingKt$logCallsWithMDC$1 = new CallLoggingKt$logCallsWithMDC$1(this.f61509d, cVar);
        callLoggingKt$logCallsWithMDC$1.f61507b = bVar;
        callLoggingKt$logCallsWithMDC$1.f61508c = lVar;
        return callLoggingKt$logCallsWithMDC$1.invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.f61506a;
        if (i11 == 0) {
            kotlin.e.n(obj);
            zx.b bVar = (zx.b) this.f61507b;
            x00.l lVar = (x00.l) this.f61508c;
            List<j> list = this.f61509d;
            l40.a aVar = new l40.a(MDCEntryUtilsKt.c(list, bVar));
            CallLoggingKt$logCallsWithMDC$1$invokeSuspend$$inlined$withMDC$1 callLoggingKt$logCallsWithMDC$1$invokeSuspend$$inlined$withMDC$1 = new CallLoggingKt$logCallsWithMDC$1$invokeSuspend$$inlined$withMDC$1(lVar, list, null);
            this.f61507b = null;
            this.f61506a = 1;
            if (c40.i.h(aVar, callLoggingKt$logCallsWithMDC$1$invokeSuspend$$inlined$withMDC$1, this) == l11) {
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
