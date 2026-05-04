package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface RegExpProxy {
    public static final int RA_MATCH = 1;
    public static final int RA_REPLACE = 2;
    public static final int RA_SEARCH = 3;

    Object action(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr, int i11);

    Object compileRegExp(Context context, String str, String str2);

    int find_split(Context context, Scriptable scriptable, String str, String str2, Scriptable scriptable2, int[] iArr, int[] iArr2, boolean[] zArr, String[][] strArr);

    boolean isRegExp(Scriptable scriptable);

    Object js_split(Context context, Scriptable scriptable, String str, Object[] objArr);

    Scriptable wrapRegExp(Context context, Scriptable scriptable, Object obj);
}
