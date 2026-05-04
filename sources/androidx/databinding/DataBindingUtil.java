package androidx.databinding;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class DataBindingUtil {
    private static DataBinderMapper sMapper = new DataBinderMapperImpl();
    private static DataBindingComponent sDefaultComponent = null;

    private DataBindingUtil() {
    }

    @Nullable
    public static <T extends ViewDataBinding> T bind(@NonNull View view) {
        return (T) bind(view, sDefaultComponent);
    }

    private static <T extends ViewDataBinding> T bindToAddedViews(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i11, int i12) {
        int childCount = viewGroup.getChildCount();
        int i13 = childCount - i11;
        if (i13 == 1) {
            return (T) bind(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i12);
        }
        View[] viewArr = new View[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            viewArr[i14] = viewGroup.getChildAt(i14 + i11);
        }
        return (T) bind(dataBindingComponent, viewArr, i12);
    }

    @Nullable
    public static String convertBrIdToString(int i11) {
        return sMapper.convertBrIdToString(i11);
    }

    @Nullable
    public static <T extends ViewDataBinding> T findBinding(@NonNull View view) {
        while (view != null) {
            T t11 = (T) ViewDataBinding.getBinding(view);
            if (t11 != null) {
                return t11;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith("layout") && str.endsWith("_0")) {
                    char charAt = str.charAt(6);
                    int indexOf = str.indexOf(47, 7);
                    if (charAt == '/') {
                        if (indexOf == -1) {
                            return null;
                        }
                    } else if (charAt == '-' && indexOf != -1 && str.indexOf(47, indexOf + 1) == -1) {
                        return null;
                    }
                }
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @Nullable
    public static <T extends ViewDataBinding> T getBinding(@NonNull View view) {
        return (T) ViewDataBinding.getBinding(view);
    }

    @Nullable
    public static DataBindingComponent getDefaultComponent() {
        return sDefaultComponent;
    }

    public static <T extends ViewDataBinding> T inflate(@NonNull LayoutInflater layoutInflater, int i11, @Nullable ViewGroup viewGroup, boolean z11) {
        return (T) inflate(layoutInflater, i11, viewGroup, z11, sDefaultComponent);
    }

    public static <T extends ViewDataBinding> T setContentView(@NonNull Activity activity, int i11) {
        return (T) setContentView(activity, i11, sDefaultComponent);
    }

    public static void setDefaultComponent(@Nullable DataBindingComponent dataBindingComponent) {
        sDefaultComponent = dataBindingComponent;
    }

    @Nullable
    public static <T extends ViewDataBinding> T bind(@NonNull View view, DataBindingComponent dataBindingComponent) {
        T t11 = (T) getBinding(view);
        if (t11 != null) {
            return t11;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        int layoutId = sMapper.getLayoutId((String) tag);
        if (layoutId != 0) {
            return (T) sMapper.getDataBinder(dataBindingComponent, view, layoutId);
        }
        throw new IllegalArgumentException("View is not a binding layout. Tag: " + tag);
    }

    public static <T extends ViewDataBinding> T inflate(@NonNull LayoutInflater layoutInflater, int i11, @Nullable ViewGroup viewGroup, boolean z11, @Nullable DataBindingComponent dataBindingComponent) {
        boolean z12 = viewGroup != null && z11;
        return z12 ? (T) bindToAddedViews(dataBindingComponent, viewGroup, z12 ? viewGroup.getChildCount() : 0, i11) : (T) bind(dataBindingComponent, layoutInflater.inflate(i11, viewGroup, z11), i11);
    }

    public static <T extends ViewDataBinding> T setContentView(@NonNull Activity activity, int i11, @Nullable DataBindingComponent dataBindingComponent) {
        activity.setContentView(i11);
        return (T) bindToAddedViews(dataBindingComponent, (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content), 0, i11);
    }

    public static <T extends ViewDataBinding> T bind(DataBindingComponent dataBindingComponent, View[] viewArr, int i11) {
        return (T) sMapper.getDataBinder(dataBindingComponent, viewArr, i11);
    }

    public static <T extends ViewDataBinding> T bind(DataBindingComponent dataBindingComponent, View view, int i11) {
        return (T) sMapper.getDataBinder(dataBindingComponent, view, i11);
    }
}
