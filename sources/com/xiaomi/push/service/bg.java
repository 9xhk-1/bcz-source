package com.xiaomi.push.service;

import android.content.Context;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes8.dex */
public class bg {

    /* renamed from: a, reason: collision with root package name */
    private static bg f46279a;

    /* renamed from: a, reason: collision with other field name */
    private ConcurrentHashMap<String, HashMap<String, b>> f956a = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with other field name */
    private List<a> f955a = new ArrayList();

    public interface a {
        void a();
    }

    public static class b {

        /* renamed from: a, reason: collision with other field name */
        public Context f957a;

        /* renamed from: a, reason: collision with other field name */
        Messenger f959a;

        /* renamed from: a, reason: collision with other field name */
        private XMPushService f961a;

        /* renamed from: a, reason: collision with other field name */
        public j f964a;

        /* renamed from: a, reason: collision with other field name */
        public String f965a;

        /* renamed from: a, reason: collision with other field name */
        public boolean f967a;

        /* renamed from: b, reason: collision with other field name */
        public String f968b;

        /* renamed from: c, reason: collision with root package name */
        public String f46282c;

        /* renamed from: d, reason: collision with root package name */
        public String f46283d;

        /* renamed from: e, reason: collision with root package name */
        public String f46284e;

        /* renamed from: f, reason: collision with root package name */
        public String f46285f;

        /* renamed from: g, reason: collision with root package name */
        public String f46286g;

        /* renamed from: h, reason: collision with root package name */
        public String f46287h;

        /* renamed from: i, reason: collision with root package name */
        public String f46288i;

        /* renamed from: a, reason: collision with other field name */
        c f963a = c.unbind;

        /* renamed from: a, reason: collision with root package name */
        private int f46280a = 0;

        /* renamed from: a, reason: collision with other field name */
        private final CopyOnWriteArrayList<a> f966a = new CopyOnWriteArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        c f46281b = null;

        /* renamed from: b, reason: collision with other field name */
        private boolean f969b = false;

        /* renamed from: a, reason: collision with other field name */
        private XMPushService.c f960a = new XMPushService.c(this);

        /* renamed from: a, reason: collision with other field name */
        IBinder.DeathRecipient f958a = null;

        /* renamed from: a, reason: collision with other field name */
        final C0533b f962a = new C0533b();

        public interface a {
            void a(c cVar, c cVar2, int i11);
        }

        /* renamed from: com.xiaomi.push.service.bg$b$b, reason: collision with other inner class name */
        public class C0533b extends XMPushService.j {

            /* renamed from: a, reason: collision with other field name */
            String f970a;

            /* renamed from: b, reason: collision with root package name */
            int f46290b;

            /* renamed from: b, reason: collision with other field name */
            String f971b;

            /* renamed from: c, reason: collision with root package name */
            int f46291c;

            public C0533b() {
                super(0);
            }

