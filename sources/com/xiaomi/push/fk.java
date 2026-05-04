package com.xiaomi.push;

import android.text.TextUtils;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.dw;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public class fk {

    /* renamed from: a, reason: collision with other field name */
    int f403a;

    /* renamed from: a, reason: collision with other field name */
    private dw.a f404a;

    /* renamed from: a, reason: collision with other field name */
    public com.xiaomi.push.service.an f405a;

    /* renamed from: a, reason: collision with other field name */
    String f406a;

    /* renamed from: a, reason: collision with other field name */
    private short f407a;

    /* renamed from: b, reason: collision with other field name */
    private byte[] f408b;

    /* renamed from: b, reason: collision with root package name */
    private static String f45568b = gx.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;

    /* renamed from: a, reason: collision with root package name */
    private static long f45567a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static final byte[] f402a = new byte[0];

    public fk() {
        this.f407a = (short) 2;
        this.f408b = f402a;
        this.f406a = null;
        this.f405a = null;
        this.f404a = new dw.a();
        this.f403a = 1;
    }

    public static synchronized String d() {
        String sb2;
        synchronized (fk.class) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(f45568b);
            long j11 = f45567a;
            f45567a = 1 + j11;
            sb3.append(Long.toString(j11));
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public int a() {
        return this.f404a.c();
    }

    public int b() {
        return this.f404a.f();
    }

    public int c() {
        return this.f404a.b() + 8 + this.f408b.length;
    }

    public String e() {
        String m5846e = this.f404a.m5846e();
        if ("ID_NOT_AVAILABLE".equals(m5846e)) {
            return null;
        }
        if (this.f404a.g()) {
            return m5846e;
        }
        String d11 = d();
        this.f404a.e(d11);
        return d11;
    }

    public String f() {
        return this.f406a;
    }

    public String g() {
        if (!this.f404a.m5841b()) {
            return null;
        }
        return Long.toString(this.f404a.m5836a()) + EmailAutoCompleteEditText.f17091d + this.f404a.m5838a() + "/" + this.f404a.m5840b();
    }

    public String toString() {
        return "Blob [chid=" + a() + "; Id=" + com.xiaomi.push.service.bd.a(e()) + "; cmd=" + m5943a() + "; type=" + ((int) m5945a()) + "; from=" + g() + " ]";
    }

    public fk(dw.a aVar, short s11, byte[] bArr) {
        this.f406a = null;
        this.f405a = null;
        this.f404a = aVar;
        this.f407a = s11;
        this.f408b = bArr;
        this.f403a = 2;
    }

    @Deprecated
    public static fk a(gm gmVar, String str) {
        int i11;
        fk fkVar = new fk();
        try {
            i11 = Integer.parseInt(gmVar.k());
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Blob parse chid err " + e11.getMessage());
            i11 = 1;
        }
        fkVar.a(i11);
        fkVar.a(gmVar.j());
        fkVar.c(gmVar.m());
        fkVar.b(gmVar.n());
        fkVar.a("XMLMSG", (String) null);
        try {
            fkVar.a(gmVar.mo5990a().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                fkVar.a((short) 3);
            } else {
                fkVar.a((short) 2);
                fkVar.a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e12) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Blob setPayload err： " + e12.getMessage());
        }
        return fkVar;
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m5949b() {
        return this.f404a.m5844d();
    }

    /* renamed from: c, reason: collision with other method in class */
    public String m5950c() {
        return this.f404a.m5848f();
    }

    public static fk a(ByteBuffer byteBuffer) {
        try {
            ByteBuffer slice = byteBuffer.slice();
            short s11 = slice.getShort(0);
            short s12 = slice.getShort(2);
            int i11 = slice.getInt(4);
            dw.a aVar = new dw.a();
            aVar.a(slice.array(), slice.arrayOffset() + 8, (int) s12);
            byte[] bArr = new byte[i11];
            slice.position(s12 + 8);
            slice.get(bArr, 0, i11);
            return new fk(aVar, s11, bArr);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("read Blob err :" + e11.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    public void b(int i11) {
        com.xiaomi.push.service.an anVar = new com.xiaomi.push.service.an();
        this.f405a = anVar;
        anVar.f46245a = i11;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int indexOf = str.indexOf(EmailAutoCompleteEditText.f17091d);
        try {
            long parseLong = Long.parseLong(str.substring(0, indexOf));
            int indexOf2 = str.indexOf("/", indexOf);
            String substring = str.substring(indexOf + 1, indexOf2);
            String substring2 = str.substring(indexOf2 + 1);
            this.f404a.a(parseLong);
            this.f404a.a(substring);
            this.f404a.b(substring2);
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Blob parse user err " + e11.getMessage());
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m5943a() {
        return this.f404a.m5842c();
    }

    public void b(String str) {
        this.f406a = str;
    }

    /* renamed from: a, reason: collision with other method in class */
    public ByteBuffer mo5944a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(c());
        }
        byteBuffer.putShort(this.f407a);
        byteBuffer.putShort((short) this.f404a.a());
        byteBuffer.putInt(this.f408b.length);
        int position = byteBuffer.position();
        this.f404a.m5906a(byteBuffer.array(), byteBuffer.arrayOffset() + position, this.f404a.a());
        byteBuffer.position(position + this.f404a.a());
        byteBuffer.put(this.f408b);
        return byteBuffer;
    }

    /* renamed from: a, reason: collision with other method in class */
    public short m5945a() {
        return this.f407a;
    }

    public void a(int i11) {
        this.f404a.a(i11);
    }

    public void a(long j11, String str, String str2) {
        if (j11 != 0) {
            this.f404a.a(j11);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f404a.a(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f404a.b(str2);
    }

    public void a(String str) {
        this.f404a.e(str);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command should not be empty");
        }
        this.f404a.c(str);
        this.f404a.m5837a();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f404a.d(str2);
    }

    public void a(short s11) {
        this.f407a = s11;
    }

    public void a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            this.f404a.c(0);
            this.f408b = bArr;
        } else {
            this.f404a.c(1);
            this.f408b = com.xiaomi.push.service.bp.a(com.xiaomi.push.service.bp.a(str, e()), bArr);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m5946a() {
        return this.f404a.j();
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m5947a() {
        return fl.a(this, this.f408b);
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m5948a(String str) {
        if (this.f404a.e() == 1) {
            return fl.a(this, com.xiaomi.push.service.bp.a(com.xiaomi.push.service.bp.a(str, e()), this.f408b));
        }
        if (this.f404a.e() == 0) {
            return fl.a(this, this.f408b);
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a("unknow cipher = " + this.f404a.e());
        return fl.a(this, this.f408b);
    }
}
