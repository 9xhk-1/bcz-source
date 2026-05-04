package n20;

import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f74284c = new c("");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d f74285a;

    /* renamed from: b, reason: collision with root package name */
    public transient c f74286b;

    public c(@m80.k String str) {
        if (str == null) {
            a(1);
        }
        this.f74285a = new d(str, this);
    }

    public static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i12 = 2;
                break;
            case 8:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i11) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = q.a.f13044u;
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @m80.k
    public static c k(@m80.k f fVar) {
        if (fVar == null) {
            a(14);
        }
        return new c(d.m(fVar));
    }

    @m80.k
    public String b() {
        String b11 = this.f74285a.b();
        if (b11 == null) {
            a(4);
        }
        return b11;
    }

    @m80.k
    public c c(@m80.k f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new c(this.f74285a.c(fVar), this);
    }

    public boolean d() {
        return this.f74285a.e();
    }

    @m80.k
    public c e() {
        c cVar = this.f74286b;
        if (cVar != null) {
            if (cVar == null) {
                a(6);
            }
            return cVar;
        }
        if (d()) {
            throw new IllegalStateException(a.r.C0259a.f16300m);
        }
        c cVar2 = new c(this.f74285a.g());
        this.f74286b = cVar2;
        return cVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f74285a.equals(((c) obj).f74285a);
    }

    @m80.k
    public List<f> f() {
        List<f> h11 = this.f74285a.h();
        if (h11 == null) {
            a(11);
        }
        return h11;
    }

    @m80.k
    public f g() {
        f i11 = this.f74285a.i();
        if (i11 == null) {
            a(9);
        }
        return i11;
    }

    @m80.k
    public f h() {
        f j11 = this.f74285a.j();
        if (j11 == null) {
            a(10);
        }
        return j11;
    }

    public int hashCode() {
        return this.f74285a.hashCode();
    }

    public boolean i(@m80.k f fVar) {
        if (fVar == null) {
            a(12);
        }
        return this.f74285a.k(fVar);
    }

    @m80.k
    public d j() {
        d dVar = this.f74285a;
        if (dVar == null) {
            a(5);
        }
        return dVar;
    }

    public String toString() {
        return this.f74285a.toString();
    }

    public c(@m80.k d dVar) {
        if (dVar == null) {
            a(2);
        }
        this.f74285a = dVar;
    }

    public c(@m80.k d dVar, c cVar) {
        if (dVar == null) {
            a(3);
        }
        this.f74285a = dVar;
        this.f74286b = cVar;
    }
}
