package com.mob.commons.cc;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes7.dex */
public class m extends RuntimeException {
    public m(String str, String str2, int i11) {
        super(str + "\r\n\tat: " + str2 + " (" + i11 + pn.j.f81007d);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStream.println("Suba Runtime Error: " + getMessage());
    }

    public m(m mVar, String str, int i11) {
        super(mVar.getMessage() + "\r\n\tat: " + str + " (" + i11 + pn.j.f81007d, mVar.getCause());
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printWriter.println("Suba Runtime Error: " + getMessage());
    }

    public m(Throwable th2, String str, int i11) {
        super(th2.getMessage() + "\r\n\tat: " + str + " (" + i11 + pn.j.f81007d, th2);
    }
}
