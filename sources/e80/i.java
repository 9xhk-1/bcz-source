package e80;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i {
    public static boolean a(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (Character.isWhitespace(charSequence.charAt(i11))) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (!Character.isWhitespace(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
