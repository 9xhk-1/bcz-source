package bt;

import android.view.animation.Interpolator;
import bt.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d extends bt.a {

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<bt.a> f7239b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public HashMap<bt.a, f> f7240c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<f> f7241d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<f> f7242e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f7243f = true;

    /* renamed from: g, reason: collision with root package name */
    public b f7244g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7245h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7246i = false;

    /* renamed from: j, reason: collision with root package name */
    public long f7247j = 0;

    /* renamed from: k, reason: collision with root package name */
    public q f7248k = null;

    /* renamed from: l, reason: collision with root package name */
    public long f7249l = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends bt.c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7250a = false;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f7252c;

        public a(ArrayList arrayList) {
            this.f7252c = arrayList;
        }

        @Override // bt.c, bt.a.InterfaceC0121a
        public void d(bt.a aVar) {
            this.f7250a = true;
        }

        @Override // bt.c, bt.a.InterfaceC0121a
        public void e(bt.a aVar) {
            if (this.f7250a) {
                return;
            }
            int size = this.f7252c.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = (f) this.f7252c.get(i11);
                fVar.f7264a.s();
                d.this.f7239b.add(fVar.f7264a);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public f f7255a;

        public c(bt.a aVar) {
            f fVar = (f) d.this.f7240c.get(aVar);
            this.f7255a = fVar;
            if (fVar == null) {
                this.f7255a = new f(aVar);
                d.this.f7240c.put(aVar, this.f7255a);
                d.this.f7241d.add(this.f7255a);
            }
        }

        public c a(long j11) {
            q f02 = q.f0(0.0f, 1.0f);
            f02.l(j11);
            b(f02);
            return this;
        }

        public c b(bt.a aVar) {
            f fVar = (f) d.this.f7240c.get(aVar);
            if (fVar == null) {
                fVar = new f(aVar);
                d.this.f7240c.put(aVar, fVar);
                d.this.f7241d.add(fVar);
            }
            this.f7255a.a(new C0122d(fVar, 1));
            return this;
        }

        public c c(bt.a aVar) {
            f fVar = (f) d.this.f7240c.get(aVar);
            if (fVar == null) {
                fVar = new f(aVar);
                d.this.f7240c.put(aVar, fVar);
                d.this.f7241d.add(fVar);
            }
            fVar.a(new C0122d(this.f7255a, 1));
            return this;
        }

        public c d(bt.a aVar) {
            f fVar = (f) d.this.f7240c.get(aVar);
            if (fVar == null) {
                fVar = new f(aVar);
                d.this.f7240c.put(aVar, fVar);
                d.this.f7241d.add(fVar);
            }
            fVar.a(new C0122d(this.f7255a, 0));
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: bt.d$d, reason: collision with other inner class name */
    public static class C0122d {

        /* renamed from: c, reason: collision with root package name */
        public static final int f7257c = 0;

        /* renamed from: d, reason: collision with root package name */
        public static final int f7258d = 1;

        /* renamed from: a, reason: collision with root package name */
        public f f7259a;

        /* renamed from: b, reason: collision with root package name */
        public int f7260b;

        public C0122d(f fVar, int i11) {
            this.f7259a = fVar;
            this.f7260b = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements Cloneable {

        /* renamed from: a, reason: collision with root package name */
        public bt.a f7264a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<C0122d> f7265b = null;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<C0122d> f7266c = null;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList<f> f7267d = null;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList<f> f7268e = null;

        /* renamed from: f, reason: collision with root package name */
        public boolean f7269f = false;

        public f(bt.a aVar) {
            this.f7264a = aVar;
        }

        public void a(C0122d c0122d) {
            if (this.f7265b == null) {
                this.f7265b = new ArrayList<>();
                this.f7267d = new ArrayList<>();
            }
            this.f7265b.add(c0122d);
            if (!this.f7267d.contains(c0122d.f7259a)) {
                this.f7267d.add(c0122d.f7259a);
            }
            f fVar = c0122d.f7259a;
            if (fVar.f7268e == null) {
                fVar.f7268e = new ArrayList<>();
            }
            fVar.f7268e.add(this);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f clone() {
            try {
                f fVar = (f) super.clone();
                fVar.f7264a = this.f7264a.clone();
                return fVar;
            } catch (CloneNotSupportedException unused) {
                throw new AssertionError();
            }
        }
    }

    public c A(bt.a aVar) {
        if (aVar == null) {
            return null;
        }
        this.f7243f = true;
        return new c(aVar);
    }

    public void B(List<bt.a> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f7243f = true;
        int i11 = 0;
        if (list.size() == 1) {
            A(list.get(0));
            return;
        }
        while (i11 < list.size() - 1) {
            c A = A(list.get(i11));
            i11++;
            A.c(list.get(i11));
        }
    }

    public void E(bt.a... aVarArr) {
        if (aVarArr != null) {
            this.f7243f = true;
            int i11 = 0;
            if (aVarArr.length == 1) {
                A(aVarArr[0]);
                return;
            }
            while (i11 < aVarArr.length - 1) {
                c A = A(aVarArr[i11]);
                i11++;
                A.c(aVarArr[i11]);
            }
        }
    }

    public void F(Collection<bt.a> collection) {
        if (collection == null || collection.size() <= 0) {
            return;
        }
        this.f7243f = true;
        c cVar = null;
        for (bt.a aVar : collection) {
            if (cVar == null) {
                cVar = A(aVar);
            } else {
                cVar.d(aVar);
            }
        }
    }

    public void G(bt.a... aVarArr) {
        if (aVarArr != null) {
            this.f7243f = true;
            c A = A(aVarArr[0]);
            for (int i11 = 1; i11 < aVarArr.length; i11++) {
                A.d(aVarArr[i11]);
            }
        }
    }

    @Override // bt.a
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public d l(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("duration must be a value of zero or greater");
        }
        Iterator<f> it = this.f7241d.iterator();
        while (it.hasNext()) {
            it.next().f7264a.l(j11);
        }
        this.f7249l = j11;
        return this;
    }

    public final void K() {
        if (!this.f7243f) {
            int size = this.f7241d.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = this.f7241d.get(i11);
                ArrayList<C0122d> arrayList = fVar.f7265b;
                if (arrayList != null && arrayList.size() > 0) {
                    int size2 = fVar.f7265b.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        C0122d c0122d = fVar.f7265b.get(i12);
                        if (fVar.f7267d == null) {
                            fVar.f7267d = new ArrayList<>();
                        }
                        if (!fVar.f7267d.contains(c0122d.f7259a)) {
                            fVar.f7267d.add(c0122d.f7259a);
                        }
                    }
                }
                fVar.f7269f = false;
            }
            return;
        }
        this.f7242e.clear();
        ArrayList arrayList2 = new ArrayList();
        int size3 = this.f7241d.size();
        for (int i13 = 0; i13 < size3; i13++) {
            f fVar2 = this.f7241d.get(i13);
            ArrayList<C0122d> arrayList3 = fVar2.f7265b;
            if (arrayList3 == null || arrayList3.size() == 0) {
                arrayList2.add(fVar2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        while (arrayList2.size() > 0) {
            int size4 = arrayList2.size();
            for (int i14 = 0; i14 < size4; i14++) {
                f fVar3 = (f) arrayList2.get(i14);
                this.f7242e.add(fVar3);
                ArrayList<f> arrayList5 = fVar3.f7268e;
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    for (int i15 = 0; i15 < size5; i15++) {
                        f fVar4 = fVar3.f7268e.get(i15);
                        fVar4.f7267d.remove(fVar3);
                        if (fVar4.f7267d.size() == 0) {
                            arrayList4.add(fVar4);
                        }
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList4);
            arrayList4.clear();
        }
        this.f7243f = false;
        if (this.f7242e.size() != this.f7241d.size()) {
            throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
        }
    }

    @Override // bt.a
    public void c() {
        this.f7245h = true;
        if (h()) {
            if (this.f7242e.size() != this.f7241d.size()) {
                K();
                Iterator<f> it = this.f7242e.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    if (this.f7244g == null) {
                        this.f7244g = new b(this);
                    }
                    next.f7264a.a(this.f7244g);
                }
            }
            q qVar = this.f7248k;
            if (qVar != null) {
                qVar.cancel();
            }
            if (this.f7242e.size() > 0) {
                Iterator<f> it2 = this.f7242e.iterator();
                while (it2.hasNext()) {
                    it2.next().f7264a.c();
                }
            }
            ArrayList<a.InterfaceC0121a> arrayList = this.f7223a;
            if (arrayList != null) {
                Iterator it3 = ((ArrayList) arrayList.clone()).iterator();
                while (it3.hasNext()) {
                    ((a.InterfaceC0121a) it3.next()).e(this);
                }
            }
            this.f7246i = false;
        }
    }

    @Override // bt.a
    public void cancel() {
        ArrayList arrayList;
        this.f7245h = true;
        if (h()) {
            ArrayList<a.InterfaceC0121a> arrayList2 = this.f7223a;
            if (arrayList2 != null) {
                arrayList = (ArrayList) arrayList2.clone();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((a.InterfaceC0121a) it.next()).d(this);
                }
            } else {
                arrayList = null;
            }
            q qVar = this.f7248k;
            if (qVar != null && qVar.g()) {
                this.f7248k.cancel();
            } else if (this.f7242e.size() > 0) {
                Iterator<f> it2 = this.f7242e.iterator();
                while (it2.hasNext()) {
                    it2.next().f7264a.cancel();
                }
            }
            if (arrayList != null) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((a.InterfaceC0121a) it3.next()).e(this);
                }
            }
            this.f7246i = false;
        }
    }

    @Override // bt.a
    public long d() {
        return this.f7249l;
    }

    @Override // bt.a
    public long f() {
        return this.f7247j;
    }

    @Override // bt.a
    public boolean g() {
        Iterator<f> it = this.f7241d.iterator();
        while (it.hasNext()) {
            if (it.next().f7264a.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // bt.a
    public boolean h() {
        return this.f7246i;
    }

    @Override // bt.a
    public void m(Interpolator interpolator) {
        Iterator<f> it = this.f7241d.iterator();
        while (it.hasNext()) {
            it.next().f7264a.m(interpolator);
        }
    }

    @Override // bt.a
    public void n(long j11) {
        this.f7247j = j11;
    }

    @Override // bt.a
    public void o(Object obj) {
        Iterator<f> it = this.f7241d.iterator();
        while (it.hasNext()) {
            bt.a aVar = it.next().f7264a;
            if (aVar instanceof d) {
                ((d) aVar).o(obj);
            } else if (aVar instanceof l) {
                ((l) aVar).o(obj);
            }
        }
    }

    @Override // bt.a
    public void p() {
        Iterator<f> it = this.f7241d.iterator();
        while (it.hasNext()) {
            it.next().f7264a.p();
        }
    }

    @Override // bt.a
    public void q() {
        Iterator<f> it = this.f7241d.iterator();
        while (it.hasNext()) {
            it.next().f7264a.q();
        }
    }

    @Override // bt.a
    public void s() {
        this.f7245h = false;
        this.f7246i = true;
        K();
        int size = this.f7242e.size();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = this.f7242e.get(i11);
            ArrayList<a.InterfaceC0121a> e11 = fVar.f7264a.e();
            if (e11 != null && e11.size() > 0) {
                Iterator it = new ArrayList(e11).iterator();
                while (it.hasNext()) {
                    a.InterfaceC0121a interfaceC0121a = (a.InterfaceC0121a) it.next();
                    if ((interfaceC0121a instanceof e) || (interfaceC0121a instanceof b)) {
                        fVar.f7264a.j(interfaceC0121a);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < size; i12++) {
            f fVar2 = this.f7242e.get(i12);
            if (this.f7244g == null) {
                this.f7244g = new b(this);
            }
            ArrayList<C0122d> arrayList2 = fVar2.f7265b;
            if (arrayList2 == null || arrayList2.size() == 0) {
                arrayList.add(fVar2);
            } else {
                int size2 = fVar2.f7265b.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    C0122d c0122d = fVar2.f7265b.get(i13);
                    c0122d.f7259a.f7264a.a(new e(this, fVar2, c0122d.f7260b));
                }
                fVar2.f7266c = (ArrayList) fVar2.f7265b.clone();
            }
            fVar2.f7264a.a(this.f7244g);
        }
        if (this.f7247j <= 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                f fVar3 = (f) it2.next();
                fVar3.f7264a.s();
                this.f7239b.add(fVar3.f7264a);
            }
        } else {
            q f02 = q.f0(0.0f, 1.0f);
            this.f7248k = f02;
            f02.l(this.f7247j);
            this.f7248k.a(new a(arrayList));
            this.f7248k.s();
        }
        ArrayList<a.InterfaceC0121a> arrayList3 = this.f7223a;
        if (arrayList3 != null) {
            ArrayList arrayList4 = (ArrayList) arrayList3.clone();
            int size3 = arrayList4.size();
            for (int i14 = 0; i14 < size3; i14++) {
                ((a.InterfaceC0121a) arrayList4.get(i14)).c(this);
            }
        }
        if (this.f7241d.size() == 0 && this.f7247j == 0) {
            this.f7246i = false;
            ArrayList<a.InterfaceC0121a> arrayList5 = this.f7223a;
            if (arrayList5 != null) {
                ArrayList arrayList6 = (ArrayList) arrayList5.clone();
                int size4 = arrayList6.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    ((a.InterfaceC0121a) arrayList6.get(i15)).e(this);
                }
            }
        }
    }

    @Override // bt.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public d clone() {
        d dVar = (d) super.clone();
        dVar.f7243f = true;
        dVar.f7245h = false;
        dVar.f7246i = false;
        dVar.f7239b = new ArrayList<>();
        dVar.f7240c = new HashMap<>();
        dVar.f7241d = new ArrayList<>();
        dVar.f7242e = new ArrayList<>();
        HashMap hashMap = new HashMap();
        Iterator<f> it = this.f7241d.iterator();
        while (it.hasNext()) {
            f next = it.next();
            f clone = next.clone();
            hashMap.put(next, clone);
            dVar.f7241d.add(clone);
            dVar.f7240c.put(clone.f7264a, clone);
            ArrayList arrayList = null;
            clone.f7265b = null;
            clone.f7266c = null;
            clone.f7268e = null;
            clone.f7267d = null;
            ArrayList<a.InterfaceC0121a> e11 = clone.f7264a.e();
            if (e11 != null) {
                Iterator<a.InterfaceC0121a> it2 = e11.iterator();
                while (it2.hasNext()) {
                    a.InterfaceC0121a next2 = it2.next();
                    if (next2 instanceof b) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next2);
                    }
                }
                if (arrayList != null) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        e11.remove((a.InterfaceC0121a) it3.next());
                    }
                }
            }
        }
        Iterator<f> it4 = this.f7241d.iterator();
        while (it4.hasNext()) {
            f next3 = it4.next();
            f fVar = (f) hashMap.get(next3);
            ArrayList<C0122d> arrayList2 = next3.f7265b;
            if (arrayList2 != null) {
                Iterator<C0122d> it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    C0122d next4 = it5.next();
                    fVar.a(new C0122d((f) hashMap.get(next4.f7259a), next4.f7260b));
                }
            }
        }
        return dVar;
    }

    public ArrayList<bt.a> z() {
        ArrayList<bt.a> arrayList = new ArrayList<>();
        Iterator<f> it = this.f7241d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f7264a);
        }
        return arrayList;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements a.InterfaceC0121a {

        /* renamed from: a, reason: collision with root package name */
        public d f7253a;

        public b(d dVar) {
            this.f7253a = dVar;
        }

        @Override // bt.a.InterfaceC0121a
        public void d(bt.a aVar) {
            ArrayList<a.InterfaceC0121a> arrayList;
            d dVar = d.this;
            if (dVar.f7245h || dVar.f7239b.size() != 0 || (arrayList = d.this.f7223a) == null) {
                return;
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                d.this.f7223a.get(i11).d(this.f7253a);
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void e(bt.a aVar) {
            aVar.j(this);
            d.this.f7239b.remove(aVar);
            ((f) this.f7253a.f7240c.get(aVar)).f7269f = true;
            if (d.this.f7245h) {
                return;
            }
            ArrayList arrayList = this.f7253a.f7242e;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (!((f) arrayList.get(i11)).f7269f) {
                    return;
                }
            }
            ArrayList<a.InterfaceC0121a> arrayList2 = d.this.f7223a;
            if (arrayList2 != null) {
                ArrayList arrayList3 = (ArrayList) arrayList2.clone();
                int size2 = arrayList3.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((a.InterfaceC0121a) arrayList3.get(i12)).e(this.f7253a);
                }
            }
            this.f7253a.f7246i = false;
        }

        @Override // bt.a.InterfaceC0121a
        public void b(bt.a aVar) {
        }

        @Override // bt.a.InterfaceC0121a
        public void c(bt.a aVar) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements a.InterfaceC0121a {

        /* renamed from: a, reason: collision with root package name */
        public d f7261a;

        /* renamed from: b, reason: collision with root package name */
        public f f7262b;

        /* renamed from: c, reason: collision with root package name */
        public int f7263c;

        public e(d dVar, f fVar, int i11) {
            this.f7261a = dVar;
            this.f7262b = fVar;
            this.f7263c = i11;
        }

        public final void a(bt.a aVar) {
            C0122d c0122d;
            if (this.f7261a.f7245h) {
                return;
            }
            int size = this.f7262b.f7266c.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    C0122d c0122d2 = this.f7262b.f7266c.get(i11);
                    if (c0122d2.f7260b == this.f7263c && c0122d2.f7259a.f7264a == aVar) {
                        aVar.j(this);
                        c0122d = c0122d2;
                        break;
                    }
                    i11++;
                } else {
                    c0122d = null;
                    break;
                }
            }
            this.f7262b.f7266c.remove(c0122d);
            if (this.f7262b.f7266c.size() == 0) {
                this.f7262b.f7264a.s();
                this.f7261a.f7239b.add(this.f7262b.f7264a);
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void c(bt.a aVar) {
            if (this.f7263c == 0) {
                a(aVar);
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void e(bt.a aVar) {
            if (this.f7263c == 1) {
                a(aVar);
            }
        }

        @Override // bt.a.InterfaceC0121a
        public void b(bt.a aVar) {
        }

        @Override // bt.a.InterfaceC0121a
        public void d(bt.a aVar) {
        }
    }
}
