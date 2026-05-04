package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@kotlin.jvm.internal.u0({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,252:1\n85#2:253\n113#2,2:254\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor\n*L\n200#1:253\n200#1:254,2\n*E\n"})
/* loaded from: classes2.dex */
final class ChainedPlatformTextInputInterceptor {

    @m80.k
    private final MutableState interceptor$delegate;

    @m80.l
    private final ChainedPlatformTextInputInterceptor parent;

    public ChainedPlatformTextInputInterceptor(@m80.k PlatformTextInputInterceptor platformTextInputInterceptor, @m80.l ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.parent = chainedPlatformTextInputInterceptor;
        this.interceptor$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(platformTextInputInterceptor, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlatformTextInputInterceptor getInterceptor() {
        return (PlatformTextInputInterceptor) this.interceptor$delegate.getValue();
    }

    private final void setInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor) {
        this.interceptor$delegate.setValue(platformTextInputInterceptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object textInputSession(@m80.k androidx.compose.ui.node.Owner r6, @m80.k x00.p<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super j00.c<?>, ? extends java.lang.Object> r7, @m80.k j00.c<?> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            kotlin.e.n(r8)
            goto L45
        L31:
            kotlin.e.n(r8)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r8 = r5.parent
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2 r2 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2
            r4 = 0
            r2.<init>(r7, r5, r4)
            r0.label = r3
            java.lang.Object r6 = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.access$interceptedTextInputSession(r6, r8, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor.textInputSession(androidx.compose.ui.node.Owner, x00.p, j00.c):java.lang.Object");
    }

    public final void updateInterceptor(@m80.k PlatformTextInputInterceptor platformTextInputInterceptor) {
        setInterceptor(platformTextInputInterceptor);
    }
}
