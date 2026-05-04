package androidx.compose.ui.text.style;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LineBreak_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int packBytes(int i11, int i12, int i13) {
        return i11 | (i12 << 8) | (i13 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte1(int i11) {
        return i11 & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte2(int i11) {
        return (i11 >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte3(int i11) {
        return (i11 >> 16) & 255;
    }
}
