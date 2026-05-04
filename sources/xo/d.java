package xo;

import com.google.gson.JsonSyntaxException;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d<T extends Date> extends s<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final String f98163c = "DefaultDateTypeAdapter";

    /* renamed from: a, reason: collision with root package name */
    public final b<T> f98164a;

    /* renamed from: b, reason: collision with root package name */
    public final List<DateFormat> f98165b;

    private Date j(cp.a aVar) throws IOException {
        String h02 = aVar.h0();
        synchronized (this.f98165b) {
            try {
                Iterator<DateFormat> it = this.f98165b.iterator();
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
    public T e(cp.a aVar) throws IOException {
        if (aVar.k0() == JsonToken.NULL) {
            aVar.d0();
            return null;
        }
        return this.f98164a.f(j(aVar));
    }

    @Override // com.google.gson.s
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void i(cp.c cVar, Date date) throws IOException {
        String format;
        if (date == null) {
            cVar.L();
            return;
        }
        DateFormat dateFormat = this.f98165b.get(0);
        synchronized (this.f98165b) {
            format = dateFormat.format(date);
        }
        cVar.v0(format);
    }

    public String toString() {
        DateFormat dateFormat = this.f98165b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public d(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f98165b = arrayList;
        this.f98164a = (b) com.google.gson.internal.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public d(b<T> bVar, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f98165b = arrayList;
        this.f98164a = (b) com.google.gson.internal.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i11));
        }
        if (com.google.gson.internal.f.e()) {
            arrayList.add(com.google.gson.internal.i.d(i11));
        }
    }

    public d(b<T> bVar, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        this.f98165b = arrayList;
        this.f98164a = (b) com.google.gson.internal.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i11, i12, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i11, i12));
        }
        if (com.google.gson.internal.f.e()) {
            arrayList.add(com.google.gson.internal.i.e(i11, i12));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b<T extends Date> {

        /* renamed from: b, reason: collision with root package name */
        public static final b<Date> f98166b = new a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f98167a;

        public b(Class<T> cls) {
            this.f98167a = cls;
        }

        public final t a(int i11) {
            return e(new d<>(this, i11));
        }

        public final t b(int i11, int i12) {
            return e(new d<>(this, i11, i12));
        }

        public final t c(String str) {
            return e(new d<>(this, str));
        }

        public final t d() {
            int i11 = 2;
            return e(new d<>(this, i11, i11));
        }

        public final t e(d<T> dVar) {
            return n.b(this.f98167a, dVar);
        }

        public abstract T f(Date date);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends b<Date> {
            public a(Class cls) {
                super(cls);
            }

            @Override // xo.d.b
            public Date f(Date date) {
                return date;
            }
        }
    }
}
