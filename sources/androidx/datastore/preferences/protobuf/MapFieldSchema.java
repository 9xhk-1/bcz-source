package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@CheckReturnValue
/* loaded from: classes2.dex */
interface MapFieldSchema {
    Map<?, ?> forMapData(Object mapField);

    MapEntryLite.Metadata<?, ?> forMapMetadata(Object mapDefaultEntry);

    Map<?, ?> forMutableMapData(Object mapField);

    int getSerializedSize(int fieldNumber, Object mapField, Object mapDefaultEntry);

    boolean isImmutable(Object mapField);

    @CanIgnoreReturnValue
    Object mergeFrom(Object destMapField, Object srcMapField);

    Object newMapField(Object mapDefaultEntry);

    Object toImmutable(Object mapField);
}
