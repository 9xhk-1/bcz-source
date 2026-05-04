package r90;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class i extends v<Date> implements n<SimpleDateFormat> {

    /* renamed from: c, reason: collision with root package name */
    public final Locale f83858c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeZone f83859d;

    /* renamed from: e, reason: collision with root package name */
    public final SimpleDateFormat[] f83860e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f83861f;

    public i(TimeZone timeZone, Locale locale, Date date, String str, String... strArr) {
        super(date, str);
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.v("Date formats", strArr);
        this.f83859d = timeZone == null ? TimeZone.getDefault() : timeZone;
        this.f83858c = locale == null ? Locale.getDefault() : locale;
        this.f83861f = (String[]) strArr.clone();
        this.f83860e = new SimpleDateFormat[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            this.f83860e[i11] = new SimpleDateFormat(strArr[i11], this.f83858c);
            this.f83860e[i11].setTimeZone(this.f83859d);
        }
    }

    @Override // r90.v
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Date l(String str) {
        Date parse;
        for (SimpleDateFormat simpleDateFormat : this.f83860e) {
            try {
                synchronized (simpleDateFormat) {
                    continue;
                    parse = simpleDateFormat.parse(str);
                }
                return parse;
            } catch (ParseException unused) {
            }
        }
        DataProcessingException dataProcessingException = new DataProcessingException("Cannot parse '{value}' as a valid date of locale '" + this.f83858c + "'. Supported formats are: " + Arrays.toString(this.f83861f));
        dataProcessingException.setValue(str);
        throw dataProcessingException;
    }

    @Override // r90.n
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public SimpleDateFormat[] c() {
        return this.f83860e;
    }

    public TimeZone u() {
        return this.f83859d;
    }

    @Override // r90.v
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public String a(Date date) {
        return date == null ? super.a(null) : this.f83860e[0].format(date);
    }

    public i(Locale locale, Date date, String str, String... strArr) {
        this(TimeZone.getDefault(), locale, date, str, strArr);
    }

    public i(Date date, String str, String... strArr) {
        this(Locale.getDefault(), date, str, strArr);
    }

    public i(Locale locale, String... strArr) {
        this(locale, null, null, strArr);
    }

    public i(String... strArr) {
        this(Locale.getDefault(), null, null, strArr);
    }
}
