package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class ia implements is<ia, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public List<hp> f635a;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f634a = new ji("XmPushActionCollectData");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45981a = new ja("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ia iaVar) {
        int a11;
        if (!getClass().equals(iaVar.getClass())) {
            return getClass().getName().compareTo(iaVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6073a()).compareTo(Boolean.valueOf(iaVar.m6073a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m6073a() || (a11 = it.a(this.f635a, iaVar.f635a)) == 0) {
            return 0;
        }
        return a11;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        a();
        jdVar.a(f634a);
        if (this.f635a != null) {
            jdVar.a(f45981a);
            jdVar.a(new jb((byte) 12, this.f635a.size()));
            Iterator<hp> it = this.f635a.iterator();
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
        if (obj != null && (obj instanceof ia)) {
            return m6074a((ia) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("XmPushActionCollectData(");
        sb2.append("dataCollectionItems:");
        List<hp> list = this.f635a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public ia a(List<hp> list) {
        this.f635a = list;
        return this;
    }

    public void a() {
        if (this.f635a != null) {
            return;
        }
        throw new je("Required field 'dataCollectionItems' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                a();
                return;
            }
            if (mo6157a.f843a == 1 && b11 == 15) {
                jb mo6158a = jdVar.mo6158a();
                this.f635a = new ArrayList(mo6158a.f844a);
                for (int i11 = 0; i11 < mo6158a.f844a; i11++) {
                    hp hpVar = new hp();
                    hpVar.a(jdVar);
                    this.f635a.add(hpVar);
                }
                jdVar.i();
            } else {
                jg.a(jdVar, b11);
            }
            jdVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6073a() {
        return this.f635a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6074a(ia iaVar) {
        if (iaVar == null) {
            return false;
        }
        boolean m6073a = m6073a();
        boolean m6073a2 = iaVar.m6073a();
        if (m6073a || m6073a2) {
            return m6073a && m6073a2 && this.f635a.equals(iaVar.f635a);
        }
        return true;
    }
}
