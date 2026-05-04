package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface EnumOrBuilder extends MessageLiteOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    EnumValue getEnumvalue(int index);

    int getEnumvalueCount();

    List<EnumValue> getEnumvalueList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int index);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
