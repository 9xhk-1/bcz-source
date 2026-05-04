package com.google.common.math;

import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.c
/* loaded from: classes7.dex */
public abstract class n<X extends Number & Comparable<X>> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34361a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f34361a = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34361a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34361a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34361a[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34361a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34361a[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34361a[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34361a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public abstract X a(X a11, X b11);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double b(X r14, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.n.b(java.lang.Number, java.math.RoundingMode):double");
    }

    public abstract double c(X x11);

    public abstract int d(X x11);

    public abstract X e(double d11, RoundingMode mode);
}
