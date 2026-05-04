package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* loaded from: classes8.dex */
public class hu implements is<hu, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f569a;

    /* renamed from: a, reason: collision with other field name */
    public long f570a;

    /* renamed from: a, reason: collision with other field name */
    public String f571a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f572a;

    /* renamed from: a, reason: collision with other field name */
    public Map<String, String> f573a;

    /* renamed from: a, reason: collision with other field name */
    public boolean f574a;

    /* renamed from: b, reason: collision with other field name */
    public int f575b;

    /* renamed from: b, reason: collision with other field name */
    public String f576b;

    /* renamed from: b, reason: collision with other field name */
    public Map<String, String> f577b;

    /* renamed from: c, reason: collision with other field name */
    public int f578c;

    /* renamed from: c, reason: collision with other field name */
    public String f579c;

    /* renamed from: c, reason: collision with other field name */
    public Map<String, String> f580c;

    /* renamed from: d, reason: collision with other field name */
    public String f581d;

    /* renamed from: e, reason: collision with other field name */
    public String f582e;

    /* renamed from: a, reason: collision with other field name */
    private static final ji f568a = new ji("PushMetaInfo");

    /* renamed from: a, reason: collision with root package name */
    private static final ja f45921a = new ja("", (byte) 11, 1);

    /* renamed from: b, reason: collision with root package name */
    private static final ja f45922b = new ja("", (byte) 10, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final ja f45923c = new ja("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final ja f45924d = new ja("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ja f45925e = new ja("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final ja f45926f = new ja("", (byte) 8, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final ja f45927g = new ja("", (byte) 11, 7);

    /* renamed from: h, reason: collision with root package name */
    private static final ja f45928h = new ja("", (byte) 8, 8);

    /* renamed from: i, reason: collision with root package name */
    private static final ja f45929i = new ja("", (byte) 8, 9);

    /* renamed from: j, reason: collision with root package name */
    private static final ja f45930j = new ja("", (byte) 13, 10);

    /* renamed from: k, reason: collision with root package name */
    private static final ja f45931k = new ja("", (byte) 13, 11);

    /* renamed from: l, reason: collision with root package name */
    private static final ja f45932l = new ja("", (byte) 2, 12);

    /* renamed from: m, reason: collision with root package name */
    private static final ja f45933m = new ja("", (byte) 13, 13);

    public hu() {
        this.f572a = new BitSet(5);
        this.f574a = false;
    }

    public int a() {
        return this.f569a;
    }

    public int b() {
        return this.f575b;
    }

    public int c() {
        return this.f578c;
    }

    public hu d(String str) {
        this.f581d = str;
        return this;
    }

    public void e(boolean z11) {
        this.f572a.set(4, z11);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof hu)) {
            return m6049a((hu) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f572a.get(1);
    }

    public boolean g() {
        return this.f582e != null;
    }

    public boolean h() {
        return this.f572a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f572a.get(3);
    }

    public boolean j() {
        return this.f573a != null;
    }

    public boolean k() {
        return this.f577b != null;
    }

    public boolean l() {
        return this.f574a;
    }

    public boolean m() {
        return this.f572a.get(4);
    }

    public boolean n() {
        return this.f580c != null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PushMetaInfo(");
        sb2.append("id:");
        String str = this.f571a;
        if (str == null) {
            sb2.append("null");
        } else {
            sb2.append(com.xiaomi.push.service.bd.a(str));
        }
        sb2.append(j2.O);
        sb2.append("messageTs:");
        sb2.append(this.f570a);
        if (m6054c()) {
            sb2.append(j2.O);
            sb2.append("topic:");
            String str2 = this.f576b;
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append(str2);
            }
        }
        if (m6055d()) {
            sb2.append(j2.O);
            sb2.append("title:");
            String str3 = this.f579c;
            if (str3 == null) {
                sb2.append("null");
            } else {
                sb2.append(str3);
            }
        }
        if (e()) {
            sb2.append(j2.O);
            sb2.append("description:");
            String str4 = this.f581d;
            if (str4 == null) {
                sb2.append("null");
            } else {
                sb2.append(str4);
            }
        }
        if (f()) {
            sb2.append(j2.O);
            sb2.append("notifyType:");
            sb2.append(this.f569a);
        }
        if (g()) {
            sb2.append(j2.O);
            sb2.append("url:");
            String str5 = this.f582e;
            if (str5 == null) {
                sb2.append("null");
            } else {
                sb2.append(str5);
            }
        }
        if (h()) {
            sb2.append(j2.O);
            sb2.append("passThrough:");
            sb2.append(this.f575b);
        }
        if (i()) {
            sb2.append(j2.O);
            sb2.append("notifyId:");
            sb2.append(this.f578c);
        }
        if (j()) {
            sb2.append(j2.O);
            sb2.append("extra:");
            Map<String, String> map = this.f573a;
            if (map == null) {
                sb2.append("null");
            } else {
                sb2.append(map);
            }
        }
        if (k()) {
            sb2.append(j2.O);
            sb2.append("internal:");
            Map<String, String> map2 = this.f577b;
            if (map2 == null) {
                sb2.append("null");
            } else {
                sb2.append(map2);
            }
        }
        if (m()) {
            sb2.append(j2.O);
            sb2.append("ignoreRegInfo:");
            sb2.append(this.f574a);
        }
        if (n()) {
            sb2.append(j2.O);
            sb2.append("apsProperFields:");
            Map<String, String> map3 = this.f580c;
            if (map3 == null) {
                sb2.append("null");
            } else {
                sb2.append(map3);
            }
        }
        sb2.append(pn.j.f81007d);
        return sb2.toString();
    }

    public hu(hu huVar) {
        BitSet bitSet = new BitSet(5);
        this.f572a = bitSet;
        bitSet.clear();
        this.f572a.or(huVar.f572a);
        if (huVar.m6048a()) {
            this.f571a = huVar.f571a;
        }
        this.f570a = huVar.f570a;
        if (huVar.m6054c()) {
            this.f576b = huVar.f576b;
        }
        if (huVar.m6055d()) {
            this.f579c = huVar.f579c;
        }
        if (huVar.e()) {
            this.f581d = huVar.f581d;
        }
        this.f569a = huVar.f569a;
        if (huVar.g()) {
            this.f582e = huVar.f582e;
        }
        this.f575b = huVar.f575b;
        this.f578c = huVar.f578c;
        if (huVar.j()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, String> entry : huVar.f573a.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            this.f573a = hashMap;
        }
        if (huVar.k()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry<String, String> entry2 : huVar.f577b.entrySet()) {
                hashMap2.put(entry2.getKey(), entry2.getValue());
            }
            this.f577b = hashMap2;
        }
        this.f574a = huVar.f574a;
        if (huVar.n()) {
            HashMap hashMap3 = new HashMap();
            for (Map.Entry<String, String> entry3 : huVar.f580c.entrySet()) {
                hashMap3.put(entry3.getKey(), entry3.getValue());
            }
            this.f580c = hashMap3;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hu huVar) {
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
        if (!getClass().equals(huVar.getClass())) {
            return getClass().getName().compareTo(huVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m6048a()).compareTo(Boolean.valueOf(huVar.m6048a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m6048a() && (a24 = it.a(this.f571a, huVar.f571a)) != 0) {
            return a24;
        }
        int compareTo2 = Boolean.valueOf(m6052b()).compareTo(Boolean.valueOf(huVar.m6052b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (m6052b() && (a23 = it.a(this.f570a, huVar.f570a)) != 0) {
            return a23;
        }
        int compareTo3 = Boolean.valueOf(m6054c()).compareTo(Boolean.valueOf(huVar.m6054c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (m6054c() && (a22 = it.a(this.f576b, huVar.f576b)) != 0) {
            return a22;
        }
        int compareTo4 = Boolean.valueOf(m6055d()).compareTo(Boolean.valueOf(huVar.m6055d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (m6055d() && (a21 = it.a(this.f579c, huVar.f579c)) != 0) {
            return a21;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(huVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a19 = it.a(this.f581d, huVar.f581d)) != 0) {
            return a19;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(huVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a18 = it.a(this.f569a, huVar.f569a)) != 0) {
            return a18;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(huVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a17 = it.a(this.f582e, huVar.f582e)) != 0) {
            return a17;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(huVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (h() && (a16 = it.a(this.f575b, huVar.f575b)) != 0) {
            return a16;
        }
        int compareTo9 = Boolean.valueOf(i()).compareTo(Boolean.valueOf(huVar.i()));
        if (compareTo9 != 0) {
            return compareTo9;
        }
        if (i() && (a15 = it.a(this.f578c, huVar.f578c)) != 0) {
            return a15;
        }
        int compareTo10 = Boolean.valueOf(j()).compareTo(Boolean.valueOf(huVar.j()));
        if (compareTo10 != 0) {
            return compareTo10;
        }
        if (j() && (a14 = it.a(this.f573a, huVar.f573a)) != 0) {
            return a14;
        }
        int compareTo11 = Boolean.valueOf(k()).compareTo(Boolean.valueOf(huVar.k()));
        if (compareTo11 != 0) {
            return compareTo11;
        }
        if (k() && (a13 = it.a(this.f577b, huVar.f577b)) != 0) {
            return a13;
        }
        int compareTo12 = Boolean.valueOf(m()).compareTo(Boolean.valueOf(huVar.m()));
        if (compareTo12 != 0) {
            return compareTo12;
        }
        if (m() && (a12 = it.a(this.f574a, huVar.f574a)) != 0) {
            return a12;
        }
        int compareTo13 = Boolean.valueOf(n()).compareTo(Boolean.valueOf(huVar.n()));
        if (compareTo13 != 0) {
            return compareTo13;
        }
        if (!n() || (a11 = it.a(this.f580c, huVar.f580c)) == 0) {
            return 0;
        }
        return a11;
    }

    public hu b(int i11) {
        this.f575b = i11;
        c(true);
        return this;
    }

    public hu c(int i11) {
        this.f578c = i11;
        d(true);
        return this;
    }

    public String d() {
        return this.f581d;
    }

    public boolean e() {
        return this.f581d != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m6043a() {
        return this.f570a;
    }

    public hu b(String str) {
        this.f576b = str;
        return this;
    }

    public hu c(String str) {
        this.f579c = str;
        return this;
    }

    public void d(boolean z11) {
        this.f572a.set(3, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public hu m6044a() {
        return new hu(this);
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m6050b() {
        return this.f576b;
    }

    /* renamed from: c, reason: collision with other method in class */
    public String m6053c() {
        return this.f579c;
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m6055d() {
        return this.f579c != null;
    }

    public hu a(int i11) {
        this.f569a = i11;
        b(true);
        return this;
    }

    /* renamed from: b, reason: collision with other method in class */
    public Map<String, String> m6051b() {
        return this.f577b;
    }

    public void c(boolean z11) {
        this.f572a.set(2, z11);
    }

    public hu a(String str) {
        this.f571a = str;
        return this;
    }

    @Override // com.xiaomi.push.is
    public void b(jd jdVar) {
        m6047a();
        jdVar.a(f568a);
        if (this.f571a != null) {
            jdVar.a(f45921a);
            jdVar.a(this.f571a);
            jdVar.b();
        }
        jdVar.a(f45922b);
        jdVar.a(this.f570a);
        jdVar.b();
        if (this.f576b != null && m6054c()) {
            jdVar.a(f45923c);
            jdVar.a(this.f576b);
            jdVar.b();
        }
        if (this.f579c != null && m6055d()) {
            jdVar.a(f45924d);
            jdVar.a(this.f579c);
            jdVar.b();
        }
        if (this.f581d != null && e()) {
            jdVar.a(f45925e);
            jdVar.a(this.f581d);
            jdVar.b();
        }
        if (f()) {
            jdVar.a(f45926f);
            jdVar.mo6166a(this.f569a);
            jdVar.b();
        }
        if (this.f582e != null && g()) {
            jdVar.a(f45927g);
            jdVar.a(this.f582e);
            jdVar.b();
        }
        if (h()) {
            jdVar.a(f45928h);
            jdVar.mo6166a(this.f575b);
            jdVar.b();
        }
        if (i()) {
            jdVar.a(f45929i);
            jdVar.mo6166a(this.f578c);
            jdVar.b();
        }
        if (this.f573a != null && j()) {
            jdVar.a(f45930j);
            jdVar.a(new jc((byte) 11, (byte) 11, this.f573a.size()));
            for (Map.Entry<String, String> entry : this.f573a.entrySet()) {
                jdVar.a(entry.getKey());
                jdVar.a(entry.getValue());
            }
            jdVar.d();
            jdVar.b();
        }
        if (this.f577b != null && k()) {
            jdVar.a(f45931k);
            jdVar.a(new jc((byte) 11, (byte) 11, this.f577b.size()));
            for (Map.Entry<String, String> entry2 : this.f577b.entrySet()) {
                jdVar.a(entry2.getKey());
                jdVar.a(entry2.getValue());
            }
            jdVar.d();
            jdVar.b();
        }
        if (m()) {
            jdVar.a(f45932l);
            jdVar.a(this.f574a);
            jdVar.b();
        }
        if (this.f580c != null && n()) {
            jdVar.a(f45933m);
            jdVar.a(new jc((byte) 11, (byte) 11, this.f580c.size()));
            for (Map.Entry<String, String> entry3 : this.f580c.entrySet()) {
                jdVar.a(entry3.getKey());
                jdVar.a(entry3.getValue());
            }
            jdVar.d();
            jdVar.b();
        }
        jdVar.c();
        jdVar.mo6165a();
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m6054c() {
        return this.f576b != null;
    }

    public hu a(Map<String, String> map) {
        this.f573a = map;
        return this;
    }

    public void b(String str, String str2) {
        if (this.f577b == null) {
            this.f577b = new HashMap();
        }
        this.f577b.put(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m6045a() {
        return this.f571a;
    }

    public void b(boolean z11) {
        this.f572a.set(1, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public Map<String, String> m6046a() {
        return this.f573a;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m6052b() {
        return this.f572a.get(0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6047a() {
        if (this.f571a != null) {
            return;
        }
        throw new je("Required field 'id' was not present! Struct: " + toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.xiaomi.push.is
    public void a(jd jdVar) {
        jdVar.mo6161a();
        while (true) {
            ja mo6157a = jdVar.mo6157a();
            byte b11 = mo6157a.f46162a;
            if (b11 == 0) {
                jdVar.f();
                if (m6052b()) {
                    m6047a();
                    return;
                }
                throw new je("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            int i11 = 0;
            switch (mo6157a.f843a) {
                case 1:
                    if (b11 == 11) {
                        this.f571a = jdVar.mo6162a();
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 2:
                    if (b11 == 10) {
                        this.f570a = jdVar.mo6156a();
                        a(true);
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 3:
                    if (b11 == 11) {
                        this.f576b = jdVar.mo6162a();
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 4:
                    if (b11 == 11) {
                        this.f579c = jdVar.mo6162a();
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 5:
                    if (b11 == 11) {
                        this.f581d = jdVar.mo6162a();
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 6:
                    if (b11 == 8) {
                        this.f569a = jdVar.mo6155a();
                        b(true);
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 7:
                    if (b11 == 11) {
                        this.f582e = jdVar.mo6162a();
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 8:
                    if (b11 == 8) {
                        this.f575b = jdVar.mo6155a();
                        c(true);
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 9:
                    if (b11 == 8) {
                        this.f578c = jdVar.mo6155a();
                        d(true);
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 10:
                    if (b11 == 13) {
                        jc mo6159a = jdVar.mo6159a();
                        this.f573a = new HashMap(mo6159a.f845a * 2);
                        while (i11 < mo6159a.f845a) {
                            this.f573a.put(jdVar.mo6162a(), jdVar.mo6162a());
                            i11++;
                        }
                        jdVar.h();
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 11:
                    if (b11 == 13) {
                        jc mo6159a2 = jdVar.mo6159a();
                        this.f577b = new HashMap(mo6159a2.f845a * 2);
                        while (i11 < mo6159a2.f845a) {
                            this.f577b.put(jdVar.mo6162a(), jdVar.mo6162a());
                            i11++;
                        }
                        jdVar.h();
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 12:
                    if (b11 == 2) {
                        this.f574a = jdVar.mo6167a();
                        e(true);
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                case 13:
                    if (b11 == 13) {
                        jc mo6159a3 = jdVar.mo6159a();
                        this.f580c = new HashMap(mo6159a3.f845a * 2);
                        while (i11 < mo6159a3.f845a) {
                            this.f580c.put(jdVar.mo6162a(), jdVar.mo6162a());
                            i11++;
                        }
                        jdVar.h();
                        break;
                    }
                    jg.a(jdVar, b11);
                    break;
                default:
                    jg.a(jdVar, b11);
                    break;
            }
            jdVar.g();
        }
    }

    public void a(String str, String str2) {
        if (this.f573a == null) {
            this.f573a = new HashMap();
        }
        this.f573a.put(str, str2);
    }

    public void a(boolean z11) {
        this.f572a.set(0, z11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6048a() {
        return this.f571a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6049a(hu huVar) {
        if (huVar == null) {
            return false;
        }
        boolean m6048a = m6048a();
        boolean m6048a2 = huVar.m6048a();
        if (((m6048a || m6048a2) && !(m6048a && m6048a2 && this.f571a.equals(huVar.f571a))) || this.f570a != huVar.f570a) {
            return false;
        }
        boolean m6054c = m6054c();
        boolean m6054c2 = huVar.m6054c();
        if ((m6054c || m6054c2) && !(m6054c && m6054c2 && this.f576b.equals(huVar.f576b))) {
            return false;
        }
        boolean m6055d = m6055d();
        boolean m6055d2 = huVar.m6055d();
        if ((m6055d || m6055d2) && !(m6055d && m6055d2 && this.f579c.equals(huVar.f579c))) {
            return false;
        }
        boolean e11 = e();
        boolean e12 = huVar.e();
        if ((e11 || e12) && !(e11 && e12 && this.f581d.equals(huVar.f581d))) {
            return false;
        }
        boolean f11 = f();
        boolean f12 = huVar.f();
        if ((f11 || f12) && !(f11 && f12 && this.f569a == huVar.f569a)) {
            return false;
        }
        boolean g11 = g();
        boolean g12 = huVar.g();
        if ((g11 || g12) && !(g11 && g12 && this.f582e.equals(huVar.f582e))) {
            return false;
        }
        boolean h11 = h();
        boolean h12 = huVar.h();
        if ((h11 || h12) && !(h11 && h12 && this.f575b == huVar.f575b)) {
            return false;
        }
        boolean i11 = i();
        boolean i12 = huVar.i();
        if ((i11 || i12) && !(i11 && i12 && this.f578c == huVar.f578c)) {
            return false;
        }
        boolean j11 = j();
        boolean j12 = huVar.j();
        if ((j11 || j12) && !(j11 && j12 && this.f573a.equals(huVar.f573a))) {
            return false;
        }
        boolean k11 = k();
        boolean k12 = huVar.k();
        if ((k11 || k12) && !(k11 && k12 && this.f577b.equals(huVar.f577b))) {
            return false;
        }
        boolean m11 = m();
        boolean m12 = huVar.m();
        if ((m11 || m12) && !(m11 && m12 && this.f574a == huVar.f574a)) {
            return false;
        }
        boolean n11 = n();
        boolean n12 = huVar.n();
        if (n11 || n12) {
            return n11 && n12 && this.f580c.equals(huVar.f580c);
        }
        return true;
    }
}
