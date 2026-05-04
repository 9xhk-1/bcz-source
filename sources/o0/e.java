package o0;

import android.graphics.drawable.Drawable;
import coil.request.ImageRequest;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Drawable f75456a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ImageRequest f75457b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Throwable f75458c;

    public e(@m80.l Drawable drawable, @m80.k ImageRequest imageRequest, @m80.k Throwable th2) {
        super(null);
        this.f75456a = drawable;
        this.f75457b = imageRequest;
        this.f75458c = th2;
    }

    public static /* synthetic */ e d(e eVar, Drawable drawable, ImageRequest imageRequest, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            drawable = eVar.a();
        }
        if ((i11 & 2) != 0) {
            imageRequest = eVar.b();
        }
        if ((i11 & 4) != 0) {
            th2 = eVar.f75458c;
        }
        return eVar.c(drawable, imageRequest, th2);
    }

    @Override // o0.g
    @m80.l
    public Drawable a() {
        return this.f75456a;
    }

    @Override // o0.g
    @m80.k
    public ImageRequest b() {
        return this.f75457b;
    }

    @m80.k
    public final e c(@m80.l Drawable drawable, @m80.k ImageRequest imageRequest, @m80.k Throwable th2) {
        return new e(drawable, imageRequest, th2);
    }

    @m80.k
    public final Throwable e() {
        return this.f75458c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return g0.g(a(), eVar.a()) && g0.g(b(), eVar.b()) && g0.g(this.f75458c, eVar.f75458c);
    }

    public int hashCode() {
        Drawable a11 = a();
        return ((((a11 != null ? a11.hashCode() : 0) * 31) + b().hashCode()) * 31) + this.f75458c.hashCode();
    }
}
