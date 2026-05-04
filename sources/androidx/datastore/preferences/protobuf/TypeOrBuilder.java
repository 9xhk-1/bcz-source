package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface TypeOrBuilder extends MessageLiteOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    Field getFields(int index);

    int getFieldsCount();

    List<Field> getFieldsList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int index);

    ByteString getOneofsBytes(int index);

    int getOneofsCount();

    List<String> getOneofsList();

    Option getOptions(int index);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
