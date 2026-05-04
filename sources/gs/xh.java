package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class xh implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57465a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f57466b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57467c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57468d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57469e;

    public xh(@NonNull LinearLayout rootView, @NonNull View divider, @NonNull TextView magicButtonNegative, @NonNull TextView magicButtonNeutral, @NonNull TextView magicButtonPositive) {
        this.f57465a = rootView;
        this.f57466b = divider;
        this.f57467c = magicButtonNegative;
        this.f57468d = magicButtonNeutral;
        this.f57469e = magicButtonPositive;
    }

    @NonNull
    public static xh a(@NonNull View rootView) {
        int i11 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
        if (findChildViewById != null) {
            i11 = R.id.magic_button_negative;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.magic_button_negative);
            if (textView != null) {
                i11 = R.id.magic_button_neutral;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.magic_button_neutral);
                if (textView2 != null) {
                    i11 = R.id.magic_button_positive;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.magic_button_positive);
                    if (textView3 != null) {
                        return new xh((LinearLayout) rootView, findChildViewById, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static xh c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static xh d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_dialog_prompt_buttons_triple, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f57465a;
    }
}
