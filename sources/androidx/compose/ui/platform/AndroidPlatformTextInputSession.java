package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.text.input.TextInputService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, c40.r0 {
    public static final int $stable = 8;

    @m80.k
    private final c40.r0 coroutineScope;

    @m80.k
    private final AtomicReference<SessionMutex.Session<Object>> methodSessionMutex = SessionMutex.m2088constructorimpl();

    @m80.k
    private final TextInputService textInputService;

    @m80.k
    private final View view;

    public AndroidPlatformTextInputSession(@m80.k View view, @m80.k TextInputService textInputService, @m80.k c40.r0 r0Var) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = r0Var;
    }

    @m80.l
    public final InputConnection createInputConnection(@m80.k EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m2092getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    @m80.k
    public View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m2092getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startInputMethod(@m80.k final androidx.compose.ui.platform.PlatformTextInputMethodRequest r6, @m80.k j00.c<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
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
            kotlin.e.n(r7)
            goto L4a
        L31:
            kotlin.e.n(r7)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<java.lang.Object>> r7 = r5.methodSessionMutex
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r2 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r2.<init>()
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r4 = 0
            r6.<init>(r5, r4)
            r0.label = r3
            java.lang.Object r6 = androidx.compose.ui.SessionMutex.m2095withSessionCancellingPreviousimpl(r7, r2, r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, j00.c):java.lang.Object");
    }
}
