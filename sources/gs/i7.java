package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class i7 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55279a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55280b;

    public i7(@NonNull TextView rootView, @NonNull TextView word) {
        this.f55279a = rootView;
        this.f55280b = word;
    }

    @NonNull
    public static i7 a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new i7(textView, textView);
    }

    @NonNull
    public static i7 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static i7 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fm_grid_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextView getRoot() {
        return this.f55279a;
    }
}
