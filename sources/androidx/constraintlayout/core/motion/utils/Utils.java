package androidx.constraintlayout.core.motion.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Utils {
    static DebugHandle sOurHandle;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface DebugHandle {
        void message(String str);
    }

    private static int clamp(int i11) {
        int i12 = (i11 & (~(i11 >> 31))) - 255;
        return (i12 & (i12 >> 31)) + 255;
    }

    public static void log(String str, String str2) {
        System.out.println(str + " : " + str2);
    }

    public static void logStack(String str, int i11) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i11, stackTrace.length - 1);
        String str2 = " ";
        for (int i12 = 1; i12 <= min; i12++) {
            StackTraceElement stackTraceElement = stackTrace[i12];
            String str3 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName();
            str2 = str2 + " ";
            System.out.println(str + str2 + str3 + str2);
        }
    }

    public static void loge(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static int rgbaTocColor(float f11, float f12, float f13, float f14) {
        int clamp = clamp((int) (f11 * 255.0f));
        int clamp2 = clamp((int) (f12 * 255.0f));
        return (clamp << 16) | (clamp((int) (f14 * 255.0f)) << 24) | (clamp2 << 8) | clamp((int) (f13 * 255.0f));
    }

    public static void setDebugHandle(DebugHandle debugHandle) {
        sOurHandle = debugHandle;
    }

    public static void socketSend(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e11) {
            System.err.println(e11.toString() + "\n" + Arrays.toString(e11.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public static void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String substring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + j.f81007d + "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + substring;
        System.out.println(str2 + " " + str);
        DebugHandle debugHandle = sOurHandle;
        if (debugHandle != null) {
            debugHandle.message(str2 + " " + str);
        }
    }
}
