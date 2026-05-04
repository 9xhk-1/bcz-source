package mq;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f73654f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final int f73655g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static j f73656h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f73657a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f73658b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f73659c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f73660d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final Handler f73661e;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                j.this.b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f73663a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<c> f73664b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f73663a = intent;
            this.f73664b = arrayList;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final IntentFilter f73665a;

        /* renamed from: b, reason: collision with root package name */
        public final BroadcastReceiver f73666b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f73667c;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f73665a = intentFilter;
            this.f73666b = broadcastReceiver;
        }

        public String toString() {
            return "Receiver{" + this.f73666b + " filter=" + this.f73665a + com.alipay.sdk.m.u.i.f11099d;
        }
    }

    public j(Context context) {
        this.f73657a = context;
        this.f73661e = new a(context.getMainLooper());
    }

    public static j c(Context context) {
        j jVar;
        synchronized (f73654f) {
            try {
                if (f73656h == null) {
                    f73656h = new j(context.getApplicationContext());
                }
                jVar = f73656h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public final void b() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f73658b) {
                try {
                    size = this.f73660d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f73660d.toArray(bVarArr);
                    this.f73660d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = bVarArr[i11];
                for (int i12 = 0; i12 < bVar.f73664b.size(); i12++) {
                    bVar.f73664b.get(i12).f73666b.onReceive(this.f73657a, bVar.f73663a);
                }
            }
        }
    }

    public void d(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f73658b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<IntentFilter> arrayList = this.f73658b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f73658b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i11 = 0; i11 < intentFilter.countActions(); i11++) {
                    String action = intentFilter.getAction(i11);
                    ArrayList<c> arrayList2 = this.f73659c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f73659c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean e(Intent intent) {
        synchronized (this.f73658b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f73657a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                ArrayList<c> arrayList = this.f73659c.get(intent.getAction());
                if (arrayList != null) {
                    ArrayList arrayList2 = null;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        c cVar = arrayList.get(i11);
                        if (!cVar.f73667c && cVar.f73665a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager") >= 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(cVar);
                            cVar.f73667c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            ((c) arrayList2.get(i12)).f73667c = false;
                        }
                        this.f73660d.add(new b(intent, arrayList2));
                        if (!this.f73661e.hasMessages(1)) {
                            this.f73661e.sendEmptyMessage(1);
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

    public void f(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f73658b) {
            try {
                ArrayList<IntentFilter> remove = this.f73658b.remove(broadcastReceiver);
                if (remove != null) {
                    for (int i11 = 0; i11 < remove.size(); i11++) {
                        IntentFilter intentFilter = remove.get(i11);
                        for (int i12 = 0; i12 < intentFilter.countActions(); i12++) {
                            String action = intentFilter.getAction(i12);
                            ArrayList<c> arrayList = this.f73659c.get(action);
                            if (arrayList != null) {
                                int i13 = 0;
                                while (i13 < arrayList.size()) {
                                    if (arrayList.get(i13).f73666b == broadcastReceiver) {
                                        arrayList.remove(i13);
                                        i13--;
                                    }
                                    i13++;
                                }
                                if (arrayList.size() <= 0) {
                                    this.f73659c.remove(action);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
