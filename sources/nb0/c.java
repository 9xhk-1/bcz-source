package nb0;

import com.google.gson.JsonIOException;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import lb0.f;
import okhttp3.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c<T> implements f<o, T> {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.d f75048a;

    /* renamed from: b, reason: collision with root package name */
    public final s<T> f75049b;

    public c(com.google.gson.d dVar, s<T> sVar) {
        this.f75048a = dVar;
        this.f75049b = sVar;
    }

    @Override // lb0.f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T convert(o oVar) throws IOException {
        cp.a v11 = this.f75048a.v(oVar.f());
        try {
            T e11 = this.f75049b.e(v11);
            if (v11.k0() == JsonToken.END_DOCUMENT) {
                return e11;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            oVar.close();
        }
    }
}
