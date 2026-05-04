package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class id implements is<id, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public hh f661a;

    /* renamed from: a, reason: collision with other field name */
    public hu f662a;

    /* renamed from: a, reason: collision with other field name */
    public hw f663a;

    /* renamed from: a, reason: collision with other field name */
    public String f664a;

    /* renamed from: a, reason: collision with other field name */
    public ByteBuffer f665a;

    /* renamed from: b, reason: collision with other field name */
    public String f668b;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f660a = new ji("XmPushActionContainer");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46002a = new ja("", (byte) 8, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46003b = new ja("", (byte) 2, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46004c = new ja("", (byte) 2, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46005d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46006e = new ja("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46007f = new ja("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46008g = new ja("", (byte) 12, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f46009h = new ja("", (byte) 12, 8);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f666a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public boolean f667a = true;

    /* renamed from: b, reason: collision with other field name */
    public boolean f669b = true;

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(id idVar) {
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        if (!getClass().equals(idVar.getClass())) {
            return getClass().getName().compareTo(idVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6089a()).compareTo(Boolean.valueOf(idVar.m6089a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6089a() && (a18 = it.a(this.f661a, idVar.f661a)) != 0) {
            return a18;
        }
        int compareTo2 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(idVar.c()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (c() && (a17 = it.a(this.f667a, idVar.f667a)) != 0) {
            return a17;
        }
        int compareTo3 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(idVar.d()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (d() && (a16 = it.a(this.f669b, idVar.f669b)) != 0) {
            return a16;
        }
        int compareTo4 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(idVar.e()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (e() && (a15 = it.a(this.f665a, idVar.f665a)) != 0) {
            return a15;
        }
        int compareTo5 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(idVar.f()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (f() && (a14 = it.a(this.f664a, idVar.f664a)) != 0) {
            return a14;
        }
        int compareTo6 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(idVar.g()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (g() && (a13 = it.a(this.f668b, idVar.f668b)) != 0) {
            return a13;
        }
        int compareTo7 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(idVar.h()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (h() && (a12 = it.a(this.f663a, idVar.f663a)) != 0) {
            return a12;
        }
        int compareTo8 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(idVar.i()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!i() || (a11 = it.a(this.f662a, idVar.f662a)) == 0) {
            return 0;
        }
        return a11;
    }

    public id b(String str) {
        this.f668b = str;
        return this;
    }

    public boolean c() {
        return this.f666a.get(0);
    }

    public boolean d() {
        return this.f666a.get(1);
    }

    public boolean e() {
        return this.f665a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof id)) {
            return m6090a((id) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f664a != null;
    }

    public boolean g() {
        return this.f668b != null;
    }

    public boolean h() {
        return this.f663a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f662a != null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("XmPushActionContainer(");
        sb2.append("action:");
        hh hhVar = this.f661a;
        if (hhVar == null) {
            sb2.append("null");
        } else {
            sb2.append(hhVar);
        }
        sb2.append(j2.O);
        sb2.append("encryptAction:");
        sb2.append(this.f667a);
        sb2.append(j2.O);
        sb2.append("isRequest:");
        sb2.append(this.f669b);
        if (f()) {
            sb2.append(j2.O);
            sb2.append("appid:");
            String str = this.f664a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str2 = this.f668b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        sb2.append(j2.O);
        sb2.append("target:");
        hw hwVar = this.f663a;
        if (hwVar == null) {
            sb2.append("null");
        } else {
            sb2.append(hwVar);
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("metaInfo:");
            hu huVar = this.f662a;
            if (huVar == null) {
                sb2.append("null");
            } else {
                sb2.append(huVar);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public hh a() {
        return this.f661a;
    }

    public id b(boolean z11) {
        this.f669b = z11;
        m6092b(true);
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public hu m6085a() {
        return this.f662a;
    }

    public String b() {
        return this.f668b;
    }

    public id a(hh hhVar) {
        this.f661a = hhVar;
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6087a();
        jdVar.a(f660a);
        if (this.f661a != null) {
            jdVar.a(f46002a);
            jdVar.mo6166a(this.f661a.a());
            jdVar.b();
        }
        jdVar.a(f46003b);
        jdVar.a(this.f667a);
        jdVar.b();
        jdVar.a(f46004c);
        jdVar.a(this.f669b);
        jdVar.b();
        if (this.f665a != null) {
            jdVar.a(f46005d);
            jdVar.a(this.f665a);
            jdVar.b();
        }
        if (this.f664a != null && f()) {
            jdVar.a(f46006e);
            jdVar.a(this.f664a);
            jdVar.b();
        }
        if (this.f668b != null && g()) {
            jdVar.a(f46007f);
            jdVar.a(this.f668b);
            jdVar.b();
        }
        if (this.f663a != null) {
            jdVar.a(f46008g);
            this.f663a.b(jdVar);
            jdVar.b();
        }
        if (this.f662a != null && i()) {
            jdVar.a(f46009h);
            this.f662a.b(jdVar);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public id a(hu huVar) {
        this.f662a = huVar;
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m6092b(boolean z11) {
        this.f666a.set(1, z11);
    }

    public id a(hw hwVar) {
        this.f663a = hwVar;
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6093b() {
        return this.f667a;
    }

    public id a(String str) {
        this.f664a = str;
        return this;
    }

    public id a(ByteBuffer byteBuffer) {
        this.f665a = byteBuffer;
        return this;
    }

    public id a(boolean z11) {
        this.f667a = z11;
        m6088a(true);
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m6086a() {
        return this.f664a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6087a() {
        if (this.f661a == null) {
            throw new je("Required field 'action' was not present! Struct: " + toString());
        }
        if (this.f665a == null) {
            throw new je("Required field 'pushAction' was not present! Struct: " + toString());
        }
        if (this.f663a != null) {
            return;
        }
        throw new je("Required field 'target' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                if (!c()) {
                    throw new je("Required field 'encryptAction' was not found in serialized data! Struct: " + toString());
                }
                if (d()) {
                    m6087a();
                    return;
                }
                throw new je("Required field 'isRequest' was not found in serialized data! Struct: " + toString());
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 8) {
                        this.f661a = hh.a(jdVar.mo6155a());
                        break;
                    }
                    break;
                case 2:
                    if (b11 == 2) {
                        this.f667a = jdVar.mo6167a();
                        m6088a(true);
                        continue;
                    }
                    break;
                case 3:
                    if (b11 == 2) {
                        this.f669b = jdVar.mo6167a();
                        m6092b(true);
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f665a = jdVar.mo6163a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f664a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 11) {
                        this.f668b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f663a = hwVar;
                        hwVar.a(jdVar);
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 12) {
                        hu huVar = new hu();
                        this.f662a = huVar;
                        huVar.a(jdVar);
                        continue;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6088a(boolean z11) {
        this.f666a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6089a() {
        return this.f661a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6090a(id idVar) {
        if (idVar == null) {
            return false;
        }
        boolean m6089a = m6089a();
        boolean m6089a2 = idVar.m6089a();
        if (((m6089a || m6089a2) && (!m6089a || !m6089a2 || !this.f661a.equals(idVar.f661a))) || this.f667a != idVar.f667a || this.f669b != idVar.f669b) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = idVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f665a.equals(idVar.f665a))) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = idVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f664a.equals(idVar.f664a))) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = idVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f668b.equals(idVar.f668b))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = idVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f663a.m6057a(idVar.f663a))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = idVar.i();
        if (i11 || i12) {
            return i11 && i12 && this.f662a.m6049a(idVar.f662a);
        }
        return true;
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m6091a() {
        a(it.a(this.f665a));
        return this.f665a.array();
    }
}
