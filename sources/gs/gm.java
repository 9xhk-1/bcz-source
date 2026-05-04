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
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class gm implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55104a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55105b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55106c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55107d;

    public gm(@NonNull RelativeLayout rootView, @NonNull TextView giveCriticism, @NonNull TextView givePraise, @NonNull TextView refuse) {
        this.f55104a = rootView;
        this.f55105b = giveCriticism;
        this.f55106c = givePraise;
        this.f55107d = refuse;
    }

    @NonNull
    public static gm a(@NonNull View rootView) {
        int i11 = R.id.give_criticism;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.give_criticism);
        if (textView != null) {
            i11 = R.id.give_praise;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.give_praise);
            if (textView2 != null) {
                i11 = R.id.refuse;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.refuse);
                if (textView3 != null) {
                    return new gm((RelativeLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static gm c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static gm d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.praise_select_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55104a;
    }
}
