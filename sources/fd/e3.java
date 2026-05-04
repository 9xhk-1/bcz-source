package fd;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e3 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements PopupWindow.OnDismissListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f51572a;

        public a(final View val$myVocabEvaluationView) {
            this.f51572a = val$myVocabEvaluationView;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            View view;
            if (!gi.b0.f(8) || (view = this.f51572a) == null) {
                return;
            }
            e3.c(view);
        }
    }

    public static void c(View myVocabEvaluationView) {
        gi.b0.b(8);
        Context context = myVocabEvaluationView.getContext();
        int a11 = xb.f.a(context, 265.0f);
        int a12 = xb.f.a(context, 44.0f);
        int a13 = xb.f.a(context, 83.0f);
        int a14 = xb.f.a(context, 2.0f);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(a11, a12));
        int[] iArr = new int[2];
        myVocabEvaluationView.getLocationInWindow(iArr);
        iArr[0] = (iArr[0] + (myVocabEvaluationView.getWidth() / 2)) - a13;
        iArr[1] = (iArr[1] - a12) - a14;
        PopupWindow popupWindow = new PopupWindow(imageView, -2, -2);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setFocusable(true);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(R.style.Animations_fade_in_out);
        popupWindow.showAtLocation(myVocabEvaluationView, 51, iArr[0], iArr[1]);
    }

    public static void d(View userCenterView, final View myVocabEvaluationView) {
        gi.b0.b(4);
        Context context = userCenterView.getContext();
        int a11 = xb.f.a(context, 192.0f);
        int a12 = xb.f.a(context, 64.0f);
        int a13 = xb.f.a(context, 25.0f);
        int a14 = xb.f.a(context, 2.0f);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(a11, a12));
        int[] iArr = new int[2];
        userCenterView.getLocationInWindow(iArr);
        iArr[0] = (iArr[0] + (userCenterView.getWidth() / 2)) - a13;
        iArr[1] = iArr[1] + userCenterView.getHeight() + a14;
        PopupWindow popupWindow = new PopupWindow(imageView, -2, -2);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setFocusable(true);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(R.style.Animations_fade_in_out);
        popupWindow.showAtLocation(userCenterView, 51, iArr[0], iArr[1]);
        popupWindow.setOnDismissListener(new a(myVocabEvaluationView));
    }

    public static void b(final ViewGroup parent, View reviewIcon) {
    }
}
