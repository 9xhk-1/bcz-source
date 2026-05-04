package org.mozilla.javascript.json;

import java.util.ArrayList;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class JsonParser {

    /* renamed from: cx, reason: collision with root package name */
    private Context f78395cx;
    private int length;
    private int pos;
    private Scriptable scope;
    private String src;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ParseException extends Exception {
        static final long serialVersionUID = 4804542791749920772L;

        public ParseException(String str) {
            super(str);
        }

        public ParseException(Exception exc) {
            super(exc);
        }
    }

    public JsonParser(Context context, Scriptable scriptable) {
        this.f78395cx = context;
        this.scope = scriptable;
    }

    private void consume(char c11) throws ParseException {
        consumeWhitespace();
        int i11 = this.pos;
        if (i11 >= this.length) {
            throw new ParseException("Expected " + c11 + " but reached end of stream");
        }
        String str = this.src;
        this.pos = i11 + 1;
        char charAt = str.charAt(i11);
        if (charAt == c11) {
            return;
        }
        throw new ParseException("Expected " + c11 + " found " + charAt);
    }

    private void consumeWhitespace() {
        while (true) {
            int i11 = this.pos;
            if (i11 >= this.length) {
                return;
            }
            char charAt = this.src.charAt(i11);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                return;
            } else {
                this.pos++;
            }
        }
    }

    private Object readArray() throws ParseException {
        ArrayList arrayList = new ArrayList();
        consumeWhitespace();
        boolean z11 = false;
        while (true) {
            int i11 = this.pos;
            if (i11 >= this.length) {
                throw new ParseException("Unterminated array literal");
            }
            char charAt = this.src.charAt(i11);
            if (charAt != ',') {
                if (charAt == ']') {
                    this.pos++;
                    return this.f78395cx.newArray(this.scope, arrayList.toArray());
                }
                if (z11) {
                    throw new ParseException("Missing comma in array literal");
                }
                arrayList.add(readValue());
                z11 = true;
            } else {
                if (!z11) {
                    throw new ParseException("Unexpected comma in array literal");
                }
                this.pos++;
                z11 = false;
            }
            consumeWhitespace();
        }
    }

    private Boolean readFalse() throws ParseException {
        int i11 = this.length;
        int i12 = this.pos;
        if (i11 - i12 < 4 || this.src.charAt(i12) != 'a' || this.src.charAt(this.pos + 1) != 'l' || this.src.charAt(this.pos + 2) != 's' || this.src.charAt(this.pos + 3) != 'e') {
            throw new ParseException("Unexpected token: f");
        }
        this.pos += 4;
        return Boolean.FALSE;
    }

    private Object readNull() throws ParseException {
        int i11 = this.length;
        int i12 = this.pos;
        if (i11 - i12 < 3 || this.src.charAt(i12) != 'u' || this.src.charAt(this.pos + 1) != 'l' || this.src.charAt(this.pos + 2) != 'l') {
            throw new ParseException("Unexpected token: n");
        }
        this.pos += 3;
        return null;
    }

    private Number readNumber(char c11) throws ParseException {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c11);
        while (true) {
            int i12 = this.pos;
            if (i12 >= this.length) {
                break;
            }
            char charAt = this.src.charAt(i12);
            if (!Character.isDigit(charAt) && charAt != '-' && charAt != '+' && charAt != '.' && charAt != 'e' && charAt != 'E') {
                break;
            }
            this.pos++;
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        int length = sb3.length();
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            try {
                char charAt2 = sb3.charAt(i13);
                if (!Character.isDigit(charAt2)) {
                    i13++;
                } else if (charAt2 == '0' && length > (i11 = i13 + 1) && Character.isDigit(sb3.charAt(i11))) {
                    throw new ParseException("Unsupported number format: " + sb3);
                }
            } catch (NumberFormatException unused) {
                throw new ParseException("Unsupported number format: " + sb3);
            }
        }
        double parseDouble = Double.parseDouble(sb3);
        int i14 = (int) parseDouble;
        return ((double) i14) == parseDouble ? Integer.valueOf(i14) : Double.valueOf(parseDouble);
    }

    private Object readObject() throws ParseException {
        Scriptable newObject = this.f78395cx.newObject(this.scope);
        consumeWhitespace();
        boolean z11 = false;
        while (true) {
            int i11 = this.pos;
            if (i11 >= this.length) {
                throw new ParseException("Unterminated object literal");
            }
            String str = this.src;
            this.pos = i11 + 1;
            char charAt = str.charAt(i11);
            if (charAt != '\"') {
                if (charAt != ',') {
                    if (charAt == '}') {
                        return newObject;
                    }
                    throw new ParseException("Unexpected token in object literal");
                }
                if (!z11) {
                    throw new ParseException("Unexpected comma in object literal");
                }
                z11 = false;
            } else {
                if (z11) {
                    throw new ParseException("Missing comma in object literal");
                }
                String readString = readString();
                consume(':');
                Object readValue = readValue();
                long indexFromString = ScriptRuntime.indexFromString(readString);
                if (indexFromString < 0) {
                    newObject.put(readString, newObject, readValue);
                } else {
                    newObject.put((int) indexFromString, newObject, readValue);
                }
                z11 = true;
            }
            consumeWhitespace();
        }
    }

    private String readString() throws ParseException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i11 = this.pos;
            if (i11 >= this.length) {
                throw new ParseException("Unterminated string literal");
            }
            String str = this.src;
            this.pos = i11 + 1;
            char charAt = str.charAt(i11);
            if (charAt <= 31) {
                throw new ParseException("String contains control character");
            }
            if (charAt == '\"') {
                return sb2.toString();
            }
            if (charAt != '\\') {
                sb2.append(charAt);
            } else {
                int i12 = this.pos;
                if (i12 >= this.length) {
                    throw new ParseException("Unterminated string");
                }
                String str2 = this.src;
                this.pos = i12 + 1;
                char charAt2 = str2.charAt(i12);
                if (charAt2 == '\"') {
                    sb2.append('\"');
                } else if (charAt2 == '/') {
                    sb2.append('/');
                } else if (charAt2 == '\\') {
                    sb2.append('\\');
                } else if (charAt2 == 'b') {
                    sb2.append('\b');
                } else if (charAt2 == 'f') {
                    sb2.append('\f');
                } else if (charAt2 == 'n') {
                    sb2.append('\n');
                } else if (charAt2 == 'r') {
                    sb2.append('\r');
                } else if (charAt2 == 't') {
                    sb2.append('\t');
                } else {
                    if (charAt2 != 'u') {
                        throw new ParseException("Unexcpected character in string: '\\" + charAt2 + "'");
                    }
                    int i13 = this.length;
                    int i14 = this.pos;
                    if (i13 - i14 < 5) {
                        throw new ParseException("Invalid character code: \\u" + this.src.substring(this.pos));
                    }
                    try {
                        sb2.append((char) Integer.parseInt(this.src.substring(i14, i14 + 4), 16));
                        this.pos += 4;
                    } catch (NumberFormatException unused) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Invalid character code: ");
                        String str3 = this.src;
                        int i15 = this.pos;
                        sb3.append(str3.substring(i15, i15 + 4));
                        throw new ParseException(sb3.toString());
                    }
                }
            }
        }
    }

    private Boolean readTrue() throws ParseException {
        int i11 = this.length;
        int i12 = this.pos;
        if (i11 - i12 < 3 || this.src.charAt(i12) != 'r' || this.src.charAt(this.pos + 1) != 'u' || this.src.charAt(this.pos + 2) != 'e') {
            throw new ParseException("Unexpected token: t");
        }
        this.pos += 3;
        return Boolean.TRUE;
    }

    private Object readValue() throws ParseException {
        consumeWhitespace();
        int i11 = this.pos;
        if (i11 >= this.length) {
            throw new ParseException("Empty JSON string");
        }
        String str = this.src;
        this.pos = i11 + 1;
        char charAt = str.charAt(i11);
        if (charAt == '\"') {
            return readString();
        }
        if (charAt != '-') {
            if (charAt == '[') {
                return readArray();
            }
            if (charAt == 'f') {
                return readFalse();
            }
            if (charAt == 'n') {
                return readNull();
            }
            if (charAt == 't') {
                return readTrue();
            }
            if (charAt == '{') {
                return readObject();
            }
            switch (charAt) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                default:
                    throw new ParseException("Unexpected token: " + charAt);
            }
        }
        return readNumber(charAt);
    }

    public synchronized Object parseValue(String str) throws ParseException {
        Object readValue;
        try {
            if (str == null) {
                throw new ParseException("Input string may not be null");
            }
            this.pos = 0;
            this.length = str.length();
            this.src = str;
            readValue = readValue();
            consumeWhitespace();
            if (this.pos < this.length) {
                throw new ParseException("Expected end of stream at char " + this.pos);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return readValue;
    }
}
