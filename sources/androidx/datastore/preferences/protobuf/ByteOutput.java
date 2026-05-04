package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class ByteOutput {
    public abstract void write(byte value) throws IOException;

    public abstract void write(ByteBuffer value) throws IOException;

    public abstract void write(byte[] value, int offset, int length) throws IOException;

    public abstract void writeLazy(ByteBuffer value) throws IOException;

    public abstract void writeLazy(byte[] value, int offset, int length) throws IOException;
}
