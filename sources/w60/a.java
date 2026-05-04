package w60;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class a implements HttpEntity {

    /* renamed from: d, reason: collision with root package name */
    public static final int f95442d = 4096;

    /* renamed from: a, reason: collision with root package name */
    public org.apache.http.e f95443a;

    /* renamed from: b, reason: collision with root package name */
    public org.apache.http.e f95444b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f95445c;

    @Override // org.apache.http.HttpEntity
    public org.apache.http.e Z() {
        return this.f95444b;
    }

    @Override // org.apache.http.HttpEntity
    public boolean a0() {
        return this.f95445c;
    }

    public void c(boolean z11) {
        this.f95445c = z11;
    }

    public void e(String str) {
        f(str != null ? new BasicHeader("Content-Encoding", str) : null);
    }

    public void f(org.apache.http.e eVar) {
        this.f95444b = eVar;
    }

    @Override // org.apache.http.HttpEntity
    public org.apache.http.e getContentType() {
        return this.f95443a;
    }

    public void i(String str) {
        j(str != null ? new BasicHeader("Content-Type", str) : null);
    }

    public void j(org.apache.http.e eVar) {
        this.f95443a = eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        if (this.f95443a != null) {
            sb2.append("Content-Type: ");
            sb2.append(this.f95443a.getValue());
            sb2.append(',');
        }
        if (this.f95444b != null) {
            sb2.append("Content-Encoding: ");
            sb2.append(this.f95444b.getValue());
            sb2.append(',');
        }
        long c02 = c0();
        if (c02 >= 0) {
            sb2.append("Content-Length: ");
            sb2.append(c02);
            sb2.append(',');
        }
        sb2.append("Chunked: ");
        sb2.append(this.f95445c);
        sb2.append(l50.b.f69930l);
        return sb2.toString();
    }

    @Override // org.apache.http.HttpEntity
    @Deprecated
    public void E() throws IOException {
    }
}
