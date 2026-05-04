package androidx.emoji2.text.flatbuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
interface ReadBuf {
    byte[] data();

    byte get(int i11);

    boolean getBoolean(int i11);

    double getDouble(int i11);

    float getFloat(int i11);

    int getInt(int i11);

    long getLong(int i11);

    short getShort(int i11);

    String getString(int i11, int i12);

    int limit();
}
