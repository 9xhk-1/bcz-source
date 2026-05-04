package com.meizu.cloud.pushsdk.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.igexin.sdk.PushConsts;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.d.b.a;
import com.meizu.cloud.pushsdk.d.b.b;
import com.meizu.cloud.pushsdk.d.b.f;
import com.meizu.cloud.pushsdk.d.e.a;
import com.meizu.cloud.pushsdk.d.e.c;
import com.meizu.cloud.pushsdk.d.f.e;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static com.meizu.cloud.pushsdk.d.e.a f39674a;

    /* renamed from: b, reason: collision with root package name */
    private static BroadcastReceiver f39675b;

    public static com.meizu.cloud.pushsdk.d.e.a a(Context context, com.meizu.cloud.pushsdk.c.c.a aVar, f fVar) {
        if (f39674a == null) {
            synchronized (a.class) {
                try {
                    if (f39674a == null) {
                        com.meizu.cloud.pushsdk.d.e.a a11 = a(b(context, aVar, fVar), (c) null, context);
                        f39674a = a11;
                        a(context, a11);
                    }
                } finally {
                }
            }
        }
        return f39674a;
    }

    private static com.meizu.cloud.pushsdk.d.b.a b(Context context, com.meizu.cloud.pushsdk.c.c.a aVar, f fVar) {
        a.C0476a a11 = new a.C0476a(a(), context, com.meizu.cloud.pushsdk.d.b.a.a.class).a(fVar).a(aVar).a(1);
        b bVar = b.DefaultGroup;
        return new com.meizu.cloud.pushsdk.d.b.a.a(a11.a(bVar).b(bVar.a()).c(2));
    }

    public static com.meizu.cloud.pushsdk.d.e.a a(Context context, boolean z11) {
        if (f39674a == null) {
            synchronized (a.class) {
                try {
                    if (f39674a == null) {
                        f39674a = a(b(context, null, null), (c) null, context);
                    }
                } finally {
                }
            }
        }
        DebugLogger.i("PushAndroidTracker", "can upload subject " + z11);
        if (z11) {
            f39674a.a(a(context));
        }
        return f39674a;
    }

    private static com.meizu.cloud.pushsdk.d.e.a a(com.meizu.cloud.pushsdk.d.b.a aVar, c cVar, Context context) {
        return new com.meizu.cloud.pushsdk.d.e.a.a(new a.C0479a(aVar, "PushAndroidTracker", context.getPackageCodePath(), context, com.meizu.cloud.pushsdk.d.e.a.a.class).a(com.meizu.cloud.pushsdk.d.f.b.VERBOSE).a(Boolean.FALSE).a(cVar).a(4));
    }

    private static c a(Context context) {
        return new c.a().a(context).a();
    }

    private static String a() {
        String str = MzSystemUtils.isOverseas() ? PushConstants.URL_ABROAD_STATICS_DOMAIN : PushConstants.URL_STATICS_DOMAIN;
        DebugLogger.e("QuickTracker", "current statics domain is " + str);
        return str;
    }

    private static void a(Context context, final com.meizu.cloud.pushsdk.d.e.a aVar) {
        if (f39675b != null) {
            return;
        }
        f39675b = new BroadcastReceiver() { // from class: com.meizu.cloud.pushsdk.d.a.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (e.a(context2)) {
                    com.meizu.cloud.pushsdk.d.f.c.a("QuickTracker", "restart track event: %s", "online true");
                    com.meizu.cloud.pushsdk.d.e.a.this.a();
                }
            }
        };
        context.registerReceiver(f39675b, new IntentFilter(PushConsts.ACTION_BROADCAST_NETWORK_CHANGE));
    }
}
