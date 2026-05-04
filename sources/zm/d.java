package zm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d extends WindowInsetsAnimationCompat.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final View f102774a;

    /* renamed from: b, reason: collision with root package name */
    public int f102775b;

    /* renamed from: c, reason: collision with root package name */
    public int f102776c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f102777d;

    public d(View view) {
        super(0);
        this.f102777d = new int[2];
        this.f102774a = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f102774a.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f102774a.getLocationOnScreen(this.f102777d);
        this.f102775b = this.f102777d[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public WindowInsetsCompat onProgress(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
        Iterator<WindowInsetsAnimationCompat> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().getTypeMask() & WindowInsetsCompat.Type.ime()) != 0) {
                this.f102774a.setTranslationY(vm.b.c(this.f102776c, 0, r0.getInterpolatedFraction()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    public WindowInsetsAnimationCompat.BoundsCompat onStart(@NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat, @NonNull WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        this.f102774a.getLocationOnScreen(this.f102777d);
        int i11 = this.f102775b - this.f102777d[1];
        this.f102776c = i11;
        this.f102774a.setTranslationY(i11);
        return boundsCompat;
    }
}
