package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class n4 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55984a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55985b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f55986c;

    public n4(@NonNull RelativeLayout rootView, @NonNull TextView bczDialogMessageText, @NonNull LottieAnimationView progress) {
        this.f55984a = rootView;
        this.f55985b = bczDialogMessageText;
        this.f55986c = progress;
    }

    @NonNull
    public static n4 a(@NonNull View rootView) {
        int i11 = R.id.bcz_dialog_messageText;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bcz_dialog_messageText);
        if (textView != null) {
            i11 = R.id.progress;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (lottieAnimationView != null) {
                return new n4((RelativeLayout) rootView, textView, lottieAnimationView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static n4 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static n4 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.bcz_loading_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55984a;
    }
}
