package ap;

import com.google.gson.JsonSyntaxException;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b extends s<Time> {

    /* renamed from: b, reason: collision with root package name */
    public static final t f5396b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final DateFormat f5397a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements t {
        @Override // com.google.gson.t
        public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Time.class) {
                return new b(aVar2);
            }
            return null;
        }
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    @Override // com.google.gson.s
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Time e(cp.a aVar) throws IOException {
        Time time;
        if (aVar.k0() == JsonToken.NULL) {
            aVar.d0();
            return null;
        }
        String h02 = aVar.h0();
        try {
            synchronized (this) {
                time = new Time(this.f5397a.parse(h02).getTime());
            }
            return time;
        } catch (ParseException e11) {
            throw new JsonSyntaxException("Failed parsing '" + h02 + "' as SQL Time; at path " + aVar.C(), e11);
        }
    }

    @Override // com.google.gson.s
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void i(cp.c cVar, Time time) throws IOException {
        String format;
        if (time == null) {
            cVar.L();
            return;
        }
        synchronized (this) {
            format = this.f5397a.format((Date) time);
        }
        cVar.v0(format);
    }

    public b() {
        this.f5397a = new SimpleDateFormat("hh:mm:ss a");
    }
}
