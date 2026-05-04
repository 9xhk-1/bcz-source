package androidx.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public abstract class DataBinderMapper {
    @NonNull
    public List<DataBinderMapper> collectDependencies() {
        return Collections.EMPTY_LIST;
    }

    public abstract String convertBrIdToString(int i11);

    public abstract ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i11);

    public abstract ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i11);

    public abstract int getLayoutId(String str);
}
