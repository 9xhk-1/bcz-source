package org.mozilla.javascript.tools.debugger;

import org.mozilla.javascript.tools.debugger.Dim;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class RunProxy implements Runnable {
    static final int ENTER_INTERRUPT = 4;
    static final int LOAD_FILE = 2;
    static final int OPEN_FILE = 1;
    static final int UPDATE_SOURCE_TEXT = 3;
    String alertMessage;
    private SwingGui debugGui;
    String fileName;
    Dim.StackFrame lastFrame;
    Dim.SourceInfo sourceInfo;
    String text;
    String threadTitle;
    private int type;

    public RunProxy(SwingGui swingGui, int i11) {
        this.debugGui = swingGui;
        this.type = i11;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i11 = this.type;
        if (i11 == 1) {
            try {
                this.debugGui.dim.compileScript(this.fileName, this.text);
                return;
            } catch (RuntimeException e11) {
                MessageDialogWrapper.showMessageDialog(this.debugGui, e11.getMessage(), "Error Compiling " + this.fileName, 0);
                return;
            }
        }
        if (i11 == 2) {
            try {
                this.debugGui.dim.evalScript(this.fileName, this.text);
                return;
            } catch (RuntimeException e12) {
                MessageDialogWrapper.showMessageDialog(this.debugGui, e12.getMessage(), "Run error for " + this.fileName, 0);
                return;
            }
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalArgumentException(String.valueOf(this.type));
            }
            this.debugGui.enterInterruptImpl(this.lastFrame, this.threadTitle, this.alertMessage);
        } else {
            String url = this.sourceInfo.url();
            if (this.debugGui.updateFileWindow(this.sourceInfo) || url.equals("<stdin>")) {
                return;
            }
            this.debugGui.createFileWindow(this.sourceInfo, -1);
        }
    }
}
