package s90;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class c implements k90.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f88145a;

    /* renamed from: b, reason: collision with root package name */
    public final char f88146b;

    /* renamed from: c, reason: collision with root package name */
    public final char f88147c;

    /* renamed from: d, reason: collision with root package name */
    public final char f88148d;

    /* renamed from: e, reason: collision with root package name */
    public final int f88149e;

    /* renamed from: f, reason: collision with root package name */
    public char[] f88150f;

    /* renamed from: g, reason: collision with root package name */
    public char[] f88151g;

    /* renamed from: h, reason: collision with root package name */
    public final char f88152h;

    /* renamed from: i, reason: collision with root package name */
    public final char f88153i;

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i11, e eVar, int i12) {
        this.f88145a = i11;
        this.f88149e = i12;
        char[] c12 = eVar.c1();
        this.f88150f = c12;
        if (c12 == null || c12.length <= 0) {
            this.f88147c = ((b) eVar.o()).t().length() > 1 ? ',' : ((b) eVar.o()).s();
            char[] cArr = new char[0];
            this.f88150f = cArr;
            this.f88151g = cArr;
        } else {
            this.f88147c = c12[0];
            this.f88151g = (char[]) c12.clone();
            Arrays.sort(this.f88150f);
        }
        this.f88148d = ((b) eVar.o()).g();
        this.f88146b = ((b) eVar.o()).b();
        this.f88152h = ((b) eVar.o()).u();
        this.f88153i = ((b) eVar.o()).v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        r9 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r9 >= r21.length) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r21[r9] != '\n') goto L23;
     */
    @Override // k90.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(char[] r21, int r22) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s90.c.a(char[], int):void");
    }

    public abstract void b(char c11, char c12, char c13);

    public Map<Character, Integer> c(List<Map<Character, Integer>> list) {
        HashMap hashMap = new HashMap();
        Iterator<Map<Character, Integer>> it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry<Character, Integer> entry : it.next().entrySet()) {
                Character key = entry.getKey();
                Integer value = entry.getValue();
                Integer num = (Integer) hashMap.get(key);
                if (num == null) {
                    num = 0;
                }
                hashMap.put(key, Integer.valueOf(num.intValue() + value.intValue()));
            }
        }
        return hashMap;
    }

    public char d(Map<Character, Integer> map, Map<Character, Integer> map2, char c11, boolean z11) {
        int i11 = z11 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int intValue = entry.getValue().intValue();
            if ((z11 && intValue <= i11) || (!z11 && intValue >= i11)) {
                Character key = entry.getKey();
                char charValue = key.charValue();
                if (i11 == intValue) {
                    Integer num = map2.get(Character.valueOf(c11));
                    Integer num2 = map2.get(key);
                    if (num == null || num2 == null) {
                        if (h(charValue)) {
                        }
                    } else if (num.equals(num2)) {
                        int e11 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.e(this.f88151g, c11, 0);
                        int e12 = org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.e(this.f88151g, charValue, 0);
                        if (e11 != -1 && e12 != -1 && e11 >= e12) {
                        }
                    } else {
                        if (z11) {
                            if (num2.intValue() > num.intValue()) {
                            }
                        }
                        if (!z11 && num2.intValue() > num.intValue()) {
                        }
                    }
                } else {
                    i11 = intValue;
                }
                c11 = charValue;
            }
        }
        return c11;
    }

    public void e(Map<Character, Integer> map, char c11) {
        f(map, c11, 1);
    }

    public void f(Map<Character, Integer> map, char c11, int i11) {
        Integer num = map.get(Character.valueOf(c11));
        if (num == null) {
            num = 0;
        }
        map.put(Character.valueOf(c11), Integer.valueOf(num.intValue() + i11));
    }

    public boolean g(char c11) {
        return Arrays.binarySearch(this.f88150f, c11) >= 0;
    }

    public boolean h(char c11) {
        if (g(c11)) {
            return true;
        }
        if (c11 == this.f88146b || Character.isLetterOrDigit(c11)) {
            return false;
        }
        return c11 == '\t' || c11 >= ' ';
    }

    public char i(Map<Character, Integer> map, Map<Character, Integer> map2, char c11) {
        return d(map, map2, c11, false);
    }

    public char j(Map<Character, Integer> map, Map<Character, Integer> map2, char c11) {
        return d(map, map2, c11, true);
    }

    public char k(Map<Character, Integer> map, Map<Character, Integer> map2) {
        char i11 = i(map, map2, this.f88147c);
        char j11 = j(map, map2, this.f88147c);
        if (j11 == ' ' || i11 == ' ') {
            Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Character, Integer> next = it.next();
                if (next.getValue().intValue() == 0 && next.getKey().charValue() != ' ') {
                    map2.remove(' ');
                    i11 = i(map, map2, this.f88147c);
                    j11 = j(map, map2, this.f88147c);
                    break;
                }
            }
        }
        if (i11 != j11) {
            if (map.get(Character.valueOf(j11)).intValue() != 0 || map.get(Character.valueOf(i11)).intValue() == 0) {
                char[] cArr = this.f88151g;
                int length = cArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        if (map2.get(Character.valueOf(j11)).intValue() > map2.get(Character.valueOf(i11)).intValue()) {
                            break;
                        }
                    } else {
                        char c11 = cArr[i12];
                        if (c11 == j11) {
                            break;
                        }
                        if (c11 == i11) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            return j11;
        }
        return i11;
    }
}
