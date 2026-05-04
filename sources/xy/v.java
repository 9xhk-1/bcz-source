package xy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v {
    public static final boolean a(char c11) {
        return Character.toLowerCase(c11) == c11;
    }

    @m80.k
    public static final char[] b(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        int length = str.length();
        char[] cArr = new char[length];
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = str.charAt(i11);
        }
        return cArr;
    }
}
