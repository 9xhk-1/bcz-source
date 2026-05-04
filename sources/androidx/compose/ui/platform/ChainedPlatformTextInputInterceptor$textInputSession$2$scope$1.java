package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.SessionMutex;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 implements PlatformTextInputSessionScope {
    private final /* synthetic */ PlatformTextInputSessionScope $$delegate_0;
    final /* synthetic */ AtomicReference<SessionMutex.Session<Object>> $inputMethodMutex;
    final /* synthetic */ PlatformTextInputSessionScope $parentSession;
    final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

    public ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1(PlatformTextInputSessionScope platformTextInputSessionScope, AtomicReference<SessionMutex.Session<Object>> atomicReference, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.$parentSession = platformTextInputSessionScope;
        this.$inputMethodMutex = atomicReference;
        this.this$0 = chainedPlatformTextInputInterceptor;
        this.$$delegate_0 = platformTextInputSessionScope;
    }

    @Override // c40.r0
    public kotlin.coroutines.d getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public View getView() {
        return this.$$delegate_0.getView();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest r9, j00.c<?> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2d:
            kotlin.e.n(r10)
            goto L4b
        L31:
            kotlin.e.n(r10)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<java.lang.Object>> r10 = r8.$inputMethodMutex
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 r2 = new x00.l<c40.r0, yz.g2>() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                static {
                    /*
                        androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2) androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.INSTANCE androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.<init>():void");
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ yz.g2 invoke(c40.r0 r1) {
                    /*
                        r0 = this;
                        c40.r0 r1 = (c40.r0) r1
                        r0.invoke2(r1)
                        yz.g2 r1 = yz.g2.f100423a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.invoke(java.lang.Object):java.lang.Object");
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(c40.r0 r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2.invoke2(c40.r0):void");
                }
            }
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3 r4 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r5 = r8.this$0
            androidx.compose.ui.platform.PlatformTextInputSessionScope r6 = r8.$parentSession
            r7 = 0
            r4.<init>(r5, r9, r6, r7)
            r0.label = r3
            java.lang.Object r9 = androidx.compose.ui.SessionMutex.m2095withSessionCancellingPreviousimpl(r10, r2, r4, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            kotlin.KotlinNothingValueException r9 = new kotlin.KotlinNothingValueException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1.startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, j00.c):java.lang.Object");
    }
}
