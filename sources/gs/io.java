package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class io implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f55360a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f55361b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Group f55362c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f55363d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f55364e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55365f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f55366g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f55367h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f55368i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final SeekBar f55369j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f55370k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f55371l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f55372m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final Group f55373n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final ImageView f55374o;

    public io(@NonNull View rootView, @NonNull View bg2, @NonNull Group controlArea, @NonNull ImageView noproguardBack, @NonNull ImageView noproguardPlayOrPause, @NonNull ImageView noproguardPreview, @NonNull TextView noproguardPreviewTime, @NonNull View noproguardPreviewTimeArea, @NonNull ImageView noproguardScreenshot, @NonNull SeekBar noproguardSeeker, @NonNull TextView noproguardSkip, @NonNull TextView noproguardSpeed, @NonNull TextView noproguardTimeProgress, @NonNull Group previewArea, @NonNull ImageView screenshotPreview) {
        this.f55360a = rootView;
        this.f55361b = bg2;
        this.f55362c = controlArea;
        this.f55363d = noproguardBack;
        this.f55364e = noproguardPlayOrPause;
        this.f55365f = noproguardPreview;
        this.f55366g = noproguardPreviewTime;
        this.f55367h = noproguardPreviewTimeArea;
        this.f55368i = noproguardScreenshot;
        this.f55369j = noproguardSeeker;
        this.f55370k = noproguardSkip;
        this.f55371l = noproguardSpeed;
        this.f55372m = noproguardTimeProgress;
        this.f55373n = previewArea;
        this.f55374o = screenshotPreview;
    }

    @NonNull
    public static io a(@NonNull View rootView) {
        int i11 = R.id.bg;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.bg);
        if (findChildViewById != null) {
            i11 = R.id.control_area;
            Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.control_area);
            if (group != null) {
                i11 = R.id.noproguard_back;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.noproguard_back);
                if (imageView != null) {
                    i11 = R.id.noproguard_play_or_pause;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.noproguard_play_or_pause);
                    if (imageView2 != null) {
                        i11 = R.id.noproguard_preview;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.noproguard_preview);
                        if (imageView3 != null) {
                            i11 = R.id.noproguard_preview_time;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.noproguard_preview_time);
                            if (textView != null) {
                                i11 = R.id.noproguard_preview_time_area;
                                View findChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.noproguard_preview_time_area);
                                if (findChildViewById2 != null) {
                                    i11 = R.id.noproguard_screenshot;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.noproguard_screenshot);
                                    if (imageView4 != null) {
                                        i11 = R.id.noproguard_seeker;
                                        SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, R.id.noproguard_seeker);
                                        if (seekBar != null) {
                                            i11 = R.id.noproguard_skip;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.noproguard_skip);
                                            if (textView2 != null) {
                                                i11 = R.id.noproguard_speed;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.noproguard_speed);
                                                if (textView3 != null) {
                                                    i11 = R.id.noproguard_time_progress;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.noproguard_time_progress);
                                                    if (textView4 != null) {
                                                        i11 = R.id.preview_area;
                                                        Group group2 = (Group) ViewBindings.findChildViewById(rootView, R.id.preview_area);
                                                        if (group2 != null) {
                                                            i11 = R.id.screenshot_preview;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.screenshot_preview);
                                                            if (imageView5 != null) {
                                                                return new io(rootView, findChildViewById, group, imageView, imageView2, imageView3, textView, findChildViewById2, imageView4, seekBar, textView2, textView3, textView4, group2, imageView5);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static io b(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException(q.a.f13044u);
        }
        inflater.inflate(R.layout.view_video_controller, parent);
        return a(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f55360a;
    }
}
