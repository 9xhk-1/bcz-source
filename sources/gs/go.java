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
public final class go implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55111a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55112b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f55113c;

    public go(@NonNull ConstraintLayout rootView, @NonNull ImageView next, @NonNull ImageView topImg) {
        this.f55111a = rootView;
        this.f55112b = next;
        this.f55113c = topImg;
    }

    @NonNull
    public static go a(@NonNull View rootView) {
        int i11 = R.id.next;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.next);
        if (imageView != null) {
            i11 = R.id.top_img;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.top_img);
            if (imageView2 != null) {
                return new go((ConstraintLayout) rootView, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static go c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static go d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.view_recall_guide_second, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f55111a;
    }
}
