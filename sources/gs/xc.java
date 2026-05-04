package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class xc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57452a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57453b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f57454c;

    public xc(@NonNull ConstraintLayout rootView, @NonNull ImageView guideContent, @NonNull ImageView next) {
        this.f57452a = rootView;
        this.f57453b = guideContent;
        this.f57454c = next;
    }

    @NonNull
    public static xc a(@NonNull View rootView) {
        int i11 = R.id.guide_content;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.guide_content);
        if (imageView != null) {
            i11 = R.id.next;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.next);
            if (imageView2 != null) {
                return new xc((ConstraintLayout) rootView, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static xc c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static xc d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.guide_home_word_book, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f57452a;
    }
}
