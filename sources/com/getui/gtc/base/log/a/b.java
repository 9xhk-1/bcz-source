package com.getui.gtc.base.log.a;

import com.getui.gtc.base.log.ILogController;
import com.getui.gtc.base.log.ILogFormatter;

/* loaded from: classes6.dex */
public final class b implements ILogController {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29805a;

    /* renamed from: b, reason: collision with root package name */
    private ILogFormatter f29806b;

    public b() {
        this(new com.getui.gtc.base.log.c.b());
    }

    @Override // com.getui.gtc.base.log.ILogController
    public final boolean isLoggable(int i11, String str) {
        int i12 = i11 & 240;
        if (i12 == 0 || i12 == 16) {
            return this.f29805a;
        }
        return false;
    }

    @Override // com.getui.gtc.base.log.ILogController
    public final void log(int i11, String str, String str2, Throwable th2) {
        if ((i11 & 240) != 0) {
            i11 &= 15;
        }
        this.f29806b.log(i11, str, str2, th2);
    }

    public b(ILogFormatter iLogFormatter) {
        this.f29805a = true;
        this.f29806b = (ILogFormatter) com.getui.gtc.base.log.e.a.a(iLogFormatter);
    }
}
