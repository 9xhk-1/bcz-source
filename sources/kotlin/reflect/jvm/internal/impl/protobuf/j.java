package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public d f67580a;

    /* renamed from: b, reason: collision with root package name */
    public f f67581b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f67582c;

    /* renamed from: d, reason: collision with root package name */
    public volatile n f67583d;

    public void a(n nVar) {
        if (this.f67583d != null) {
            return;
        }
        synchronized (this) {
            if (this.f67583d != null) {
                return;
            }
            try {
                if (this.f67580a != null) {
                    this.f67583d = nVar.getParserForType().c(this.f67580a, this.f67581b);
                } else {
                    this.f67583d = nVar;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int b() {
        return this.f67582c ? this.f67583d.getSerializedSize() : this.f67580a.size();
    }

    public n c(n nVar) {
        a(nVar);
        return this.f67583d;
    }

    public n d(n nVar) {
        n nVar2 = this.f67583d;
        this.f67583d = nVar;
        this.f67580a = null;
        this.f67582c = true;
        return nVar2;
    }
}
