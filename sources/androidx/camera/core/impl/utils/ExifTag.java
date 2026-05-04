package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class ExifTag {
    public final String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    public ExifTag(String str, int i11, int i12) {
        this.name = str;
        this.number = i11;
        this.primaryFormat = i12;
        this.secondaryFormat = -1;
    }

    public boolean isFormatCompatible(int i11) {
        int i12;
        int i13 = this.primaryFormat;
        if (i13 == 7 || i11 == 7 || i13 == i11 || (i12 = this.secondaryFormat) == i11) {
            return true;
        }
        if ((i13 == 4 || i12 == 4) && i11 == 3) {
            return true;
        }
        if ((i13 == 9 || i12 == 9) && i11 == 8) {
            return true;
        }
        return (i13 == 12 || i12 == 12) && i11 == 11;
    }

    public ExifTag(String str, int i11, int i12, int i13) {
        this.name = str;
        this.number = i11;
        this.primaryFormat = i12;
        this.secondaryFormat = i13;
    }
}
