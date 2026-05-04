package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class ie implements is<ie, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public List<hs> f671a;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f670a = new ji("XmPushActionCustomConfig");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46010a = new ja("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ie ieVar) {
        int a11;
        if (!getClass().equals(ieVar.getClass())) {
            return getClass().getName().compareTo(ieVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6095a()).compareTo(Boolean.valueOf(ieVar.m6095a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m6095a() || (a11 = it.a(this.f671a, ieVar.f671a)) == 0) {
            return 0;
        }
        return a11;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6094a();
        jdVar.a(f670a);
        if (this.f671a != null) {
            jdVar.a(f46010a);
            jdVar.a(new jb((byte) 12, this.f671a.size()));
            Iterator<hs> it = this.f671a.iterator();
            while (it.hasNext()) {
                it.next().b(jdVar);
            }
            jdVar.e();
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ie)) {
            return m6096a((ie) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("XmPushActionCustomConfig(");
        sb2.append("customConfigs:");
        List<hs> list = this.f671a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public List<hs> a() {
        return this.f671a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6094a() {
        if (this.f671a != null) {
            return;
        }
        throw new je("Required field 'customConfigs' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                m6094a();
                return;
            }
            if (mo6157a.f843a == 1 && b11 == 15) {
                jb mo6158a = jdVar.mo6158a();
                this.f671a = new ArrayList(mo6158a.f844a);
                for (int i11 = 0; i11 < mo6158a.f844a; i11++) {
                    hs hsVar = new hs();
                    hsVar.a(jdVar);
                    this.f671a.add(hsVar);
                }
                jdVar.i();
            } else {
                jg.a(jdVar, b11);
            }
            jdVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6095a() {
        return this.f671a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6096a(ie ieVar) {
        if (ieVar == null) {
            return false;
        }
        boolean m6095a = m6095a();
        boolean m6095a2 = ieVar.m6095a();
        if (m6095a || m6095a2) {
            return m6095a && m6095a2 && this.f671a.equals(ieVar.f671a);
        }
        return true;
    }
}
