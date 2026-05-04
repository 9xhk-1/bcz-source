package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.dw;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* loaded from: classes8.dex */
class fm {

    /* renamed from: a, reason: collision with root package name */
    private Context f45570a;

    /* renamed from: a, reason: collision with other field name */
    private fr f410a;

    /* renamed from: a, reason: collision with other field name */
    private InputStream f411a;

    /* renamed from: a, reason: collision with other field name */
    private volatile boolean f414a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f415a;

    /* renamed from: a, reason: collision with other field name */
    private ByteBuffer f412a = ByteBuffer.allocate(2048);

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f45571b = ByteBuffer.allocate(4);

    /* renamed from: a, reason: collision with other field name */
    private Adler32 f413a = new Adler32();

    /* renamed from: a, reason: collision with other field name */
    private fp f409a = new fp();

    public fm(InputStream inputStream, fr frVar, Context context) {
        this.f411a = new BufferedInputStream(inputStream);
        this.f410a = frVar;
        this.f45570a = context;
    }

    private void c() {
        String str;
        StringBuilder sb2;
        boolean z11 = false;
        this.f414a = false;
        fk m5951a = m5951a();
        if ("CONN".equals(m5951a.m5943a())) {
            dw.f a11 = dw.f.a(m5951a.m5947a());
            if (a11.m5882a()) {
                this.f410a.a(a11.m5881a());
                z11 = true;
            }
            if (a11.c()) {
                dw.b m5880a = a11.m5880a();
                fk fkVar = new fk();
                fkVar.a("SYNC", "CONF");
                fkVar.a(m5880a.m5907a(), (String) null);
                this.f410a.a(fkVar);
            }
            com.xiaomi.channel.commonutils.logger.b.m5639a("[Slim] CONN: host = " + a11.m5883b());
        }
        if (!z11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("[Slim] Invalid CONN");
            throw new IOException("Invalid Connection");
        }
        this.f415a = this.f410a.m5958a();
        while (!this.f414a) {
            fk m5951a2 = m5951a();
            this.f410a.c();
            short m5945a = m5951a2.m5945a();
            if (m5945a != 1) {
                if (m5945a != 2) {
                    if (m5945a != 3) {
                        str = "[Slim] unknow blob type " + ((int) m5951a2.m5945a());
                        com.xiaomi.channel.commonutils.logger.b.m5639a(str);
                    } else {
                        try {
                            this.f410a.b(this.f409a.a(m5951a2.m5947a(), this.f410a));
                        } catch (Exception e11) {
                            e = e11;
                            sb2 = new StringBuilder();
                            sb2.append("[Slim] Parse packet from Blob chid=");
                            sb2.append(m5951a2.a());
                            sb2.append("; Id=");
                            sb2.append(m5951a2.e());
                            sb2.append(" failure:");
                            sb2.append(e.getMessage());
                            str = sb2.toString();
                            com.xiaomi.channel.commonutils.logger.b.m5639a(str);
                        }
                    }
                } else if ("SECMSG".equals(m5951a2.m5943a()) && ((m5951a2.a() == 2 || m5951a2.a() == 3) && TextUtils.isEmpty(m5951a2.m5949b()))) {
                    try {
                        this.f410a.b(this.f409a.a(m5951a2.m5948a(com.xiaomi.push.service.bg.a().a(Integer.valueOf(m5951a2.a()).toString(), m5951a2.g()).f46287h), this.f410a));
                    } catch (Exception e12) {
                        e = e12;
                        sb2 = new StringBuilder();
                        sb2.append("[Slim] Parse packet from Blob chid=");
                        sb2.append(m5951a2.a());
                        sb2.append("; Id=");
                        sb2.append(m5951a2.e());
                        sb2.append(" failure:");
                        sb2.append(e.getMessage());
                        str = sb2.toString();
                        com.xiaomi.channel.commonutils.logger.b.m5639a(str);
                    }
                } else if (m5951a2.a() == 10) {
                    m5951a2.b(10);
                    m5951a2.f405a.f931a = t.a(this.f45570a);
                    m5951a2.f405a.f933b = bi.e(this.f45570a);
                    m5951a2.f405a.f930a = System.currentTimeMillis();
                    com.xiaomi.channel.commonutils.logger.b.c("rcv blob from chid 10");
                }
            }
            this.f410a.a(m5951a2);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public fk m5951a() {
        int i11;
        try {
            ByteBuffer a11 = a();
            i11 = a11.position();
            try {
                a11.flip();
                a11.position(8);
                fk fqVar = i11 == 8 ? new fq() : fk.a(a11.slice());
                com.xiaomi.channel.commonutils.logger.b.c("[Slim] Read {cmd=" + fqVar.m5943a() + ";chid=" + fqVar.a() + ";len=" + i11 + com.alipay.sdk.m.u.i.f11099d);
                return fqVar;
            } catch (IOException e11) {
                e = e11;
                if (i11 == 0) {
                    i11 = this.f412a.position();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[Slim] read Blob [");
                byte[] array = this.f412a.array();
                if (i11 > 128) {
                    i11 = 128;
                }
                sb2.append(ag.a(array, 0, i11));
                sb2.append("] Err:");
                sb2.append(e.getMessage());
                com.xiaomi.channel.commonutils.logger.b.m5639a(sb2.toString());
                throw e;
            }
        } catch (IOException e12) {
            e = e12;
            i11 = 0;
        }
    }

    public void b() {
        this.f414a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.nio.ByteBuffer a() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fm.a():java.nio.ByteBuffer");
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5952a() {
        try {
            c();
        } catch (IOException e11) {
            if (!this.f414a) {
                throw e11;
            }
        }
    }

    private void a(ByteBuffer byteBuffer, int i11) {
        int position = byteBuffer.position();
        do {
            int read = this.f411a.read(byteBuffer.array(), position, i11);
            if (read == -1) {
                throw new EOFException();
            }
            i11 -= read;
            position += read;
        } while (i11 > 0);
        byteBuffer.position(position);
    }
}
