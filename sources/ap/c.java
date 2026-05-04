package ap;

import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c extends s<Timestamp> {

    /* renamed from: b, reason: collision with root package name */
    public static final t f5398b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final s<Date> f5399a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements t {
        @Override // com.google.gson.t
        public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Timestamp.class) {
                return new c(dVar.q(Date.class), aVar2);
            }
            return null;
        }
    }

    public /* synthetic */ c(s sVar, a aVar) {
        this(sVar);
    }

    @Override // com.google.gson.s
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Timestamp e(cp.a aVar) throws IOException {
        Date e11 = this.f5399a.e(aVar);
        if (e11 != null) {
            return new Timestamp(e11.getTime());
        }
        return null;
    }

    @Override // com.google.gson.s
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void i(cp.c cVar, Timestamp timestamp) throws IOException {
        this.f5399a.i(cVar, timestamp);
    }

    public c(s<Date> sVar) {
        this.f5399a = sVar;
    }
}
