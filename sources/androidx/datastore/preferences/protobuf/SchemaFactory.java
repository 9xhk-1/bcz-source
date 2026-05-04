package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> messageType);
}
