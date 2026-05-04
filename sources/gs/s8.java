package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.fm.activity.fragment.FmPlayPager;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class s8 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56720a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f56721b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56722c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f56723d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56724e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RecyclerView f56725f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FmPlayPager f56726g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f56727h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f56728i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f56729j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ProgressBar f56730k;

    public s8(@NonNull RelativeLayout rootView, @NonNull View configAnchor, @NonNull TextView configAutoClose, @NonNull TextView configDownload, @NonNull TextView fmEmpty, @NonNull RecyclerView fmGrid, @NonNull FmPlayPager fmPlayPager, @NonNull ImageView fmToggle, @NonNull TextView listTag, @NonNull View listTagDivider, @NonNull ProgressBar loadProgress) {
        this.f56720a = rootView;
        this.f56721b = configAnchor;
        this.f56722c = configAutoClose;
        this.f56723d = configDownload;
        this.f56724e = fmEmpty;
        this.f56725f = fmGrid;
        this.f56726g = fmPlayPager;
        this.f56727h = fmToggle;
        this.f56728i = listTag;
        this.f56729j = listTagDivider;
        this.f56730k = loadProgress;
    }

    @NonNull
    public static s8 a(@NonNull View rootView) {
        int i11 = R.id.config_anchor;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.config_anchor);
        if (findChildViewById != null) {
            i11 = R.id.config_auto_close;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.config_auto_close);
            if (textView != null) {
                i11 = R.id.config_download;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.config_download);
                if (textView2 != null) {
                    i11 = R.id.fm_empty;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fm_empty);
                    if (textView3 != null) {
                        i11 = R.id.fm_grid;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.fm_grid);
                        if (recyclerView != null) {
                            i11 = R.id.fm_play_pager;
                            FmPlayPager fmPlayPager = (FmPlayPager) ViewBindings.findChildViewById(rootView, R.id.fm_play_pager);
                            if (fmPlayPager != null) {
                                i11 = R.id.fm_toggle;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fm_toggle);
                                if (imageView != null) {
                                    i11 = R.id.list_tag;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.list_tag);
                                    if (textView4 != null) {
                                        i11 = R.id.list_tag_divider;
                                        View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.list_tag_divider);
                                        if (findChildViewById2 != null) {
                                            i11 = R.id.load_progress;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.load_progress);
                                            if (progressBar != null) {
                                                return new s8((RelativeLayout) rootView, findChildViewById, textView, textView2, textView3, recyclerView, fmPlayPager, imageView, textView4, findChildViewById2, progressBar);
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
    public static s8 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static s8 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_fm, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56720a;
    }
}
