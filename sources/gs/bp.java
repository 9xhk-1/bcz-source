package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class bp implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54323a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f54324b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54325c;

    public bp(@NonNull RelativeLayout rootView, @NonNull ImageView hint1, @NonNull RelativeLayout wordlistUserGuiderPart1) {
        this.f54323a = rootView;
        this.f54324b = hint1;
        this.f54325c = wordlistUserGuiderPart1;
    }

    @NonNull
    public static bp a(@NonNull View rootView) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.hint1);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.hint1)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        return new bp(relativeLayout, imageView, relativeLayout);
    }

    @NonNull
    public static bp c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static bp d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.wordlist_user_guider_part_1, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f54323a;
    }
}
