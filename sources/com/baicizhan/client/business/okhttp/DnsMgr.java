package com.baicizhan.client.business.okhttp;

import a00.h0;
import a00.m0;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.thrift.h;
import com.baicizhan.client.business.util.BczJson;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m00.c;
import m80.k;
import nc.b;
import t50.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDnsMgr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DnsMgr.kt\ncom/baicizhan/client/business/okhttp/DnsMgr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1#2:92\n1803#3,3:93\n*S KotlinDebug\n*F\n+ 1 DnsMgr.kt\ncom/baicizhan/client/business/okhttp/DnsMgr\n*L\n36#1:93,3\n*E\n"})
/* loaded from: classes4.dex */
public final class DnsMgr {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final DnsMgr f16538a = new DnsMgr();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f16539b = "DnsMgr";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Set<String> f16540c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final List<String> f16541d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final Map<String, List<String>> f16542e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final l f16543f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f16544g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TestServer {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ TestServer[] $VALUES;
        public static final TestServer NONE = new TestServer("NONE", 0);
        public static final TestServer Test1 = new TestServer("Test1", 1);
        public static final TestServer Test2 = new TestServer("Test2", 2);

        private static final /* synthetic */ TestServer[] $values() {
            return new TestServer[]{NONE, Test1, Test2};
        }

