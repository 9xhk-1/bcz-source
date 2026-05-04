package com.baicizhan.client.business.thrift;

import com.baicizhan.online.bcz_system_api.BczSystemInfos;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h {
    public static h F;

    /* renamed from: a, reason: collision with root package name */
    public String[] f16612a = f16601p;

    /* renamed from: b, reason: collision with root package name */
    public String[] f16613b = f16602q;

    /* renamed from: c, reason: collision with root package name */
    public String[] f16614c = f16603r;

    /* renamed from: d, reason: collision with root package name */
    public String[] f16615d = f16604s;

    /* renamed from: e, reason: collision with root package name */
    public String[] f16616e = f16605t;

    /* renamed from: f, reason: collision with root package name */
    public String[] f16617f = f16606u;

    /* renamed from: g, reason: collision with root package name */
    public String[] f16618g = f16607v;

    /* renamed from: h, reason: collision with root package name */
    public String[] f16619h = f16608w;

    /* renamed from: i, reason: collision with root package name */
    public String[] f16620i = f16609x;

    /* renamed from: j, reason: collision with root package name */
    public String[] f16621j = f16610y;

    /* renamed from: k, reason: collision with root package name */
    public String[] f16622k = f16611z;

    /* renamed from: l, reason: collision with root package name */
    public String[] f16623l = E;

    /* renamed from: m, reason: collision with root package name */
    public String[] f16624m = A;

    /* renamed from: n, reason: collision with root package name */
    public String[] f16625n = B;

    /* renamed from: o, reason: collision with root package name */
    public String[] f16626o = C;

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f16601p = {"https://www.baicizhan.com", "https://www.bczeducation.cn"};

    /* renamed from: q, reason: collision with root package name */
    public static final String[] f16602q = {"https://conan.baicizhan.com"};

    /* renamed from: r, reason: collision with root package name */
    public static final String[] f16603r = {"https://notify.baicizhan.com", "https://notify.bczeducation.cn"};

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f16604s = {"https://passport.baicizhan.com", "https://passport.bczeducation.cn"};

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f16605t = {"https://learn.baicizhan.com", "https://learn.bczeducation.cn"};

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f16606u = {"https://assistant.baicizhan.com", "https://assistant.bczeducation.cn"};

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f16607v = {"https://system.baicizhan.com", "https://system.bczeducation.cn"};

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f16608w = {"https://advertise.baicizhan.com", "https://advertise.bczeducation.cn"};

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f16609x = {"https://resource.baicizhan.com", "https://resource.bczeducation.cn"};

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f16610y = {"https://pk.baicizhan.com", "https://pk.bczeducation.cn"};

    /* renamed from: z, reason: collision with root package name */
    public static final String[] f16611z = {"https://learn.baicizhan.com", "https://learn.bczeducation.cn"};
    public static final String[] A = {"https://booklist.baicizhan.com", "https://booklist.bczeducation.cn"};
    public static final String[] B = {"https://activity.baicizhan.com", "https://activity.bczeducation.cn"};
    public static final String[] C = {"https://events.baicizhan.com", "https://events.bczeducation.cn"};
    public static final String[] D = {"https://game.baicizhan.com"};
    public static final String[] E = {"", ""};

    public static h a() {
        if (F == null) {
            synchronized (h.class) {
                try {
                    if (F == null) {
                        F = new h();
                    }
                } finally {
                }
            }
        }
        return F;
    }

    public String[] b(String domain) {
        if (domain == null) {
            return null;
        }
        switch (domain) {
        }
        return null;
    }

    public void c(BczSystemInfos checkInfo) {
        if (checkInfo == null) {
            return;
        }
        if (!xb.e.h(checkInfo.data_dns)) {
            List<String> list = checkInfo.data_dns;
            this.f16612a = (String[]) list.toArray(new String[list.size()]);
        }
        Map<String, List<String>> map = checkInfo.other_dns;
        if (map != null) {
            List<String> list2 = map.get(q9.h.f81938b);
            if (!xb.e.h(list2)) {
                this.f16613b = (String[]) list2.toArray(new String[list2.size()]);
            }
            List<String> list3 = map.get(q9.h.f81943g);
            if (!xb.e.h(list3)) {
                this.f16614c = (String[]) list3.toArray(new String[list3.size()]);
            }
            List<String> list4 = map.get(q9.h.f81941e);
            if (!xb.e.h(list4)) {
                this.f16615d = (String[]) list4.toArray(new String[list4.size()]);
            }
            List<String> list5 = map.get(q9.h.f81942f);
            if (!xb.e.h(list5)) {
                this.f16616e = (String[]) list5.toArray(new String[list5.size()]);
            }
            List<String> list6 = map.get(q9.h.f81944h);
            if (!xb.e.h(list6)) {
                this.f16617f = (String[]) list6.toArray(new String[list6.size()]);
            }
            List<String> list7 = map.get(q9.h.f81945i);
            if (!xb.e.h(list7)) {
                this.f16618g = (String[]) list7.toArray(new String[list7.size()]);
            }
            List<String> list8 = map.get(q9.h.f81946j);
            if (!xb.e.h(list8)) {
                this.f16619h = (String[]) list8.toArray(new String[list8.size()]);
            }
            List<String> list9 = map.get("resource");
            if (!xb.e.h(list9)) {
                this.f16620i = (String[]) list9.toArray(new String[list9.size()]);
            }
            List<String> list10 = map.get("pk");
            if (!xb.e.h(list10)) {
                this.f16621j = (String[]) list10.toArray(new String[list10.size()]);
            }
            List<String> list11 = map.get(q9.h.f81949m);
            if (!xb.e.h(list11)) {
                this.f16623l = (String[]) list11.toArray(new String[list11.size()]);
            }
            List<String> list12 = map.get("activity");
            if (!xb.e.h(list12)) {
                this.f16625n = (String[]) list12.toArray(new String[list12.size()]);
            }
            List<String> list13 = map.get(q9.h.f81951o);
            if (!xb.e.h(list13)) {
                this.f16624m = (String[]) list13.toArray(new String[list13.size()]);
            }
            List<String> list14 = map.get(q9.h.f81950n);
            if (!xb.e.h(list14)) {
                this.f16622k = (String[]) list14.toArray(new String[list14.size()]);
            }
            List<String> list15 = map.get(q9.h.f81953q);
            if (xb.e.h(list15)) {
                return;
            }
            this.f16626o = (String[]) list15.toArray(new String[list15.size()]);
        }
    }
}
