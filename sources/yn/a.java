package yn;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a extends com.google.android.material.tabs.a {
    public static float e(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return (float) (1.0d - Math.cos((f11 * 3.141592653589793d) / 2.0d));
    }

    public static float f(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return (float) Math.sin((f11 * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.a
    public void d(TabLayout tabLayout, View view, View view2, float f11, @NonNull Drawable drawable) {
        float f12;
        float e11;
        RectF a11 = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF a12 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (a11.left < a12.left) {
            f12 = e(f11);
            e11 = f(f11);
        } else {
            f12 = f(f11);
            e11 = e(f11);
        }
        drawable.setBounds(vm.b.c((int) a11.left, (int) a12.left, f12), drawable.getBounds().top, vm.b.c((int) a11.right, (int) a12.right, e11), drawable.getBounds().bottom);
    }
}
