package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class iz extends jd {

    /* renamed from: a, reason: collision with root package name */
    private static final ji f46150a = new ji();

    /* renamed from: a, reason: collision with other field name */
    protected int f835a;

    /* renamed from: a, reason: collision with other field name */
    protected boolean f836a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f837a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f46151b;

    /* renamed from: b, reason: collision with other field name */
    private byte[] f838b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f46152c;

    /* renamed from: c, reason: collision with other field name */
    private byte[] f839c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f46153d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f46154e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f46155f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f46156g;

    /* renamed from: h, reason: collision with root package name */
    private byte[] f46157h;

    public static class a implements jf {

        /* renamed from: a, reason: collision with root package name */
        protected int f46158a;

        /* renamed from: a, reason: collision with other field name */
        protected boolean f840a;

        /* renamed from: b, reason: collision with root package name */
        protected boolean f46159b;

        public a() {
            this(false, true);
        }

        @Override // com.xiaomi.push.jf
        public jd a(jn jnVar) {
            iz izVar = new iz(jnVar, this.f840a, this.f46159b);
            int i11 = this.f46158a;
            if (i11 != 0) {
                izVar.b(i11);
            }
            return izVar;
        }

        public a(boolean z11, boolean z12) {
            this(z11, z12, 0);
        }

        public a(boolean z11, boolean z12, int i11) {
            this.f840a = z11;
            this.f46159b = z12;
            this.f46158a = i11;
        }
    }

    public iz(jn jnVar, boolean z11, boolean z12) {
        super(jnVar);
        this.f46152c = false;
        this.f837a = new byte[1];
        this.f838b = new byte[2];
        this.f839c = new byte[4];
        this.f46153d = new byte[8];
        this.f46154e = new byte[1];
        this.f46155f = new byte[2];
        this.f46156g = new byte[4];
        this.f46157h = new byte[8];
        this.f836a = z11;
        this.f46151b = z12;
    }

    @Override // com.xiaomi.push.jd
    public byte a() {
        if (((jd) this).f46166a.b() < 1) {
            a(this.f46154e, 0, 1);
            return this.f46154e[0];
        }
        byte b11 = ((jd) this).f46166a.mo6180a()[((jd) this).f46166a.a()];
        ((jd) this).f46166a.a(1);
        return b11;
    }

    @Override // com.xiaomi.push.jd
    public void b() {
    }

    @Override // com.xiaomi.push.jd
    public void c() {
        a((byte) 0);
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public double mo6154a() {
        return Double.longBitsToDouble(mo6156a());
    }

    public void b(int i11) {
        this.f835a = i11;
        this.f46152c = true;
    }

    public void c(int i11) {
        if (i11 < 0) {
            throw new ix("Negative length: " + i11);
        }
        if (this.f46152c) {
            int i12 = this.f835a - i11;
            this.f835a = i12;
            if (i12 >= 0) {
                return;
            }
            throw new ix("Message length exceeded: " + i11);
        }
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public int mo6155a() {
        int i11;
        byte[] bArr = this.f46156g;
        if (((jd) this).f46166a.b() >= 4) {
            bArr = ((jd) this).f46166a.mo6180a();
            i11 = ((jd) this).f46166a.a();
            ((jd) this).f46166a.a(4);
        } else {
            a(this.f46156g, 0, 4);
            i11 = 0;
        }
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    private int a(byte[] bArr, int i11, int i12) {
        c(i12);
        return ((jd) this).f46166a.b(bArr, i11, i12);
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public long mo6156a() {
        int i11;
        byte[] bArr = this.f46157h;
        if (((jd) this).f46166a.b() >= 8) {
            bArr = ((jd) this).f46166a.mo6180a();
            i11 = ((jd) this).f46166a.a();
            ((jd) this).f46166a.a(8);
        } else {
            a(this.f46157h, 0, 8);
            i11 = 0;
        }
        return (bArr[i11 + 7] & 255) | ((bArr[i11] & 255) << 56) | ((bArr[i11 + 1] & 255) << 48) | ((bArr[i11 + 2] & 255) << 40) | ((bArr[i11 + 3] & 255) << 32) | ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8);
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public ja mo6157a() {
        byte a11 = a();
        return new ja("", a11, a11 == 0 ? (short) 0 : mo6164a());
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public jb mo6158a() {
        return new jb(a(), mo6155a());
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public jc mo6159a() {
        return new jc(a(), a(), mo6155a());
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public jh mo6160a() {
        return new jh(a(), mo6155a());
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public ji mo6161a() {
        return f46150a;
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public String mo6162a() {
        int mo6155a = mo6155a();
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

    public String a(int i11) {
        try {
            c(i11);
            byte[] bArr = new byte[i11];
            ((jd) this).f46166a.b(bArr, 0, i11);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new ix("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public ByteBuffer mo6163a() {
        int mo6155a = mo6155a();
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

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public short mo6164a() {
        int i11;
        byte[] bArr = this.f46155f;
        if (((jd) this).f46166a.b() >= 2) {
            bArr = ((jd) this).f46166a.mo6180a();
            i11 = ((jd) this).f46166a.a();
            ((jd) this).f46166a.a(2);
        } else {
            a(this.f46155f, 0, 2);
            i11 = 0;
        }
        return (short) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public void mo6165a() {
    }

    @Override // com.xiaomi.push.jd
    public void a(byte b11) {
        byte[] bArr = this.f837a;
        bArr[0] = b11;
        ((jd) this).f46166a.mo6179a(bArr, 0, 1);
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public void mo6166a(int i11) {
        byte[] bArr = this.f839c;
        bArr[0] = (byte) ((i11 >> 24) & 255);
        bArr[1] = (byte) ((i11 >> 16) & 255);
        bArr[2] = (byte) ((i11 >> 8) & 255);
        bArr[3] = (byte) (i11 & 255);
        ((jd) this).f46166a.mo6179a(bArr, 0, 4);
    }

    @Override // com.xiaomi.push.jd
    public void d() {
    }

    @Override // com.xiaomi.push.jd
    public void e() {
    }

    @Override // com.xiaomi.push.jd
    public void f() {
    }

    @Override // com.xiaomi.push.jd
    public void g() {
    }

    @Override // com.xiaomi.push.jd
    public void h() {
    }

    @Override // com.xiaomi.push.jd
    public void i() {
    }

    @Override // com.xiaomi.push.jd
    public void j() {
    }

    @Override // com.xiaomi.push.jd
    public void a(long j11) {
        byte[] bArr = this.f46153d;
        bArr[0] = (byte) ((j11 >> 56) & 255);
        bArr[1] = (byte) ((j11 >> 48) & 255);
        bArr[2] = (byte) ((j11 >> 40) & 255);
        bArr[3] = (byte) ((j11 >> 32) & 255);
        bArr[4] = (byte) ((j11 >> 24) & 255);
        bArr[5] = (byte) ((j11 >> 16) & 255);
        bArr[6] = (byte) ((j11 >> 8) & 255);
        bArr[7] = (byte) (j11 & 255);
        ((jd) this).f46166a.mo6179a(bArr, 0, 8);
    }

    @Override // com.xiaomi.push.jd
    public void a(ja jaVar) {
        a(jaVar.f46162a);
        a(jaVar.f843a);
    }

    @Override // com.xiaomi.push.jd
    public void a(jb jbVar) {
        a(jbVar.f46163a);
        mo6166a(jbVar.f844a);
    }

    @Override // com.xiaomi.push.jd
    public void a(jc jcVar) {
        a(jcVar.f46164a);
        a(jcVar.f46165b);
        mo6166a(jcVar.f845a);
    }

    @Override // com.xiaomi.push.jd
    public void a(ji jiVar) {
    }

    @Override // com.xiaomi.push.jd
    public void a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo6166a(bytes.length);
            ((jd) this).f46166a.mo6179a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new ix("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.jd
    public void a(ByteBuffer byteBuffer) {
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo6166a(limit);
        ((jd) this).f46166a.mo6179a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    @Override // com.xiaomi.push.jd
    public void a(short s11) {
        byte[] bArr = this.f838b;
        bArr[0] = (byte) ((s11 >> 8) & 255);
        bArr[1] = (byte) (s11 & 255);
        ((jd) this).f46166a.mo6179a(bArr, 0, 2);
    }

    @Override // com.xiaomi.push.jd
    public void a(boolean z11) {
        a(z11 ? (byte) 1 : (byte) 0);
    }

    @Override // com.xiaomi.push.jd
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo6167a() {
        return a() == 1;
    }
}
