package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class o6 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56184a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RadioGroup f56185b;

    public o6(@NonNull LinearLayout rootView, @NonNull RadioGroup optionsContainer) {
        this.f56184a = rootView;
        this.f56185b = optionsContainer;
    }

    @NonNull
    public static o6 a(@NonNull View rootView) {
        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(rootView, R.id.options_container);
        if (radioGroup != null) {
            return new o6((LinearLayout) rootView, radioGroup);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.options_container)));
    }

    @NonNull
    public static o6 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static o6 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_plan_more_content, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f56184a;
    }
}
