package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class g9 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55018a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55019b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55020c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55021d;

    public g9(@NonNull RelativeLayout rootView, @NonNull ImageView historyClear, @NonNull TextView historyTag, @NonNull RecyclerView lookupResultList) {
        this.f55018a = rootView;
        this.f55019b = historyClear;
        this.f55020c = historyTag;
        this.f55021d = lookupResultList;
    }

    @NonNull
    public static g9 a(@NonNull View rootView) {
        int i11 = R.id.history_clear;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.history_clear);
        if (imageView != null) {
            i11 = R.id.history_tag;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.history_tag);
            if (textView != null) {
                i11 = R.id.lookup_result_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.lookup_result_list);
                if (recyclerView != null) {
                    return new g9((RelativeLayout) rootView, imageView, textView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static g9 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static g9 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_lookup_result_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55018a;
    }
}
