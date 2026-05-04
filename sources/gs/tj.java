package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class tj implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56893a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56894b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56895c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f56896d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56897e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56898f;

    public tj(@NonNull FrameLayout rootView, @NonNull TextView accent, @NonNull TextView cnmean, @NonNull View divider, @NonNull RelativeLayout item, @NonNull TextView word) {
        this.f56893a = rootView;
        this.f56894b = accent;
        this.f56895c = cnmean;
        this.f56896d = divider;
        this.f56897e = item;
        this.f56898f = word;
    }

    @NonNull
    public static tj a(@NonNull View rootView) {
        int i11 = R.id.accent;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.accent);
        if (textView != null) {
            i11 = R.id.cnmean;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.cnmean);
            if (textView2 != null) {
                i11 = R.id.divider;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
                if (findChildViewById != null) {
                    i11 = R.id.item;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.item);
                    if (relativeLayout != null) {
                        i11 = R.id.word;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.word);
                        if (textView3 != null) {
                            return new tj((FrameLayout) rootView, textView, textView2, findChildViewById, relativeLayout, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static tj c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static tj d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.lookup_result_list_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f56893a;
    }
}
