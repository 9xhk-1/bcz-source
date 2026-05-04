package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface n extends o {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a extends Cloneable, o {
        n build();

        a r(e eVar, f fVar) throws IOException;
    }

    p<? extends n> getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    void writeTo(CodedOutputStream codedOutputStream) throws IOException;
}
