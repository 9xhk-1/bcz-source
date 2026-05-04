package r90;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class o implements g<Object, String> {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f83868a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83869b;

    public o(String str, Locale locale, String str2) {
        this.f83869b = str2;
        this.f83868a = new SimpleDateFormat(str, locale == null ? Locale.getDefault() : locale);
    }

    @Override // r90.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(Object obj) {
        if (obj == null) {
            return this.f83869b;
        }
        Date time = obj instanceof Date ? (Date) obj : obj instanceof Calendar ? ((Calendar) obj).getTime() : null;
        if (time != null) {
            return this.f83868a.format(time);
        }
        DataProcessingException dataProcessingException = new DataProcessingException("Cannot format '{value}' to a date. Not an instance of java.util.Date or java.util.Calendar");
        dataProcessingException.setValue(obj);
        throw dataProcessingException;
    }

    @Override // r90.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object a(String str) {
        throw new UnsupportedOperationException("Can't convert an input string into date type");
    }
}
