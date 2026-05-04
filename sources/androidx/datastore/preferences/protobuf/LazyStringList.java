package androidx.datastore.preferences.protobuf;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString element);

    void add(byte[] element);

    boolean addAllByteArray(Collection<byte[]> c11);

    boolean addAllByteString(Collection<? extends ByteString> c11);

    List<byte[]> asByteArrayList();

    byte[] getByteArray(int index);

    ByteString getByteString(int index);

    Object getRaw(int index);

    List<?> getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    void mergeFrom(LazyStringList other);

    void set(int index, ByteString element);

    void set(int index, byte[] element);
}
