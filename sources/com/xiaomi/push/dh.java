package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.LoggerInterface;

/* loaded from: classes8.dex */
public class dh implements LoggerInterface {

    /* renamed from: a, reason: collision with root package name */
    private LoggerInterface f45387a;

    /* renamed from: b, reason: collision with root package name */
    private LoggerInterface f45388b;

    public dh(LoggerInterface loggerInterface, LoggerInterface loggerInterface2) {
        this.f45387a = loggerInterface;
        this.f45388b = loggerInterface2;
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str) {
        LoggerInterface loggerInterface = this.f45387a;
        if (loggerInterface != null) {
            loggerInterface.log(str);
        }
        LoggerInterface loggerInterface2 = this.f45388b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str, Throwable th2) {
        LoggerInterface loggerInterface = this.f45387a;
        if (loggerInterface != null) {
            loggerInterface.log(str, th2);
        }
        LoggerInterface loggerInterface2 = this.f45388b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str, th2);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void setTag(String str) {
    }
}
