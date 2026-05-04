package tj;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class k implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final String f90723d = "need_show_guider";

    /* renamed from: a, reason: collision with root package name */
    public Activity f90724a;

    /* renamed from: b, reason: collision with root package name */
    public int f90725b = 0;

    /* renamed from: c, reason: collision with root package name */
    public View f90726c;

    public static boolean a() {
        return i9.j.c(f90723d, true);
    }

    public final void b(int res) {
        View inflate = LayoutInflater.from(this.f90724a).inflate(res, (ViewGroup) null);
        inflate.setOnClickListener(this);
        View findViewById = inflate.findViewById(R.id.hint1);
        if (findViewById != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.topMargin += this.f90725b + zb.a.k(this.f90724a);
            findViewById.setLayoutParams(marginLayoutParams);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewGroup viewGroup = (ViewGroup) this.f90724a.getWindow().getDecorView();
        View view = this.f90726c;
        if (view != null) {
            viewGroup.removeView(view);
        }
        viewGroup.addView(inflate, layoutParams);
        this.f90726c = inflate;
    }

    public void c(Activity activity, boolean isLearnt) {
        i9.j.n(f90723d, false);
        this.f90724a = activity;
        this.f90725b = isLearnt ? xb.f.a(activity, 24.0f) : 0;
        b(R.layout.wordlist_user_guider_part_1);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        if (v11.getId() == R.id.wordlist_user_guider_part_1) {
            b(R.layout.wordlist_user_guider_part_2);
            return;
        }
        if (v11.getId() == R.id.wordlist_user_guider_part_2) {
            ViewGroup viewGroup = (ViewGroup) this.f90724a.getWindow().getDecorView();
            View view = this.f90726c;
            if (view != null) {
                viewGroup.removeView(view);
            }
        }
    }
}
