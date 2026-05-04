package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface EnumValueOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    int getNumber();

    Option getOptions(int index);

    int getOptionsCount();

    List<Option> getOptionsList();
}
