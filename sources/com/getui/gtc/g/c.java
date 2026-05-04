package com.getui.gtc.g;

import android.text.TextUtils;
import com.getui.gtc.api.SdkInfo;
import com.getui.gtc.base.GtcProvider;
import com.getui.gtc.base.util.ScheduleQueue;
import com.getui.gtc.e.c;
import com.getui.gtc.entity.a;
import com.getui.gtc.f.c;
import com.getui.gtc.f.e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    String f30080a;

    /* renamed from: b, reason: collision with root package name */
    String f30081b;

    /* renamed from: c, reason: collision with root package name */
    final Map<String, a.C0358a> f30082c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f30094a = new c(0);
    }

    private c() {
        com.getui.gtc.e.c cVar;
        com.getui.gtc.e.c cVar2;
        this.f30082c = new HashMap();
        try {
            this.f30080a = GtcProvider.context().getFilesDir().getAbsolutePath();
            File file = new File(this.f30080a);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f30081b = this.f30080a + File.separator + "libs";
            File file2 = new File(this.f30081b);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            cVar = c.a.f30027a;
            HashSet<String> hashSet = new HashSet(cVar.f30024a.f30041n);
            for (String str : hashSet) {
                if (a(str)) {
                    cVar2 = c.a.f30027a;
                    cVar2.f30024a.f(str);
                    com.getui.gtc.i.c.a.a("remove: ".concat(String.valueOf(hashSet)));
                }
            }
            com.getui.gtc.dyc.b.a.a(GtcProvider.context(), new e() { // from class: com.getui.gtc.g.c.1
                @Override // com.getui.gtc.f.e
                public final void a(String str2) {
                }

                @Override // com.getui.gtc.f.e
                public final void a(Map<String, String> map, Map<String, String> map2) {
                    com.getui.gtc.e.c cVar3;
                    if (map == null || map2 == null) {
                        return;
                    }
                    com.getui.gtc.entity.a a11 = com.getui.gtc.entity.a.a(map2);
                    com.getui.gtc.entity.a a12 = com.getui.gtc.entity.a.a(map);
                    if (a12 != null) {
                        int size = a12.f30045a.size();
                        HashSet hashSet2 = new HashSet();
                        for (int i11 = 0; i11 < size; i11++) {
                            a.C0358a a13 = a12.a(i11);
                            if (a11 == null || a11.b(a13.f30048a) == null || !a11.b(a13.f30048a).f30049b.equalsIgnoreCase(a13.f30049b) || !a11.b(a13.f30048a).f30050c.equalsIgnoreCase(a13.f30050c)) {
                                hashSet2.add(a13.f30050c);
                            }
                        }
                        com.getui.gtc.i.c.a.a("wait remove: ".concat(String.valueOf(hashSet2)));
                        cVar3 = c.a.f30027a;
                        cVar3.f30024a.a(hashSet2);
                    }
                    if (a11 != null) {
                        int size2 = a11.f30045a.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            a.C0358a a14 = a11.a(i12);
                            if (!c.this.a(a14)) {
                                try {
                                    com.getui.gtc.h.b.a(a14, c.this.f30081b + File.separator + a14.f30050c);
                                } catch (Exception e11) {
                                    com.getui.gtc.i.c.a.b(e11);
                                }
                            }
                        }
                    }
                }
            }.f30066c);
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
        }
    }

    private void b(SdkInfo sdkInfo) {
        List<a.C0358a> stubs = sdkInfo.getStubs();
        for (int i11 = 0; i11 < stubs.size(); i11++) {
            final a.C0358a c0358a = stubs.get(i11);
            if (!b(c0358a)) {
                this.f30082c.put(c0358a.f30051d, c0358a);
                if (c0358a.f30057j) {
                    b.a(GtcProvider.context(), null, null, c0358a.f30051d, sdkInfo.getAppid(), sdkInfo.getCid(), new com.getui.gtc.g.a.b() { // from class: com.getui.gtc.g.c.2
                        @Override // com.getui.gtc.g.a.b
                        public final void a(boolean z11) {
                            if (z11) {
                                return;
                            }
                            c.this.f30082c.remove(c0358a.f30051d);
                        }
                    });
                } else {
                    try {
                        b.a(GtcProvider.context(), c0358a.f30051d, sdkInfo.getAppid(), sdkInfo.getCid());
                    } catch (Throwable th2) {
                        this.f30082c.remove(c0358a.f30051d);
                        com.getui.gtc.i.c.a.b("local gtcFile failed: ".concat(String.valueOf(th2)));
                    }
                }
            }
        }
    }

    private com.getui.gtc.entity.a c(final SdkInfo sdkInfo) {
        Map<String, String> a11 = com.getui.gtc.f.c.a(sdkInfo, new c.a() { // from class: com.getui.gtc.g.c.3
            @Override // com.getui.gtc.f.c.a
            public final void a(Map<String, String> map) {
                c.this.a(sdkInfo, com.getui.gtc.entity.a.a(map));
            }
        });
        if (a11 == null) {
            return null;
        }
        return com.getui.gtc.entity.a.a(a11);
    }

    public final String a(SdkInfo sdkInfo, a.C0358a c0358a) {
        com.getui.gtc.entity.a a11;
        a.C0358a b11;
        File file = new File(this.f30081b + File.separator + c0358a.f30050c);
        if (a(c0358a)) {
            return file.getAbsolutePath();
        }
        try {
            Map<String, String> a12 = com.getui.gtc.dyc.b.a.a(GtcProvider.context(), sdkInfo.getModuleName());
            if (a12 == null || (a11 = com.getui.gtc.entity.a.a(a12)) == null || (b11 = a11.b(c0358a.f30048a)) == null || !b11.f30052e.equals(c0358a.f30052e)) {
                return null;
            }
            com.getui.gtc.h.b.a(c0358a, file.getAbsolutePath());
            if (com.getui.gtc.i.b.a.a(file.getAbsolutePath()).equals(c0358a.f30052e)) {
                return file.getAbsolutePath();
            }
            com.getui.gtc.i.b.a.a(file);
            throw new Exception("The net gtcFile save failed or has a wrong checksum");
        } catch (Exception e11) {
            com.getui.gtc.i.c.a.b(e11);
            return null;
        }
    }

    public /* synthetic */ c(byte b11) {
        this();
    }

    private boolean b(a.C0358a c0358a) {
        return this.f30082c.containsKey(c0358a.f30051d);
    }

    private static boolean c(a.C0358a c0358a) {
        c0358a.f30051d.endsWith(".gws.stub.PushExtension");
        return false;
    }

    public final void a(SdkInfo sdkInfo) {
        b(sdkInfo);
        a(sdkInfo, c(sdkInfo));
    }

    public final void a(SdkInfo sdkInfo, com.getui.gtc.entity.a aVar) {
        com.getui.gtc.e.c cVar;
        final SdkInfo sdkInfo2;
        if (aVar == null) {
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < aVar.f30045a.size()) {
            final a.C0358a a11 = aVar.a(i11);
            if (!aVar.f30046b && c(a11)) {
                com.getui.gtc.i.c.a.a("no push, no gws");
            } else if (!b(a11)) {
                cVar = c.a.f30027a;
                final long a12 = cVar.f30025b.a(a11.f30048a);
                if ((a11.f30054g <= 0 || a12 <= 0 || System.currentTimeMillis() - a12 <= a11.f30054g) && (a12 <= 0 || !a11.f30056i)) {
                    this.f30082c.put(a11.f30051d, a11);
                    sdkInfo2 = sdkInfo;
                    ScheduleQueue.getInstance().addSchedule(new Runnable() { // from class: com.getui.gtc.g.c.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.getui.gtc.e.c cVar2;
                            String a13 = c.this.a(sdkInfo2, a11);
                            if (a13 == null) {
                                c.this.f30082c.remove(a11.f30051d);
                                return;
                            }
                            File file = new File(a13);
                            final File file2 = new File(a13 + com.getui.gtc.c.a.f29823b);
                            com.getui.gtc.i.a.a.a(file, file2, a11.f30053f);
                            if (a11.f30057j) {
                                b.a(GtcProvider.context(), file2.getAbsolutePath(), c.this.f30080a, a11.f30051d, sdkInfo2.getAppid(), sdkInfo2.getCid(), new com.getui.gtc.g.a.b() { // from class: com.getui.gtc.g.c.4.1
                                    @Override // com.getui.gtc.g.a.b
                                    public final void a(boolean z11) {
                                        com.getui.gtc.e.c cVar3;
                                        com.getui.gtc.i.b.a.a(file2);
                                        if (!z11) {
                                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                            c.this.f30082c.remove(a11.f30051d);
                                        } else if (a12 == 0) {
                                            cVar3 = c.a.f30027a;
                                            cVar3.f30025b.a(a11.f30048a, System.currentTimeMillis());
                                        }
                                    }
                                });
                                return;
                            }
                            try {
                                b.a(GtcProvider.context(), file2.getAbsolutePath(), c.this.f30080a, a11.f30051d, sdkInfo2.getAppid(), sdkInfo2.getCid());
                                if (a12 == 0) {
                                    cVar2 = c.a.f30027a;
                                    cVar2.f30025b.a(a11.f30048a, System.currentTimeMillis());
                                }
                            } catch (Throwable th2) {
                                try {
                                    c.this.f30082c.remove(a11.f30051d);
                                    com.getui.gtc.i.c.a.b("net gtcFile filed: ".concat(String.valueOf(th2)));
                                } finally {
                                    com.getui.gtc.i.b.a.a(file2);
                                }
                            }
                        }
                    });
                    i11++;
                    sdkInfo = sdkInfo2;
                } else {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            sdkInfo2 = sdkInfo;
            i11++;
            sdkInfo = sdkInfo2;
        }
        for (Integer num : arrayList) {
            a(aVar.a(num.intValue()).f30050c);
            aVar.c(num.intValue());
        }
    }

    public final boolean a(a.C0358a c0358a) {
        File file = new File(this.f30081b + File.separator + c0358a.f30050c);
        if (file.exists() && file.isFile()) {
            return com.getui.gtc.i.b.a.a(file.getAbsolutePath()).equals(c0358a.f30052e);
        }
        return false;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            com.getui.gtc.i.b.a.a(this.f30080a, str);
            String a11 = com.getui.gtc.g.a.a(str);
            if (TextUtils.isEmpty(a11)) {
                return true;
            }
            com.getui.gtc.i.b.a.a(new File(this.f30080a + "/" + a11));
            return true;
        } catch (Exception e11) {
            com.getui.gtc.i.c.a.c(e11);
            return false;
        }
    }
}
