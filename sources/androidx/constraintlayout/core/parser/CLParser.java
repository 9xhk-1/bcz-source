package androidx.constraintlayout.core.parser;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class CLParser {
    static boolean sDebug = false;
    private String mContent;
    private boolean mHasComment = false;
    private int mLineNumber;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public CLParser(String str) {
        this.mContent = str;
    }

    private CLElement createElement(CLElement cLElement, int i11, TYPE type, boolean z11, char[] cArr) {
        CLElement allocate;
        if (sDebug) {
            System.out.println("CREATE " + type + " at " + cArr[i11]);
        }
        switch (type.ordinal()) {
            case 1:
                allocate = CLObject.allocate(cArr);
                i11++;
                break;
            case 2:
                allocate = CLArray.allocate(cArr);
                i11++;
                break;
            case 3:
                allocate = CLNumber.allocate(cArr);
                break;
            case 4:
                allocate = CLString.allocate(cArr);
                break;
            case 5:
                allocate = CLKey.allocate(cArr);
                break;
            case 6:
                allocate = CLToken.allocate(cArr);
                break;
            default:
                allocate = null;
                break;
        }
        if (allocate == null) {
            return null;
        }
        allocate.setLine(this.mLineNumber);
        if (z11) {
            allocate.setStart(i11);
        }
        if (cLElement instanceof CLContainer) {
            allocate.setContainer((CLContainer) cLElement);
        }
        return allocate;
    }

    private CLElement getNextJsonElement(int i11, char c11, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c11 != '\t' && c11 != '\n' && c11 != '\r' && c11 != ' ') {
            if (c11 == '\"' || c11 == '\'') {
                return cLElement instanceof CLObject ? createElement(cLElement, i11, TYPE.KEY, true, cArr) : createElement(cLElement, i11, TYPE.STRING, true, cArr);
            }
            if (c11 == '[') {
                return createElement(cLElement, i11, TYPE.ARRAY, true, cArr);
            }
            if (c11 != ']') {
                if (c11 == '{') {
                    return createElement(cLElement, i11, TYPE.OBJECT, true, cArr);
                }
                if (c11 != '}') {
                    switch (c11) {
                        case '+':
                        case '-':
                        case '.':
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
                            return createElement(cLElement, i11, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            break;
                        case '/':
                            int i12 = i11 + 1;
                            if (i12 >= cArr.length || cArr[i12] != '/') {
                                return cLElement;
                            }
                            this.mHasComment = true;
                            return cLElement;
                        default:
                            if (!(cLElement instanceof CLContainer) || (cLElement instanceof CLObject)) {
                                return createElement(cLElement, i11, TYPE.KEY, true, cArr);
                            }
                            CLElement createElement = createElement(cLElement, i11, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) createElement;
                            if (cLToken.validate(c11, i11)) {
                                return createElement;
                            }
                            throw new CLParsingException("incorrect token <" + c11 + "> at line " + this.mLineNumber, cLToken);
                    }
                }
            }
            cLElement.setEnd(i11 - 1);
            CLElement container = cLElement.getContainer();
            container.setEnd(i11);
            return container;
        }
        return cLElement;
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }

    public CLObject parse() throws CLParsingException {
        int i11;
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i12 = 1;
        this.mLineNumber = 1;
        boolean z11 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                i13 = -1;
                break;
            }
            char c11 = charArray[i13];
            if (c11 == '{') {
                break;
            }
            if (c11 == '\n') {
                this.mLineNumber++;
            }
            i13++;
        }
        if (i13 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject allocate = CLObject.allocate(charArray);
        allocate.setLine(this.mLineNumber);
        allocate.setStart(i13);
        int i14 = i13 + 1;
        CLElement cLElement = allocate;
        while (i14 < length) {
            char c12 = charArray[i14];
            if (c12 == '\n') {
                this.mLineNumber += i12;
            }
            if (this.mHasComment) {
                if (c12 == '\n') {
                    this.mHasComment = z11;
                } else {
                    i11 = i12;
                    i14++;
                    i12 = i11;
                    z11 = false;
                }
            }
            if (cLElement == null) {
                break;
            }
            if (cLElement.isDone()) {
                cLElement = getNextJsonElement(i14, c12, cLElement, charArray);
            } else if (cLElement instanceof CLObject) {
                if (c12 == '}') {
                    cLElement.setEnd(i14 - 1);
                } else {
                    cLElement = getNextJsonElement(i14, c12, cLElement, charArray);
                }
            } else if (!(cLElement instanceof CLArray)) {
                boolean z12 = cLElement instanceof CLString;
                if (z12) {
                    long j11 = cLElement.mStart;
                    if (charArray[(int) j11] == c12) {
                        cLElement.setStart(j11 + 1);
                        cLElement.setEnd(i14 - 1);
                    }
                } else {
                    if (cLElement instanceof CLToken) {
                        CLToken cLToken = (CLToken) cLElement;
                        i11 = i12;
                        if (!cLToken.validate(c12, i14)) {
                            throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.mLineNumber, cLToken);
                        }
                    } else {
                        i11 = i12;
                    }
                    if ((cLElement instanceof CLKey) || z12) {
                        long j12 = cLElement.mStart;
                        char c13 = charArray[(int) j12];
                        if ((c13 == '\'' || c13 == '\"') && c13 == c12) {
                            cLElement.setStart(j12 + 1);
                            cLElement.setEnd(i14 - 1);
                        }
                    }
                    if (!cLElement.isDone() && (c12 == '}' || c12 == ']' || c12 == ',' || c12 == ' ' || c12 == '\t' || c12 == '\r' || c12 == '\n' || c12 == ':')) {
                        long j13 = i14 - 1;
                        cLElement.setEnd(j13);
                        if (c12 == '}' || c12 == ']') {
                            cLElement = cLElement.getContainer();
                            cLElement.setEnd(j13);
                            if (cLElement instanceof CLKey) {
                                cLElement = cLElement.getContainer();
                                cLElement.setEnd(j13);
                            }
                        }
                    }
                    if (cLElement.isDone() && (!(cLElement instanceof CLKey) || ((CLKey) cLElement).mElements.size() > 0)) {
                        cLElement = cLElement.getContainer();
                    }
                    i14++;
                    i12 = i11;
                    z11 = false;
                }
            } else if (c12 == ']') {
                cLElement.setEnd(i14 - 1);
            } else {
                cLElement = getNextJsonElement(i14, c12, cLElement, charArray);
            }
            i11 = i12;
            if (cLElement.isDone()) {
                cLElement = cLElement.getContainer();
            }
            i14++;
            i12 = i11;
            z11 = false;
        }
        while (cLElement != null && !cLElement.isDone()) {
            if (cLElement instanceof CLString) {
                cLElement.setStart(((int) cLElement.mStart) + 1);
            }
            cLElement.setEnd(length - 1);
            cLElement = cLElement.getContainer();
        }
        if (sDebug) {
            System.out.println("Root: " + allocate.toJSON());
        }
        return allocate;
    }
}
