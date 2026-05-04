package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class km implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55646a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55647b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f55648c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55649d;

    public km(@NonNull RelativeLayout rootView, @NonNull TextView content, @NonNull Button iKnow, @NonNull TextView title) {
        this.f55646a = rootView;
        this.f55647b = content;
        this.f55648c = iKnow;
        this.f55649d = title;
    }

    @NonNull
    public static km a(@NonNull View rootView) {
        int i11 = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.content);
        if (textView != null) {
            i11 = R.id.i_know;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.i_know);
            if (button != null) {
                i11 = R.id.title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                if (textView2 != null) {
                    return new km((RelativeLayout) rootView, textView, button, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static km c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static km d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.server_fatal_error_dialog, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55646a;
    }
}
