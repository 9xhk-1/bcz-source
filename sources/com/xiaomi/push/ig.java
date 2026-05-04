package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class ig implements is<ig, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f675a;

    /* renamed from: a, reason: collision with other field name */
    public hw f676a;

    /* renamed from: a, reason: collision with other field name */
    public String f677a;

    /* renamed from: a, reason: collision with other field name */
    public ByteBuffer f678a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f679a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f680a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f681a;

    /* renamed from: b, reason: collision with other field name */
    public String f682b;

    /* renamed from: b, reason: collision with other field name */
    public boolean f683b;

    /* renamed from: c, reason: collision with other field name */
    public String f684c;

    /* renamed from: d, reason: collision with other field name */
    public String f685d;

    /* renamed from: e, reason: collision with other field name */
    public String f686e;

    /* renamed from: f, reason: collision with other field name */
    public String f687f;

    /* renamed from: g, reason: collision with other field name */
    public String f688g;

    /* renamed from: h, reason: collision with other field name */
    public String f689h;

    /* renamed from: i, reason: collision with other field name */
    public String f690i;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f674a = new ji("XmPushActionNotification");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f46012a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f46013b = new ja("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f46014c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f46015d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f46016e = new ja("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f46017f = new ja("", (byte) 2, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f46018g = new ja("", (byte) 11, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f46019h = new ja("", (byte) 13, 8);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f46020i = new ja("", (byte) 11, 9);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f46021j = new ja("", (byte) 11, 10);

    /* renamed from: k, reason: collision with root package name */
    private static final ja f46022k = new ja("", (byte) 11, 12);

    /* renamed from: l, reason: collision with root package name */
    private static final ja f46023l = new ja("", (byte) 11, 13);

    /* renamed from: m, reason: collision with root package name */
    private static final ja f46024m = new ja("", (byte) 11, 14);

    /* renamed from: n, reason: collision with root package name */
    private static final ja f46025n = new ja("", (byte) 10, 15);

    /* renamed from: o, reason: collision with root package name */
    private static final ja f46026o = new ja("", (byte) 2, 20);

    public ig() {
        this.f679a = new BitSet(3);
        this.f681a = true;
        this.f683b = false;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ig igVar) {
        int a11;
        int a12;
        int a13;
        int a14;
        int a15;
        int a16;
        int a17;
        int a18;
        int a19;
        int a21;
        int a22;
        int a23;
        int a24;
        int a25;
        int a26;
        if (!getClass().equals(igVar.getClass())) {
            return getClass().getName().compareTo(igVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6104a()).compareTo(Boolean.valueOf(igVar.m6104a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6104a() && (a26 = it.a(this.f677a, igVar.f677a)) != 0) {
            return a26;
        }
        int compareTo2 = Boolean.valueOf(m6107b()).compareTo(Boolean.valueOf(igVar.m6107b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6107b() && (a25 = it.a(this.f676a, igVar.f676a)) != 0) {
            return a25;
        }
        int compareTo3 = Boolean.valueOf(m6108c()).compareTo(Boolean.valueOf(igVar.m6108c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m6108c() && (a24 = it.a(this.f682b, igVar.f682b)) != 0) {
            return a24;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(igVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a23 = it.a(this.f684c, igVar.f684c)) != 0) {
            return a23;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(igVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a22 = it.a(this.f685d, igVar.f685d)) != 0) {
            return a22;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(igVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a21 = it.a(this.f681a, igVar.f681a)) != 0) {
            return a21;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(igVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a19 = it.a(this.f686e, igVar.f686e)) != 0) {
            return a19;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(igVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a18 = it.a(this.f680a, igVar.f680a)) != 0) {
            return a18;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(igVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a17 = it.a(this.f687f, igVar.f687f)) != 0) {
            return a17;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(igVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a16 = it.a(this.f688g, igVar.f688g)) != 0) {
            return a16;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(igVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a15 = it.a(this.f689h, igVar.f689h)) != 0) {
            return a15;
        }
        int compareTo12 = Boolean.valueOf(l()).compareTo(Boolean.valueOf(igVar.l()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (l() && (a14 = it.a(this.f690i, igVar.f690i)) != 0) {
            return a14;
        }
        int compareTo13 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(igVar.m()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (m() && (a13 = it.a(this.f678a, igVar.f678a)) != 0) {
            return a13;
        }
        int compareTo14 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(igVar.n()));
        if (compareTo14 != 0) {
            return compareTo14;
        }
        if (n() && (a12 = it.a(this.f675a, igVar.f675a)) != 0) {
            return a12;
        }
        int compareTo15 = Boolean.valueOf(o()).compareTo(Boolean.valueOf(igVar.o()));
        if (compareTo15 != 0) {
            return compareTo15;
        }
        if (!o() || (a11 = it.a(this.f683b, igVar.f683b)) == 0) {
            return 0;
        }
        return a11;
    }

    public ig b(String str) {
        this.f684c = str;
        return this;
    }

    public ig c(String str) {
        this.f685d = str;
        return this;
    }

    public ig d(String str) {
        this.f687f = str;
        return this;
    }

    public boolean e() {
        return this.f685d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ig)) {
            return m6105a((ig) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f679a.get(0);
    }

    public boolean g() {
        return this.f686e != null;
    }

    public boolean h() {
        return this.f680a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f687f != null;
    }

    public boolean j() {
        return this.f688g != null;
    }

    public boolean k() {
        return this.f689h != null;
    }

    public boolean l() {
        return this.f690i != null;
    }

    public boolean m() {
        return this.f678a != null;
    }

    public boolean n() {
        return this.f679a.get(1);
    }

    public boolean o() {
        return this.f679a.get(2);
    }

    public String toString() {
        boolean z11;
        StringBuilder sb2 = new StringBuilder("XmPushActionNotification(");
        boolean z12 = false;
        if (m6104a()) {
            sb2.append("debug:");
            String str = this.f677a;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            z11 = false;
        } else {
            z11 = true;
        }
        if (m6107b()) {
            if (!z11) {
                sb2.append(j2.O);
            }
            sb2.append("target:");
            hw hwVar = this.f676a;
            if (hwVar == null) {
                sb2.append("null");
            } else {
                sb2.append(hwVar);
            }
        } else {
            z12 = z11;
        }
        if (!z12) {
            sb2.append(j2.O);
        }
        sb2.append("id:");
        String str2 = this.f682b;
        if (str2 == null) {
            sb2.append("null");
        } else {
            sb2.append(str2);
        }
        if (d()) {
            sb2.append(j2.O);
            sb2.append("appId:");
            String str3 = this.f684c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(j2.O);
            sb2.append("type:");
            String str4 = this.f685d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        sb2.append(j2.O);
        sb2.append("requireAck:");
        sb2.append(this.f681a);
        if (g()) {
            sb2.append(j2.O);
            sb2.append("payload:");
            String str5 = this.f686e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("extra:");
            Map<String, String> map = this.f680a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("packageName:");
            String str6 = this.f687f;
            if (str6 == null) {
                sb2.append("null");
            } else {
                sb2.append(str6);
            }
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("category:");
            String str7 = this.f688g;
            if (str7 == null) {
                sb2.append("null");
            } else {
                sb2.append(str7);
            }
        }
        if (k()) {
            sb2.append(j2.O);
            sb2.append("regId:");
            String str8 = this.f689h;
            if (str8 == null) {
                sb2.append("null");
            } else {
                sb2.append(str8);
            }
        }
        if (l()) {
            sb2.append(j2.O);
            sb2.append("aliasName:");
            String str9 = this.f690i;
            if (str9 == null) {
                sb2.append("null");
            } else {
                sb2.append(str9);
            }
        }
        if (m()) {
            sb2.append(j2.O);
            sb2.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f678a;
            if (byteBuffer == null) {
                sb2.append("null");
            } else {
                it.a(byteBuffer, sb2);
            }
        }
        if (n()) {
            sb2.append(j2.O);
            sb2.append("createdTs:");
            sb2.append(this.f675a);
        }
        if (o()) {
            sb2.append(j2.O);
            sb2.append("alreadyLogClickInXmq:");
            sb2.append(this.f683b);
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public ig(String str, boolean z11) {
        this();
        this.f682b = str;
        this.f681a = z11;
        m6103a(true);
    }

    public hw a() {
        return this.f676a;
    }

    public String b() {
        return this.f684c;
    }

    public String c() {
        return this.f687f;
    }

    public boolean d() {
        return this.f684c != null;
    }

    public ig a(String str) {
        this.f682b = str;
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6102a();
        jdVar.a(f674a);
        if (this.f677a != null && m6104a()) {
            jdVar.a(f46012a);
            jdVar.a(this.f677a);
            jdVar.b();
        }
        if (this.f676a != null && m6107b()) {
            jdVar.a(f46013b);
            this.f676a.b(jdVar);
            jdVar.b();
        }
        if (this.f682b != null) {
            jdVar.a(f46014c);
            jdVar.a(this.f682b);
            jdVar.b();
        }
        if (this.f684c != null && d()) {
            jdVar.a(f46015d);
            jdVar.a(this.f684c);
            jdVar.b();
        }
        if (this.f685d != null && e()) {
            jdVar.a(f46016e);
            jdVar.a(this.f685d);
            jdVar.b();
        }
        jdVar.a(f46017f);
        jdVar.a(this.f681a);
        jdVar.b();
        if (this.f686e != null && g()) {
            jdVar.a(f46018g);
            jdVar.a(this.f686e);
            jdVar.b();
        }
        if (this.f680a != null && h()) {
            jdVar.a(f46019h);
            jdVar.a(new jc((byte) 11, (byte) 11, this.f680a.size()));
            for (Map.Entry<String, String> entry : this.f680a.entrySet()) {
                jdVar.a(entry.getKey());
                jdVar.a(entry.getValue());
            }
            jdVar.d();
            jdVar.b();
        }
        if (this.f687f != null && i()) {
            jdVar.a(f46020i);
            jdVar.a(this.f687f);
            jdVar.b();
        }
        if (this.f688g != null && j()) {
            jdVar.a(f46021j);
            jdVar.a(this.f688g);
            jdVar.b();
        }
        if (this.f689h != null && k()) {
            jdVar.a(f46022k);
            jdVar.a(this.f689h);
            jdVar.b();
        }
        if (this.f690i != null && l()) {
            jdVar.a(f46023l);
            jdVar.a(this.f690i);
            jdVar.b();
        }
        if (this.f678a != null && m()) {
            jdVar.a(f46024m);
            jdVar.a(this.f678a);
            jdVar.b();
        }
        if (n()) {
            jdVar.a(f46025n);
            jdVar.a(this.f675a);
            jdVar.b();
        }
        if (o()) {
            jdVar.a(f46026o);
            jdVar.a(this.f683b);
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    public void c(boolean z11) {
        this.f679a.set(2, z11);
    }

    public ig a(ByteBuffer byteBuffer) {
        this.f678a = byteBuffer;
        return this;
    }

    public void b(boolean z11) {
        this.f679a.set(1, z11);
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6108c() {
        return this.f682b != null;
    }

    public ig a(Map<String, String> map) {
        this.f680a = map;
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6107b() {
        return this.f676a != null;
    }

    public ig a(boolean z11) {
        this.f681a = z11;
        m6103a(true);
        return this;
    }

    public ig a(byte[] bArr) {
        a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m6100a() {
        return this.f682b;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m6101a() {
        return this.f680a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6102a() {
        if (this.f682b != null) {
            return;
        }
        throw new je("Required field 'id' was not present! Struct: " + toString());
    }

    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                if (f()) {
                    m6102a();
                    return;
                }
                throw new je("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
            }
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f677a = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 2:
                    if (b11 == 12) {
                        hw hwVar = new hw();
                        this.f676a = hwVar;
                        hwVar.a(jdVar);
                        break;
                    }
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f682b = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f684c = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f685d = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 6:
                    if (b11 == 2) {
                        this.f681a = jdVar.mo6167a();
                        m6103a(true);
                        continue;
                    }
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f686e = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 8:
                    if (b11 == 13) {
                        jc mo6159a = jdVar.mo6159a();
                        this.f680a = new HashMap(mo6159a.f845a * 2);
                        for (int i11 = 0; i11 < mo6159a.f845a; i11++) {
                            this.f680a.put(jdVar.mo6162a(), jdVar.mo6162a());
                        }
                        jdVar.h();
                        break;
                    }
                    break;
                case 9:
                    if (b11 == 11) {
                        this.f687f = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 10:
                    if (b11 == 11) {
                        this.f688g = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 12:
                    if (b11 == 11) {
                        this.f689h = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 13:
                    if (b11 == 11) {
                        this.f690i = jdVar.mo6162a();
                        continue;
                    }
                    break;
                case 14:
                    if (b11 == 11) {
                        this.f678a = jdVar.mo6163a();
                        continue;
                    }
                    break;
                case 15:
                    if (b11 == 10) {
                        this.f675a = jdVar.mo6156a();
                        b(true);
                        break;
                    }
                    break;
                case 20:
                    if (b11 == 2) {
                        this.f683b = jdVar.mo6167a();
                        c(true);
                        continue;
                    }
                    break;
            }
            jg.a(jdVar, b11);
            jdVar.g();
        }
    }

    public void a(String str, String str2) {
        if (this.f680a == null) {
            this.f680a = new HashMap();
        }
        this.f680a.put(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6103a(boolean z11) {
        this.f679a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6104a() {
        return this.f677a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6105a(ig igVar) {
        if (igVar == null) {
            return false;
        }
        boolean m6104a = m6104a();
        boolean m6104a2 = igVar.m6104a();
        if ((m6104a || m6104a2) && !(m6104a && m6104a2 && this.f677a.equals(igVar.f677a))) {
            return false;
        }
        boolean m6107b = m6107b();
        boolean m6107b2 = igVar.m6107b();
        if ((m6107b || m6107b2) && !(m6107b && m6107b2 && this.f676a.m6057a(igVar.f676a))) {
            return false;
        }
        boolean m6108c = m6108c();
        boolean m6108c2 = igVar.m6108c();
        if ((m6108c || m6108c2) && !(m6108c && m6108c2 && this.f682b.equals(igVar.f682b))) {
            return false;
        }
        boolean d11 = d();
        boolean d12 = igVar.d();
        if ((d11 || d12) && !(d11 && d12 && this.f684c.equals(igVar.f684c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = igVar.e();
        if (((e11 || e12) && !(e11 && e12 && this.f685d.equals(igVar.f685d))) || this.f681a != igVar.f681a) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = igVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f686e.equals(igVar.f686e))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = igVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f680a.equals(igVar.f680a))) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = igVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f687f.equals(igVar.f687f))) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = igVar.j();
        if ((j11 || j12) && !(j11 && j12 && this.f688g.equals(igVar.f688g))) {
            return false;
        }
        boolean k11 = k();
        boolean k12 = igVar.k();
        if ((k11 || k12) && !(k11 && k12 && this.f689h.equals(igVar.f689h))) {
            return false;
        }
        boolean l11 = l();
        boolean l12 = igVar.l();
        if ((l11 || l12) && !(l11 && l12 && this.f690i.equals(igVar.f690i))) {
            return false;
        }
        boolean m11 = m();
        boolean m12 = igVar.m();
        if ((m11 || m12) && !(m11 && m12 && this.f678a.equals(igVar.f678a))) {
            return false;
        }
        boolean n11 = n();
        boolean n12 = igVar.n();
        if ((n11 || n12) && !(n11 && n12 && this.f675a == igVar.f675a)) {
            return false;
        }
        boolean o11 = o();
        boolean o12 = igVar.o();
        if (o11 || o12) {
            return o11 && o12 && this.f683b == igVar.f683b;
        }
        return true;
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m6106a() {
        a(it.a(this.f678a));
        return this.f678a.array();
    }
}
