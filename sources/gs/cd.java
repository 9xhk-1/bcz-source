package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.client.business.widget.CircleImageView;
import com.baicizhan.main.customview.calendar.CalendarView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class cd extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final CircleImageView f54444a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CalendarView f54445b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54446c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f54447d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54448e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f54449f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f54450g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54451h;

    public cd(Object _bindingComponent, View _root, int _localFieldCount, CircleImageView avatar, CalendarView calendar, TextView calendarDateTitle, View colorBg, TextView date, ImageView imgHeader, ImageView imgQrcode, TextView name) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54444a = avatar;
        this.f54445b = calendar;
        this.f54446c = calendarDateTitle;
        this.f54447d = colorBg;
        this.f54448e = date;
        this.f54449f = imgHeader;
        this.f54450g = imgQrcode;
        this.f54451h = name;
    }

    public static cd b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static cd c(@NonNull View view, @Nullable Object component) {
        return (cd) ViewDataBinding.bind(component, view, R.layout.image_daka_content_calendar);
    }

    @NonNull
    public static cd d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static cd e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static cd g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (cd) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_content_calendar, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static cd h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (cd) ViewDataBinding.inflateInternal(inflater, R.layout.image_daka_content_calendar, null, false, component);
    }
}
