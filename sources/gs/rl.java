package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class rl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56664a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewSwitcher f56665b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f56666c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f56667d;

    public rl(@NonNull ConstraintLayout rootView, @NonNull ViewSwitcher hintSwitcher, @NonNull ImageView plusreviewListenExample, @NonNull ImageView plusreviewListenWord) {
        this.f56664a = rootView;
        this.f56665b = hintSwitcher;
        this.f56666c = plusreviewListenExample;
        this.f56667d = plusreviewListenWord;
    }

    @NonNull
    public static rl a(@NonNull View rootView) {
        int i11 = R.id.hint_switcher;
        ViewSwitcher viewSwitcher = (ViewSwitcher) ViewBindings.findChildViewById(rootView, R.id.hint_switcher);
        if (viewSwitcher != null) {
            i11 = R.id.plusreview_listen_example;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.plusreview_listen_example);
            if (imageView != null) {
                i11 = R.id.plusreview_listen_word;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.plusreview_listen_word);
                if (imageView2 != null) {
                    return new rl((ConstraintLayout) rootView, viewSwitcher, imageView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static rl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static rl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.plusreview_fragment_listen_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f56664a;
    }
}
