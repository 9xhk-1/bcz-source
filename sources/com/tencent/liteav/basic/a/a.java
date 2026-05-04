package com.tencent.liteav.basic.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.alipay.sdk.m.u.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f43114f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static a f43115g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f43116a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f43117b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<b>> f43118c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<C0510a> f43119d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f43120e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.tencent.liteav.basic.a.a$a, reason: collision with other inner class name */
    public static class C0510a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f43122a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<b> f43123b;

        public C0510a(Intent intent, ArrayList<b> arrayList) {
            this.f43122a = intent;
            this.f43123b = arrayList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f43124a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f43125b;

        /* renamed from: c, reason: collision with root package name */
        boolean f43126c;

        public b(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f43124a = intentFilter;
            this.f43125b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f43125b);
            sb2.append(" filter=");
            sb2.append(this.f43124a);
            sb2.append(i.f11099d);
            return sb2.toString();
        }
    }

    private a(Context context) {
        this.f43116a = context;
        this.f43120e = new Handler(context.getMainLooper()) { // from class: com.tencent.liteav.basic.a.a.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    a.this.a();
                }
            }
        };
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f43114f) {
            try {
                if (f43115g == null) {
                    f43115g = new a(context.getApplicationContext());
                }
                aVar = f43115g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f43117b) {
            try {
                b bVar = new b(intentFilter, broadcastReceiver);
                ArrayList<IntentFilter> arrayList = this.f43117b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f43117b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                    String action = intentFilter.getAction(i11);
                    ArrayList<b> arrayList2 = this.f43118c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f43118c.put(action, arrayList2);
                    }
                    arrayList2.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f43117b) {
            try {
                ArrayList<IntentFilter> remove = this.f43117b.remove(broadcastReceiver);
                if (remove == null) {
                    return;
                }
                for (int i11 = 0; i11 < remove.size(); i11++) {
                    IntentFilter intentFilter = remove.get(i11);
                    for (int i12 = 0; i12 < intentFilter.countActions(); i12++) {
                        String action = intentFilter.getAction(i12);
                        ArrayList<b> arrayList = this.f43118c.get(action);
                        if (arrayList != null) {
                            int i13 = 0;
                            while (i13 < arrayList.size()) {
                                if (arrayList.get(i13).f43125b == broadcastReceiver) {
                                    arrayList.remove(i13);
                                    i13--;
                                }
                                i13++;
                            }
                            if (arrayList.size() <= 0) {
                                this.f43118c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(Intent intent) {
        String str;
        String str2;
        synchronized (this.f43117b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f43116a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z11 = (intent.getFlags() & 8) != 0;
                if (z11) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<b> arrayList = this.f43118c.get(intent.getAction());
                if (arrayList != null) {
                    if (z11) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i11 = 0;
                    while (i11 < arrayList.size()) {
                        b bVar = arrayList.get(i11);
                        if (z11) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f43124a);
                        }
                        if (bVar.f43126c) {
                            if (z11) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            str = action;
                        } else {
                            int match = bVar.f43124a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (z11) {
                                    StringBuilder sb2 = new StringBuilder();
                                    str = action;
                                    sb2.append("  Filter matched!  match=0x");
                                    sb2.append(Integer.toHexString(match));
                                    Log.v("LocalBroadcastManager", sb2.toString());
                                } else {
                                    str = action;
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(bVar);
                                bVar.f43126c = true;
                            } else {
                                str = action;
                                if (z11) {
                                    if (match == -4) {
                                        str2 = za.a.f102442j;
                                    } else if (match == -3) {
                                        str2 = "action";
                                    } else if (match == -2) {
                                        str2 = "data";
                                    } else if (match != -1) {
                                        str2 = "unknown reason";
                                    } else {
                                        str2 = "type";
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                                }
                            }
                        }
                        i11++;
                        action = str;
                    }
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            ((b) arrayList2.get(i12)).f43126c = false;
                        }
                        this.f43119d.add(new C0510a(intent, arrayList2));
                        if (!this.f43120e.hasMessages(1)) {
                            this.f43120e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        int size;
        C0510a[] c0510aArr;
        while (true) {
            synchronized (this.f43117b) {
                try {
                    size = this.f43119d.size();
                    if (size <= 0) {
                        return;
                    }
                    c0510aArr = new C0510a[size];
                    this.f43119d.toArray(c0510aArr);
                    this.f43119d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i11 = 0; i11 < size; i11++) {
                C0510a c0510a = c0510aArr[i11];
                for (int i12 = 0; i12 < c0510a.f43123b.size(); i12++) {
                    c0510a.f43123b.get(i12).f43125b.onReceive(this.f43116a, c0510a.f43122a);
                }
            }
        }
    }
}
