package i0;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.DataSource;
import i0.i;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBitmapFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapFetcher.kt\ncoil/fetch/BitmapFetcher\n+ 2 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 3 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,29:1\n50#2:30\n28#3:31\n*S KotlinDebug\n*F\n+ 1 BitmapFetcher.kt\ncoil/fetch/BitmapFetcher\n*L\n16#1:30\n16#1:31\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Bitmap f60015a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final o0.j f60016b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements i.a<Bitmap> {
        @Override // i0.i.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(@m80.k Bitmap bitmap, @m80.k o0.j jVar, @m80.k b0.f fVar) {
            return new b(bitmap, jVar);
        }
    }

    public b(@m80.k Bitmap bitmap, @m80.k o0.j jVar) {
        this.f60015a = bitmap;
        this.f60016b = jVar;
    }

    @Override // i0.i
    @m80.l
    public Object b(@m80.k j00.c<? super h> cVar) {
        return new g(new BitmapDrawable(this.f60016b.g().getResources(), this.f60015a), false, DataSource.MEMORY);
    }
}
