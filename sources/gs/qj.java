package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class qj implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56517a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56518b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56519c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f56520d;

    public qj(@NonNull FrameLayout rootView, @NonNull ImageView guideHint, @NonNull ImageView guideKill, @NonNull ImageView guideVoice) {
        this.f56517a = rootView;
        this.f56518b = guideHint;
        this.f56519c = guideKill;
        this.f56520d = guideVoice;
    }

    @NonNull
    public static qj a(@NonNull View rootView) {
        int i11 = R.id.guide_hint;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.guide_hint);
        if (imageView != null) {
            i11 = R.id.guide_kill;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.guide_kill);
            if (imageView2 != null) {
                i11 = R.id.guide_voice;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.guide_voice);
                if (imageView3 != null) {
                    return new qj((FrameLayout) rootView, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static qj c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static qj d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.learning_guide_portrait_customize_operation_des, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f56517a;
    }
}
