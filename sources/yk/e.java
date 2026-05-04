package yk;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import yk.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f100167a = "ConnectivityMonitor";

    /* renamed from: b, reason: collision with root package name */
    public static final String f100168b = "android.permission.ACCESS_NETWORK_STATE";

    @Override // yk.c
    @NonNull
    public b a(@NonNull Context context, @NonNull b.a aVar) {
        boolean z11 = ContextCompat.checkSelfPermission(context, f100168b) == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z11 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z11 ? new d(context, aVar) : new n();
    }
}
