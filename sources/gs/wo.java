package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.PinnedSectionListView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class wo implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57372a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57373b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57374c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57375d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f57376e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57377f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57378g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final PinnedSectionListView f57379h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f57380i;

    public wo(@NonNull FrameLayout rootView, @NonNull LinearLayout batchLayout, @NonNull TextView cancelKillAll, @NonNull LinearLayout empty, @NonNull ImageView emptyImage, @NonNull TextView emptyTitle, @NonNull TextView hideMeanAll, @NonNull PinnedSectionListView listView, @NonNull TextView showMeanAll) {
        this.f57372a = rootView;
        this.f57373b = batchLayout;
        this.f57374c = cancelKillAll;
        this.f57375d = empty;
        this.f57376e = emptyImage;
        this.f57377f = emptyTitle;
        this.f57378g = hideMeanAll;
        this.f57379h = listView;
        this.f57380i = showMeanAll;
    }

    @NonNull
    public static wo a(@NonNull View rootView) {
        int i11 = R.id.batch_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.batch_layout);
        if (linearLayout != null) {
            i11 = R.id.cancel_kill_all;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel_kill_all);
            if (textView != null) {
                i11 = R.id.empty;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty);
                if (linearLayout2 != null) {
                    i11 = R.id.empty_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.empty_image);
                    if (imageView != null) {
                        i11 = R.id.empty_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty_title);
                        if (textView2 != null) {
                            i11 = R.id.hide_mean_all;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.hide_mean_all);
                            if (textView3 != null) {
                                i11 = R.id.list_view;
                                PinnedSectionListView pinnedSectionListView = (PinnedSectionListView) ViewBindings.findChildViewById(rootView, R.id.list_view);
                                if (pinnedSectionListView != null) {
                                    i11 = R.id.show_mean_all;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.show_mean_all);
                                    if (textView4 != null) {
                                        return new wo((FrameLayout) rootView, linearLayout, textView, linearLayout2, imageView, textView2, textView3, pinnedSectionListView, textView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static wo c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static wo d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.wordlist_fragment_normal, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f57372a;
    }
}
