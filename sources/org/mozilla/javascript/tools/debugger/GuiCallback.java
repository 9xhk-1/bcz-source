package org.mozilla.javascript.tools.debugger;

import org.mozilla.javascript.tools.debugger.Dim;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface GuiCallback {
    void dispatchNextGuiEvent() throws InterruptedException;

    void enterInterrupt(Dim.StackFrame stackFrame, String str, String str2);

    boolean isGuiEventThread();

    void updateSourceText(Dim.SourceInfo sourceInfo);
}
