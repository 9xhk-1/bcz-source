package xo;

import com.google.gson.JsonSyntaxException;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c extends s<Date> {

    /* renamed from: b, reason: collision with root package name */
    public static final t f98161b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List<DateFormat> f98162a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements t {
        @Override // com.google.gson.t
        public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f98162a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (com.google.gson.internal.f.e()) {
            arrayList.add(com.google.gson.internal.i.e(2, 2));
        }
    }

    public final Date j(cp.a aVar) throws IOException {
        String h02 = aVar.h0();
        synchronized (this.f98162a) {
            try {
                Iterator<DateFormat> it = this.f98162a.iterator();
                while (it.hasNext()) {
                    try {
                        return it.next().parse(h02);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return yo.a.g(h02, new ParsePosition(0));
                } catch (ParseException e11) {
                    throw new JsonSyntaxException("Failed parsing '" + h02 + "' as Date; at path " + aVar.C(), e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.gson.s
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Date e(cp.a aVar) throws IOException {
        if (aVar.k0() != JsonToken.NULL) {
            return j(aVar);
        }
        aVar.d0();
        return null;
    }

    @Override // com.google.gson.s
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void i(cp.c cVar, Date date) throws IOException {
        String format;
        if (date == null) {
            cVar.L();
            return;
        }
        DateFormat dateFormat = this.f98162a.get(0);
        synchronized (this.f98162a) {
            format = dateFormat.format(date);
        }
        cVar.v0(format);
    }
}
