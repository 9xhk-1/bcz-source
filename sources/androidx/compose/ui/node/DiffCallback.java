package androidx.compose.ui.node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface DiffCallback {
    boolean areItemsTheSame(int i11, int i12);

    void insert(int i11);

    void remove(int i11, int i12);

    void same(int i11, int i12);
}
