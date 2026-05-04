package na;

import android.app.Application;
import android.text.TextUtils;
import com.baicizhan.client.business.thrift.i;
import com.baicizhan.client.business.thrift.j;
import com.baicizhan.online.hero_api.HeroApi;
import i9.m;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b<T> {

    /* renamed from: c, reason: collision with root package name */
    public String f75012c;

    /* renamed from: a, reason: collision with root package name */
    public int f75010a = 2;

    /* renamed from: b, reason: collision with root package name */
    public i f75011b = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f75013d = true;

    /* renamed from: e, reason: collision with root package name */
    public int f75014e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f75015f = -1;

    public T a() throws Exception {
        Application a11 = pb.a.a();
        if (this.f75012c == null) {
            String d11 = m.d();
            this.f75012c = d11;
            if (d11 == null && this.f75013d) {
                throw new IllegalStateException("token null");
            }
        }
        a aVar = new a(new d());
        j jVar = new j(aVar);
        com.baicizhan.client.business.thrift.b bVar = new com.baicizhan.client.business.thrift.b(a11);
        if (!TextUtils.isEmpty(this.f75012c)) {
            bVar.put("access_token", this.f75012c);
        }
        aVar.f(bVar);
        aVar.i(this.f75010a);
        int i11 = this.f75015f;
        if (i11 > 0) {
            aVar.setConnectTimeout(i11);
        }
        int i12 = this.f75014e;
        if (i12 > 0) {
            aVar.setReadTimeout(i12);
        }
        i iVar = this.f75011b;
        if (iVar != null) {
            aVar.j(iVar);
        }
        jVar.open();
        return (T) new HeroApi.Client.Factory().getClient((TProtocol) new TCompactProtocol(jVar));
    }

    public b<T> b(int connectTimeout) {
        this.f75015f = connectTimeout;
        return this;
    }

    public b<T> c(int maxRetries) {
        this.f75010a = maxRetries;
        return this;
    }

    public b<T> d(int readTimeout) {
        this.f75014e = readTimeout;
        return this;
    }

    public b<T> e(boolean requireToken) {
        this.f75013d = requireToken;
        return this;
    }

    public b<T> f(i retryPolicy) {
        this.f75011b = retryPolicy;
        return this;
    }

    public b<T> g(String token) {
        this.f75012c = token;
        return this;
    }
}
