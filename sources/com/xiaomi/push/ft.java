package com.xiaomi.push;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.xiaomi.push.dw;
import com.xiaomi.push.fv;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* loaded from: classes8.dex */
public class ft implements gh {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f45580a = false;

    /* renamed from: a, reason: collision with other field name */
    private fv f430a;

    /* renamed from: a, reason: collision with other field name */
    private SimpleDateFormat f433a = new SimpleDateFormat("hh:mm:ss aaa");

    /* renamed from: a, reason: collision with other field name */
    private a f429a = null;

    /* renamed from: b, reason: collision with root package name */
    private a f45581b = null;

    /* renamed from: a, reason: collision with other field name */
    private fy f431a = null;

    /* renamed from: a, reason: collision with other field name */
    private final String f432a = "[Slim] ";

    public class a implements ga, gi {

        /* renamed from: a, reason: collision with other field name */
        String f434a;

        /* renamed from: a, reason: collision with other field name */
        private boolean f435a;

        public a(boolean z11) {
            this.f435a = z11;
            this.f434a = z11 ? " RCV " : " Sent ";
        }

        @Override // com.xiaomi.push.ga
        public void a(fk fkVar) {
            StringBuilder sb2;
            String str;
            if (ft.f45580a) {
                sb2 = new StringBuilder();
                sb2.append("[Slim] ");
                sb2.append(ft.this.f433a.format(new Date()));
                sb2.append(this.f434a);
                str = fkVar.toString();
            } else {
                sb2 = new StringBuilder();
                sb2.append("[Slim] ");
                sb2.append(ft.this.f433a.format(new Date()));
                sb2.append(this.f434a);
                sb2.append(" Blob [");
                sb2.append(fkVar.m5943a());
                sb2.append(",");
                sb2.append(fkVar.a());
                sb2.append(",");
                sb2.append(com.xiaomi.push.service.bd.a(fkVar.e()));
                str = "]";
            }
            sb2.append(str);
            com.xiaomi.channel.commonutils.logger.b.c(sb2.toString());
            if (fkVar == null || fkVar.a() != 99999) {
                return;
            }
            String m5943a = fkVar.m5943a();
            fk fkVar2 = null;
            if (!this.f435a) {
                if ("BIND".equals(m5943a)) {
                    com.xiaomi.channel.commonutils.logger.b.m5639a("build binded result for loopback.");
                    dw.d dVar = new dw.d();
                    dVar.a(true);
                    dVar.c("login success.");
                    dVar.b("success");
                    dVar.a("success");
                    fk fkVar3 = new fk();
                    fkVar3.a(dVar.m5907a(), (String) null);
                    fkVar3.a((short) 2);
                    fkVar3.a(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE);
                    fkVar3.a("BIND", (String) null);
                    fkVar3.a(fkVar.e());
                    fkVar3.b((String) null);
                    fkVar3.c(fkVar.g());
                    fkVar2 = fkVar3;
                } else if (!"UBND".equals(m5943a) && "SECMSG".equals(m5943a)) {
                    fk fkVar4 = new fk();
                    fkVar4.a(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE);
                    fkVar4.a("SECMSG", (String) null);
                    fkVar4.c(fkVar.g());
                    fkVar4.a(fkVar.e());
                    fkVar4.a(fkVar.m5945a());
                    fkVar4.b(fkVar.f());
                    fkVar4.a(fkVar.m5948a(com.xiaomi.push.service.bg.a().a(String.valueOf(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE), fkVar.g()).f46287h), (String) null);
                    fkVar2 = fkVar4;
                }
            }
            if (fkVar2 != null) {
                for (Map.Entry<ga, fv.a> entry : ft.this.f430a.m5966a().entrySet()) {
                    if (ft.this.f429a != entry.getKey()) {
                        entry.getValue().a(fkVar2);
                    }
                }
            }
        }

        @Override // com.xiaomi.push.ga
        public void a(gm gmVar) {
            StringBuilder sb2;
            String str;
            if (ft.f45580a) {
                sb2 = new StringBuilder();
                sb2.append("[Slim] ");
                sb2.append(ft.this.f433a.format(new Date()));
                sb2.append(this.f434a);
                sb2.append(" PKT ");
                str = gmVar.mo5990a();
            } else {
                sb2 = new StringBuilder();
                sb2.append("[Slim] ");
                sb2.append(ft.this.f433a.format(new Date()));
                sb2.append(this.f434a);
                sb2.append(" PKT [");
                sb2.append(gmVar.k());
                sb2.append(",");
                sb2.append(gmVar.j());
                str = "]";
            }
            sb2.append(str);
            com.xiaomi.channel.commonutils.logger.b.c(sb2.toString());
        }

        @Override // com.xiaomi.push.gi
        /* renamed from: a, reason: collision with other method in class */
        public boolean mo5961a(gm gmVar) {
            return true;
        }
    }

    public ft(fv fvVar) {
        this.f430a = fvVar;
        a();
    }

    private void a() {
        this.f429a = new a(true);
        this.f45581b = new a(false);
        fv fvVar = this.f430a;
        a aVar = this.f429a;
        fvVar.a(aVar, aVar);
        fv fvVar2 = this.f430a;
        a aVar2 = this.f45581b;
        fvVar2.b(aVar2, aVar2);
        this.f431a = new fu(this);
    }
}