        static {
            TestServer[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private TestServer(String str, int i11) {
        }

        @k
        public static m00.a<TestServer> getEntries() {
            return $ENTRIES;
        }

        public static TestServer valueOf(String str) {
            return (TestServer) Enum.valueOf(TestServer.class, str);
        }

        public static TestServer[] values() {
            return (TestServer[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDnsMgr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DnsMgr.kt\ncom/baicizhan/client/business/okhttp/DnsMgr$bczDns$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1803#2,2:92\n1805#2:98\n13216#3,2:94\n13218#3:97\n13216#3,3:99\n1#4:96\n*S KotlinDebug\n*F\n+ 1 DnsMgr.kt\ncom/baicizhan/client/business/okhttp/DnsMgr$bczDns$1\n*L\n70#1:92,2\n70#1:98\n71#1:94,2\n71#1:97\n85#1:99,3\n*E\n"})
    public static final class a implements l {
        @Override // t50.l
        public List<InetAddress> a(String hostname) {
            g0.p(hostname, "hostname");
            List<InetAddress> c11 = c(hostname);
            if (c11 != null) {
                return c11;
            }
            List<InetAddress> b11 = b(hostname);
            return b11 != null ? b11 : l.f89627b.a(hostname);
        }

        public final List<InetAddress> b(String str) {
            List list = (List) DnsMgr.f16542e.get(str);
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InetAddress[] allByName = InetAddress.getAllByName((String) it.next());
                if (allByName != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (InetAddress inetAddress : allByName) {
                        g0.m(inetAddress);
                        arrayList2.add(inetAddress);
                    }
                    arrayList.addAll(arrayList2);
                }
            }
            return arrayList;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
        
            if (r1.compareTo(r2) >= 0) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<java.net.InetAddress> c(java.lang.String r6) {
            /*
                r5 = this;
                com.baicizhan.client.business.okhttp.DnsMgr r0 = com.baicizhan.client.business.okhttp.DnsMgr.f16538a
                com.baicizhan.client.business.okhttp.DnsMgr$TestServer r1 = r0.e()
                com.baicizhan.client.business.debug.DebugConfig r2 = com.baicizhan.client.business.debug.DebugConfig.getsIntance()
                boolean r2 = r2.enable
                r3 = 0
                if (r2 == 0) goto L20
                com.baicizhan.client.business.okhttp.DnsMgr$TestServer r2 = com.baicizhan.client.business.okhttp.DnsMgr.TestServer.Test1
                com.baicizhan.client.business.okhttp.DnsMgr$TestServer r4 = com.baicizhan.client.business.okhttp.DnsMgr.TestServer.Test2
                int r4 = r1.compareTo(r4)
                if (r4 > 0) goto L20
                int r2 = r1.compareTo(r2)
                if (r2 < 0) goto L20
                goto L21
            L20:
                r1 = r3
            L21:
                if (r1 == 0) goto L5e
                java.util.Set r2 = com.baicizhan.client.business.okhttp.DnsMgr.b()
                boolean r6 = r2.contains(r6)
                if (r6 == 0) goto L2e
                goto L2f
            L2e:
                r1 = r3
            L2f:
                if (r1 == 0) goto L5e
                java.util.List r6 = r0.d()
                int r0 = r1.ordinal()
                int r0 = r0 + (-1)
                java.lang.Object r6 = r6.get(r0)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 == 0) goto L5e
                java.net.InetAddress[] r6 = java.net.InetAddress.getAllByName(r6)
                if (r6 == 0) goto L5e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = r6.length
                r2 = 0
            L50:
                if (r2 >= r1) goto L5d
                r3 = r6[r2]
                kotlin.jvm.internal.g0.m(r3)
                r0.add(r3)
                int r2 = r2 + 1
                goto L50
            L5d:
                return r0
            L5e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.okhttp.DnsMgr.a.c(java.lang.String):java.util.List");
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        String[] DEFAULT_OLD_SERVICE_URLS = h.f16601p;
        g0.o(DEFAULT_OLD_SERVICE_URLS, "DEFAULT_OLD_SERVICE_URLS");
        m0.u0(arrayList, DEFAULT_OLD_SERVICE_URLS);
        String[] DEFAULT_STATS_SERVICE_URLS = h.f16602q;
        g0.o(DEFAULT_STATS_SERVICE_URLS, "DEFAULT_STATS_SERVICE_URLS");
        m0.u0(arrayList, DEFAULT_STATS_SERVICE_URLS);
        String[] DEFAULT_NOTIFY_SERVICE_URLS = h.f16603r;
        g0.o(DEFAULT_NOTIFY_SERVICE_URLS, "DEFAULT_NOTIFY_SERVICE_URLS");
        m0.u0(arrayList, DEFAULT_NOTIFY_SERVICE_URLS);
        String[] DEFAULT_UNIFIED_USER_SERVICE_URLS = h.f16604s;
        g0.o(DEFAULT_UNIFIED_USER_SERVICE_URLS, "DEFAULT_UNIFIED_USER_SERVICE_URLS");
        m0.u0(arrayList, DEFAULT_UNIFIED_USER_SERVICE_URLS);
        String[] DEFAULT_USER_STUDY_SERVICE_URLS = h.f16605t;
        g0.o(DEFAULT_USER_STUDY_SERVICE_URLS, "DEFAULT_USER_STUDY_SERVICE_URLS");
        m0.u0(arrayList, DEFAULT_USER_STUDY_SERVICE_URLS);
        String[] DEFAULT_USER_ASSISTANT_SERVICE_URLS = h.f16606u;
        g0.o(DEFAULT_USER_ASSISTANT_SERVICE_URLS, "DEFAULT_USER_ASSISTANT_SERVICE_URLS");
        m0.u0(arrayList, DEFAULT_USER_ASSISTANT_SERVICE_URLS);
        String[] DEFAULT_SYSTEM_SERVICE_URLS = h.f16607v;
        g0.o(DEFAULT_SYSTEM_SERVICE_URLS, "DEFAULT_SYSTEM_SERVICE_URLS");
        m0.u0(arrayList, DEFAULT_SYSTEM_SERVICE_URLS);
        String[] DEFAULT_ADVERTISE_SERVICE_URLS = h.f16608w;
        g0.o(DEFAULT_ADVERTISE_SERVICE_URLS, "DEFAULT_ADVERTISE_SERVICE_URLS");
        m0.u0(arrayList, DEFAULT_ADVERTISE_SERVICE_URLS);
        String[] DEFAULT_RESOURCE_SERVICE_URLS = h.f16609x;
        g0.o(DEFAULT_RESOURCE_SERVICE_URLS, "DEFAULT_RESOURCE_SERVICE_URLS");
        m0.u0(arrayList, DEFAULT_RESOURCE_SERVICE_URLS);
        String[] DEFAULT_PK_SERVICE_URLS = h.f16610y;
        g0.o(DEFAULT_PK_SERVICE_URLS, "DEFAULT_PK_SERVICE_URLS");
        m0.u0(arrayList, DEFAULT_PK_SERVICE_URLS);
        String[] DEFAULT_COURSE_SERVICE_URLS = h.f16611z;
        g0.o(DEFAULT_COURSE_SERVICE_URLS, "DEFAULT_COURSE_SERVICE_URLS");
        m0.u0(arrayList, DEFAULT_COURSE_SERVICE_URLS);
        String[] DEFAULT_BOOK_LIST_URLS = h.A;
        g0.o(DEFAULT_BOOK_LIST_URLS, "DEFAULT_BOOK_LIST_URLS");
        m0.u0(arrayList, DEFAULT_BOOK_LIST_URLS);
        String[] DEFAULT_ACTIVITY_URLS = h.B;
        g0.o(DEFAULT_ACTIVITY_URLS, "DEFAULT_ACTIVITY_URLS");
        m0.u0(arrayList, DEFAULT_ACTIVITY_URLS);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(String.valueOf(Uri.parse((String) it.next()).getHost()));
        }
        f16540c = linkedHashSet;
        f16541d = h0.Q("47.98.31.211", "47.114.200.31");
        f16542e = new HashMap();
        f16543f = new a();
        f16544g = 8;
    }

    @k
    public final l c() {
        return f16543f;
    }

    @k
    public final List<String> d() {
        return f16541d;
    }

    @k
    public final TestServer e() {
        Integer valueOf = Integer.valueOf(b.b().getInt("DnsMgrTest", 0));
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue >= 3) {
            valueOf = null;
        }
        if (valueOf != null) {
            TestServer testServer = TestServer.values()[valueOf.intValue()];
            if (testServer != null) {
                return testServer;
            }
        }
        return TestServer.NONE;
    }

    public final void f(@k TestServer test) {
        g0.p(test, "test");
        b.b().m("DnsMgrTest", test.ordinal());
    }

    public final void g(@m80.l Map<String, ? extends List<String>> map) {
        Map<String, List<String>> map2 = f16542e;
        map2.clear();
        if (map != null) {
            map2.putAll(map);
        }
        qb.c.i(f16539b, "update dns , %s", BczJson.toJson(map2));
    }
}
