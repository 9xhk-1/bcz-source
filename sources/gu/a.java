package gu;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {
    public final void a(Rect marginRect, ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginRect.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    public void b(Rect margins, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a(margins, (ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            margins.set(0, 0, 0, 0);
        }
    }
}
