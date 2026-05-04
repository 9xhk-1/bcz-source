package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class pj implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56389a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56390b;

    public pj(@NonNull FrameLayout rootView, @NonNull TextView guildTitle) {
        this.f56389a = rootView;
        this.f56390b = guildTitle;
    }

    @NonNull
    public static pj a(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.guild_title);
        if (textView != null) {
            return new pj((FrameLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.guild_title)));
    }

    @NonNull
    public static pj c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static pj d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.learning_guide_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f56389a;
    }
}
