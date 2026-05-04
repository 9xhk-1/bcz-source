package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k0<T> {

    /* renamed from: a, reason: collision with root package name */
    public b<T> f1554a;

    /* renamed from: b, reason: collision with root package name */
    public b<T> f1555b;

    /* renamed from: c, reason: collision with root package name */
    public b<T> f1556c;

    /* renamed from: d, reason: collision with root package name */
    public b<T> f1557d;

    /* renamed from: e, reason: collision with root package name */
    public int f1558e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final j0<b<T>> f1559f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j0<b<T>> {
        public a(int i11, int i12) {
            super(i11, i12);
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public b<T> g() {
            return new b<>();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public T f1561a;

        /* renamed from: b, reason: collision with root package name */
        public b<T> f1562b;

        /* renamed from: c, reason: collision with root package name */
        public b<T> f1563c;
    }

    public k0(int i11) {
        this.f1559f = new a(16, i11);
    }

    public void a(T t11) {
        b<T> h11 = this.f1559f.h();
        h11.f1561a = t11;
        h11.f1562b = null;
        h11.f1563c = null;
        if (this.f1554a == null) {
            this.f1554a = h11;
            this.f1555b = h11;
            this.f1558e++;
        } else {
            b<T> bVar = this.f1555b;
            h11.f1563c = bVar;
            bVar.f1562b = h11;
            this.f1555b = h11;
            this.f1558e++;
        }
    }

    public void b(T t11) {
        b<T> h11 = this.f1559f.h();
        h11.f1561a = t11;
        b<T> bVar = this.f1554a;
        h11.f1562b = bVar;
        h11.f1563c = null;
        if (bVar != null) {
            bVar.f1563c = h11;
        } else {
            this.f1555b = h11;
        }
        this.f1554a = h11;
        this.f1558e++;
    }

    public void c() {
        d();
        while (f() != null) {
            h();
        }
    }

    public void d() {
        this.f1556c = this.f1554a;
    }

    public void e() {
        this.f1556c = this.f1555b;
    }

    @d0
    public T f() {
        b<T> bVar = this.f1556c;
        if (bVar == null) {
            return null;
        }
        T t11 = bVar.f1561a;
        this.f1557d = bVar;
        this.f1556c = bVar.f1562b;
        return t11;
    }

    @d0
    public T g() {
        b<T> bVar = this.f1556c;
        if (bVar == null) {
            return null;
        }
        T t11 = bVar.f1561a;
        this.f1557d = bVar;
        this.f1556c = bVar.f1563c;
        return t11;
    }

    public void h() {
        b<T> bVar = this.f1557d;
        if (bVar == null) {
            return;
        }
        this.f1558e--;
        b<T> bVar2 = bVar.f1562b;
        b<T> bVar3 = bVar.f1563c;
        this.f1559f.d(bVar);
        this.f1557d = null;
        if (this.f1558e == 0) {
            this.f1554a = null;
            this.f1555b = null;
        } else if (bVar == this.f1554a) {
            bVar2.f1563c = null;
            this.f1554a = bVar2;
        } else if (bVar == this.f1555b) {
            bVar3.f1562b = null;
            this.f1555b = bVar3;
        } else {
            bVar3.f1562b = bVar2;
            bVar2.f1563c = bVar3;
        }
    }

    @d0
    public T i() {
        b<T> bVar = this.f1555b;
        if (bVar == null) {
            return null;
        }
        T t11 = bVar.f1561a;
        this.f1558e--;
        b<T> bVar2 = bVar.f1563c;
        this.f1559f.d(bVar);
        if (this.f1558e == 0) {
            this.f1554a = null;
            this.f1555b = null;
            return t11;
        }
        this.f1555b = bVar2;
        bVar2.f1562b = null;
        return t11;
    }

    public int j() {
        return this.f1558e;
    }
}
