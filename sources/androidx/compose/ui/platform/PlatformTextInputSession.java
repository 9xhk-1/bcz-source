package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface PlatformTextInputSession {
    @m80.k
    View getView();

    @m80.l
    Object startInputMethod(@m80.k PlatformTextInputMethodRequest platformTextInputMethodRequest, @m80.k j00.c<?> cVar);
}