            public XMPushService.j a(int i11, int i12, String str, String str2) {
                this.f46290b = i11;
                this.f46291c = i12;
                this.f971b = str2;
                this.f970a = str;
                return this;
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public String mo6216a() {
                return "notify job";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public void mo5933a() {
                if (b.this.a(this.f46290b, this.f46291c, this.f971b)) {
                    b.this.a(this.f46290b, this.f46291c, this.f970a, this.f971b);
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.b(" ignore notify client :" + b.this.f46286g);
            }
        }

        public class c implements IBinder.DeathRecipient {

            /* renamed from: a, reason: collision with root package name */
            final Messenger f46292a;

            /* renamed from: a, reason: collision with other field name */
            final b f972a;

            public c(b bVar, Messenger messenger) {
                this.f972a = bVar;
                this.f46292a = messenger;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                com.xiaomi.channel.commonutils.logger.b.b("peer died, chid = " + this.f972a.f46286g);
                b.this.f961a.a(new bi(this, 0), 0L);
                if (Constants.VIA_SHARE_TYPE_MINI_PROGRAM.equals(this.f972a.f46286g) && "com.xiaomi.xmsf".equals(b.this.f961a.getPackageName())) {
                    b.this.f961a.a(new bj(this, 0), 60000L);
                }
            }
        }

        public b() {
        }

        public long a() {
            return (((long) ((Math.random() * 20.0d) - 10.0d)) + ((this.f46280a + 1) * 15)) * 1000;
        }

        public void b(a aVar) {
            this.f966a.remove(aVar);
        }

        public b(XMPushService xMPushService) {
            this.f961a = xMPushService;
            a(new bh(this));
        }

        private boolean b(int i11, int i12, String str) {
            if (i11 == 1) {
                return (this.f963a == c.binded || !this.f961a.m6214c() || i12 == 21 || (i12 == 7 && "wait".equals(str))) ? false : true;
            }
            if (i11 == 2) {
                return this.f961a.m6214c();
            }
            if (i11 != 3) {
                return false;
            }
            return !"wait".equals(str);
        }

        public String a(int i11) {
            return i11 != 1 ? i11 != 2 ? i11 != 3 ? "unknown" : "KICK" : "CLOSE" : "OPEN";
        }

        public static String a(String str) {
            int lastIndexOf;
            return (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf("/")) == -1) ? "" : str.substring(lastIndexOf + 1);
        }

        /* renamed from: a, reason: collision with other method in class */
        public void m6260a() {
            try {
                Messenger messenger = this.f959a;
                if (messenger != null && this.f958a != null) {
                    messenger.getBinder().unlinkToDeath(this.f958a, 0);
                }
            } catch (Exception unused) {
            }
            this.f46281b = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i11, int i12, String str, String str2) {
            c cVar = this.f963a;
            this.f46281b = cVar;
            if (i11 == 2) {
                this.f964a.a(this.f957a, this, i12);
                return;
            }
            if (i11 == 3) {
                this.f964a.a(this.f957a, this, str2, str);
                return;
            }
            if (i11 == 1) {
                boolean z11 = cVar == c.binded;
                if (!z11 && "wait".equals(str2)) {
                    this.f46280a++;
                } else if (z11) {
                    this.f46280a = 0;
                    if (this.f959a != null) {
                        try {
                            this.f959a.send(Message.obtain(null, 16, this.f961a.f874a));
                        } catch (RemoteException unused) {
                        }
                    }
                }
                this.f964a.a(this.f961a, this, z11, i12, str);
            }
        }

        public void a(Messenger messenger) {
            m6260a();
            try {
                if (messenger != null) {
                    this.f959a = messenger;
                    this.f969b = true;
                    this.f958a = new c(this, messenger);
                    messenger.getBinder().linkToDeath(this.f958a, 0);
                    return;
                }
                com.xiaomi.channel.commonutils.logger.b.b("peer linked with old sdk chid = " + this.f46286g);
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.b("peer linkToDeath err: " + e11.getMessage());
                this.f959a = null;
                this.f969b = false;
            }
        }

        public void a(a aVar) {
            this.f966a.add(aVar);
        }

        public void a(c cVar, int i11, int i12, String str, String str2) {
            c cVar2;
            String str3;
            String str4;
            boolean z11;
            Iterator<a> it = this.f966a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next != null) {
                    next.a(this.f963a, cVar, i12);
                }
            }
            c cVar3 = this.f963a;
            if (cVar3 != cVar) {
                cVar2 = cVar;
                str3 = str;
                str4 = str2;
                com.xiaomi.channel.commonutils.logger.b.m5639a(String.format("update the client %7$s status. %1$s->%2$s %3$s %4$s %5$s %6$s", cVar3, cVar2, a(i11), bk.a(i12), str3, str4, this.f46286g));
                this.f963a = cVar2;
            } else {
                cVar2 = cVar;
                str3 = str;
                str4 = str2;
            }
            if (this.f964a == null) {
                com.xiaomi.channel.commonutils.logger.b.d("status changed while the client dispatcher is missing");
                return;
            }
            if (cVar2 == c.binding) {
                return;
            }
            int i13 = (this.f46281b == null || !(z11 = this.f969b)) ? 0 : (this.f959a == null || !z11) ? 10100 : 1000;
            this.f961a.b(this.f962a);
            if (b(i11, i12, str4)) {
                a(i11, i12, str3, str4);
            } else {
                this.f961a.a(this.f962a.a(i11, i12, str3, str4), i13);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(int i11, int i12, String str) {
            boolean z11;
            StringBuilder sb2;
            String str2;
            c cVar = this.f46281b;
            if (cVar == null || !(z11 = this.f969b)) {
                return true;
            }
            if (cVar == this.f963a) {
                sb2 = new StringBuilder();
                str2 = " status recovered, don't notify client:";
            } else {
                if (this.f959a != null && z11) {
                    com.xiaomi.channel.commonutils.logger.b.b("Peer alive notify status to client:" + this.f46286g);
                    return true;
                }
                sb2 = new StringBuilder();
                str2 = "peer died, ignore notify ";
            }
            sb2.append(str2);
            sb2.append(this.f46286g);
            com.xiaomi.channel.commonutils.logger.b.b(sb2.toString());
            return false;
        }
    }

