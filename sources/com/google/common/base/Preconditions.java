package com.google.common.base;

import go.b;
import ho.j;
import ho.o0;
import javax.annotation.CheckForNull;
import uo.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@b
/* loaded from: classes7.dex */
public final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int index, int size, String desc) {
        if (index < 0) {
            return o0.e("%s (%s) must not be negative", desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return o0.e("%s (%s) must be less than size (%s)", desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException("negative size: " + size);
    }

    private static String badPositionIndex(int index, int size, String desc) {
        if (index < 0) {
            return o0.e("%s (%s) must not be negative", desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return o0.e("%s (%s) must not be greater than size (%s)", desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException("negative size: " + size);
    }

    private static String badPositionIndexes(int start, int end, int size) {
        return (start < 0 || start > size) ? badPositionIndex(start, size, "start index") : (end < 0 || end > size) ? badPositionIndex(end, size, "end index") : o0.e("end index (%s) must not be less than start index (%s)", Integer.valueOf(end), Integer.valueOf(start));
    }

    public static void checkArgument(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
    }

    @a
    public static int checkElementIndex(int index, int size) {
        return checkElementIndex(index, size, "index");
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference) {
        reference.getClass();
        return reference;
    }

    @a
    public static int checkPositionIndex(int index, int size) {
        return checkPositionIndex(index, size, "index");
    }

    public static void checkPositionIndexes(int start, int end, int size) {
        if (start < 0 || end < start || end > size) {
            throw new IndexOutOfBoundsException(badPositionIndexes(start, end, size));
        }
    }

    public static void checkState(boolean expression) {
        if (!expression) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean expression, @CheckForNull Object errorMessage) {
        if (!expression) {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    @a
    public static int checkElementIndex(int index, int size, String desc) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(badElementIndex(index, size, desc));
        }
        return index;
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, @CheckForNull Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    @a
    public static int checkPositionIndex(int index, int size, String desc) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(badPositionIndex(index, size, desc));
        }
        return index;
    }

    public static void checkState(boolean expression, @CheckForNull Object errorMessage) {
        if (!expression) {
            throw new IllegalStateException(String.valueOf(errorMessage));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @CheckForNull Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, errorMessageArgs));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, @CheckForNull Object... errorMessageArgs) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, errorMessageArgs));
    }

    public static void checkState(boolean expression, @CheckForNull String errorMessageTemplate, @CheckForNull Object... errorMessageArgs) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, errorMessageArgs));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, char p12) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Character.valueOf(p12)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, char p12) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Character.valueOf(p12)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, char p12) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Character.valueOf(p12)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, int p12) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Integer.valueOf(p12)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, int p12) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Integer.valueOf(p12)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, int p12) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Integer.valueOf(p12)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, long p12) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Long.valueOf(p12)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, long p12) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Long.valueOf(p12)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, long p12) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Long.valueOf(p12)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @CheckForNull Object p12) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, p12));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, @CheckForNull Object p12) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, p12));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @CheckForNull Object p12) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, p12));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, char p12, char p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Character.valueOf(p12), Character.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, char p12, char p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Character.valueOf(p12), Character.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, char p12, char p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Character.valueOf(p12), Character.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, char p12, int p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Character.valueOf(p12), Integer.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, char p12, int p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Character.valueOf(p12), Integer.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, char p12, int p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Character.valueOf(p12), Integer.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, char p12, long p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Character.valueOf(p12), Long.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, char p12, long p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Character.valueOf(p12), Long.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, char p12, long p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Character.valueOf(p12), Long.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, char p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Character.valueOf(p12), p22));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, char p12, @CheckForNull Object p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Character.valueOf(p12), p22));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, char p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Character.valueOf(p12), p22));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, int p12, char p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Character.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, int p12, char p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Character.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, int p12, char p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Character.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, int p12, int p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Integer.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, int p12, int p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Integer.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, int p12, int p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Integer.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, int p12, long p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Long.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, int p12, long p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Long.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, int p12, long p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Integer.valueOf(p12), Long.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, int p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Integer.valueOf(p12), p22));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, int p12, @CheckForNull Object p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Integer.valueOf(p12), p22));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, int p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Integer.valueOf(p12), p22));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, long p12, char p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Long.valueOf(p12), Character.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, long p12, char p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Long.valueOf(p12), Character.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, long p12, char p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Long.valueOf(p12), Character.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, long p12, int p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Long.valueOf(p12), Integer.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, long p12, int p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Long.valueOf(p12), Integer.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, long p12, int p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Long.valueOf(p12), Integer.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, long p12, long p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Long.valueOf(p12), Long.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, long p12, long p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Long.valueOf(p12), Long.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, long p12, long p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Long.valueOf(p12), Long.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, long p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, Long.valueOf(p12), p22));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, long p12, @CheckForNull Object p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, Long.valueOf(p12), p22));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, long p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, Long.valueOf(p12), p22));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, char p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, p12, Character.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, @CheckForNull Object p12, char p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, p12, Character.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, char p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, p12, Character.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, int p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, p12, Integer.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, @CheckForNull Object p12, int p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, p12, Integer.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, int p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, p12, Integer.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, long p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, p12, Long.valueOf(p22)));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, @CheckForNull Object p12, long p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, p12, Long.valueOf(p22)));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, long p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, p12, Long.valueOf(p22)));
        }
    }

    public static void checkArgument(boolean expression, @CheckForNull String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, p12, p22));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, p12, p22));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, p12, p22));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22, @CheckForNull Object p32) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, p12, p22, p32));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22, @CheckForNull Object p32) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, p12, p22, p32));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22, @CheckForNull Object p32) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, p12, p22, p32));
        }
    }

    public static void checkArgument(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22, @CheckForNull Object p32, @CheckForNull Object p42) {
        if (!expression) {
            throw new IllegalArgumentException(o0.e(errorMessageTemplate, p12, p22, p32, p42));
        }
    }

    @a
    public static <T> T checkNotNull(@CheckForNull T reference, String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22, @CheckForNull Object p32, @CheckForNull Object p42) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(o0.e(errorMessageTemplate, p12, p22, p32, p42));
    }

    public static void checkState(boolean expression, String errorMessageTemplate, @CheckForNull Object p12, @CheckForNull Object p22, @CheckForNull Object p32, @CheckForNull Object p42) {
        if (!expression) {
            throw new IllegalStateException(o0.e(errorMessageTemplate, p12, p22, p32, p42));
        }
    }
}
