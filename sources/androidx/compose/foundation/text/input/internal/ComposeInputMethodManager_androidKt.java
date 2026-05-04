package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ComposeInputMethodManager_androidKt {

    @m80.k
    private static x00.l<? super View, ? extends ComposeInputMethodManager> ComposeInputMethodManagerFactory = new x00.l<View, ComposeInputMethodManager>() { // from class: androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1
        @Override // x00.l
        public final ComposeInputMethodManager invoke(View view) {
            return Build.VERSION.SDK_INT >= 34 ? new ComposeInputMethodManagerImplApi34(view) : new ComposeInputMethodManagerImplApi24(view);
        }
    };

    @m80.k
    public static final ComposeInputMethodManager ComposeInputMethodManager(@m80.k View view) {
        return ComposeInputMethodManagerFactory.invoke(view);
    }

    @VisibleForTesting
    @m80.k
    @m80.o
    public static final x00.l<View, ComposeInputMethodManager> overrideComposeInputMethodManagerFactoryForTests(@m80.k x00.l<? super View, ? extends ComposeInputMethodManager> lVar) {
        x00.l lVar2 = ComposeInputMethodManagerFactory;
        ComposeInputMethodManagerFactory = lVar;
        return lVar2;
    }
}
