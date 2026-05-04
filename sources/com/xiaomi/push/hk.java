package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class hk implements is<hk, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public List<hl> f507a;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f506a = new ji("ClientUploadData");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45765a = new ja("", (byte) 15, 1);

    public int a() {
        List<hl> list = this.f507a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6010a();
        jdVar.a(f506a);
        if (this.f507a != null) {
            jdVar.a(f45765a);
            jdVar.a(new jb((byte) 12, this.f507a.size()));
            Iterator<hl> it = this.f507a.iterator();
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
        if (obj != null && (obj instanceof hk)) {
            return m6012a((hk) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClientUploadData(");
        sb2.append("uploadDataItems:");
        List<hl> list = this.f507a;
        if (list == null) {
            sb2.append("null");
        } else {
            sb2.append(list);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hk hkVar) {
        int a11;
        if (!getClass().equals(hkVar.getClass())) {
            return getClass().getName().compareTo(hkVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6011a()).compareTo(Boolean.valueOf(hkVar.m6011a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m6011a() || (a11 = it.a(this.f507a, hkVar.f507a)) == 0) {
            return 0;
        }
        return a11;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6010a() {
        if (this.f507a != null) {
            return;
        }
        throw new je("Required field 'uploadDataItems' was not present! Struct: " + toString());
    }

    public void a(hl hlVar) {
        if (this.f507a == null) {
            this.f507a = new ArrayList();
        }
        this.f507a.add(hlVar);
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                m6010a();
                return;
            }
            if (mo6157a.f843a == 1 && b11 == 15) {
                jb mo6158a = jdVar.mo6158a();
                this.f507a = new ArrayList(mo6158a.f844a);
                for (int i11 = 0; i11 < mo6158a.f844a; i11++) {
                    hl hlVar = new hl();
                    hlVar.a(jdVar);
                    this.f507a.add(hlVar);
                }
                jdVar.i();
            } else {
                jg.a(jdVar, b11);
            }
            jdVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6011a() {
        return this.f507a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6012a(hk hkVar) {
        if (hkVar == null) {
            return false;
        }
        boolean m6011a = m6011a();
        boolean m6011a2 = hkVar.m6011a();
        if (m6011a || m6011a2) {
            return m6011a && m6011a2 && this.f507a.equals(hkVar.f507a);
        }
        return true;
    }
}
