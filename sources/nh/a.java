package nh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.jiongji.andriod.card.R;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends PopupWindow {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f75127c = {R.drawable.combo_0_normal_default, R.drawable.combo_1_normal_default, R.drawable.combo_2_normal_default, R.drawable.combo_3_normal_default, R.drawable.combo_4_normal_default, R.drawable.combo_5_normal_default, R.drawable.combo_6_normal_default, R.drawable.combo_7_normal_default, R.drawable.combo_8_normal_default, R.drawable.combo_9_normal_default};

    /* renamed from: a, reason: collision with root package name */
    public Context f75128a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView[] f75129b;

    @SuppressLint({"InflateParams"})
    public a(Context context) {
        super(context);
        this.f75128a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.combo_popup_window, (ViewGroup) null, false);
        setFocusable(true);
        setTouchable(true);
        setOutsideTouchable(false);
        setBackgroundDrawable(context.getResources().getDrawable(android.R.color.transparent));
        dt.a.r(inflate, 10.0f);
        setContentView(inflate);
        setWindowLayoutMode(-2, -2);
        this.f75129b = new ImageView[]{(ImageView) inflate.findViewById(R.id.combo_number1), (ImageView) inflate.findViewById(R.id.combo_number2), (ImageView) inflate.findViewById(R.id.combo_number3)};
    }

    public void a(View anchor, int combo) {
        String num = Integer.toString(combo);
        for (int i11 = 0; i11 < num.length(); i11++) {
            this.f75129b[i11].setImageResource(f75127c[num.charAt(i11) - '0']);
            this.f75129b[i11].setVisibility(0);
        }
        int length = num.length();
        while (true) {
            ImageView[] imageViewArr = this.f75129b;
            if (length >= imageViewArr.length) {
                update();
                Rect rect = new Rect();
                anchor.getGlobalVisibleRect(rect);
                showAtLocation(anchor, 8388659, ((rect.left + rect.right) - i.a(this.f75128a, 80.0f)) / 2, 0);
                return;
            }
            imageViewArr[length].setVisibility(8);
            length++;
        }
    }
}
