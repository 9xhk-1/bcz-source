package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.MaxHeightScrollView;
import com.baicizhan.main.customview.OfflineDownloadView;
import com.baicizhan.main.view.AspectRoundImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class j6 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55430a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final AspectRoundImageView f55431b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55432c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55433d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f55434e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55435f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Barrier f55436g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final OfflineDownloadView f55437h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55438i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final MaxHeightScrollView f55439j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f55440k;

    public j6(@NonNull LinearLayout rootView, @NonNull AspectRoundImageView bookCover, @NonNull TextView bookDesc, @NonNull TextView bookName, @NonNull View bottomAncor, @NonNull ImageView close, @NonNull Barrier descBottomBarrier, @NonNull OfflineDownloadView noproguardBookDownload, @NonNull TextView noproguardBookLink, @NonNull MaxHeightScrollView scrollContainer, @NonNull TextView wordsSum) {
        this.f55430a = rootView;
        this.f55431b = bookCover;
        this.f55432c = bookDesc;
        this.f55433d = bookName;
        this.f55434e = bottomAncor;
        this.f55435f = close;
        this.f55436g = descBottomBarrier;
        this.f55437h = noproguardBookDownload;
        this.f55438i = noproguardBookLink;
        this.f55439j = scrollContainer;
        this.f55440k = wordsSum;
    }

    @NonNull
    public static j6 a(@NonNull View rootView) {
        int i11 = R.id.book_cover;
        AspectRoundImageView aspectRoundImageView = (AspectRoundImageView) ViewBindings.findChildViewById(rootView, R.id.book_cover);
        if (aspectRoundImageView != null) {
            i11 = R.id.book_desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.book_desc);
            if (textView != null) {
                i11 = R.id.book_name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.book_name);
                if (textView2 != null) {
                    i11 = R.id.bottom_ancor;
                    View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bottom_ancor);
                    if (findChildViewById != null) {
                        i11 = R.id.close;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.close);
                        if (imageView != null) {
                            i11 = R.id.desc_bottom_barrier;
                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(rootView, R.id.desc_bottom_barrier);
                            if (barrier != null) {
                                i11 = R.id.noproguard_book_download;
                                OfflineDownloadView offlineDownloadView = (OfflineDownloadView) ViewBindings.findChildViewById(rootView, R.id.noproguard_book_download);
                                if (offlineDownloadView != null) {
                                    i11 = R.id.noproguard_book_link;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.noproguard_book_link);
                                    if (textView3 != null) {
                                        i11 = R.id.scroll_container;
                                        MaxHeightScrollView maxHeightScrollView = (MaxHeightScrollView) ViewBindings.findChildViewById(rootView, R.id.scroll_container);
                                        if (maxHeightScrollView != null) {
                                            i11 = R.id.words_sum;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.words_sum);
                                            if (textView4 != null) {
                                                return new j6((LinearLayout) rootView, aspectRoundImageView, textView, textView2, findChildViewById, imageView, barrier, offlineDownloadView, textView3, maxHeightScrollView, textView4);
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
    public static j6 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static j6 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_book_detail, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f55430a;
    }
}
