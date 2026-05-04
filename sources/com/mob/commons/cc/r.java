package com.mob.commons.cc;

import com.mob.commons.cc.i;
import ix.l1;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.internal.s0;

/* loaded from: classes7.dex */
public class r implements i {

    /* renamed from: a, reason: collision with root package name */
    private a f40296a;

    public static class a implements i {

        /* renamed from: a, reason: collision with root package name */
        private Number f40297a;

        /* renamed from: b, reason: collision with root package name */
        private Number f40298b;

        /* renamed from: c, reason: collision with root package name */
        private Number f40299c;

        /* renamed from: d, reason: collision with root package name */
        private Number f40300d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f40301e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Number] */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v32 */
        /* JADX WARN: Type inference failed for: r2v33 */
        /* JADX WARN: Type inference failed for: r2v34 */
        /* JADX WARN: Type inference failed for: r2v35 */
        /* JADX WARN: Type inference failed for: r2v36 */
        /* JADX WARN: Type inference failed for: r2v37 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
        /* JADX WARN: Type inference failed for: r6v6 */
        public a(Number number, Number number2, Number number3) {
            char c11;
            int i11;
            char c12;
            ?? r22;
            Number valueOf;
            Number[] numberArr = {number, number2, number3};
            int[] iArr = new int[3];
            int i12 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i13 = 0;
            while (i13 < 3) {
                Number number4 = numberArr[i13];
                int i14 = i12;
                if (number4 != null) {
                    if (number4 instanceof Byte) {
                        iArr[i13] = 1;
                    } else if (number4 instanceof Short) {
                        iArr[i13] = 2;
                    } else if (number4 instanceof Integer) {
                        iArr[i13] = 3;
                    } else if (number4 instanceof Long) {
                        iArr[i13] = 4;
                    } else if (number4 instanceof Float) {
                        iArr[i13] = 5;
                    } else if (number4 instanceof Double) {
                        iArr[i13] = 6;
                    } else if (number4 instanceof BigInteger) {
                        iArr[i13] = 7;
                    } else if (number4 instanceof BigDecimal) {
                        iArr[i13] = 8;
                    }
                }
                i13++;
                i12 = i14;
            }
            int i15 = i12;
            int i16 = i15;
            int i17 = i16;
            while (i16 < 3) {
                int i18 = iArr[i16];
                if (i17 < i18) {
                    i17 = i18;
                }
                i16++;
            }
            if (number != null) {
                c11 = 3;
                i11 = 1;
                c12 = 2;
                switch (i17) {
                    case 1:
                        r22 = Byte.valueOf(Double.valueOf(String.valueOf(number)).byteValue());
                        break;
                    case 2:
                        r22 = Short.valueOf(Double.valueOf(String.valueOf(number)).shortValue());
                        break;
                    case 3:
                        r22 = Integer.valueOf(Double.valueOf(String.valueOf(number)).intValue());
                        break;
                    case 4:
                        r22 = Long.valueOf(Double.valueOf(String.valueOf(number)).longValue());
                        break;
                    case 5:
                        r22 = Float.valueOf(Double.valueOf(String.valueOf(number)).floatValue());
                        break;
                    case 6:
                        r22 = Double.valueOf(String.valueOf(number));
                        break;
                    case 7:
                        r22 = new BigInteger(String.valueOf(number));
                        break;
                    case 8:
                        r22 = new BigDecimal(String.valueOf(number));
                        break;
                    default:
                        r22 = number;
                        break;
                }
            } else {
                Short valueOf2 = Short.valueOf(s0.f67031b);
                Float valueOf3 = Float.valueOf(Float.MIN_VALUE);
                c11 = 3;
                Double valueOf4 = Double.valueOf(Double.MIN_VALUE);
                i11 = 1;
                c12 = 2;
                BigInteger bigInteger = new BigInteger(String.valueOf(Long.MIN_VALUE));
                BigDecimal bigDecimal = new BigDecimal(Double.MIN_VALUE);
                Number[] numberArr2 = new Number[9];
                numberArr2[i15] = Integer.MIN_VALUE;
                numberArr2[1] = Byte.MIN_VALUE;
                numberArr2[2] = valueOf2;
                numberArr2[3] = Integer.MIN_VALUE;
                numberArr2[4] = Long.MIN_VALUE;
                numberArr2[5] = valueOf3;
                numberArr2[6] = valueOf4;
                numberArr2[7] = bigInteger;
                numberArr2[8] = bigDecimal;
                r22 = numberArr2[i17];
            }
            if (number2 != null) {
                switch (i17) {
                    case 1:
                        valueOf = Byte.valueOf(Double.valueOf(String.valueOf(number2)).byteValue());
                        break;
                    case 2:
                        valueOf = Short.valueOf(Double.valueOf(String.valueOf(number2)).shortValue());
                        break;
                    case 3:
                        valueOf = Integer.valueOf(Double.valueOf(String.valueOf(number2)).intValue());
                        break;
                    case 4:
                        valueOf = Long.valueOf(Double.valueOf(String.valueOf(number2)).longValue());
                        break;
                    case 5:
                        valueOf = Float.valueOf(Double.valueOf(String.valueOf(number2)).floatValue());
                        break;
                    case 6:
                        valueOf = Double.valueOf(String.valueOf(number2));
                        break;
                    case 7:
                        valueOf = new BigInteger(String.valueOf(number2));
                        break;
                    case 8:
                        valueOf = new BigDecimal(String.valueOf(number2));
                        break;
                    default:
                        valueOf = number2;
                        break;
                }
            } else {
                Short valueOf5 = Short.valueOf(s0.f67032c);
                Float valueOf6 = Float.valueOf(Float.MAX_VALUE);
                Double valueOf7 = Double.valueOf(Double.MAX_VALUE);
                BigInteger bigInteger2 = new BigInteger(String.valueOf(Long.MAX_VALUE));
                BigDecimal bigDecimal2 = new BigDecimal(Double.MAX_VALUE);
                Number[] numberArr3 = new Number[9];
                numberArr3[i15] = Integer.MAX_VALUE;
                numberArr3[i11] = Byte.MAX_VALUE;
                numberArr3[c12] = valueOf5;
                numberArr3[c11] = Integer.MAX_VALUE;
                numberArr3[4] = Long.MAX_VALUE;
                numberArr3[5] = valueOf6;
                numberArr3[6] = valueOf7;
                numberArr3[7] = bigInteger2;
                numberArr3[8] = bigDecimal2;
                valueOf = numberArr3[i17];
            }
            this.f40297a = r22;
            this.f40298b = valueOf;
            this.f40299c = number3;
            ?? r62 = ((Comparable) r22).compareTo(valueOf) > 0 ? i11 : i15;
            this.f40301e = r62;
            if (this.f40299c == null) {
                this.f40299c = Integer.valueOf(r62 != 0 ? -1 : i11);
            }
        }

