package com.tencent.open.log;

import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class e extends Tracer {

    /* renamed from: a, reason: collision with root package name */
    public static final e f44559a = new e();

    @Override // com.tencent.open.log.Tracer
    public void doTrace(int i11, Thread thread, long j11, String str, String str2, Throwable th2) {
        if (i11 == 1) {
            Log.v(str, str2, th2);
            return;
        }
        if (i11 == 2) {
            Log.d(str, str2, th2);
            return;
        }
        if (i11 == 4) {
            Log.i(str, str2, th2);
            return;
        }
        if (i11 == 8) {
            Log.w(str, str2, th2);
        } else if (i11 == 16) {
            Log.e(str, str2, th2);
        } else {
            if (i11 != 32) {
                return;
            }
            Log.e(str, str2, th2);
        }
    }
}
