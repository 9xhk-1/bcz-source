package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface ApiOrBuilder extends MessageLiteOrBuilder {
    Method getMethods(int index);

    int getMethodsCount();

    List<Method> getMethodsList();

    Mixin getMixins(int index);

    int getMixinsCount();

    List<Mixin> getMixinsList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int index);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    String getVersion();

    ByteString getVersionBytes();

    boolean hasSourceContext();
}
