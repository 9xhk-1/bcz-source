package org.conscrypt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class Preconditions {
    private Preconditions() {
    }

    private static String badPositionIndex(int i11, int i12, String str) {
        if (i11 < 0) {
            return String.format("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return String.format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }

    private static String badPositionIndexes(int i11, int i12, int i13) {
        return (i11 < 0 || i11 > i13) ? badPositionIndex(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? badPositionIndex(i12, i13, "end index") : String.format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public static void checkArgument(boolean z11, String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    public static void checkPositionIndexes(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i11, i12, i13));
        }
    }

    public static void checkArgument(boolean z11, String str, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.format(str, obj));
        }
    }
}
