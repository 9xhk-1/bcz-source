package r90;

import java.lang.Number;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class u<T extends Number> extends v<T> implements n<DecimalFormat> {

    /* renamed from: c, reason: collision with root package name */
    public DecimalFormat[] f83874c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f83875d;

    /* renamed from: e, reason: collision with root package name */
    public final ParsePosition f83876e;

    /* renamed from: f, reason: collision with root package name */
    public Class<? extends Number> f83877f;

    public u(T t11, String str, String... strArr) {
        super(t11, str);
        this.f83874c = new DecimalFormat[0];
        this.f83875d = new String[0];
        this.f83876e = new ParsePosition(0);
        this.f83877f = Number.class;
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.v("Numeric formats", strArr);
        this.f83875d = (String[]) strArr.clone();
        this.f83874c = new DecimalFormat[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            this.f83874c[i11] = new DecimalFormat(strArr[i11]);
            t(this.f83874c[i11]);
        }
    }

    public void s(String str, String... strArr) {
        DecimalFormat decimalFormat = new DecimalFormat(str);
        t(decimalFormat);
        h90.a.f(decimalFormat, strArr);
        String[] strArr2 = this.f83875d;
        this.f83875d = (String[]) Arrays.copyOf(strArr2, strArr2.length + 1);
        DecimalFormat[] decimalFormatArr = this.f83874c;
        DecimalFormat[] decimalFormatArr2 = (DecimalFormat[]) Arrays.copyOf(decimalFormatArr, decimalFormatArr.length + 1);
        this.f83874c = decimalFormatArr2;
        this.f83875d[r1.length - 1] = str;
        decimalFormatArr2[decimalFormatArr2.length - 1] = decimalFormat;
    }

    public abstract void t(DecimalFormat decimalFormat);

    @Override // r90.v
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public T l(String str) {
        Class<? extends Number> cls;
        for (int i11 = 0; i11 < this.f83874c.length; i11++) {
            this.f83876e.setIndex(0);
            T t11 = (T) this.f83874c[i11].parse(str, this.f83876e);
            if (this.f83874c.length == 1 || this.f83876e.getIndex() == str.length()) {
                if (t11 != null && (cls = this.f83877f) != Number.class) {
                    if (cls == Double.class) {
                        return Double.valueOf(t11.doubleValue());
                    }
                    if (cls == Float.class) {
                        return Float.valueOf(t11.floatValue());
                    }
                    if (cls == BigDecimal.class) {
                        return t11 instanceof BigDecimal ? t11 : new BigDecimal(String.valueOf(t11));
                    }
                    if (cls == BigInteger.class) {
                        return t11 instanceof BigInteger ? t11 : BigInteger.valueOf(t11.longValue());
                    }
                    if (cls == Long.class) {
                        return Long.valueOf(t11.longValue());
                    }
                    if (cls == Integer.class) {
                        return Integer.valueOf(t11.intValue());
                    }
                    if (cls == Short.class) {
                        return Short.valueOf(t11.shortValue());
                    }
                    if (cls == Byte.class) {
                        return Byte.valueOf(t11.byteValue());
                    }
                }
                return t11;
            }
        }
        DataProcessingException dataProcessingException = new DataProcessingException("Cannot parse '{value}' as a valid number. Supported formats are: " + Arrays.toString(this.f83875d));
        dataProcessingException.setValue(str);
        throw dataProcessingException;
    }

    @Override // r90.n
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public DecimalFormat[] c() {
        return this.f83874c;
    }

    public Class<? extends Number> w() {
        return this.f83877f;
    }

    @Override // r90.v
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public String a(T t11) {
        if (t11 == null) {
            return super.a(null);
        }
        for (DecimalFormat decimalFormat : this.f83874c) {
            try {
                return decimalFormat.format(t11);
            } catch (Throwable unused) {
            }
        }
        DataProcessingException dataProcessingException = new DataProcessingException("Cannot format '{value}'. No valid formatters were defined.");
        dataProcessingException.setValue(t11);
        throw dataProcessingException;
    }

    public void y(Class<? extends Number> cls) {
        this.f83877f = cls;
    }

    public u(T t11, String str, DecimalFormat... decimalFormatArr) {
        super(t11, str);
        this.f83874c = new DecimalFormat[0];
        this.f83875d = new String[0];
        this.f83876e = new ParsePosition(0);
        this.f83877f = Number.class;
        org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.v("Numeric formatters", decimalFormatArr);
        this.f83874c = (DecimalFormat[]) decimalFormatArr.clone();
        this.f83875d = new String[decimalFormatArr.length];
        for (int i11 = 0; i11 < decimalFormatArr.length; i11++) {
            this.f83875d[i11] = decimalFormatArr[i11].toPattern();
        }
    }

    public u(T t11, String str) {
        super(t11, str);
        this.f83874c = new DecimalFormat[0];
        this.f83875d = new String[0];
        this.f83876e = new ParsePosition(0);
        this.f83877f = Number.class;
    }

    public u(String... strArr) {
        this((Number) null, (String) null, strArr);
    }

    public u(DecimalFormat... decimalFormatArr) {
        this((Number) null, (String) null, decimalFormatArr);
    }

    public u() {
        this.f83874c = new DecimalFormat[0];
        this.f83875d = new String[0];
        this.f83876e = new ParsePosition(0);
        this.f83877f = Number.class;
    }
}
