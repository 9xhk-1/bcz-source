package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class cp implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54514a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AspectRoundImageView f54515b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54516c;

    public cp(@NonNull RelativeLayout rootView, @NonNull AspectRoundImageView hint1, @NonNull RelativeLayout wordlistUserGuiderPart2) {
        this.f54514a = rootView;
        this.f54515b = hint1;
        this.f54516c = wordlistUserGuiderPart2;
    }

    @NonNull
    public static cp a(@NonNull View rootView) {
        AspectRoundImageView aspectRoundImageView = (AspectRoundImageView) ViewBindings.findChildViewById(rootView, R.id.hint1);
        if (aspectRoundImageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.hint1)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        return new cp(relativeLayout, aspectRoundImageView, relativeLayout);
    }

    @NonNull
    public static cp c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static cp d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.wordlist_user_guider_part_2, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f54514a;
    }
}
