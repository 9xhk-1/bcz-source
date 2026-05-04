package androidx.compose.material;

import androidx.compose.ui.platform.AccessibilityManager;
import c40.a1;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SnackbarHostKt$SnackbarHost$1$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ SnackbarData $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, c<? super SnackbarHostKt$SnackbarHost$1$1> cVar) {
        super(2, cVar);
        this.$currentSnackbarData = snackbarData;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new SnackbarHostKt$SnackbarHost$1$1(this.$currentSnackbarData, this.$accessibilityManager, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((SnackbarHostKt$SnackbarHost$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            SnackbarData snackbarData = this.$currentSnackbarData;
            if (snackbarData != null) {
                long millis = SnackbarHostKt.toMillis(snackbarData.getDuration(), this.$currentSnackbarData.getActionLabel() != null, this.$accessibilityManager);
                this.label = 1;
                if (a1.b(millis, this) == l11) {
                    return l11;
                }
            }
            return g2.f100423a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        this.$currentSnackbarData.dismiss();
        return g2.f100423a;
    }
}
