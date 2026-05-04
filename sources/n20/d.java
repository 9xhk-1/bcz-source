package n20;

import a00.a0;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.baicizhan.client.business.dataset.provider.a;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final f f74287e = f.k("<root>");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f74288f = Pattern.compile("\\.");

    /* renamed from: g, reason: collision with root package name */
    public static final l<String, f> f74289g = new a();

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f74290a;

    /* renamed from: b, reason: collision with root package name */
    public transient c f74291b;

    /* renamed from: c, reason: collision with root package name */
    public transient d f74292c;

    /* renamed from: d, reason: collision with root package name */
    public transient f f74293d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements l<String, f> {
        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f invoke(String str) {
            return f.e(str);
        }
    }

    public d(@m80.k String str, @m80.k c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f74290a = str;
        this.f74291b = cVar;
    }

    public static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i12 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        if (i11 != 1) {
            switch (i11) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i11) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = q.a.f13044u;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @m80.k
    public static d m(@m80.k f fVar) {
        if (fVar == null) {
            a(17);
        }
        return new d(fVar.b(), c.f74284c.j(), fVar);
    }

    @m80.k
    public String b() {
        String str = this.f74290a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    @m80.k
    public d c(@m80.k f fVar) {
        String str;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            str = fVar.b();
        } else {
            str = this.f74290a + "." + fVar.b();
        }
        return new d(str, this, fVar);
    }

    public final void d() {
        int lastIndexOf = this.f74290a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f74293d = f.e(this.f74290a.substring(lastIndexOf + 1));
            this.f74292c = new d(this.f74290a.substring(0, lastIndexOf));
        } else {
            this.f74293d = f.e(this.f74290a);
            this.f74292c = c.f74284c.j();
        }
    }

    public boolean e() {
        return this.f74290a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f74290a.equals(((d) obj).f74290a);
    }

    public boolean f() {
        return this.f74291b != null || b().indexOf(60) < 0;
    }

    @m80.k
    public d g() {
        d dVar = this.f74292c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException(a.r.C0259a.f16300m);
        }
        d();
        d dVar2 = this.f74292c;
        if (dVar2 == null) {
            a(8);
        }
        return dVar2;
    }

    @m80.k
    public List<f> h() {
        List<f> Gi = e() ? Collections.EMPTY_LIST : a0.Gi(f74288f.split(this.f74290a), f74289g);
        if (Gi == null) {
            a(14);
        }
        return Gi;
    }

    public int hashCode() {
        return this.f74290a.hashCode();
    }

    @m80.k
    public f i() {
        f fVar = this.f74293d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException(a.r.C0259a.f16300m);
        }
        d();
        f fVar2 = this.f74293d;
        if (fVar2 == null) {
            a(11);
        }
        return fVar2;
    }

    @m80.k
    public f j() {
        if (e()) {
            f fVar = f74287e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f i11 = i();
        if (i11 == null) {
            a(13);
        }
        return i11;
    }

    public boolean k(@m80.k f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int indexOf = this.f74290a.indexOf(46);
        if (indexOf == -1) {
            indexOf = this.f74290a.length();
        }
        String b11 = fVar.b();
        return indexOf == b11.length() && this.f74290a.regionMatches(0, b11, 0, indexOf);
    }

    @m80.k
    public c l() {
        c cVar = this.f74291b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f74291b = cVar2;
        return cVar2;
    }

    @m80.k
    public String toString() {
        String b11 = e() ? f74287e.b() : this.f74290a;
        if (b11 == null) {
            a(18);
        }
        return b11;
    }

    public d(@m80.k String str) {
        if (str == null) {
            a(2);
        }
        this.f74290a = str;
    }

    public d(@m80.k String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f74290a = str;
        this.f74292c = dVar;
        this.f74293d = fVar;
    }
}
