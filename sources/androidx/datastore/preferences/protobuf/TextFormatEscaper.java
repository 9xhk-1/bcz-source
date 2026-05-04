package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class TextFormatEscaper {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface ByteSequence {
        byte byteAt(int offset);

        int size();
    }

    private TextFormatEscaper() {
    }

    public static String escapeBytes(ByteSequence input) {
        StringBuilder sb2 = new StringBuilder(input.size());
        for (int i11 = 0; i11 < input.size(); i11++) {
            byte byteAt = input.byteAt(i11);
            if (byteAt == 34) {
                sb2.append("\\\"");
            } else if (byteAt == 39) {
                sb2.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (byteAt < 32 || byteAt > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((byteAt & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) byteAt);
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String escapeDoubleQuotesAndBackslashes(String input) {
        return input.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String input) {
        return escapeBytes(ByteString.copyFromUtf8(input));
    }

    public static String escapeBytes(final ByteString input) {
        return escapeBytes(new ByteSequence() { // from class: androidx.datastore.preferences.protobuf.TextFormatEscaper.1
            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int offset) {
                return ByteString.this.byteAt(offset);
            }

            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return ByteString.this.size();
            }
        });
    }

    public static String escapeBytes(final byte[] input) {
        return escapeBytes(new ByteSequence() { // from class: androidx.datastore.preferences.protobuf.TextFormatEscaper.2
            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int offset) {
                return input[offset];
            }

            @Override // androidx.datastore.preferences.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return input.length;
            }
        });
    }
}
