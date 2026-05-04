package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class t5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56830a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56831b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56832c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f56833d;

    public t5(@NonNull LinearLayout rootView, @NonNull ImageView comboNumber1, @NonNull ImageView comboNumber2, @NonNull ImageView comboNumber3) {
        this.f56830a = rootView;
        this.f56831b = comboNumber1;
        this.f56832c = comboNumber2;
        this.f56833d = comboNumber3;
    }

    @NonNull
    public static t5 a(@NonNull View rootView) {
        int i11 = R.id.combo_number1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.combo_number1);
        if (imageView != null) {
            i11 = R.id.combo_number2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.combo_number2);
            if (imageView2 != null) {
                i11 = R.id.combo_number3;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.combo_number3);
                if (imageView3 != null) {
                    return new t5((LinearLayout) rootView, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static t5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static t5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.combo_popup_window, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f56830a;
    }
}
