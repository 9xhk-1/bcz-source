package hg;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.baicizhan.client.business.widget.RedDotImageView;
import com.jiongji.andriod.card.R;
import gs.s7;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public s7 f59249a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f59250b = new Handler();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: hg.a$a, reason: collision with other inner class name */
    public class C0672a extends sa.c {
        public C0672a() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            a aVar = a.this;
            aVar.y(aVar.f59249a.f56716b);
        }
    }

    public final void A(Runnable r11, long millis) {
        this.f59250b.postDelayed(r11, millis);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        s7 s7Var = (s7) DataBindingUtil.inflate(inflater, R.layout.fragment_base_main, container, false);
        this.f59249a = s7Var;
        return s7Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f59250b.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.f59249a.f56719e.setText(x());
        int w11 = w();
        if (w11 > 0) {
            this.f59249a.f56716b.setImageResource(w11);
            this.f59249a.f56716b.setOnClickListener(new C0672a());
        }
        NestedScrollView nestedScrollView = this.f59249a.f56717c;
        nestedScrollView.addView(v(nestedScrollView));
    }

    @Nullable
    public final RedDotImageView t() {
        s7 s7Var = this.f59249a;
        if (s7Var == null) {
            return null;
        }
        return s7Var.f56716b;
    }

    public abstract View v(ViewGroup container);

    @DrawableRes
    public abstract int w();

    public abstract CharSequence x();

    public abstract void y(RedDotImageView v11);

    public final void z(Runnable r11) {
        this.f59250b.post(r11);
    }
}
