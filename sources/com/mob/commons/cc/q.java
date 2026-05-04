package com.mob.commons.cc;

import com.mob.commons.cc.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private String f40288a;

    /* renamed from: b, reason: collision with root package name */
    private int f40289b;

    /* renamed from: c, reason: collision with root package name */
    private j f40290c;

    /* renamed from: d, reason: collision with root package name */
    private int f40291d;

    /* renamed from: e, reason: collision with root package name */
    private int f40292e;

    /* renamed from: f, reason: collision with root package name */
    private l f40293f;

    public static class a implements i {

        /* renamed from: a, reason: collision with root package name */
        public Throwable f40294a;

        /* renamed from: b, reason: collision with root package name */
        public Object f40295b;

        public boolean a() {
            return this.f40294a != null;
        }

        private a() {
        }

        @Override // com.mob.commons.cc.i
        public i.b a(i.a aVar) {
            i.b bVar = new i.b();
            try {
                if ("isError".equals(aVar.f40232a) && aVar.f40233b.length == 0) {
                    bVar.f40236a = Boolean.valueOf(a());
                    return bVar;
                }
                if ("getError".equals(aVar.f40232a) && aVar.f40233b.length == 0) {
                    bVar.f40236a = this.f40294a;
                    return bVar;
                }
                if ("getResult".equals(aVar.f40232a) && aVar.f40233b.length == 0) {
                    bVar.f40236a = this.f40295b;
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

    public q(String str, int i11, ArrayList<p> arrayList, ArrayList<Object> arrayList2, int i12, int i13, j jVar) {
        this.f40288a = str;
        this.f40289b = i11;
        this.f40293f = new l(arrayList, arrayList2);
        this.f40291d = i12;
        this.f40292e = i13;
        this.f40290c = jVar;
    }

    public q a(j jVar, String str, int i11) {
        ArrayList<p> arrayList = new ArrayList<>();
        a(str, i11, arrayList, 0);
        return new q(null, 1, arrayList, new ArrayList(), 0, arrayList.size(), jVar);
    }

    public LinkedList<Object> b(Object... objArr) throws Throwable {
        j b11 = this.f40290c.b();
        int i11 = this.f40289b;
        if (i11 != 0) {
            if (objArr.length <= i11) {
                for (int length = objArr.length; length < this.f40289b; length++) {
                    b11.a((Object) null);
                }
                for (int length2 = objArr.length - 1; length2 >= 0; length2--) {
                    b11.a(objArr[length2]);
                }
            } else {
                ArrayList arrayList = new ArrayList(0);
                for (int i12 = this.f40289b - 1; i12 < objArr.length; i12++) {
                    arrayList.add(objArr[i12]);
                }
                b11.a(arrayList);
                for (int i13 = this.f40289b - 2; i13 >= 0; i13--) {
                    b11.a(objArr[i13]);
                }
            }
        }
        LinkedList<Object> linkedList = new LinkedList<>();
        this.f40293f.a(this.f40291d, this.f40292e, b11, linkedList);
        return linkedList;
    }

    private void a(String str, int i11, ArrayList<p> arrayList, int i12) {
        if (i12 != 0) {
            p pVar = new p(29);
            pVar.f40265b = str;
            pVar.f40266c = i11;
            pVar.f40272i = 1;
            arrayList.add(pVar);
        }
        p pVar2 = new p(1);
        pVar2.f40265b = str;
        pVar2.f40266c = i11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("arg");
        int i13 = i12 + 1;
        sb2.append(i13);
        pVar2.f40271h = sb2.toString();
        arrayList.add(pVar2);
        int i14 = this.f40289b;
        if (i12 < i14 - 1) {
            a(str, i11, arrayList, i13);
            p pVar3 = new p(28);
            pVar3.f40265b = str;
            pVar3.f40266c = i11;
            arrayList.add(pVar3);
        } else {
            for (int i15 = i14 - 1; i15 >= 0; i15 += -1) {
                p pVar4 = new p(3);
                pVar4.f40265b = str;
                pVar4.f40266c = i11;
                pVar4.f40271h = "arg" + (i15 + 1);
                arrayList.add(pVar4);
            }
            if (this.f40288a == null) {
                p pVar5 = new p(2);
                pVar5.f40265b = str;
                pVar5.f40266c = i11;
                pVar5.f40277n = this;
                arrayList.add(pVar5);
                p pVar6 = new p(32);
                pVar6.f40265b = str;
                pVar6.f40266c = i11;
                pVar6.f40272i = this.f40289b;
                arrayList.add(pVar6);
            } else {
                p pVar7 = new p(31);
                pVar7.f40265b = str;
                pVar7.f40266c = i11;
                pVar7.f40271h = this.f40288a;
                pVar7.f40272i = this.f40289b;
                arrayList.add(pVar7);
            }
            Iterator<p> it = this.f40293f.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().f40264a == 28) {
                    p pVar8 = new p(28);
                    pVar8.f40265b = str;
                    pVar8.f40266c = i11;
                    arrayList.add(pVar8);
                    break;
                }
            }
        }
        if (i12 != 0) {
            p pVar9 = new p(30);
            pVar9.f40265b = str;
            pVar9.f40266c = i11;
            arrayList.add(pVar9);
        }
    }

    public a a(Object... objArr) {
        a aVar = new a();
        try {
            LinkedList<Object> b11 = b(objArr);
            if (b11.isEmpty()) {
                return aVar;
            }
            aVar.f40295b = b11.get(0);
            return aVar;
        } catch (Throwable th2) {
            aVar.f40294a = th2;
            return aVar;
        }
    }
}
