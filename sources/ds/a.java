package ds;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.jeremyfeinstein.slidingmenu.lib.CustomViewBehind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface a {
    void a(Canvas canvas, Drawable shadow, int width);

    void b(Canvas canvas, int alpha, CustomViewBehind cvb, View content);

    boolean c(int x11);

    boolean d(View content, int currPage, int x11);

    void e(View content, Canvas canvas, float percentOpen);

    boolean f(View content, int x11, int threshold);

    void g(int x11, int y11, CustomViewBehind cvb, float scrollScale);

    boolean h(int x11);

    int i(CustomViewBehind cvb, View content);

    int j(CustomViewBehind cvb, View content);

    int k(CustomViewBehind cvb, View content);

    boolean l(View content, int currPage, int x11);
}
