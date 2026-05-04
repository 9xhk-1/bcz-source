package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* renamed from: id, reason: collision with root package name */
    private final int f4366id;
    private final java.lang.reflect.Field valueField;

    public OneofInfo(int id2, java.lang.reflect.Field caseField, java.lang.reflect.Field valueField) {
        this.f4366id = id2;
        this.caseField = caseField;
        this.valueField = valueField;
    }

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f4366id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }
}
