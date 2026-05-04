package org.junit.jupiter.params.shadow.com.univocity.parsers.fixed;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public enum FieldAlignment {
    LEFT,
    CENTER,
    RIGHT;

    public int calculatePadding(int i11, int i12) {
        if (this == LEFT || i11 <= i12) {
            return 0;
        }
        if (this == RIGHT) {
            return i11 - i12;
        }
        int i13 = (i11 / 2) - (i12 / 2);
        return i12 + i13 > i11 ? i13 - 1 : i13;
    }
}
