package org.mozilla.javascript;

import java.io.IOException;
import java.io.Reader;
import org.mozilla.javascript.Token;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class TokenStream {
    private static final char BYTE_ORDER_MARK = 65279;
    private static final int EOF_CHAR = -1;
    Token.CommentType commentType;
    int cursor;
    private boolean dirtyLine;
    private boolean isOctal;
    int lineno;
    private double number;
    private Parser parser;
    private int quoteChar;
    String regExpFlags;
    private char[] sourceBuffer;
    int sourceCursor;
    private int sourceEnd;
    private Reader sourceReader;
    private String sourceString;
    private int stringBufferTop;
    int tokenBeg;
    int tokenEnd;
    private int ungetCursor;
    private boolean xmlIsAttribute;
    private boolean xmlIsTagContent;
    private int xmlOpenTagsCount;
    private String string = "";
    private char[] stringBuffer = new char[128];
    private ObjToIntMap allStrings = new ObjToIntMap(50);
    private final int[] ungetBuffer = new int[3];
    private boolean hitEOF = false;
    private int lineStart = 0;
    private int lineEndChar = -1;
    private String commentPrefix = "";
    private int commentCursor = -1;

    public TokenStream(Parser parser, Reader reader, String str, int i11) {
        this.parser = parser;
        this.lineno = i11;
        if (reader != null) {
            if (str != null) {
                Kit.codeBug();
            }
            this.sourceReader = reader;
            this.sourceBuffer = new char[512];
            this.sourceEnd = 0;
        } else {
            if (str == null) {
                Kit.codeBug();
            }
            this.sourceString = str;
            this.sourceEnd = str.length();
        }
        this.cursor = 0;
        this.sourceCursor = 0;
    }

    private void addToString(int i11) {
        int i12 = this.stringBufferTop;
        char[] cArr = this.stringBuffer;
        if (i12 == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            this.stringBuffer = cArr2;
        }
        this.stringBuffer[i12] = (char) i11;
        this.stringBufferTop = i12 + 1;
    }

    private boolean canUngetChar() {
        int i11 = this.ungetCursor;
        return i11 == 0 || this.ungetBuffer[i11 - 1] != 10;
    }

    private String convertLastCharToHex(String str) {
        int length = str.length() - 1;
        StringBuffer stringBuffer = new StringBuffer(str.substring(0, length));
        stringBuffer.append("\\u");
        String hexString = Integer.toHexString(str.charAt(length));
        for (int i11 = 0; i11 < 4 - hexString.length(); i11++) {
            stringBuffer.append('0');
        }
        stringBuffer.append(hexString);
        return stringBuffer.toString();
    }

    private boolean fillSourceBuffer() throws IOException {
        if (this.sourceString != null) {
            Kit.codeBug();
        }
        if (this.sourceEnd == this.sourceBuffer.length) {
            if (this.lineStart == 0 || isMarkingComment()) {
                char[] cArr = this.sourceBuffer;
                char[] cArr2 = new char[cArr.length * 2];
                System.arraycopy(cArr, 0, cArr2, 0, this.sourceEnd);
                this.sourceBuffer = cArr2;
            } else {
                char[] cArr3 = this.sourceBuffer;
                int i11 = this.lineStart;
                System.arraycopy(cArr3, i11, cArr3, 0, this.sourceEnd - i11);
                int i12 = this.sourceEnd;
                int i13 = this.lineStart;
                this.sourceEnd = i12 - i13;
                this.sourceCursor -= i13;
                this.lineStart = 0;
            }
        }
        Reader reader = this.sourceReader;
        char[] cArr4 = this.sourceBuffer;
        int i14 = this.sourceEnd;
        int read = reader.read(cArr4, i14, cArr4.length - i14);
        if (read < 0) {
            return false;
        }
        this.sourceEnd += read;
        return true;
    }

    private int getChar() throws IOException {
        return getChar(true);
    }

    private int getCharIgnoreLineEnd() throws IOException {
        char c11;
        int i11 = this.ungetCursor;
        if (i11 != 0) {
            this.cursor++;
            int[] iArr = this.ungetBuffer;
            int i12 = i11 - 1;
            this.ungetCursor = i12;
            return iArr[i12];
        }
        while (true) {
            String str = this.sourceString;
            if (str != null) {
                int i13 = this.sourceCursor;
                if (i13 == this.sourceEnd) {
                    this.hitEOF = true;
                    return -1;
                }
                this.cursor++;
                this.sourceCursor = i13 + 1;
                c11 = str.charAt(i13);
            } else {
                if (this.sourceCursor == this.sourceEnd && !fillSourceBuffer()) {
                    this.hitEOF = true;
                    return -1;
                }
                this.cursor++;
                char[] cArr = this.sourceBuffer;
                int i14 = this.sourceCursor;
                this.sourceCursor = i14 + 1;
                c11 = cArr[i14];
            }
            if (c11 > 127) {
                if (c11 == 65279) {
                    break;
                }
                if (!isJSFormatChar(c11)) {
                    if (ScriptRuntime.isJSLineTerminator(c11)) {
                        this.lineEndChar = c11;
                        return 10;
                    }
                }
            } else if (c11 == '\n' || c11 == '\r') {
                this.lineEndChar = c11;
                return 10;
            }
        }
        return c11;
    }

    private String getStringFromBuffer() {
        this.tokenEnd = this.cursor;
        return new String(this.stringBuffer, 0, this.stringBufferTop);
    }

    private static boolean isAlpha(int i11) {
        return i11 <= 90 ? 65 <= i11 : 97 <= i11 && i11 <= 122;
    }

    public static boolean isDigit(int i11) {
        return 48 <= i11 && i11 <= 57;
    }

    private static boolean isJSFormatChar(int i11) {
        return i11 > 127 && Character.getType((char) i11) == 16;
    }

    public static boolean isJSSpace(int i11) {
        return i11 <= 127 ? i11 == 32 || i11 == 9 || i11 == 12 || i11 == 11 : i11 == 160 || i11 == 65279 || Character.getType((char) i11) == 12;
    }

    public static boolean isKeyword(String str) {
        return stringToKeyword(str) != 0;
    }

    private boolean isMarkingComment() {
        return this.commentCursor != -1;
    }

    private void markCommentStart() {
        markCommentStart("");
    }

    private boolean matchChar(int i11) throws IOException {
        int charIgnoreLineEnd = getCharIgnoreLineEnd();
        if (charIgnoreLineEnd == i11) {
            this.tokenEnd = this.cursor;
            return true;
        }
        ungetCharIgnoreLineEnd(charIgnoreLineEnd);
        return false;
    }

    private int peekChar() throws IOException {
        int i11 = getChar();
        ungetChar(i11);
        return i11;
    }

    private boolean readCDATA() throws IOException {
        int i11 = getChar();
        while (i11 != -1) {
            addToString(i11);
            if (i11 == 93 && peekChar() == 93) {
                i11 = getChar();
                addToString(i11);
                if (peekChar() == 62) {
                    addToString(getChar());
                    return true;
                }
            } else {
                i11 = getChar();
            }
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    private boolean readEntity() throws IOException {
        int i11 = getChar();
        int i12 = 1;
        while (i11 != -1) {
            addToString(i11);
            if (i11 == 60) {
                i12++;
            } else if (i11 == 62 && i12 - 1 == 0) {
                return true;
            }
            i11 = getChar();
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    private boolean readPI() throws IOException {
        while (true) {
            int i11 = getChar();
            if (i11 == -1) {
                this.stringBufferTop = 0;
                this.string = null;
                this.parser.addError("msg.XML.bad.form");
                return false;
            }
            addToString(i11);
            if (i11 == 63 && peekChar() == 62) {
                addToString(getChar());
                return true;
            }
        }
    }

    private boolean readQuotedString(int i11) throws IOException {
        int i12;
        do {
            i12 = getChar();
            if (i12 == -1) {
                this.stringBufferTop = 0;
                this.string = null;
                this.parser.addError("msg.XML.bad.form");
                return false;
            }
            addToString(i12);
        } while (i12 != i11);
        return true;
    }

    private boolean readXmlComment() throws IOException {
        int i11 = getChar();
        while (i11 != -1) {
            addToString(i11);
            if (i11 == 45 && peekChar() == 45) {
                i11 = getChar();
                addToString(i11);
                if (peekChar() == 62) {
                    addToString(getChar());
                    return true;
                }
            } else {
                i11 = getChar();
            }
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    private void skipLine() throws IOException {
        int i11;
        do {
            i11 = getChar();
            if (i11 == -1) {
                break;
            }
        } while (i11 != 10);
        ungetChar(i11);
        this.tokenEnd = this.cursor;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0204, code lost:
    
        if (r17.charAt(1) == 'n') goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0206, code lost:
    
        r2 = 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x021e, code lost:
    
        if (r17.charAt(1) == 'a') goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0230, code lost:
    
        if (r17.charAt(1) == 'h') goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x029d, code lost:
    
        if (r17.charAt(1) == 'n') goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x02ae, code lost:
    
        if (r17.charAt(1) == 'o') goto L225;
     */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x02d9 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int stringToKeyword(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.TokenStream.stringToKeyword(java.lang.String):int");
    }

    private void ungetChar(int i11) {
        int i12 = this.ungetCursor;
        if (i12 != 0 && this.ungetBuffer[i12 - 1] == 10) {
            Kit.codeBug();
        }
        int[] iArr = this.ungetBuffer;
        int i13 = this.ungetCursor;
        this.ungetCursor = i13 + 1;
        iArr[i13] = i11;
        this.cursor--;
    }

    private void ungetCharIgnoreLineEnd(int i11) {
        int[] iArr = this.ungetBuffer;
        int i12 = this.ungetCursor;
        this.ungetCursor = i12 + 1;
        iArr[i12] = i11;
        this.cursor--;
    }

    public final boolean eof() {
        return this.hitEOF;
    }

    public final String getAndResetCurrentComment() {
        if (this.sourceString != null) {
            if (isMarkingComment()) {
                Kit.codeBug();
            }
            return this.sourceString.substring(this.tokenBeg, this.tokenEnd);
        }
        if (!isMarkingComment()) {
            Kit.codeBug();
        }
        StringBuilder sb2 = new StringBuilder(this.commentPrefix);
        sb2.append(this.sourceBuffer, this.commentCursor, getTokenLength() - this.commentPrefix.length());
        this.commentCursor = -1;
        return sb2.toString();
    }

    public Token.CommentType getCommentType() {
        return this.commentType;
    }

    public int getCursor() {
        return this.cursor;
    }

    public int getFirstXMLToken() throws IOException {
        this.xmlOpenTagsCount = 0;
        this.xmlIsAttribute = false;
        this.xmlIsTagContent = false;
        if (!canUngetChar()) {
            return -1;
        }
        ungetChar(60);
        return getNextXMLToken();
    }

    public final String getLine() {
        if (this.sourceString != null) {
            int i11 = this.sourceCursor;
            if (this.lineEndChar >= 0) {
                i11--;
            } else {
                while (i11 != this.sourceEnd && !ScriptRuntime.isJSLineTerminator(this.sourceString.charAt(i11))) {
                    i11++;
                }
            }
            return this.sourceString.substring(this.lineStart, i11);
        }
        int i12 = this.sourceCursor - this.lineStart;
        if (this.lineEndChar >= 0) {
            i12--;
        } else {
            while (true) {
                int i13 = this.lineStart + i12;
                if (i13 == this.sourceEnd) {
                    try {
                        if (!fillSourceBuffer()) {
                            break;
                        }
                        i13 = this.lineStart + i12;
                    } catch (IOException unused) {
                    }
                }
                if (ScriptRuntime.isJSLineTerminator(this.sourceBuffer[i13])) {
                    break;
                }
                i12++;
            }
        }
        return new String(this.sourceBuffer, this.lineStart, i12);
    }

    public final int getLineno() {
        return this.lineno;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x015d, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getNextXMLToken() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.TokenStream.getNextXMLToken():int");
    }

    public final double getNumber() {
        return this.number;
    }

    public final int getOffset() {
        int i11 = this.sourceCursor - this.lineStart;
        return this.lineEndChar >= 0 ? i11 - 1 : i11;
    }

    public final char getQuoteChar() {
        return (char) this.quoteChar;
    }

    public final String getSourceString() {
        return this.sourceString;
    }

    public final String getString() {
        return this.string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        if (r1 != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        r1 = stringToKeyword(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c3, code lost:
    
        if (r1 == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        if (r1 == 153) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        if (r1 != 72) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        r18.string = (java.lang.String) r18.allStrings.intern(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        if (r1 == 127) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
    
        if (r18.parser.compilerEnv.isReservedKeywordAsIdentifier() != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        if (r18.parser.compilerEnv.getLanguageVersion() >= 170) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00db, code lost:
    
        if (r1 != 153) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dd, code lost:
    
        r1 = "let";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e2, code lost:
    
        r18.string = r1;
        r1 = 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
    
        r1 = "yield";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
    
        r18.string = (java.lang.String) r18.allStrings.intern(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0113, code lost:
    
        return 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0103, code lost:
    
        if (isKeyword(r2) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0105, code lost:
    
        r2 = convertLastCharToHex(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0449 A[LOOP:6: B:361:0x0449->B:363:0x044f, LOOP_START, PHI: r1
      0x0449: PHI (r1v26 int) = (r1v5 int), (r1v27 int) binds: [B:360:0x0447, B:363:0x044f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0488 A[LOOP:7: B:372:0x0488->B:375:?, LOOP_START, PHI: r1
      0x0488: PHI (r1v24 int) = (r1v8 int), (r1v25 int) binds: [B:371:0x0486, B:375:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x04c2 A[LOOP:8: B:388:0x04c2->B:391:?, LOOP_START, PHI: r1
      0x04c2: PHI (r1v20 int) = (r1v19 int), (r1v21 int) binds: [B:385:0x04b8, B:391:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0457 A[ADDED_TO_REGION, LOOP:9: B:404:0x0457->B:415:0x0472, LOOP_START, PHI: r1 r7
      0x0457: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:360:0x0447, B:415:0x0472] A[DONT_GENERATE, DONT_INLINE]
      0x0457: PHI (r7v5 int) = (r7v4 int), (r7v6 int) binds: [B:360:0x0447, B:415:0x0472] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:196:0x0270 -> B:191:0x0256). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getToken() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.TokenStream.getToken():int");
    }

    public int getTokenBeg() {
        return this.tokenBeg;
    }

    public int getTokenEnd() {
        return this.tokenEnd;
    }

    public int getTokenLength() {
        return this.tokenEnd - this.tokenBeg;
    }

    public final boolean isNumberOctal() {
        return this.isOctal;
    }

    public boolean isXMLAttribute() {
        return this.xmlIsAttribute;
    }

    public String readAndClearRegExpFlags() {
        String str = this.regExpFlags;
        this.regExpFlags = null;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a7, code lost:
    
        ungetChar(r2);
        r5.tokenEnd = r5.cursor - 1;
        r5.string = new java.lang.String(r5.stringBuffer, 0, r5.stringBufferTop);
        r5.parser.reportError("msg.unterminated.re.lit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void readRegExp(int r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.tokenBeg
            r1 = 0
            r5.stringBufferTop = r1
            r2 = 100
            if (r6 != r2) goto Lf
            r6 = 61
            r5.addToString(r6)
            goto L16
        Lf:
            r2 = 24
            if (r6 == r2) goto L16
            org.mozilla.javascript.Kit.codeBug()
        L16:
            r6 = r1
        L17:
            int r2 = r5.getChar()
            r3 = 47
            if (r2 != r3) goto L82
            if (r6 == 0) goto L22
            goto L82
        L22:
            int r6 = r5.stringBufferTop
        L24:
            r2 = 103(0x67, float:1.44E-43)
            boolean r3 = r5.matchChar(r2)
            if (r3 == 0) goto L30
            r5.addToString(r2)
            goto L24
        L30:
            r2 = 105(0x69, float:1.47E-43)
            boolean r3 = r5.matchChar(r2)
            if (r3 == 0) goto L3c
            r5.addToString(r2)
            goto L24
        L3c:
            r2 = 109(0x6d, float:1.53E-43)
            boolean r3 = r5.matchChar(r2)
            if (r3 == 0) goto L48
            r5.addToString(r2)
            goto L24
        L48:
            r2 = 121(0x79, float:1.7E-43)
            boolean r3 = r5.matchChar(r2)
            if (r3 == 0) goto L54
            r5.addToString(r2)
            goto L24
        L54:
            int r2 = r5.stringBufferTop
            int r0 = r0 + r2
            int r0 = r0 + 2
            r5.tokenEnd = r0
            int r0 = r5.peekChar()
            boolean r0 = isAlpha(r0)
            if (r0 == 0) goto L6c
            org.mozilla.javascript.Parser r0 = r5.parser
            java.lang.String r2 = "msg.invalid.re.flag"
            r0.reportError(r2)
        L6c:
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.stringBuffer
            r0.<init>(r2, r1, r6)
            r5.string = r0
            java.lang.String r0 = new java.lang.String
            char[] r1 = r5.stringBuffer
            int r2 = r5.stringBufferTop
            int r2 = r2 - r6
            r0.<init>(r1, r6, r2)
            r5.regExpFlags = r0
            return
        L82:
            r3 = 10
            r4 = 1
            if (r2 == r3) goto La7
            r3 = -1
            if (r2 != r3) goto L8b
            goto La7
        L8b:
            r3 = 92
            if (r2 != r3) goto L97
            r5.addToString(r2)
            int r2 = r5.getChar()
            goto La2
        L97:
            r3 = 91
            if (r2 != r3) goto L9d
            r6 = r4
            goto La2
        L9d:
            r3 = 93
            if (r2 != r3) goto La2
            r6 = r1
        La2:
            r5.addToString(r2)
            goto L17
        La7:
            r5.ungetChar(r2)
            int r6 = r5.cursor
            int r6 = r6 - r4
            r5.tokenEnd = r6
            java.lang.String r6 = new java.lang.String
            char[] r0 = r5.stringBuffer
            int r2 = r5.stringBufferTop
            r6.<init>(r0, r1, r2)
            r5.string = r6
            org.mozilla.javascript.Parser r6 = r5.parser
            java.lang.String r0 = "msg.unterminated.re.lit"
            r6.reportError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.TokenStream.readRegExp(int):void");
    }

    public String tokenToString(int i11) {
        return "";
    }

    private int getChar(boolean z11) throws IOException {
        char c11;
        int i11 = this.ungetCursor;
        if (i11 != 0) {
            this.cursor++;
            int[] iArr = this.ungetBuffer;
            int i12 = i11 - 1;
            this.ungetCursor = i12;
            return iArr[i12];
        }
        while (true) {
            String str = this.sourceString;
            if (str != null) {
                int i13 = this.sourceCursor;
                if (i13 == this.sourceEnd) {
                    this.hitEOF = true;
                    return -1;
                }
                this.cursor++;
                this.sourceCursor = i13 + 1;
                c11 = str.charAt(i13);
            } else {
                if (this.sourceCursor == this.sourceEnd && !fillSourceBuffer()) {
                    this.hitEOF = true;
                    return -1;
                }
                this.cursor++;
                char[] cArr = this.sourceBuffer;
                int i14 = this.sourceCursor;
                this.sourceCursor = i14 + 1;
                c11 = cArr[i14];
            }
            int i15 = this.lineEndChar;
            if (i15 >= 0) {
                if (i15 == 13 && c11 == '\n') {
                    this.lineEndChar = 10;
                } else {
                    this.lineEndChar = -1;
                    this.lineStart = this.sourceCursor - 1;
                    this.lineno++;
                }
            }
            if (c11 > 127) {
                if (c11 == 65279) {
                    break;
                }
                if (!z11 || !isJSFormatChar(c11)) {
                    break;
                }
            } else if (c11 == '\n' || c11 == '\r') {
                this.lineEndChar = c11;
                return 10;
            }
        }
        if (ScriptRuntime.isJSLineTerminator(c11)) {
            this.lineEndChar = c11;
            return 10;
        }
        return c11;
    }

    private void markCommentStart(String str) {
        if (!this.parser.compilerEnv.isRecordingComments() || this.sourceReader == null) {
            return;
        }
        this.commentPrefix = str;
        this.commentCursor = this.sourceCursor - 1;
    }
}
