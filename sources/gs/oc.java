package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class oc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56210a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56211b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56212c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56213d;

    public oc(@NonNull RelativeLayout rootView, @NonNull RelativeLayout searchEntry, @NonNull TextView searchName, @NonNull LinearLayout searchPrompt) {
        this.f56210a = rootView;
        this.f56211b = searchEntry;
        this.f56212c = searchName;
        this.f56213d = searchPrompt;
    }

    @NonNull
    public static oc a(@NonNull View rootView) {
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        int i11 = R.id.search_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.search_name);
        if (textView != null) {
            i11 = R.id.search_prompt;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.search_prompt);
            if (linearLayout != null) {
                return new oc(relativeLayout, relativeLayout, textView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static oc c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static oc d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_search_entry, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56210a;
    }
}
