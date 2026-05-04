package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class n extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f35049a;

    public n(Boolean bool) {
        this.f35049a = com.google.gson.internal.a.b(bool);
    }

    public static boolean A(n nVar) {
        Object obj = nVar.f35049a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean B() {
        return this.f35049a instanceof Number;
    }

    public boolean C() {
        return this.f35049a instanceof String;
    }

    @Override // com.google.gson.j
    public BigDecimal b() {
        Object obj = this.f35049a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(this.f35049a.toString());
    }

    @Override // com.google.gson.j
    public BigInteger d() {
        Object obj = this.f35049a;
        return obj instanceof BigInteger ? (BigInteger) obj : new BigInteger(this.f35049a.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f35049a == null) {
            return nVar.f35049a == null;
        }
        if (A(this) && A(nVar)) {
            return r().longValue() == nVar.r().longValue();
        }
        Object obj2 = this.f35049a;
        if (!(obj2 instanceof Number) || !(nVar.f35049a instanceof Number)) {
            return obj2.equals(nVar.f35049a);
        }
        double doubleValue = r().doubleValue();
        double doubleValue2 = nVar.r().doubleValue();
        return doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2));
    }

    @Override // com.google.gson.j
    public boolean f() {
        return z() ? ((Boolean) this.f35049a).booleanValue() : Boolean.parseBoolean(t());
    }

    @Override // com.google.gson.j
    public byte g() {
        return B() ? r().byteValue() : Byte.parseByte(t());
    }

    @Override // com.google.gson.j
    public char h() {
        return t().charAt(0);
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f35049a == null) {
            return 31;
        }
        if (A(this)) {
            doubleToLongBits = r().longValue();
        } else {
            Object obj = this.f35049a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(r().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // com.google.gson.j
    public double j() {
        return B() ? r().doubleValue() : Double.parseDouble(t());
    }

    @Override // com.google.gson.j
    public float k() {
        return B() ? r().floatValue() : Float.parseFloat(t());
    }

    @Override // com.google.gson.j
    public int l() {
        return B() ? r().intValue() : Integer.parseInt(t());
    }

    @Override // com.google.gson.j
    public long q() {
        return B() ? r().longValue() : Long.parseLong(t());
    }

    @Override // com.google.gson.j
    public Number r() {
        Object obj = this.f35049a;
        return obj instanceof String ? new LazilyParsedNumber((String) obj) : (Number) obj;
    }

    @Override // com.google.gson.j
    public short s() {
        return B() ? r().shortValue() : Short.parseShort(t());
    }

    @Override // com.google.gson.j
    public String t() {
        return B() ? r().toString() : z() ? ((Boolean) this.f35049a).toString() : (String) this.f35049a;
    }

    public boolean z() {
        return this.f35049a instanceof Boolean;
    }

    public n(Number number) {
        this.f35049a = com.google.gson.internal.a.b(number);
    }

    public n(String str) {
        this.f35049a = com.google.gson.internal.a.b(str);
    }

    public n(Character ch2) {
        this.f35049a = ((Character) com.google.gson.internal.a.b(ch2)).toString();
    }

    @Override // com.google.gson.j
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public n a() {
        return this;
    }
}
