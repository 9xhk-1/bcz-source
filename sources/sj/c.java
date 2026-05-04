package sj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public Map<Integer, a> f88732a = new HashMap();

    public static void c(String[] argv) {
        c cVar = new c();
        cVar.b();
        cVar.d();
        Iterator<Integer> it = cVar.f("is").iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            System.out.println(intValue + j2.O);
        }
    }

    public void a(int id2, String word) {
        for (int i11 = 0; i11 < word.length(); i11++) {
            int numericValue = Character.getNumericValue(word.charAt(i11));
            a aVar = this.f88732a.get(Integer.valueOf(numericValue));
            if (aVar == null) {
                aVar = new a();
            }
            this.f88732a.put(Integer.valueOf(numericValue), aVar);
            aVar.d(id2);
        }
    }

    public void b() {
        a(1, "hello");
        a(2, "word");
        a(3, "this");
        a(4, "is");
        a(5, "a");
        a(6, "test");
    }

    public void d() {
        Iterator<a> it = this.f88732a.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().c();
        }
        System.out.println("total mem size " + i11);
    }

    public List<Integer> e(List<a> candidates) {
        b bVar = new b(candidates.size());
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[candidates.size()];
        int i11 = 0;
        for (int i12 = 0; i12 < candidates.size(); i12++) {
            bVar.f(i12, candidates.get(i12).a(0));
            iArr[i12] = 0;
        }
        int b11 = bVar.b();
        while (true) {
            int b12 = bVar.b();
            int c11 = bVar.c();
            if (b12 == Integer.MAX_VALUE) {
                return arrayList;
            }
            System.out.println("get " + b12);
            if (b12 == b11) {
                i11++;
            } else {
                System.out.println(" ====> " + b11 + j2.O + i11);
                if (i11 >= 2) {
                    arrayList.add(Integer.valueOf(b11));
                }
                b11 = b12;
                i11 = 1;
            }
            int i13 = iArr[c11] + 1;
            iArr[c11] = i13;
            if (i13 >= candidates.get(c11).f()) {
                bVar.f(c11, Integer.MAX_VALUE);
            } else {
                bVar.f(c11, candidates.get(c11).a(iArr[c11]));
            }
        }
    }

    public List<Integer> f(String token) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < token.length(); i11++) {
            a aVar = this.f88732a.get(Integer.valueOf(Character.getNumericValue(token.charAt(i11))));
            if (aVar != null && aVar.f() > 0) {
                arrayList.add(aVar);
            }
        }
        return e(arrayList);
    }
}
