package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.activity.aiclass.video.BczVideoView;
import com.baicizhan.main.activity.aiclass.video.VideoControllerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class g extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final q3 f54968a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final VideoControllerView f54969b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final BczVideoView f54970c;

    public g(Object _bindingComponent, View _root, int _localFieldCount, q3 aiClassLoading, VideoControllerView controller, BczVideoView video) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54968a = aiClassLoading;
        this.f54969b = controller;
        this.f54970c = video;
    }

    public static g b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static g c(@NonNull View view, @Nullable Object component) {
        return (g) ViewDataBinding.bind(component, view, R.layout.activity_ai_class_video);
    }

    @NonNull
    public static g d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static g e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static g g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (g) ViewDataBinding.inflateInternal(inflater, R.layout.activity_ai_class_video, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static g h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (g) ViewDataBinding.inflateInternal(inflater, R.layout.activity_ai_class_video, null, false, component);
    }
}
