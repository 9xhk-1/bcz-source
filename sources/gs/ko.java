package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ko implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55659a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55660b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f55661c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f55662d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final SeekBar f55663e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55664f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f55665g;

    public ko(@NonNull RelativeLayout rootView, @NonNull RelativeLayout bottomLine, @NonNull ImageView vcvImgFullscreen, @NonNull ImageView vcvPlay, @NonNull SeekBar vcvSeekbar, @NonNull TextView vcvTxtElapsed, @NonNull TextView vcvTxtTotal) {
        this.f55659a = rootView;
        this.f55660b = bottomLine;
        this.f55661c = vcvImgFullscreen;
        this.f55662d = vcvPlay;
        this.f55663e = vcvSeekbar;
        this.f55664f = vcvTxtElapsed;
        this.f55665g = vcvTxtTotal;
    }

    @NonNull
    public static ko a(@NonNull View rootView) {
        int i11 = R.id.bottom_line;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.bottom_line);
        if (relativeLayout != null) {
            i11 = R.id.vcv_img_fullscreen;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.vcv_img_fullscreen);
            if (imageView != null) {
                i11 = R.id.vcv_play;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.vcv_play);
                if (imageView2 != null) {
                    i11 = R.id.vcv_seekbar;
                    SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.vcv_seekbar);
                    if (seekBar != null) {
                        i11 = R.id.vcv_txt_elapsed;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.vcv_txt_elapsed);
                        if (textView != null) {
                            i11 = R.id.vcv_txt_total;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.vcv_txt_total);
                            if (textView2 != null) {
                                return new ko((RelativeLayout) rootView, relativeLayout, imageView, imageView2, seekBar, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ko c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ko d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.view_videocontrols, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55659a;
    }
}
