package com.xiaomi.push;

import com.xiaomi.push.iz;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class jj extends iz {

    /* renamed from: b, reason: collision with root package name */
    private static int f46171b = 10000;

    /* renamed from: c, reason: collision with root package name */
    private static int f46172c = 10000;

    /* renamed from: d, reason: collision with root package name */
    private static int f46173d = 10000;

    /* renamed from: e, reason: collision with root package name */
    private static int f46174e = 10485760;

    /* renamed from: f, reason: collision with root package name */
    private static int f46175f = 104857600;

    public static class a extends iz.a {
        public a() {
            super(false, true);
        }

        @Override // com.xiaomi.push.iz.a, com.xiaomi.push.jf
        public jd a(jn jnVar) {
            jj jjVar = new jj(jnVar, ((iz.a) this).f840a, this.f46159b);
            int i11 = ((iz.a) this).f46158a;
            if (i11 != 0) {
                jjVar.b(i11);
            }
            return jjVar;
        }

        public a(boolean z11, boolean z12, int i11) {
            super(z11, z12, i11);
        }
    }

    public jj(jn jnVar, boolean z11, boolean z12) {
        super(jnVar, z11, z12);
    }

    @Override // com.xiaomi.push.iz, com.xiaomi.push.jd
    /* renamed from: a */
    public jb mo6158a() {
        byte a11 = a();
        int mo6155a = mo6155a();
        if (mo6155a <= f46172c) {
            return new jb(a11, mo6155a);
        }
        throw new je(3, "Thrift list size " + mo6155a + " out of range!");
    }

    @Override // com.xiaomi.push.iz, com.xiaomi.push.jd
    /* renamed from: a */
    public jc mo6159a() {
        byte a11 = a();
        byte a12 = a();
        int mo6155a = mo6155a();
        if (mo6155a <= f46171b) {
            return new jc(a11, a12, mo6155a);
        }
        throw new je(3, "Thrift map size " + mo6155a + " out of range!");
    }

    @Override // com.xiaomi.push.iz, com.xiaomi.push.jd
    /* renamed from: a */
    public jh mo6160a() {
        byte a11 = a();
        int mo6155a = mo6155a();
        if (mo6155a <= f46173d) {
            return new jh(a11, mo6155a);
        }
        throw new je(3, "Thrift set size " + mo6155a + " out of range!");
    }

    @Override // com.xiaomi.push.iz, com.xiaomi.push.jd
    /* renamed from: a */
    public String mo6162a() {
        int mo6155a = mo6155a();
        if (mo6155a > f46174e) {
            throw new je(3, "Thrift string size " + mo6155a + " out of range!");
        }
        if (((jd) this).f46166a.b() < mo6155a) {
            return a(mo6155a);
        }
        try {
            String str = new String(((jd) this).f46166a.mo6180a(), ((jd) this).f46166a.a(), mo6155a, "UTF-8");
            ((jd) this).f46166a.a(mo6155a);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new ix("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.iz, com.xiaomi.push.jd
    /* renamed from: a */
    public ByteBuffer mo6163a() {
        int mo6155a = mo6155a();
        if (mo6155a > f46175f) {
            throw new je(3, "Thrift binary size " + mo6155a + " out of range!");
        }
        c(mo6155a);
        if (((jd) this).f46166a.b() >= mo6155a) {
            ByteBuffer wrap = ByteBuffer.wrap(((jd) this).f46166a.mo6180a(), ((jd) this).f46166a.a(), mo6155a);
            ((jd) this).f46166a.a(mo6155a);
            return wrap;
        }
        byte[] bArr = new byte[mo6155a];
        ((jd) this).f46166a.b(bArr, 0, mo6155a);
        return ByteBuffer.wrap(bArr);
    }
}
