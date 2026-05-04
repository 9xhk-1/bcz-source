package com.igexin.c.a.c.a;

import com.igexin.sdk.IUserLoggerInterface;

/* loaded from: classes7.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37181a = "[GT-PUSH] ";

    /* renamed from: b, reason: collision with root package name */
    private IUserLoggerInterface f37182b;

    /* renamed from: c, reason: collision with root package name */
    private final StringBuffer f37183c = new StringBuffer();

    private void b() {
        if (this.f37183c.length() > 0) {
            if (this.f37183c.toString().contains("\n")) {
                for (String str : this.f37183c.toString().split("\n")) {
                    IUserLoggerInterface iUserLoggerInterface = this.f37182b;
                    if (iUserLoggerInterface != null) {
                        iUserLoggerInterface.log(f37181a.concat(String.valueOf(str)));
                    }
                }
            } else {
                this.f37182b.log(f37181a + this.f37183c.toString());
            }
            this.f37183c.setLength(0);
        }
    }

    @Override // com.igexin.c.a.c.a.b
    public final void a() {
        if (this.f37182b != null) {
            b();
        }
    }

    @Override // com.igexin.c.a.c.a.b
    public final void a(IUserLoggerInterface iUserLoggerInterface) {
        if (iUserLoggerInterface != null) {
            this.f37182b = iUserLoggerInterface;
        }
    }

    @Override // com.igexin.c.a.c.a.b
    public final void b(String str) {
        if (this.f37183c.length() + str.length() < 5120) {
            StringBuffer stringBuffer = this.f37183c;
            stringBuffer.append(str);
            stringBuffer.append("\n");
        } else {
            if (this.f37183c.length() > 5120 || this.f37183c.length() + 135 <= 5120) {
                return;
            }
            StringBuffer stringBuffer2 = this.f37183c;
            stringBuffer2.append("Warning! the log cache is too long to show the full content,we suggest you call initialize and setDebugLogger in a short time interval.");
            stringBuffer2.append("\n");
        }
    }

    @Override // com.igexin.c.a.c.a.b
    public final void a(String str) {
        if (this.f37182b != null) {
            b();
            this.f37182b.log(f37181a.concat(String.valueOf(str)));
            return;
        }
        if (this.f37183c.length() + str.length() < 5120) {
            StringBuffer stringBuffer = this.f37183c;
            stringBuffer.append(str);
            stringBuffer.append("\n");
        } else {
            if (this.f37183c.length() > 5120 || this.f37183c.length() + 135 <= 5120) {
                return;
            }
            StringBuffer stringBuffer2 = this.f37183c;
            stringBuffer2.append("Warning! the log cache is too long to show the full content,we suggest you call initialize and setDebugLogger in a short time interval.");
            stringBuffer2.append("\n");
        }
    }
}
