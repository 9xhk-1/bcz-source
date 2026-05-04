package i0;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import i0.i;
import kotlin.jvm.internal.u0;
import u0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDrawableFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawableFetcher.kt\ncoil/fetch/DrawableFetcher\n+ 2 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 3 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,42:1\n50#2:43\n28#3:44\n*S KotlinDebug\n*F\n+ 1 DrawableFetcher.kt\ncoil/fetch/DrawableFetcher\n*L\n26#1:43\n26#1:44\n*E\n"})
/* loaded from: classes3.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Drawable f60021a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0.j f60022b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements i.a<Drawable> {
        @Override // i0.i.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@m80.k Drawable drawable, @m80.k o0.j jVar, @m80.k b0.f fVar) {
            return new f(drawable, jVar);
        }
    }

    public f(@m80.k Drawable drawable, @m80.k o0.j jVar) {
        this.f60021a = drawable;
        this.f60022b = jVar;
    }

    @Override // i0.i
    @m80.l
    public Object b(@m80.k j00.c<? super h> cVar) {
        Drawable drawable;
        boolean D = u0.l.D(this.f60021a);
        if (D) {
            drawable = new BitmapDrawable(this.f60022b.g().getResources(), p.f91463a.a(this.f60021a, this.f60022b.f(), this.f60022b.p(), this.f60022b.o(), this.f60022b.c()));
        } else {
            drawable = this.f60021a;
        }
        return new g(drawable, D, DataSource.MEMORY);
    }
}
