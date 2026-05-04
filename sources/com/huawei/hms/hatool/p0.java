package com.huawei.hms.hatool;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;
import java.util.UUID;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    private long f35882a = 1800000;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f35883b = false;

    /* renamed from: c, reason: collision with root package name */
    private a f35884c = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        String f35885a = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");

        /* renamed from: b, reason: collision with root package name */
        boolean f35886b;

        /* renamed from: c, reason: collision with root package name */
        private long f35887c;

        public a(long j11) {
            this.f35885a += "_" + j11;
            this.f35887c = j11;
            this.f35886b = true;
            p0.this.f35883b = false;
        }

        private void b(long j11) {
            v.c("hmsSdk", "getNewSession() session is flush!");
            String uuid = UUID.randomUUID().toString();
            this.f35885a = uuid;
            this.f35885a = uuid.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            this.f35885a += "_" + j11;
            this.f35887c = j11;
            this.f35886b = true;
        }

        public void a(long j11) {
            if (p0.this.f35883b) {
                p0.this.f35883b = false;
                b(j11);
            } else if (b(this.f35887c, j11) || a(this.f35887c, j11)) {
                b(j11);
            } else {
                this.f35887c = j11;
                this.f35886b = false;
            }
        }

        private boolean a(long j11, long j12) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j12);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        private boolean b(long j11, long j12) {
            return j12 - j11 >= p0.this.f35882a;
        }
    }

    public String a() {
        a aVar = this.f35884c;
        if (aVar != null) {
            return aVar.f35885a;
        }
        v.f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    public void a(long j11) {
        a aVar = this.f35884c;
        if (aVar != null) {
            aVar.a(j11);
        } else {
            v.c("hmsSdk", "Session is first flush");
            this.f35884c = new a(j11);
        }
    }

    public boolean b() {
        a aVar = this.f35884c;
        if (aVar != null) {
            return aVar.f35886b;
        }
        v.f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }
}
