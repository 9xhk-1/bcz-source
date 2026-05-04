package z60;

import org.apache.http.HttpException;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes9.dex */
public class a implements w60.e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f101034d = new a(new d(0));

    /* renamed from: c, reason: collision with root package name */
    public final w60.e f101035c;

    public a(w60.e eVar) {
        this.f101035c = eVar;
    }

    @Override // w60.e
    public long a(o oVar) throws HttpException {
        long a11 = this.f101035c.a(oVar);
        if (a11 != -1) {
            return a11;
        }
        throw new ProtocolException("Identity transfer encoding cannot be used");
    }
}
