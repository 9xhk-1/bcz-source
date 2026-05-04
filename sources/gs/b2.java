package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.DirectionalViewPager;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b2 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54216a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54217b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f54218c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f54219d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54220e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final DirectionalViewPager f54221f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f54222g;

    public b2(@NonNull FrameLayout rootView, @NonNull TextView forgetTheWordBtn, @NonNull ImageView home, @NonNull TextView lastTopic, @NonNull TextView rememberTheWordBtn, @NonNull DirectionalViewPager wordsGallery, @NonNull TextView wordsLeft) {
        this.f54216a = rootView;
        this.f54217b = forgetTheWordBtn;
        this.f54218c = home;
        this.f54219d = lastTopic;
        this.f54220e = rememberTheWordBtn;
        this.f54221f = wordsGallery;
        this.f54222g = wordsLeft;
    }

    @NonNull
    public static b2 a(@NonNull View rootView) {
        int i11 = R.id.forget_the_word_btn;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.forget_the_word_btn);
        if (textView != null) {
            i11 = R.id.home;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.home);
            if (imageView != null) {
                i11 = R.id.last_topic;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.last_topic);
                if (textView2 != null) {
                    i11 = R.id.remember_the_word_btn;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.remember_the_word_btn);
                    if (textView3 != null) {
                        i11 = R.id.words_gallery;
                        DirectionalViewPager directionalViewPager = (DirectionalViewPager) ViewBindings.findChildViewById(rootView, R.id.words_gallery);
                        if (directionalViewPager != null) {
                            i11 = R.id.words_left;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.words_left);
                            if (textView4 != null) {
                                return new b2((FrameLayout) rootView, textView, imageView, textView2, textView3, directionalViewPager, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b2 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static b2 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_self_test, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f54216a;
    }
}
