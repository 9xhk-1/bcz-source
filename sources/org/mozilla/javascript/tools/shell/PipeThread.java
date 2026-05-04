package org.mozilla.javascript.tools.shell;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.mozilla.javascript.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class PipeThread extends Thread {
    private InputStream from;
    private boolean fromProcess;

    /* renamed from: to, reason: collision with root package name */
    private OutputStream f78412to;

    public PipeThread(boolean z11, InputStream inputStream, OutputStream outputStream) {
        setDaemon(true);
        this.fromProcess = z11;
        this.from = inputStream;
        this.f78412to = outputStream;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            Global.pipe(this.fromProcess, this.from, this.f78412to);
        } catch (IOException e11) {
            throw Context.throwAsScriptRuntimeEx(e11);
        }
    }
}
