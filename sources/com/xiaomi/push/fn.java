package com.xiaomi.push;

import android.os.Build;
import com.xiaomi.push.dw;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* loaded from: classes8.dex */
public class fn {

    /* renamed from: a, reason: collision with root package name */
    private int f45572a;

    /* renamed from: a, reason: collision with other field name */
    private fr f416a;

    /* renamed from: a, reason: collision with other field name */
    private OutputStream f417a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f420a;

    /* renamed from: b, reason: collision with root package name */
    private int f45573b;

    /* renamed from: a, reason: collision with other field name */
    ByteBuffer f418a = ByteBuffer.allocate(2048);

    /* renamed from: b, reason: collision with other field name */
    private ByteBuffer f421b = ByteBuffer.allocate(4);

    /* renamed from: a, reason: collision with other field name */
    private Adler32 f419a = new Adler32();

    public fn(OutputStream outputStream, fr frVar) {
        this.f417a = new BufferedOutputStream(outputStream);
        this.f416a = frVar;
        TimeZone timeZone = TimeZone.getDefault();
        this.f45572a = timeZone.getRawOffset() / 3600000;
        this.f45573b = timeZone.useDaylightTime() ? 1 : 0;
    }

    public int a(fk fkVar) {
        int c11 = fkVar.c();
        if (c11 > 32768) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Blob size=" + c11 + " should be less than 32768 Drop blob chid=" + fkVar.a() + " id=" + fkVar.e());
            return 0;
        }
        this.f418a.clear();
        int i11 = c11 + 12;
        if (i11 > this.f418a.capacity() || this.f418a.capacity() > 4096) {
            this.f418a = ByteBuffer.allocate(i11);
        }
        this.f418a.putShort((short) -15618);
        this.f418a.putShort((short) 5);
        this.f418a.putInt(c11);
        int position = this.f418a.position();
        this.f418a = fkVar.mo5944a(this.f418a);
        if (!"CONN".equals(fkVar.m5943a())) {
            if (this.f420a == null) {
                this.f420a = this.f416a.m5958a();
            }
            com.xiaomi.push.service.bp.a(this.f420a, this.f418a.array(), true, position, c11);
        }
        this.f419a.reset();
        this.f419a.update(this.f418a.array(), 0, this.f418a.position());
        this.f421b.putInt(0, (int) this.f419a.getValue());
        this.f417a.write(this.f418a.array(), 0, this.f418a.position());
        this.f417a.write(this.f421b.array(), 0, 4);
        this.f417a.flush();
        int position2 = this.f418a.position() + 4;
        com.xiaomi.channel.commonutils.logger.b.c("[Slim] Wrote {cmd=" + fkVar.m5943a() + ";chid=" + fkVar.a() + ";len=" + position2 + com.alipay.sdk.m.u.i.f11099d);
        return position2;
    }

    public void b() {
        fk fkVar = new fk();
        fkVar.a("CLOSE", (String) null);
        a(fkVar);
        this.f417a.close();
    }

    public void a() {
        dw.e eVar = new dw.e();
        eVar.a(106);
        String str = Build.MODEL;
        eVar.a(str);
        eVar.b(s.m6184a());
        eVar.c(com.xiaomi.push.service.bv.m6265a());
        eVar.b(48);
        eVar.d(this.f416a.m5967b());
        eVar.e(this.f416a.mo5965a());
        eVar.f(Locale.getDefault().toString());
        int i11 = Build.VERSION.SDK_INT;
        eVar.c(i11);
        byte[] mo5973a = this.f416a.m5964a().mo5973a();
        if (mo5973a != null) {
            eVar.a(dw.b.a(mo5973a));
        }
        fk fkVar = new fk();
        fkVar.a(0);
        fkVar.a("CONN", (String) null);
        fkVar.a(0L, "xiaomi.com", null);
        fkVar.a(eVar.m5907a(), (String) null);
        a(fkVar);
        com.xiaomi.channel.commonutils.logger.b.m5639a("[slim] open conn: andver=" + i11 + " sdk=48 tz=" + this.f45572a + ":" + this.f45573b + " Model=" + str + " os=" + Build.VERSION.INCREMENTAL);
    }
}
