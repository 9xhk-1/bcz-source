package rx.internal.util.unsafe;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class p {
    public p() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean a(int i11) {
        return (i11 & (i11 + (-1))) == 0;
    }

    public static int b(int i11) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i11 - 1));
    }
}
