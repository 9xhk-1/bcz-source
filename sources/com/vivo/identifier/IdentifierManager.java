package com.vivo.identifier;

import android.content.Context;

/* loaded from: classes6.dex */
public class IdentifierManager {
    public static native String getAAID(Context context);

    public static native String getAAID(Context context, String str);

    public static native String getOAID(Context context);

    public static native String getOAIDStatus(Context context);

    public static native String getVAID(Context context);

    public static native String getVAID(Context context, String str);

    public static native boolean isSupported(Context context);

    public static native boolean setDebuggable(boolean z11);
}
