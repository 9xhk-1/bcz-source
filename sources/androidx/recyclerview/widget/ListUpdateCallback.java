package androidx.recyclerview.widget;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface ListUpdateCallback {
    void onChanged(int i11, int i12, @Nullable Object obj);

    void onInserted(int i11, int i12);

    void onMoved(int i11, int i12);

    void onRemoved(int i11, int i12);
}
