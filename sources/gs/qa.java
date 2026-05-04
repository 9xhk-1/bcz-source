package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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
public final class qa implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56471a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56472b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56473c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56474d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56475e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56476f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56477g;

    public qa(@NonNull RelativeLayout rootView, @NonNull TextView buy, @NonNull RecyclerView categoryList, @NonNull LinearLayout dataContainer, @NonNull TextView errMsg, @NonNull RecyclerView examList, @NonNull ProgressBar loadProgress) {
        this.f56471a = rootView;
        this.f56472b = buy;
        this.f56473c = categoryList;
        this.f56474d = dataContainer;
        this.f56475e = errMsg;
        this.f56476f = examList;
        this.f56477g = loadProgress;
    }

    @NonNull
    public static qa a(@NonNull View rootView) {
        int i11 = R.id.buy;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.buy);
        if (textView != null) {
            i11 = R.id.category_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.category_list);
            if (recyclerView != null) {
                i11 = R.id.data_container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_container);
                if (linearLayout != null) {
                    i11 = R.id.err_msg;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.err_msg);
                    if (textView2 != null) {
                        i11 = R.id.exam_list;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.exam_list);
                        if (recyclerView2 != null) {
                            i11 = R.id.load_progress;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.load_progress);
                            if (progressBar != null) {
                                return new qa((RelativeLayout) rootView, textView, recyclerView, linearLayout, textView2, recyclerView2, progressBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static qa c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static qa d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_select_exam, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56471a;
    }
}
