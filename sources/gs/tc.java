package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class tc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56870a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56871b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56872c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56873d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56874e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56875f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56876g;

    public tc(@NonNull LinearLayout rootView, @NonNull TextView emptyView, @NonNull TextView id2, @NonNull ProgressBar loadProgress, @NonNull TextView name, @NonNull RecyclerView suggestionList, @NonNull LinearLayout systemSuggestion) {
        this.f56870a = rootView;
        this.f56871b = emptyView;
        this.f56872c = id2;
        this.f56873d = loadProgress;
        this.f56874e = name;
        this.f56875f = suggestionList;
        this.f56876g = systemSuggestion;
    }

    @NonNull
    public static tc a(@NonNull View rootView) {
        int i11 = R.id.empty_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty_view);
        if (textView != null) {
            i11 = R.id.id;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.id);
            if (textView2 != null) {
                i11 = R.id.load_progress;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.load_progress);
                if (progressBar != null) {
                    i11 = R.id.name;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                    if (textView3 != null) {
                        i11 = R.id.suggestion_list;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.suggestion_list);
                        if (recyclerView != null) {
                            LinearLayout linearLayout = (LinearLayout) rootView;
                            return new tc(linearLayout, textView, textView2, progressBar, textView3, recyclerView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static tc c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static tc d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_system_suggestion_portrait, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f56870a;
    }
}
