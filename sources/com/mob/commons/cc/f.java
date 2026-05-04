package com.mob.commons.cc;

import com.mob.commons.cc.i;

/* loaded from: classes7.dex */
public class f implements i {
    public int a(int i11) {
        return ~i11;
    }

    public int b(int i11, int i12) {
        return i11 | i12;
    }

    public int c(int i11, int i12) {
        return i11 >> i12;
    }

    public int d(int i11, int i12) {
        return i11 << i12;
    }

    public int e(int i11, int i12) {
        return i11 ^ i12;
    }

    public int a(int i11, int i12) {
        return i11 & i12;
    }

    @Override // com.mob.commons.cc.i
    public i.b a(i.a aVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        i.b bVar = new i.b();
        try {
            if ("andOperation".equals(aVar.f40232a)) {
                Object[] objArr = aVar.f40233b;
                if (objArr.length == 2 && (obj10 = objArr[0]) != null && (obj10 instanceof Integer) && (obj11 = objArr[1]) != null && (obj11 instanceof Integer)) {
                    bVar.f40236a = Integer.valueOf(a(Integer.parseInt(obj10.toString()), Integer.parseInt(aVar.f40233b[1].toString())));
                    return bVar;
                }
            }
            if ("orOperation".equals(aVar.f40232a)) {
                Object[] objArr2 = aVar.f40233b;
                if (objArr2.length == 2 && (obj8 = objArr2[0]) != null && (obj8 instanceof Integer) && (obj9 = objArr2[1]) != null && (obj9 instanceof Integer)) {
                    bVar.f40236a = Integer.valueOf(b(Integer.parseInt(obj8.toString()), Integer.parseInt(aVar.f40233b[1].toString())));
                    return bVar;
                }
            }
            if ("rMoveOperation".equals(aVar.f40232a)) {
                Object[] objArr3 = aVar.f40233b;
                if (objArr3.length == 2 && (obj6 = objArr3[0]) != null && (obj6 instanceof Integer) && (obj7 = objArr3[1]) != null && (obj7 instanceof Integer)) {
                    bVar.f40236a = Integer.valueOf(c(Integer.parseInt(obj6.toString()), Integer.parseInt(aVar.f40233b[1].toString())));
                    return bVar;
                }
            }
            if ("lMoveOperation".equals(aVar.f40232a)) {
                Object[] objArr4 = aVar.f40233b;
                if (objArr4.length == 2 && (obj4 = objArr4[0]) != null && (obj4 instanceof Integer) && (obj5 = objArr4[1]) != null && (obj5 instanceof Integer)) {
                    bVar.f40236a = Integer.valueOf(d(Integer.parseInt(obj4.toString()), Integer.parseInt(aVar.f40233b[1].toString())));
                    return bVar;
                }
            }
            if ("xOperation".equals(aVar.f40232a)) {
                Object[] objArr5 = aVar.f40233b;
                if (objArr5.length == 1 && (obj3 = objArr5[0]) != null && (obj3 instanceof Integer)) {
                    bVar.f40236a = Integer.valueOf(a(Integer.parseInt(obj3.toString())));
                    return bVar;
                }
            }
            if ("xorOperation".equals(aVar.f40232a)) {
                Object[] objArr6 = aVar.f40233b;
                if (objArr6.length == 2 && (obj = objArr6[0]) != null && (obj instanceof Integer) && (obj2 = objArr6[1]) != null && (obj2 instanceof Integer)) {
                    bVar.f40236a = Integer.valueOf(e(Integer.parseInt(obj.toString()), Integer.parseInt(aVar.f40233b[1].toString())));
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
