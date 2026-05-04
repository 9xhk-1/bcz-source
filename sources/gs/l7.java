package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class l7 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55720a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55721b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55722c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55723d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Button f55724e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55725f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f55726g;

    public l7(@NonNull RelativeLayout rootView, @NonNull TextView fmLineCnmean, @NonNull TextView fmLineExample, @NonNull TextView fmLineRetry, @NonNull Button fmLineSendErr, @NonNull TextView fmLineWord, @NonNull ProgressBar retryProgress) {
        this.f55720a = rootView;
        this.f55721b = fmLineCnmean;
        this.f55722c = fmLineExample;
        this.f55723d = fmLineRetry;
        this.f55724e = fmLineSendErr;
        this.f55725f = fmLineWord;
        this.f55726g = retryProgress;
    }

    @NonNull
    public static l7 a(@NonNull View rootView) {
        int i11 = R.id.fm_line_cnmean;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.fm_line_cnmean);
        if (textView != null) {
            i11 = R.id.fm_line_example;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fm_line_example);
            if (textView2 != null) {
                i11 = R.id.fm_line_retry;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fm_line_retry);
                if (textView3 != null) {
                    i11 = R.id.fm_line_send_err;
                    Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.fm_line_send_err);
                    if (button != null) {
                        i11 = R.id.fm_line_word;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.fm_line_word);
                        if (textView4 != null) {
                            i11 = R.id.retry_progress;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.retry_progress);
                            if (progressBar != null) {
                                return new l7((RelativeLayout) rootView, textView, textView2, textView3, button, textView4, progressBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static l7 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static l7 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fm_line_item_normal, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55720a;
    }
}
