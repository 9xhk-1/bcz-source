package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class gq {

    /* renamed from: a, reason: collision with root package name */
    private int f45664a;

    /* renamed from: a, reason: collision with other field name */
    private String f480a;

    /* renamed from: a, reason: collision with other field name */
    private List<gj> f481a;

    /* renamed from: b, reason: collision with root package name */
    private String f45665b;

    /* renamed from: c, reason: collision with root package name */
    private String f45666c;

    /* renamed from: d, reason: collision with root package name */
    private String f45667d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f45668a = new a("internal-server-error");

        /* renamed from: b, reason: collision with root package name */
        public static final a f45669b = new a("forbidden");

        /* renamed from: c, reason: collision with root package name */
        public static final a f45670c = new a("bad-request");

        /* renamed from: d, reason: collision with root package name */
        public static final a f45671d = new a("conflict");

        /* renamed from: e, reason: collision with root package name */
        public static final a f45672e = new a("feature-not-implemented");

        /* renamed from: f, reason: collision with root package name */
        public static final a f45673f = new a("gone");

        /* renamed from: g, reason: collision with root package name */
        public static final a f45674g = new a("item-not-found");

        /* renamed from: h, reason: collision with root package name */
        public static final a f45675h = new a("jid-malformed");

        /* renamed from: i, reason: collision with root package name */
        public static final a f45676i = new a("not-acceptable");

        /* renamed from: j, reason: collision with root package name */
        public static final a f45677j = new a("not-allowed");

        /* renamed from: k, reason: collision with root package name */
        public static final a f45678k = new a("not-authorized");

        /* renamed from: l, reason: collision with root package name */
        public static final a f45679l = new a("payment-required");

        /* renamed from: m, reason: collision with root package name */
        public static final a f45680m = new a("recipient-unavailable");

        /* renamed from: n, reason: collision with root package name */
        public static final a f45681n = new a("redirect");

        /* renamed from: o, reason: collision with root package name */
        public static final a f45682o = new a("registration-required");

        /* renamed from: p, reason: collision with root package name */
        public static final a f45683p = new a("remote-server-error");

        /* renamed from: q, reason: collision with root package name */
        public static final a f45684q = new a("remote-server-not-found");

        /* renamed from: r, reason: collision with root package name */
        public static final a f45685r = new a("remote-server-timeout");

        /* renamed from: s, reason: collision with root package name */
        public static final a f45686s = new a("resource-constraint");

        /* renamed from: t, reason: collision with root package name */
        public static final a f45687t = new a("service-unavailable");

        /* renamed from: u, reason: collision with root package name */
        public static final a f45688u = new a("subscription-required");

        /* renamed from: v, reason: collision with root package name */
        public static final a f45689v = new a("undefined-condition");

        /* renamed from: w, reason: collision with root package name */
        public static final a f45690w = new a("unexpected-request");

        /* renamed from: x, reason: collision with root package name */
        public static final a f45691x = new a("request-timeout");

        /* renamed from: a, reason: collision with other field name */
        private String f482a;

        public a(String str) {
            this.f482a = str;
        }

        public String toString() {
            return this.f482a;
        }
    }

    public gq(int i11, String str, String str2, String str3, String str4, List<gj> list) {
        this.f45664a = i11;
        this.f480a = str;
        this.f45666c = str2;
        this.f45665b = str3;
        this.f45667d = str4;
        this.f481a = list;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        String str = this.f480a;
        if (str != null) {
            bundle.putString("ext_err_type", str);
        }
        bundle.putInt("ext_err_code", this.f45664a);
        String str2 = this.f45666c;
        if (str2 != null) {
            bundle.putString("ext_err_reason", str2);
        }
        String str3 = this.f45665b;
        if (str3 != null) {
            bundle.putString("ext_err_cond", str3);
        }
        String str4 = this.f45667d;
        if (str4 != null) {
            bundle.putString("ext_err_msg", str4);
        }
        List<gj> list = this.f481a;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            Iterator<gj> it = this.f481a.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Bundle a11 = it.next().a();
                if (a11 != null) {
                    bundleArr[i11] = a11;
                    i11++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f45665b;
        if (str != null) {
            sb2.append(str);
        }
        sb2.append(pn.j.f81006c);
        sb2.append(this.f45664a);
        sb2.append(pn.j.f81007d);
        if (this.f45667d != null) {
            sb2.append(" ");
            sb2.append(this.f45667d);
        }
        return sb2.toString();
    }

    public gq(Bundle bundle) {
        this.f481a = null;
        this.f45664a = bundle.getInt("ext_err_code");
        if (bundle.containsKey("ext_err_type")) {
            this.f480a = bundle.getString("ext_err_type");
        }
        this.f45665b = bundle.getString("ext_err_cond");
        this.f45666c = bundle.getString("ext_err_reason");
        this.f45667d = bundle.getString("ext_err_msg");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.f481a = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                gj a11 = gj.a((Bundle) parcelable);
                if (a11 != null) {
                    this.f481a.add(a11);
                }
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m5994a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<error code=\"");
        sb2.append(this.f45664a);
        sb2.append("\"");
        if (this.f480a != null) {
            sb2.append(" type=\"");
            sb2.append(this.f480a);
            sb2.append("\"");
        }
        if (this.f45666c != null) {
            sb2.append(" reason=\"");
            sb2.append(this.f45666c);
            sb2.append("\"");
        }
        sb2.append(">");
        if (this.f45665b != null) {
            sb2.append("<");
            sb2.append(this.f45665b);
            sb2.append(" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\"/>");
        }
        if (this.f45667d != null) {
            sb2.append("<text xml:lang=\"en\" xmlns=\"urn:ietf:params:xml:ns:xmpp-stanzas\">");
            sb2.append(this.f45667d);
            sb2.append("</text>");
        }
        Iterator<gj> it = m5995a().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().d());
        }
        sb2.append("</error>");
        return sb2.toString();
    }

    public gq(a aVar) {
        this.f481a = null;
        a(aVar);
        this.f45667d = null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized List<gj> m5995a() {
        List<gj> list = this.f481a;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    private void a(a aVar) {
        this.f45665b = aVar.f482a;
    }
}
