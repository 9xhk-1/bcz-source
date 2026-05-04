package gw;

import android.util.Log;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f57829a = false;

    public static void a(String str, String str2) {
        if (f57829a) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            Log.d(str, (stackTraceElement.getFileName() + j.f81006c + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + ": " + str2);
        }
    }

    public static void b(String str, String str2) {
        if (f57829a) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            Log.e(str, (stackTraceElement.getFileName() + j.f81006c + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + ": " + str2);
        }
    }
}
