package androidx.collection;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CollectionPlatformUtils {

    @k
    public static final CollectionPlatformUtils INSTANCE = new CollectionPlatformUtils();

    private CollectionPlatformUtils() {
    }

    @k
    public final IndexOutOfBoundsException createIndexOutOfBoundsException$collection() {
        return new ArrayIndexOutOfBoundsException();
    }
}