    public enum c {
        unbind,
        binding,
        binded
    }

    private bg() {
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized int m6252a() {
        return this.f956a.size();
    }

    public synchronized void b() {
        this.f955a.clear();
    }

    public synchronized b a(String str, String str2) {
        HashMap<String, b> hashMap = this.f956a.get(str);
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(a(str2));
    }

    public static synchronized bg a() {
        bg bgVar;
        synchronized (bg.class) {
            try {
                if (f46279a == null) {
                    f46279a = new bg();
                }
                bgVar = f46279a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bgVar;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(EmailAutoCompleteEditText.f17091d);
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized ArrayList<b> m6253a() {
        ArrayList<b> arrayList;
        arrayList = new ArrayList<>();
        Iterator<HashMap<String, b>> it = this.f956a.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().values());
        }
        return arrayList;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized Collection<b> m6254a(String str) {
        if (this.f956a.containsKey(str)) {
            return ((HashMap) this.f956a.get(str).clone()).values();
        }
        return new ArrayList();
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized List<String> m6255a(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<HashMap<String, b>> it = this.f956a.values().iterator();
        while (it.hasNext()) {
            for (b bVar : it.next().values()) {
                if (str.equals(bVar.f965a)) {
                    arrayList.add(bVar.f46286g);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m6256a() {
        try {
            Iterator<b> it = m6253a().iterator();
            while (it.hasNext()) {
                it.next().m6260a();
            }
            this.f956a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(Context context) {
        Iterator<HashMap<String, b>> it = this.f956a.values().iterator();
        while (it.hasNext()) {
            Iterator<b> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                it2.next().a(c.unbind, 1, 3, (String) null, (String) null);
            }
        }
    }

    public synchronized void a(Context context, int i11) {
        Iterator<HashMap<String, b>> it = this.f956a.values().iterator();
        while (it.hasNext()) {
            Iterator<b> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                int i12 = i11;
                it2.next().a(c.unbind, 2, i12, (String) null, (String) null);
                i11 = i12;
            }
        }
    }

    public synchronized void a(a aVar) {
        this.f955a.add(aVar);
    }

    public synchronized void a(b bVar) {
        try {
            HashMap<String, b> hashMap = this.f956a.get(bVar.f46286g);
            if (hashMap == null) {
                hashMap = new HashMap<>();
                this.f956a.put(bVar.f46286g, hashMap);
            }
            hashMap.put(a(bVar.f968b), bVar);
            com.xiaomi.channel.commonutils.logger.b.m5639a("add active client. " + bVar.f965a);
            Iterator<a> it = this.f955a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m6257a(String str) {
        try {
            HashMap<String, b> hashMap = this.f956a.get(str);
            if (hashMap != null) {
                Iterator<b> it = hashMap.values().iterator();
                while (it.hasNext()) {
                    it.next().m6260a();
                }
                hashMap.clear();
                this.f956a.remove(str);
            }
            Iterator<a> it2 = this.f955a.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m6258a(String str, String str2) {
        try {
            HashMap<String, b> hashMap = this.f956a.get(str);
            if (hashMap != null) {
                b bVar = hashMap.get(a(str2));
                if (bVar != null) {
                    bVar.m6260a();
                }
                hashMap.remove(a(str2));
                if (hashMap.isEmpty()) {
                    this.f956a.remove(str);
                }
            }
            Iterator<a> it = this.f955a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
