package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface ViewAdapter {
    void didInsert(@k View view, @k ViewGroup viewGroup);

    void didUpdate(@k View view, @k ViewGroup viewGroup);

    int getId();

    void willInsert(@k View view, @k ViewGroup viewGroup);
}
