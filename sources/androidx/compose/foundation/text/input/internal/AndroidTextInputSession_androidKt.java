package androidx.compose.foundation.text.input.internal;

import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeOptions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt {

    @m80.k
    private static final String[] ALL_MIME_TYPES = {"*/*", "image/*", "video/*"};
    public static final boolean TIA_DEBUG = false;

    @m80.k
    private static final String TIA_TAG = "AndroidTextInputSession";

    public static /* synthetic */ void logDebug$default(String str, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = TIA_TAG;
        }
        logDebug(str, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object platformSpecificTextInputSession(@m80.k androidx.compose.ui.platform.PlatformTextInputSession r13, @m80.k androidx.compose.foundation.text.input.internal.TransformedTextFieldState r14, @m80.k androidx.compose.foundation.text.input.internal.TextLayoutState r15, @m80.k androidx.compose.ui.text.input.ImeOptions r16, @m80.l androidx.compose.foundation.content.internal.ReceiveContentConfiguration r17, @m80.l x00.l<? super androidx.compose.ui.text.input.ImeAction, yz.g2> r18, @m80.l x00.a<yz.g2> r19, @m80.l kotlinx.coroutines.flow.x<yz.g2> r20, @m80.l androidx.compose.ui.platform.ViewConfiguration r21, @m80.k j00.c<?> r22) {
        /*
            r0 = r22
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1
            if (r1 == 0) goto L16
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r12 = r1
            goto L1c
        L16:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r12.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r12.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L31
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            kotlin.e.n(r0)
            goto L58
        L35:
            kotlin.e.n(r0)
            android.view.View r0 = r13.getView()
            androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r9 = androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt.ComposeInputMethodManager(r0)
            r12.label = r3
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r10 = r20
            r11 = r21
            java.lang.Object r13 = platformSpecificTextInputSession(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r1) goto L58
            return r1
        L58:
            kotlin.KotlinNothingValueException r13 = new kotlin.KotlinNothingValueException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, x00.l, x00.a, kotlinx.coroutines.flow.x, androidx.compose.ui.platform.ViewConfiguration, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object platformSpecificTextInputSession$default(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, x00.l lVar, x00.a aVar, kotlinx.coroutines.flow.x xVar, ViewConfiguration viewConfiguration, j00.c cVar, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            aVar = null;
        }
        if ((i11 & 64) != 0) {
            xVar = null;
        }
        if ((i11 & 128) != 0) {
            viewConfiguration = null;
        }
        return platformSpecificTextInputSession(platformTextInputSession, transformedTextFieldState, textLayoutState, imeOptions, receiveContentConfiguration, lVar, aVar, xVar, viewConfiguration, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object platformSpecificTextInputSession(@m80.k androidx.compose.ui.platform.PlatformTextInputSession r17, @m80.k androidx.compose.foundation.text.input.internal.TransformedTextFieldState r18, @m80.k androidx.compose.foundation.text.input.internal.TextLayoutState r19, @m80.k androidx.compose.ui.text.input.ImeOptions r20, @m80.l androidx.compose.foundation.content.internal.ReceiveContentConfiguration r21, @m80.l x00.l<? super androidx.compose.ui.text.input.ImeAction, yz.g2> r22, @m80.l x00.a<yz.g2> r23, @m80.k androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r24, @m80.l kotlinx.coroutines.flow.x<yz.g2> r25, @m80.l androidx.compose.ui.platform.ViewConfiguration r26, @m80.k j00.c<?> r27) {
        /*
            r0 = r27
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            if (r1 == 0) goto L15
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 == r4) goto L2f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2f:
            kotlin.e.n(r0)
            goto L5a
        L33:
            kotlin.e.n(r0)
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 r5 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3
            r16 = 0
            r10 = r17
            r7 = r18
            r8 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r9 = r24
            r6 = r25
            r15 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.label = r4
            java.lang.Object r0 = c40.s0.g(r5, r1)
            if (r0 != r2) goto L5a
            return r2
        L5a:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, x00.l, x00.a, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager, kotlinx.coroutines.flow.x, androidx.compose.ui.platform.ViewConfiguration, j00.c):java.lang.Object");
    }

    @VisibleForTesting
    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    private static final void logDebug(String str, x00.a<String> aVar) {
    }
}
