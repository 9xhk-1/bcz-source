package y60;

import c80.s;
import java.io.IOException;
import org.apache.http.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final s f99459a;

    /* renamed from: b, reason: collision with root package name */
    public final t f99460b;

    /* renamed from: c, reason: collision with root package name */
    public final org.apache.http.c f99461c;

    public f(s sVar, t tVar, org.apache.http.c cVar) {
        this.f99459a = sVar;
        this.f99460b = tVar;
        this.f99461c = cVar;
    }

    public t a() {
        return this.f99460b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    c80.a aVar = new c80.a();
                    c80.g a11 = c80.g.a(aVar);
                    while (!Thread.interrupted() && this.f99460b.isOpen()) {
                        this.f99459a.e(this.f99460b, a11);
                        aVar.a();
                    }
                    this.f99460b.close();
                    this.f99460b.shutdown();
                } catch (Throwable th2) {
                    try {
                        this.f99460b.shutdown();
                    } catch (IOException e11) {
                        this.f99461c.a(e11);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                this.f99461c.a(e12);
                this.f99460b.shutdown();
            }
        } catch (IOException e13) {
            this.f99461c.a(e13);
        }
    }
}
