package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class n implements l {

    /* renamed from: a, reason: collision with root package name */
    public Map<Class<?>, r90.g[]> f78173a;

    /* renamed from: b, reason: collision with root package name */
    public j90.i f78174b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f78175c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f78176d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f78177e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f78178f;

    /* renamed from: g, reason: collision with root package name */
    public b0 f78179g = v.f78195a;

    /* renamed from: h, reason: collision with root package name */
    public i f78180h;

    public final boolean A(Throwable th2, Object[] objArr, int i11) {
        if (objArr != null && objArr.length < i11) {
            objArr = Arrays.copyOf(objArr, i11 + 1);
        }
        DataProcessingException E = E(th2, objArr, i11);
        if (i11 > -1) {
            b0 b0Var = this.f78179g;
            if (b0Var instanceof d0) {
                ((d0) b0Var).e();
            }
        }
        E.markAsHandled(this.f78179g);
        this.f78179g.a(E, objArr, this.f78180h);
        if (i11 <= -1) {
            return false;
        }
        b0 b0Var2 = this.f78179g;
        if (!(b0Var2 instanceof d0)) {
            return false;
        }
        objArr[i11] = ((d0) b0Var2).b();
        return !r4.c();
    }

    public void B(String[] strArr, i iVar) {
        this.f78175c = true;
        this.f78176d = null;
        this.f78178f = false;
        String[] a11 = iVar != null ? iVar.a() : null;
        if (a11 == null || a11.length <= 0) {
            z().i(false, strArr);
        } else {
            z().i(false, a11);
        }
        if (iVar != null) {
            this.f78176d = iVar.g();
            this.f78178f = iVar.c();
        }
    }

    public final void C() {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.f78176d;
            if (i12 >= iArr.length) {
                break;
            }
            int i14 = iArr[i12];
            if (i14 > i13) {
                i13 = i14;
            }
            i12++;
        }
        int[] iArr2 = new int[i13 + 1];
        this.f78177e = iArr2;
        Arrays.fill(iArr2, -1);
        while (true) {
            int[] iArr3 = this.f78176d;
            if (i11 >= iArr3.length) {
                return;
            }
            this.f78177e[iArr3[i11]] = i11;
            i11++;
        }
    }

    public final boolean D(boolean z11, Object[] objArr, NormalizedString[] normalizedStringArr, int[] iArr) {
        boolean z12;
        int[] iArr2;
        int i11;
        boolean[] zArr = this.f78173a != null ? new boolean[objArr.length] : null;
        j90.i iVar = this.f78174b;
        if (iVar != null) {
            if (!this.f78175c) {
                this.f78175c = true;
                iVar.i(true, normalizedStringArr != null ? NormalizedString.toArray(normalizedStringArr) : new String[objArr.length]);
                this.f78176d = iArr;
            }
            z12 = z11 ? F(objArr) : true;
            int[] iArr3 = this.f78176d;
            int length = iArr3 == null ? objArr.length : iArr3.length;
            for (int i12 = 0; i12 < length; i12++) {
                try {
                    iArr2 = this.f78176d;
                } catch (Throwable th2) {
                    z12 = A(th2, objArr, i12);
                }
                if (iArr2 != null && (i11 = iArr2[i12]) != -1) {
                    objArr[i11] = this.f78174b.j(z11, i11, objArr[i11], zArr);
                }
                objArr[i12] = this.f78174b.j(z11, i12, objArr[i12], zArr);
            }
        } else {
            z12 = true;
        }
        if (z12 && zArr != null) {
            z12 = x(true, objArr, zArr);
        }
        return z11 ? z12 : z12 && F(objArr);
    }

    public DataProcessingException E(Throwable th2, Object[] objArr, int i11) {
        DataProcessingException dataProcessingException;
        if (th2 instanceof DataProcessingException) {
            dataProcessingException = (DataProcessingException) th2;
            dataProcessingException.setRow(objArr);
            dataProcessingException.setColumnIndex(i11);
        } else {
            dataProcessingException = new DataProcessingException("Error processing data conversions", i11, objArr, th2);
        }
        dataProcessingException.markAsNonFatal();
        dataProcessingException.setContext(this.f78180h);
        return dataProcessingException;
    }

    public final boolean F(Object[] objArr) {
        int i11;
        j90.i iVar = this.f78174b;
        boolean z11 = true;
        if (iVar != null && iVar.f63918a != null) {
            int i12 = 0;
            while (z11) {
                int[] iArr = this.f78174b.f63918a;
                if (i12 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i12];
                if (this.f78178f) {
                    if (this.f78177e == null) {
                        C();
                    }
                    i11 = this.f78177e[i13];
                } else {
                    i11 = i13;
                }
                try {
                    this.f78174b.g(i13, i13 < objArr.length ? objArr[i11] : null);
                } catch (Throwable th2) {
                    z11 = A(th2, objArr, i13);
                }
                i12++;
            }
        }
        return z11;
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.l
    public final j90.n<String> b(r90.g... gVarArr) {
        return z().e(gVarArr);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.l
    public final j90.n<Integer> c(r90.g... gVarArr) {
        return z().d(gVarArr);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.l
    public final void e(r90.g... gVarArr) {
        z().b(gVarArr);
    }

    @Override // org.junit.jupiter.params.shadow.com.univocity.parsers.common.l
    public final void n(Class<?> cls, r90.g... gVarArr) {
        d.v("Type to convert", cls);
        d.v("Sequence of conversions to apply over data of type " + cls.getSimpleName(), gVarArr);
        if (this.f78173a == null) {
            this.f78173a = new HashMap();
        }
        this.f78173a.put(cls, gVarArr);
    }

    public final Object[] w(String[] strArr, i iVar) {
        int length = strArr.length;
        Object[] objArr = new Object[length];
        boolean[] zArr = this.f78173a != null ? new boolean[strArr.length] : null;
        System.arraycopy(strArr, 0, objArr, 0, strArr.length);
        boolean z11 = true;
        if (this.f78174b != null) {
            if (!this.f78175c) {
                B(strArr, iVar);
            }
            if (this.f78178f || this.f78176d != null) {
                length = this.f78176d.length;
            }
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    if (this.f78178f) {
                        objArr[i11] = this.f78174b.a(this.f78176d[i11], strArr[i11], zArr);
                    } else {
                        int[] iArr = this.f78176d;
                        if (iArr == null) {
                            objArr[i11] = this.f78174b.a(i11, strArr[i11], zArr);
                        } else {
                            int i12 = iArr[i11];
                            objArr[i12] = this.f78174b.a(i12, strArr[i12], zArr);
                        }
                    }
                } catch (Throwable th2) {
                    z11 = A(th2, objArr, i11);
                }
            }
        }
        if (z11 && zArr != null) {
            z11 = x(false, objArr, zArr);
        }
        if (z11 && F(objArr)) {
            return objArr;
        }
        return null;
    }

    public final boolean x(boolean z11, Object[] objArr, boolean[] zArr) {
        boolean z12 = true;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            if (!zArr[i11]) {
                try {
                    objArr[i11] = y(z11, objArr[i11]);
                } catch (Throwable th2) {
                    z12 = A(th2, objArr, i11);
                }
            }
        }
        return z12;
    }

    public final Object y(boolean z11, Object obj) {
        Map<Class<?>, r90.g[]> map = this.f78173a;
        if (map != null && obj != null) {
            r90.g[] gVarArr = map.get(obj.getClass());
            if (gVarArr == null) {
                return obj;
            }
            int i11 = 0;
            if (z11) {
                while (i11 < gVarArr.length) {
                    obj = gVarArr[i11].a(obj);
                    i11++;
                }
                return obj;
            }
            while (i11 < gVarArr.length) {
                obj = gVarArr[i11].b(obj);
                i11++;
            }
        }
        return obj;
    }

    public final j90.i z() {
        if (this.f78174b == null) {
            this.f78174b = new j90.i();
        }
        return this.f78174b;
    }
}
