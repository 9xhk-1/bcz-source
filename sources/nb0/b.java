package nb0;

import com.google.gson.s;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import l60.k;
import lb0.f;
import okhttp3.j;
import okhttp3.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b<T> implements f<T, m> {

    /* renamed from: c, reason: collision with root package name */
    public static final j f75044c = j.h("application/json; charset=UTF-8");

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f75045d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.d f75046a;

    /* renamed from: b, reason: collision with root package name */
    public final s<T> f75047b;

    public b(com.google.gson.d dVar, s<T> sVar) {
        this.f75046a = dVar;
        this.f75047b = sVar;
    }

    @Override // lb0.f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public m convert(T t11) throws IOException {
        k kVar = new k();
        cp.c w11 = this.f75046a.w(new OutputStreamWriter(kVar.O8(), f75045d));
        this.f75047b.i(w11, t11);
        w11.close();
        return m.g(f75044c, kVar.q3());
    }
}
