package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 extends FunctionReferenceImpl implements x00.l<View, InputMethodManagerImpl> {
    public static final LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 INSTANCE = new LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1();

    public LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1() {
        super(1, InputMethodManagerImpl.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }

    @Override // x00.l
    public final InputMethodManagerImpl invoke(View view) {
        return new InputMethodManagerImpl(view);
    }
}
