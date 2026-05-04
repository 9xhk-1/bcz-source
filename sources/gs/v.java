package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class v implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57092a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57093b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57094c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57095d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f57096e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f57097f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f57098g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ProgressBar f57099h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f57100i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f57101j;

    public v(@NonNull LinearLayout rootView, @NonNull TextView cancel, @NonNull TextView confirm, @NonNull LinearLayout confirmArea, @NonNull ImageView image, @NonNull ImageView imageFinal, @NonNull ImageView imgBox, @NonNull ProgressBar loadingProgress, @NonNull TextView subtitle, @NonNull TextView title) {
        this.f57092a = rootView;
        this.f57093b = cancel;
        this.f57094c = confirm;
        this.f57095d = confirmArea;
        this.f57096e = image;
        this.f57097f = imageFinal;
        this.f57098g = imgBox;
        this.f57099h = loadingProgress;
        this.f57100i = subtitle;
        this.f57101j = title;
    }

    @NonNull
    public static v a(@NonNull View rootView) {
        int i11 = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (textView != null) {
            i11 = R.id.confirm;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.confirm);
            if (textView2 != null) {
                i11 = R.id.confirm_area;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.confirm_area);
                if (linearLayout != null) {
                    i11 = R.id.image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
                    if (imageView != null) {
                        i11 = R.id.image_final;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image_final);
                        if (imageView2 != null) {
                            i11 = R.id.img_box;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.img_box);
                            if (imageView3 != null) {
                                i11 = R.id.loading_progress;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.loading_progress);
                                if (progressBar != null) {
                                    i11 = R.id.subtitle;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.subtitle);
                                    if (textView3 != null) {
                                        i11 = R.id.title;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                        if (textView4 != null) {
                                            return new v((LinearLayout) rootView, textView, textView2, linearLayout, imageView, imageView2, imageView3, progressBar, textView3, textView4);
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
    public static v c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static v d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_daka_lottery, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f57092a;
    }
}
