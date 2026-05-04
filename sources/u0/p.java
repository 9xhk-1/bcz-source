package u0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.WorkerThread;
import coil.size.Scale;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDrawableUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawableUtils.kt\ncoil/util/DrawableUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\ncoil/util/-Utils\n+ 4 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 5 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,96:1\n1#2:97\n219#3:98\n223#3:99\n219#3:105\n223#3:106\n95#4:100\n38#5:101\n49#5:102\n60#5:103\n71#5:104\n*S KotlinDebug\n*F\n+ 1 DrawableUtils.kt\ncoil/util/DrawableUtils\n*L\n54#1:98\n55#1:99\n89#1:105\n90#1:106\n61#1:100\n63#1:101\n63#1:102\n63#1:103\n63#1:104\n*E\n"})
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final p f91463a = new p();

    /* renamed from: b, reason: collision with root package name */
    public static final int f91464b = 512;

    @WorkerThread
    @m80.k
    public final Bitmap a(@m80.k Drawable drawable, @m80.k Bitmap.Config config, @m80.k q0.g gVar, @m80.k Scale scale, boolean z11) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z11, bitmap, gVar, scale)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int x11 = l.x(mutate);
        if (x11 <= 0) {
            x11 = 512;
        }
        int o11 = l.o(mutate);
        int i11 = o11 > 0 ? o11 : 512;
        double c11 = f0.g.c(x11, i11, q0.b.f(gVar) ? x11 : l.J(gVar.f(), scale), q0.b.f(gVar) ? i11 : l.J(gVar.e(), scale), scale);
        int K0 = c10.d.K0(x11 * c11);
        int K02 = c10.d.K0(c11 * i11);
        Bitmap createBitmap = Bitmap.createBitmap(K0, K02, a.h(config));
        Rect bounds = mutate.getBounds();
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        mutate.setBounds(0, 0, K0, K02);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i12, i13, i14, i15);
        return createBitmap;
    }

    public final boolean b(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == a.h(config);
    }

    public final boolean c(boolean z11, Bitmap bitmap, q0.g gVar, Scale scale) {
        if (z11) {
            return true;
        }
        return f0.g.c(bitmap.getWidth(), bitmap.getHeight(), q0.b.f(gVar) ? bitmap.getWidth() : l.J(gVar.f(), scale), q0.b.f(gVar) ? bitmap.getHeight() : l.J(gVar.e(), scale), scale) == 1.0d;
    }
}