        public boolean a() {
            Object obj = this.f40300d;
            if (obj == null) {
                obj = this.f40297a;
            }
            return this.f40301e ? ((Comparable) obj).compareTo(this.f40298b) >= 0 : ((Comparable) obj).compareTo(this.f40298b) <= 0;
        }

        public Number b() {
            if (this.f40300d == null) {
                this.f40300d = this.f40297a;
            }
            Number number = this.f40300d;
            Number number2 = this.f40299c;
            if (number2 instanceof BigDecimal) {
                this.f40300d = ((BigDecimal) number).add((BigDecimal) number2);
                return number;
            }
            if (number2 instanceof BigInteger) {
                this.f40300d = ((BigInteger) number).add((BigInteger) number2);
                return number;
            }
            if (number2 instanceof Double) {
                this.f40300d = Double.valueOf(number.doubleValue() + this.f40299c.doubleValue());
                return number;
            }
            if (number2 instanceof Float) {
                this.f40300d = Float.valueOf(number.floatValue() + this.f40299c.floatValue());
                return number;
            }
            if (number2 instanceof Long) {
                this.f40300d = Long.valueOf(number.longValue() + this.f40299c.longValue());
                return number;
            }
            if (number2 instanceof Integer) {
                this.f40300d = Integer.valueOf(number.intValue() + this.f40299c.intValue());
                return number;
            }
            if (number2 instanceof Short) {
                this.f40300d = Integer.valueOf(number.shortValue() + this.f40299c.shortValue());
                return number;
            }
            this.f40300d = Integer.valueOf(number.byteValue() + this.f40299c.byteValue());
            return number;
        }

        @Override // com.mob.commons.cc.i
        public i.b a(i.a aVar) {
            i.b bVar = new i.b();
            try {
                if ("hasNext".equals(aVar.f40232a) && aVar.f40233b.length == 0) {
                    bVar.f40236a = Boolean.valueOf(a());
                    return bVar;
                }
                if (l1.b.f62938h.equals(aVar.f40232a) && aVar.f40233b.length == 0) {
                    bVar.f40236a = b();
                    return bVar;
                }
                bVar.f40238c = new NoSuchMethodException("method name: " + aVar.f40232a + " at line: " + aVar.f40234c + pn.j.f81006c + aVar.f40235d + pn.j.f81007d);
                return bVar;
            } catch (Throwable th2) {
                bVar.f40238c = th2;
                return bVar;
            }
        }
    }

    public r(Number number, Number number2, Number number3) {
        this.f40296a = new a(number, number2, number3);
    }

    public a a() {
        return this.f40296a;
    }

    public boolean b(Number number) {
        return a(number);
    }

    public boolean a(Number number) {
        return ((Comparable) this.f40296a.f40297a).compareTo(number) <= 0 && ((Comparable) this.f40296a.f40298b).compareTo(number) >= 0;
    }

    @Override // com.mob.commons.cc.i
    public i.b a(i.a aVar) {
        Object obj;
        Object obj2;
        i.b bVar = new i.b();
        try {
            if ("iterator".equals(aVar.f40232a) && aVar.f40233b.length == 0) {
                bVar.f40236a = a();
                return bVar;
            }
            if ("isInRange".equals(aVar.f40232a)) {
                Object[] objArr = aVar.f40233b;
                if (objArr.length == 1 && ((obj2 = objArr[0]) == null || (obj2 instanceof Number))) {
                    bVar.f40236a = Boolean.valueOf(a((Number) obj2));
                    return bVar;
                }
            }
            if ("contains".equals(aVar.f40232a)) {
                Object[] objArr2 = aVar.f40233b;
                if (objArr2.length == 1 && ((obj = objArr2[0]) == null || (obj instanceof Number))) {
                    bVar.f40236a = Boolean.valueOf(b((Number) obj));
                    return bVar;
                }
            }
            bVar.f40238c = new NoSuchMethodException("method name: " + aVar.f40232a + " at line: " + aVar.f40234c + pn.j.f81006c + aVar.f40235d + pn.j.f81007d);
            return bVar;
        } catch (Throwable th2) {
            bVar.f40238c = th2;
            return bVar;
        }
    }
}
