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
import com.baicizhan.client.business.widget.RedDotImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class hc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55175a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55176b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55177c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55178d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55179e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RedDotImageView f55180f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55181g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55182h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final RedDotImageView f55183i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f55184j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ProgressBar f55185k;

    public hc(@NonNull LinearLayout rootView, @NonNull TextView emptyView, @NonNull RecyclerView friendList, @NonNull LinearLayout friendsAdd, @NonNull LinearLayout friendsFeed, @NonNull RedDotImageView friendsFeedImg, @NonNull LinearLayout friendsRank, @NonNull LinearLayout friendsRequest, @NonNull RedDotImageView friendsRequestImg, @NonNull TextView friendsRequestText, @NonNull ProgressBar loadProgress) {
        this.f55175a = rootView;
        this.f55176b = emptyView;
        this.f55177c = friendList;
        this.f55178d = friendsAdd;
        this.f55179e = friendsFeed;
        this.f55180f = friendsFeedImg;
        this.f55181g = friendsRank;
        this.f55182h = friendsRequest;
        this.f55183i = friendsRequestImg;
        this.f55184j = friendsRequestText;
        this.f55185k = loadProgress;
    }

    @NonNull
    public static hc a(@NonNull View rootView) {
        int i11 = R.id.empty_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty_view);
        if (textView != null) {
            i11 = R.id.friend_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.friend_list);
            if (recyclerView != null) {
                i11 = R.id.friends_add;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.friends_add);
                if (linearLayout != null) {
                    i11 = R.id.friends_feed;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.friends_feed);
                    if (linearLayout2 != null) {
                        i11 = R.id.friends_feed_img;
                        RedDotImageView redDotImageView = (RedDotImageView) ViewBindings.findChildViewById(rootView, R.id.friends_feed_img);
                        if (redDotImageView != null) {
                            i11 = R.id.friends_rank;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.friends_rank);
                            if (linearLayout3 != null) {
                                i11 = R.id.friends_request;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.friends_request);
                                if (linearLayout4 != null) {
                                    i11 = R.id.friends_request_img;
                                    RedDotImageView redDotImageView2 = (RedDotImageView) ViewBindings.findChildViewById(rootView, R.id.friends_request_img);
                                    if (redDotImageView2 != null) {
                                        i11 = R.id.friends_request_text;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.friends_request_text);
                                        if (textView2 != null) {
                                            i11 = R.id.load_progress;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.load_progress);
                                            if (progressBar != null) {
                                                return new hc((LinearLayout) rootView, textView, recyclerView, linearLayout, linearLayout2, redDotImageView, linearLayout3, linearLayout4, redDotImageView2, textView2, progressBar);
                                            }
                                        }
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
    public static hc c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static hc d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_list_fragment, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f55175a;
    }
}
