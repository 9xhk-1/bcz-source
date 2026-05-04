package com.meizu.cloud.pushsdk;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a.d;
import com.meizu.cloud.pushsdk.handler.a.e;
import com.meizu.cloud.pushsdk.handler.a.f;
import com.meizu.cloud.pushsdk.handler.c;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f39340b;

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<c> f39341a;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, com.meizu.cloud.pushsdk.handler.a> f39342c;

    /* renamed from: d, reason: collision with root package name */
    private com.meizu.cloud.pushsdk.handler.a.f.a f39343d;

    /* renamed from: e, reason: collision with root package name */
    private com.meizu.cloud.pushsdk.handler.a.a.a f39344e;

    public class a extends com.meizu.cloud.pushsdk.handler.a {
        public a() {
        }

        @Override // com.meizu.cloud.pushsdk.handler.a
        public void a(Context context, Intent intent) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.a(context, intent);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void b(Context context, MzPushMessage mzPushMessage) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.b(context, mzPushMessage);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void c(Context context, MzPushMessage mzPushMessage) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.c(context, mzPushMessage);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, MzPushMessage mzPushMessage) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.a(context, mzPushMessage);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void b(Context context, String str) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.b(context, str);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void c(Context context, String str) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.c(context, str);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, PushSwitchStatus pushSwitchStatus) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.a(context, pushSwitchStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, RegisterStatus registerStatus) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.a(context, registerStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, SubAliasStatus subAliasStatus) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.a(context, subAliasStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, SubTagsStatus subTagsStatus) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.a(context, subTagsStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, UnRegisterStatus unRegisterStatus) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.a(context, unRegisterStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, String str) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.a(context, str);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, String str, String str2) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.a(context, str, str2);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, boolean z11) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.a(context, z11);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(PushNotificationBuilder pushNotificationBuilder) {
            Iterator it = b.this.f39342c.entrySet().iterator();
            while (it.hasNext()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) ((Map.Entry) it.next()).getValue();
                if (aVar != null) {
                    aVar.a(pushNotificationBuilder);
                }
            }
        }
    }

    public b(Context context) {
        this(context, null);
    }

    public static b a(Context context) {
        if (f39340b == null) {
            synchronized (b.class) {
                try {
                    if (f39340b == null) {
                        DebugLogger.i("PushMessageProxy", "PushMessageProxy init");
                        f39340b = new b(context);
                    }
                } finally {
                }
            }
        }
        return f39340b;
    }

    public com.meizu.cloud.pushsdk.handler.a.a.a b() {
        return this.f39344e;
    }

    public b(Context context, List<c> list) {
        this(context, list, null);
    }

    public b a(c cVar) {
        this.f39341a.put(cVar.a(), cVar);
        return this;
    }

    public b(Context context, List<c> list, com.meizu.cloud.pushsdk.handler.a aVar) {
        this.f39341a = new SparseArray<>();
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null.");
        }
        Context applicationContext = context.getApplicationContext();
        this.f39342c = new HashMap();
        a aVar2 = new a();
        if (PushConstants.PUSH_PACKAGE_NAME.equalsIgnoreCase(applicationContext.getPackageName())) {
            this.f39343d = new com.meizu.cloud.pushsdk.handler.a.f.a(applicationContext);
            if (MinSdkChecker.isSupportNotificationSort()) {
                this.f39344e = new com.meizu.cloud.pushsdk.handler.a.a.a(applicationContext);
            }
        }
        if (list != null) {
            a(list);
            return;
        }
        a(new com.meizu.cloud.pushsdk.handler.a.c(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.b(applicationContext, aVar2));
        a(new e(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.b(applicationContext, aVar2));
        a(new d(applicationContext, aVar2));
        a(new f(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.d(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.a(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.c(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.f(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.d(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.e(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.f.c(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.e.b(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.e(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.b.a(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.a(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.f(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.f.b(applicationContext, aVar2));
        a(new com.meizu.cloud.pushsdk.handler.a.d.c(applicationContext, aVar2));
    }

    public b a(String str, com.meizu.cloud.pushsdk.handler.a aVar) {
        this.f39342c.put(str, aVar);
        return this;
    }

    public b a(List<c> list) {
        if (list == null) {
            throw new IllegalArgumentException("messageManagerList must not be null.");
        }
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public com.meizu.cloud.pushsdk.handler.a.f.a a() {
        return this.f39343d;
    }

    public void a(Intent intent) {
        DebugLogger.e("PushMessageProxy", "process message start");
        try {
            DebugLogger.i("PushMessageProxy", "receive action " + intent.getAction() + " method " + intent.getStringExtra("method"));
            for (int i11 = 0; i11 < this.f39341a.size() && !this.f39341a.valueAt(i11).b(intent); i11++) {
            }
        } catch (Exception e11) {
            DebugLogger.e("PushMessageProxy", "process message error " + e11.getMessage());
        }
    }
}
