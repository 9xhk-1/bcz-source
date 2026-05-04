package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.share.SharePickerSheetView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class nm implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final SharePickerSheetView f56107a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56108b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56109c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56110d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f56111e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56112f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56113g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f56114h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f56115i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f56116j;

    public nm(@NonNull SharePickerSheetView rootView, @NonNull TextView cancel, @NonNull TextView circle, @NonNull LinearLayout container, @NonNull TextView qq2, @NonNull TextView qzone, @NonNull TextView saveImg, @NonNull TextView title, @NonNull TextView weibo, @NonNull TextView weixin) {
        this.f56107a = rootView;
        this.f56108b = cancel;
        this.f56109c = circle;
        this.f56110d = container;
        this.f56111e = qq2;
        this.f56112f = qzone;
        this.f56113g = saveImg;
        this.f56114h = title;
        this.f56115i = weibo;
        this.f56116j = weixin;
    }

    @NonNull
    public static nm a(@NonNull View rootView) {
        int i11 = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.cancel);
        if (textView != null) {
            i11 = R.id.circle;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.circle);
            if (textView2 != null) {
                i11 = R.id.container;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                if (linearLayout != null) {
                    i11 = R.id.qq;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.qq);
                    if (textView3 != null) {
                        i11 = R.id.qzone;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.qzone);
                        if (textView4 != null) {
                            i11 = R.id.save_img;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.save_img);
                            if (textView5 != null) {
                                i11 = R.id.title;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                if (textView6 != null) {
                                    i11 = R.id.weibo;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weibo);
                                    if (textView7 != null) {
                                        i11 = R.id.weixin;
                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weixin);
                                        if (textView8 != null) {
                                            return new nm((SharePickerSheetView) rootView, textView, textView2, linearLayout, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static nm c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static nm d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.share_picker_sheet_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharePickerSheetView getRoot() {
        return this.f56107a;
    }
}
