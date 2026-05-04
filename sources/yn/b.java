package yn;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends com.google.android.material.tabs.a {

    /* renamed from: b, reason: collision with root package name */
    public static final float f100233b = 0.5f;

    @Override // com.google.android.material.tabs.a
    public void d(TabLayout tabLayout, View view, View view2, float f11, @NonNull Drawable drawable) {
        if (f11 >= 0.5f) {
            view = view2;
        }
        RectF a11 = com.google.android.material.tabs.a.a(tabLayout, view);
        float b11 = f11 < 0.5f ? vm.b.b(1.0f, 0.0f, 0.0f, 0.5f, f11) : vm.b.b(0.0f, 1.0f, 0.5f, 1.0f, f11);
        drawable.setBounds((int) a11.left, drawable.getBounds().top, (int) a11.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b11 * 255.0f));
    }
}
