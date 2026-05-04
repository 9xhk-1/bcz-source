package r1;

import a3.b1;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.lang.reflect.GenericDeclaration;
import s1.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d implements b3.c<Void> {

    /* renamed from: a, reason: collision with root package name */
    public e f82827a;

    /* renamed from: b, reason: collision with root package name */
    public final a f82828b;

    /* renamed from: c, reason: collision with root package name */
    public final s1.a f82829c;

    /* renamed from: d, reason: collision with root package name */
    public final b3.a f82830d;

    /* renamed from: e, reason: collision with root package name */
    public final long f82831e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f82832f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f82833g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.badlogic.gdx.utils.a<a> f82834h;

    /* renamed from: i, reason: collision with root package name */
    public volatile b3.b<Void> f82835i;

    /* renamed from: j, reason: collision with root package name */
    public volatile b3.b<Void> f82836j;

    /* renamed from: k, reason: collision with root package name */
    public volatile Object f82837k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f82838l;

    public d(e eVar, a aVar, s1.a aVar2, b3.a aVar3) {
        this.f82827a = eVar;
        this.f82828b = aVar;
        this.f82829c = aVar2;
        this.f82830d = aVar3;
        this.f82831e = eVar.f82852n.e() == 3 ? b1.c() : 0L;
    }

    @Override // b3.c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        if (this.f82838l) {
            return null;
        }
        s1.b bVar = (s1.b) this.f82829c;
        if (this.f82833g) {
            e eVar = this.f82827a;
            a aVar = this.f82828b;
            bVar.c(eVar, aVar.f82822a, e(this.f82829c, aVar), this.f82828b.f82824c);
            this.f82832f = true;
        } else {
            a aVar2 = this.f82828b;
            this.f82834h = bVar.a(aVar2.f82822a, e(this.f82829c, aVar2), this.f82828b.f82824c);
            if (this.f82834h != null) {
                d(this.f82834h);
                this.f82827a.p1(this.f82828b.f82822a, this.f82834h);
            } else {
                e eVar2 = this.f82827a;
                a aVar3 = this.f82828b;
                bVar.c(eVar2, aVar3.f82822a, e(this.f82829c, aVar3), this.f82828b.f82824c);
                this.f82832f = true;
            }
        }
        return null;
    }

    public final void b() {
        s1.b bVar = (s1.b) this.f82829c;
        if (!this.f82833g) {
            if (this.f82835i == null) {
                this.f82835i = this.f82830d.b(this);
                return;
            }
            if (this.f82835i.b()) {
                try {
                    this.f82835i.a();
                    this.f82833g = true;
                    if (this.f82832f) {
                        e eVar = this.f82827a;
                        a aVar = this.f82828b;
                        this.f82837k = bVar.d(eVar, aVar.f82822a, e(this.f82829c, aVar), this.f82828b.f82824c);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    throw new GdxRuntimeException("Couldn't load dependencies of asset: " + this.f82828b.f82822a, e11);
                }
            }
            return;
        }
        if (this.f82836j == null && !this.f82832f) {
            this.f82836j = this.f82830d.b(this);
            return;
        }
        if (this.f82832f) {
            e eVar2 = this.f82827a;
            a aVar2 = this.f82828b;
            this.f82837k = bVar.d(eVar2, aVar2.f82822a, e(this.f82829c, aVar2), this.f82828b.f82824c);
        } else if (this.f82836j.b()) {
            try {
                this.f82836j.a();
                e eVar3 = this.f82827a;
                a aVar3 = this.f82828b;
                this.f82837k = bVar.d(eVar3, aVar3.f82822a, e(this.f82829c, aVar3), this.f82828b.f82824c);
            } catch (Exception e12) {
                throw new GdxRuntimeException("Couldn't load asset: " + this.f82828b.f82822a, e12);
            }
        }
    }

    public final void c() {
        n nVar = (n) this.f82829c;
        if (this.f82833g) {
            e eVar = this.f82827a;
            a aVar = this.f82828b;
            this.f82837k = nVar.c(eVar, aVar.f82822a, e(this.f82829c, aVar), this.f82828b.f82824c);
            return;
        }
        this.f82833g = true;
        a aVar2 = this.f82828b;
        this.f82834h = nVar.a(aVar2.f82822a, e(this.f82829c, aVar2), this.f82828b.f82824c);
        if (this.f82834h != null) {
            d(this.f82834h);
            this.f82827a.p1(this.f82828b.f82822a, this.f82834h);
        } else {
            e eVar2 = this.f82827a;
            a aVar3 = this.f82828b;
            this.f82837k = nVar.c(eVar2, aVar3.f82822a, e(this.f82829c, aVar3), this.f82828b.f82824c);
        }
    }

    public final void d(com.badlogic.gdx.utils.a<a> aVar) {
        boolean z11 = aVar.f13180c;
        aVar.f13180c = true;
        for (int i11 = 0; i11 < aVar.f13179b; i11++) {
            String str = aVar.get(i11).f82822a;
            GenericDeclaration genericDeclaration = aVar.get(i11).f82823b;
            for (int i12 = aVar.f13179b - 1; i12 > i11; i12--) {
                if (genericDeclaration == aVar.get(i12).f82823b && str.equals(aVar.get(i12).f82822a)) {
                    aVar.A(i12);
                }
            }
        }
        aVar.f13180c = z11;
    }

    public final v1.a e(s1.a aVar, a aVar2) {
        if (aVar2.f82825d == null) {
            aVar2.f82825d = aVar.b(aVar2.f82822a);
        }
        return aVar2.f82825d;
    }

    public void f() {
        s1.a aVar = this.f82829c;
        if (aVar instanceof s1.b) {
            e eVar = this.f82827a;
            a aVar2 = this.f82828b;
            ((s1.b) aVar).e(eVar, aVar2.f82822a, e(aVar, aVar2), this.f82828b.f82824c);
        }
    }

    public boolean g() {
        if (this.f82829c instanceof n) {
            c();
        } else {
            b();
        }
        return this.f82837k != null;
    }
}
