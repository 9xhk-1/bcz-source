package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes8.dex */
public class gg extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private gp f45617a;

    /* renamed from: a, reason: collision with other field name */
    private gq f463a;

    /* renamed from: a, reason: collision with other field name */
    private Throwable f464a;

    public gg() {
        this.f45617a = null;
        this.f463a = null;
        this.f464a = null;
    }

    public Throwable a() {
        return this.f464a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        gp gpVar;
        gq gqVar;
        String message = super.getMessage();
        return (message != null || (gqVar = this.f463a) == null) ? (message != null || (gpVar = this.f45617a) == null) ? message : gpVar.toString() : gqVar.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(": ");
        }
        gq gqVar = this.f463a;
        if (gqVar != null) {
            sb2.append(gqVar);
        }
        gp gpVar = this.f45617a;
        if (gpVar != null) {
            sb2.append(gpVar);
        }
        if (this.f464a != null) {
            sb2.append("\n  -- caused by: ");
            sb2.append(this.f464a);
        }
        return sb2.toString();
    }

    public gg(gp gpVar) {
        this.f463a = null;
        this.f464a = null;
        this.f45617a = gpVar;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f464a != null) {
            printStream.println("Nested Exception: ");
            this.f464a.printStackTrace(printStream);
        }
    }

    public gg(String str) {
        super(str);
        this.f45617a = null;
        this.f463a = null;
        this.f464a = null;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f464a != null) {
            printWriter.println("Nested Exception: ");
            this.f464a.printStackTrace(printWriter);
        }
    }

    public gg(String str, Throwable th2) {
        super(str);
        this.f45617a = null;
        this.f463a = null;
        this.f464a = th2;
    }

    public gg(Throwable th2) {
        this.f45617a = null;
        this.f463a = null;
        this.f464a = th2;
    }
}
