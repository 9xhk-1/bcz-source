package ap;

import com.google.gson.JsonSyntaxException;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a extends s<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final t f5394b = new C0096a();

    /* renamed from: a, reason: collision with root package name */
    public final DateFormat f5395a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ap.a$a, reason: collision with other inner class name */
    public class C0096a implements t {
        @Override // com.google.gson.t
        public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            C0096a c0096a = null;
            if (aVar.getRawType() == Date.class) {
                return new a(c0096a);
            }
            return null;
        }
    }

    public /* synthetic */ a(C0096a c0096a) {
        this();
    }

    @Override // com.google.gson.s
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Date e(cp.a aVar) throws IOException {
        java.util.Date parse;
        if (aVar.k0() == JsonToken.NULL) {
            aVar.d0();
            return null;
        }
        String h02 = aVar.h0();
        try {
            synchronized (this) {
                parse = this.f5395a.parse(h02);
            }
            return new Date(parse.getTime());
        } catch (ParseException e11) {
            throw new JsonSyntaxException("Failed parsing '" + h02 + "' as SQL Date; at path " + aVar.C(), e11);
        }
    }

    @Override // com.google.gson.s
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void i(cp.c cVar, Date date) throws IOException {
        String format;
        if (date == null) {
            cVar.L();
            return;
        }
        synchronized (this) {
            format = this.f5395a.format((java.util.Date) date);
        }
        cVar.v0(format);
    }

    public a() {
        this.f5395a = new SimpleDateFormat("MMM d, yyyy");
    }
}
