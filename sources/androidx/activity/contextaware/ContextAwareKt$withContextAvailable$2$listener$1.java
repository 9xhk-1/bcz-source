package androidx.activity.contextaware;

import android.content.Context;
import c40.n;
import j00.c;
import kotlin.Result;
import kotlin.e;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ n<R> $co;
    final /* synthetic */ l<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(n<R> nVar, l<Context, R> lVar) {
        this.$co = nVar;
        this.$onContextAvailable = lVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object m6308constructorimpl;
        g0.p(context, "context");
        c cVar = this.$co;
        l<Context, R> lVar = this.$onContextAvailable;
        try {
            Result.a aVar = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(lVar.invoke(context));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
        }
        cVar.resumeWith(m6308constructorimpl);
    }
}
