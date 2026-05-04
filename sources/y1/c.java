package y1;

import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.utils.GdxRuntimeException;
import l2.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends x1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final String f98962f = "environmentCubemap";

    /* renamed from: g, reason: collision with root package name */
    public static final long f98963g;

    /* renamed from: h, reason: collision with root package name */
    public static long f98964h;

    /* renamed from: e, reason: collision with root package name */
    public final r<Cubemap> f98965e;

    static {
        long e11 = x1.a.e(f98962f);
        f98963g = e11;
        f98964h = e11;
    }

    public c(long j11) {
        super(j11);
        if (!g(j11)) {
            throw new GdxRuntimeException("Invalid type specified");
        }
        this.f98965e = new r<>();
    }

    public static final boolean g(long j11) {
        return (j11 & f98964h) != 0;
    }

    @Override // x1.a
    public x1.a a() {
        return new c(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(x1.a aVar) {
        long j11 = this.f97002a;
        long j12 = aVar.f97002a;
        return j11 != j12 ? (int) (j11 - j12) : this.f98965e.compareTo(((c) aVar).f98965e);
    }

    @Override // x1.a
    public int hashCode() {
        return (super.hashCode() * 967) + this.f98965e.hashCode();
    }

    public <T extends Cubemap> c(long j11, r<T> rVar) {
        this(j11);
        this.f98965e.c(rVar);
    }

    public c(long j11, Cubemap cubemap) {
        this(j11);
        this.f98965e.f69250a = cubemap;
    }

    public c(c cVar) {
        this(cVar.f97002a, cVar.f98965e);
    }
}
