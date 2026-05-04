package com.baicizhan.main.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import com.igexin.sdk.PushConsts;
import i80.c;
import rb.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class NetworkChangeReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24795a = "NetworkChangeReceiver";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f24796a;

        public a(int networkType) {
            this.f24796a = networkType;
        }
    }

    public static void a(Context context) {
        c.f().q(new a(d.b(context)));
    }

    public static void b(Context context, NetworkChangeReceiver receiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE);
        ContextCompat.registerReceiver(context, receiver, intentFilter, 2);
    }

    public static void c(Context context, NetworkChangeReceiver receiver) {
        context.unregisterReceiver(receiver);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        qb.c.i(f24795a, "onReceive %s", intent.toString());
        a(context);
    }
}
