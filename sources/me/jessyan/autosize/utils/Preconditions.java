package me.jessyan.autosize.utils;

import android.os.Looper;
import l50.b;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class Preconditions {
    private Preconditions() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    private static String badElementIndex(int i11, int i12, String str) {
        if (i11 < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static String badPositionIndex(int i11, int i12, String str) {
        if (i11 < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static String badPositionIndexes(int i11, int i12, int i13) {
        return (i11 < 0 || i11 > i13) ? badPositionIndex(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? badPositionIndex(i12, i13, "end index") : format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public static void checkArgument(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i11, int i12) {
        return checkElementIndex(i11, i12, "index");
    }

    public static void checkMainThread() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    public static <T> T checkNotNull(T t11) {
        t11.getClass();
        return t11;
    }

    public static int checkPositionIndex(int i11, int i12) {
        return checkPositionIndex(i11, i12, "index");
    }

    public static void checkPositionIndexes(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i11, i12, i13));
        }
    }

    public static void checkState(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    public static String format(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i11 = 0;
        int i12 = 0;
        while (i11 < objArr.length && (indexOf = valueOf.indexOf("%s", i12)) != -1) {
            sb2.append(valueOf.substring(i12, indexOf));
            sb2.append(objArr[i11]);
            i12 = indexOf + 2;
            i11++;
        }
        sb2.append(valueOf.substring(i12));
        if (i11 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i11]);
            for (int i13 = i11 + 1; i13 < objArr.length; i13++) {
                sb2.append(j2.O);
                sb2.append(objArr[i13]);
            }
            sb2.append(b.f69930l);
        }
        return sb2.toString();
    }

    public static void checkArgument(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkElementIndex(int i11, int i12, String str) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(badElementIndex(i11, i12, str));
        }
        return i11;
    }

    public static <T> T checkNotNull(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(badPositionIndex(i11, i12, str));
        }
        return i11;
    }

    public static void checkState(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalArgumentException(format(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t11, String str, Object... objArr) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(format(str, objArr));
    }

    public static void checkState(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalStateException(format(str, objArr));
        }
    }
}
