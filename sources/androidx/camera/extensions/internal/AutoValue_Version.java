package androidx.camera.extensions.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AutoValue_Version extends Version {
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    public AutoValue_Version(int i11, int i12, int i13, String str) {
        this.major = i11;
        this.minor = i12;
        this.patch = i13;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.description = str;
    }

    @Override // androidx.camera.extensions.internal.Version
    public String getDescription() {
        return this.description;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMajor() {
        return this.major;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getMinor() {
        return this.minor;
    }

    @Override // androidx.camera.extensions.internal.Version
    public int getPatch() {
        return this.patch;
    }
}
