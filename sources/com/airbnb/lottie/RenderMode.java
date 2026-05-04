package com.airbnb.lottie;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public enum RenderMode {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9914a;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f9914a = iArr;
            try {
                iArr[RenderMode.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9914a[RenderMode.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9914a[RenderMode.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i11, boolean z11, int i12) {
        int i13 = a.f9914a[ordinal()];
        if (i13 == 1) {
            return false;
        }
        if (i13 != 2) {
            return (z11 && i11 < 28) || i12 > 4 || i11 <= 25;
        }
        return true;
    }
}
