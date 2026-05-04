package androidx.compose.ui.autofill;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes.dex */
final class AndroidContentDataType implements ContentDataType {
    private final int androidAutofillType;

    private /* synthetic */ AndroidContentDataType(int i11) {
        this.androidAutofillType = i11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidContentDataType m2097boximpl(int i11) {
        return new AndroidContentDataType(i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2099equalsimpl(int i11, Object obj) {
        return (obj instanceof AndroidContentDataType) && i11 == ((AndroidContentDataType) obj).m2103unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2100equalsimpl0(int i11, int i12) {
        return i11 == i12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2101hashCodeimpl(int i11) {
        return Integer.hashCode(i11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2102toStringimpl(int i11) {
        return "AndroidContentDataType(androidAutofillType=" + i11 + ')';
    }

    public boolean equals(Object obj) {
        return m2099equalsimpl(this.androidAutofillType, obj);
    }

    public final int getAndroidAutofillType() {
        return this.androidAutofillType;
    }

    public int hashCode() {
        return m2101hashCodeimpl(this.androidAutofillType);
    }

    public String toString() {
        return m2102toStringimpl(this.androidAutofillType);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2103unboximpl() {
        return this.androidAutofillType;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2098constructorimpl(int i11) {
        return i11;
    }
}
